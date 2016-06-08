package com.homeauto.honeywell.manager;

import com.homeauto.honeywell.domain.security.*;
import org.apache.axis.AxisFault;
import org.apache.http.impl.client.CloseableHttpClient;
import org.glassfish.jersey.client.ClientConfig;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by jpaul on 6/27/15.
 */
public class SecurityManager {
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

    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";
    private static final int APPLICATION_ID = 13778;
    private static final String APPLICATION_VERSION = "3.10.5";
    private static final String URL = "https://rs.alarmnet.com/TC21api/tc2.asmx";

    private String _sessionId = "";
    private long _deviceId = 0l;
    private long _locationId = 0l;
    private SvcTC2APISoap12Stub svcTC2APISoap12Stub = null;

    public SecurityManager() {
        try {
            java.net.URL url = null;

            try {
                url = new URL(URL);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            try {
                svcTC2APISoap12Stub = new SvcTC2APISoap12Stub(url, null);
            } catch (AxisFault axisFault) {
                axisFault.printStackTrace();
            }

            getSessionId();
            getLocIdAndDeviceId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String armStayInstant() {
        if (_sessionId.equals("") || _deviceId == 0l || _locationId == 0l) {
            return "{SessionID, DeviceID, or LocationID is Empty}";
        }
        try {
            ArmSecuritySystemResults armSecuritySystemResults = svcTC2APISoap12Stub.armSecuritySystem(_sessionId, _locationId, _deviceId, 2, -1);
            return String.valueOf(armSecuritySystemResults.getResultCode());
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

    public String armAway() {
        if (_sessionId.equals("") || _deviceId == 0l || _locationId == 0l) {
            return "{SessionID, DeviceID, or LocationID is Empty}";
        }
        try {
            ArmSecuritySystemResults armSecuritySystemResults = svcTC2APISoap12Stub.armSecuritySystem(_sessionId, _locationId, _deviceId, 0, -1);
            return String.valueOf(armSecuritySystemResults.getResultCode());
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

    public String disarm() {
        if (_sessionId.equals("") || _deviceId == 0l || _locationId == 0l) {
            return "{SessionID, DeviceID, or LocationID is Empty}";
        }
        try {
            ArmSecuritySystemResults armSecuritySystemResults = svcTC2APISoap12Stub.armSecuritySystem(_sessionId, _locationId, _deviceId, 0, -1);
            return String.valueOf(armSecuritySystemResults.getResultCode());
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }

    private void logout() {
        try {
            WebMethodResults webMethodResults = svcTC2APISoap12Stub.logout(_sessionId);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void getSessionId() {
        try {
            AuthenticateLoginResults authenticateLoginResults = svcTC2APISoap12Stub.authenticateUserLoginEx(USERNAME, PASSWORD, 13778, "3.10.5", "en-US");
            _sessionId = authenticateLoginResults.getSessionID();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getLocIdAndDeviceId() {
        try {
            SessionDetailResults sessionDetailResults = svcTC2APISoap12Stub.getSessionDetails(_sessionId, APPLICATION_ID, APPLICATION_VERSION);
            _locationId = sessionDetailResults.getLocations()[0].getLocationID();
            _deviceId = sessionDetailResults.getLocations()[0].getDeviceList()[0].getDeviceID();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            svcTC2APISoap12Stub.logout(_sessionId);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
