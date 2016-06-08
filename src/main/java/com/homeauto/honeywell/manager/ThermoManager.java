package com.homeauto.honeywell.manager;

import com.homeauto.honeywell.domain.thermo.*;
import com.homeauto.honeywell.domain.customThermo.UI;
import org.apache.axis.AxisFault;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.glassfish.jersey.client.ClientConfig;

import javax.net.ssl.*;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;

/**
 * Created by jpaul on 6/7/15.
 */
public class ThermoManager {

    private static final Logger logger = LogManager.getLogger(ThermoManager.class);

    TrustManager[] certs = new TrustManager[]{
            new X509TrustManager() {
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType)
                        throws CertificateException {
                }

                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType)
                        throws CertificateException {
                }
            }
    };
    private SSLContext sslctx = null;
    private MobileV2Soap12Stub mobileV2Soap12Stub = null;
    private String URL = "https://tccna.honeywell.com/ws/MobileV2.asmx";
    private String _session = "";
    private int _deviceId = 0;
    private UI ui = null;

    public ThermoManager() {
        try {
            URL url = new URL(URL);
            mobileV2Soap12Stub = new MobileV2Soap12Stub(url, null);
            getLoginInfo();

            ui = new UI();
            loadUI();

            //getLoginInfo();
        } catch (MalformedURLException | AxisFault e) {
            e.printStackTrace();
        }

    }

    private void getLoginInfo() {

        try {
            AuthenticateLoginResult authenticateLoginResult = mobileV2Soap12Stub.authenticateUserLogin("user", "password", "11111111-1111-1111-1111-111111111111", "2", SupportedLanguage.Default);
            _session = authenticateLoginResult.getSessionID();
            GetLocationsResult getLocationsResult = mobileV2Soap12Stub.getLocations(authenticateLoginResult.getSessionID());
            _deviceId = getLocationsResult.getLocations()[0].getThermostats()[0].getThermostatID();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public UIInfo getThermoDetails() {
        try {
            GetThermostatResult getThermostatResult = mobileV2Soap12Stub.getThermostat(_session, _deviceId);
            ThermostatInfo thermostatInfo = getThermostatResult.getThermostat();
            UIInfo uiInfo = thermostatInfo.getUI();
            return uiInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getCurrentTemp() {
        try {
            GetThermostatResult getThermostatResult = mobileV2Soap12Stub.getThermostat(_session, _deviceId);
            return getThermostatResult.getThermostat().getUI().getDispTemperature().toString();
        } catch (RemoteException e) {
            logger.error(e);
            e.printStackTrace();
            return e.getMessage();
        }
        //return null;
    }

    public void changeMode(int mode) {
        try {
            ui.setChangeSystemSwitch(true);
            ui.setSystemSwitch(mode);
            changeThermo();

        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        }
    }

    public void changeThermo() {
        try {
            ChangeRequestResult changeRequestResult = mobileV2Soap12Stub.changeThermostatUI(ui.getSessionId(), ui.getThermoId(), ui.isChangeSystemSwitch(), ui.getSystemSwitch(),
                    ui.isChangeHeatSetpoint(), ui.getHeatSetpoint(), ui.isChangeCoolSetpoint(), ui.getCoolSetpoint(), ui.isChangeHeatNextPeriod(),
                    ui.getHeatNextPeriod(), ui.isChangeCoolNextPeriod(), ui.getCoolNextPeriod(), ui.isChangeStatusHeat(), ui.getStatusHeat(),
                    ui.isChangeStatusCool(), ui.getStatusCool());
            logger.info(changeRequestResult.getResult().getValue());
        } catch (RemoteException e) {
            logger.error(e);
            e.printStackTrace();
        }
    }

    public void loadUI() {
        try {
            GetThermostatResult getThermostatResult = mobileV2Soap12Stub.getThermostat(_session, _deviceId);
            ui.setSessionId(_session);
            ui.setThermoId(_deviceId);
            ui.setCoolNextPeriod(getThermostatResult.getThermostat().getUI().getCoolNextPeriod());
            ui.setHeatNextPeriod(getThermostatResult.getThermostat().getUI().getHeatNextPeriod());
            ui.setCoolSetpoint(getThermostatResult.getThermostat().getUI().getCoolSetpoint());
            ui.setHeatSetpoint(getThermostatResult.getThermostat().getUI().getHeatSetpoint());
            ui.setStatusCool(getThermostatResult.getThermostat().getUI().getStatusCool());
            ui.setStatusHeat(getThermostatResult.getThermostat().getUI().getStatusHeat());
            ui.setChangeCoolSetpoint(false);
            ui.setChangeCoolNextPeriod(false);
            ui.setChangeHeatSetpoint(false);
            ui.setChangeHeatNextPeriod(false);
            ui.setChangeStatusCool(false);
            ui.setChangeStatusHeat(false);
            ui.setChangeSystemSwitch(false);
            ui.setSystemSwitch(getThermostatResult.getThermostat().getUI().getSystemSwitchPosition());
            ui.setHoldUntilCapable(getThermostatResult.getThermostat().getUI().isHoldUntilCapable());
        } catch (RemoteException e) {
            logger.error(e);
            e.printStackTrace();
        }
    }


    public void setTempAndHold(BigDecimal cTemp, BigDecimal hTemp) {

        try {
            ui.setChangeHeatSetpoint(true);
            ui.setChangeCoolSetpoint(true);
            ui.setHeatSetpoint(hTemp);
            ui.setCoolSetpoint(cTemp);
            ui.setHoldUntilCapable(true);

            changeThermo();
        } catch (Exception e) {
            logger.error(e);
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            LogOffResult logOffResult = mobileV2Soap12Stub.logOff(_session);
            System.out.println(logOffResult.getResult().getValue());
        } catch (Exception e) {
            logger.error(e);
            System.out.println(e.getMessage());
        }
    }

    public static class TrustAllHostNameVerifier implements HostnameVerifier {

        public boolean verify(String hostname, SSLSession session) {
            return true;
        }

    }

}