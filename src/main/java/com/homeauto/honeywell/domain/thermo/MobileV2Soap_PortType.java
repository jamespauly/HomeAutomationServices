/**
 * MobileV2Soap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public interface MobileV2Soap_PortType extends java.rmi.Remote {
    public CreateAccountResult createAccount(String email, String password, String firstName, String lastName, String countryCode, String state, String city, String streetAddress, String zipCode, SupportedLanguage uiLanguage, boolean agreedWithAgreement, SecretQuestion question1, String answer1, SecretQuestion question2, String answer2, SecretQuestion question3, String answer3, String applicationID, String applicationVersion) throws java.rmi.RemoteException;
    public CreateLocationResult createLocation(String sessionID, String name, String type, String countryCode, String state, String city, String streetAddress, String zipCode, String notificationEmails, TimeZone timeZone, boolean useDaylightSavingTime) throws java.rmi.RemoteException;
    public EditLocationResult editLocation(String sessionID, int locationID, String name, String type, String countryCode, String state, String city, String streetAddress, String zipCode, String notificationEmails, TimeZone timeZone, boolean useDaylightSavingTime) throws java.rmi.RemoteException;
    public GetUserAddressInfoResult getUserAddressInfo(String sessionID) throws java.rmi.RemoteException;
    public GetSystemGeoInfoResult getSystemGeoInfo(String sessionID) throws java.rmi.RemoteException;
    public RegisterGatewayResult registerGateway(String sessionID, int locationID, String mac, String crc) throws java.rmi.RemoteException;
    public RegisterGatewayResult unregisterGateway(String sessionID, String mac, String crc) throws java.rmi.RemoteException;
    public AuthenticateLoginResult authenticateUserLogin(String username, String password, String applicationID, String applicationVersion, SupportedLanguage uiLanguage) throws java.rmi.RemoteException;
    public WebMethodResult resendAccountActivationEmail(String username, String password, String applicationID, String applicationVersion, SupportedLanguage uiLanguage) throws java.rmi.RemoteException;
    public KeepAliveResult keepAlive(String sessionID) throws java.rmi.RemoteException;
    public LogOffResult logOff(String sessionID) throws java.rmi.RemoteException;
    public GetLocationsResult getLocations(String sessionID) throws java.rmi.RemoteException;
    public GetShortLocationInfoResult getShortLocationInfo(String sessionID) throws java.rmi.RemoteException;
    public GetVolatileThermostatDataResult getVolatileThermostatData(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public GetThermostatResult getThermostat(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public GetThermostatUIResult getThermostatUI(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public GetDREventResult getDREvent(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public WebMethodResult hideDREvent(String sessionID, int thermostatID, int eventId) throws java.rmi.RemoteException;
    public ChangeRequestResult optOutDREvent(String sessionID, int thermostatID, int eventId) throws java.rmi.RemoteException;
    public GetThermostatFanResult getThermostatFan(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public GetThermostatHumidificationResult getThermostatHumidification(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public GetWeatherForecastResult getWeatherForecast(String sessionID, int locationID) throws java.rmi.RemoteException;
    public WebMethodResult dismissSiteAlert(String sessionID, int alertID) throws java.rmi.RemoteException;
    public WebMethodResult dismissThermostatAlert(String sessionID, int alertID) throws java.rmi.RemoteException;
    public WebMethodResult dismissCommunicationAlert(String sessionID, int alertID) throws java.rmi.RemoteException;
    public GetCommTaskStateResult getCommTaskState(String sessionID, int commTaskID) throws java.rmi.RemoteException;
    public ChangeRequestResult changeThermostatUI(String sessionID, int thermostatID, boolean changeSystemSwitch, int systemSwitch, boolean changeHeatSetpoint, java.math.BigDecimal heatSetpoint, boolean changeCoolSetpoint, java.math.BigDecimal coolSetpoint, boolean changeHeatNextPeriod, int heatNextPeriod, boolean changeCoolNextPeriod, int coolNextPeriod, boolean changeStatusHeat, int statusHeat, boolean changeStatusCool, int statusCool) throws java.rmi.RemoteException;
    public ChangeRequestResult changeThermostatUIEx(String sessionID, ThermostatUIData request) throws java.rmi.RemoteException;
    public ChangeRequestResult changeThermostatFan(String sessionID, int thermostatID, FanSwitch fanSwitch) throws java.rmi.RemoteException;
    public ChangeRequestResult changeThermostatHumidification(String sessionID, int thermostatID, boolean setHumidificationSetPoint, short humidificationSetPoint, boolean setHumidificationMode, HumidificationMode humidificationMode, boolean setDehumidificationSetPoint, short dehumidificationSetPoint, boolean setDehumidificationMode, HumidificationMode dehumidificationMode) throws java.rmi.RemoteException;
    public ScheduleResult getSchedule(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public ScheduleResult changeSchedule(String sessionID, int thermostatID, ScheduleInfo scheduleInfo) throws java.rmi.RemoteException;
    public SubmitScheduleResult submitScheduleChanges(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public ScheduleResult cancelScheduleChanges(String sessionID, int thermostatID) throws java.rmi.RemoteException;
    public ContracotrsForLocationResult getPreferredDealers(String sessionID, int locationId) throws java.rmi.RemoteException;
    public WebMethodResult acceptInvitation(String sessionID, String token, DealerInfoContact[] contacts, LocationLevelOfAccess[] locationsLevelAccess) throws java.rmi.RemoteException;
    public WebMethodResult declineInvitation(String sessionID, String token) throws java.rmi.RemoteException;
    public WebMethodResult requestDealerInvitation(String sessionID, String dealerPortalId, int locationId, DealerInfoContact[] contacts) throws java.rmi.RemoteException;
    public WebMethodResult updateLocationLevelOfAccess(String sessionID, int locationId, LevelOfAccess levelOfAccess) throws java.rmi.RemoteException;
    public PendingInvitationsResult getPendingInvitations(String sessionID) throws java.rmi.RemoteException;
    public DealerInfoResult getDealerInformation(String sessionID, int locationId) throws java.rmi.RemoteException;
    public WebMethodResult editDealerInformation(String sessionID, DealerInfo info) throws java.rmi.RemoteException;
    public WebMethodResult editPreferredDealerInformation(String sessionID, PreferredDealerInfo info) throws java.rmi.RemoteException;
    public WebMethodResult emailDealer(String sessionID, String dealerEmail, String subject, String body) throws java.rmi.RemoteException;
    public GetSecurityQuestionsResult getSecurityQuestions(String email, String applicationID, String applicationVersion) throws java.rmi.RemoteException;
    public WebMethodResult resetPassword(String email, String secretQuestion, String answer, String applicationID, String applicationVersion) throws java.rmi.RemoteException;
    public WiringToolThermostatsResult wiringToolGetThermostats(String applicationID, String applicationVersion) throws java.rmi.RemoteException;
    public WiringToolWireMapResult wiringToolGetWireMapWithAnswer(String thermostat, String[] input, String answer, String applicationID, String applicationVersion) throws java.rmi.RemoteException;
    public EulaResult getEulaDocument(SupportedLanguage language) throws java.rmi.RemoteException;
    public EulaResult getFutureEulaDocument(SupportedLanguage language) throws java.rmi.RemoteException;
    public WebMethodResult acceptEula(String sessionID, int eulaVersion) throws java.rmi.RemoteException;
}
