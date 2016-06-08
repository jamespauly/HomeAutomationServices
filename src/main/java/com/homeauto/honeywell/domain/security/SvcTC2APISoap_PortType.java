/**
 * SvcTC2APISoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public interface SvcTC2APISoap_PortType extends java.rmi.Remote {

    /**
     * Polling API - Which should be called based on Arm/Disarm API
     * output Result Codes
     */
    public WebMethodResults checkSecurityPanelLastCommandState(String sessionID, long locationID, long deviceID, int commandCode) throws java.rmi.RemoteException;

    /**
     * Returns the current connection status of the security panel
     */
    public PanelConnectionStatusInfoResults getPanelConnectionStatusInfo(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Return List of Zone Informations for given ZoneId's
     */
    public GetZoneInfoResults getIndividualZoneDetails(String sessionID, long locationID, int[] zoneIDs, long deviceID, int partitionID) throws java.rmi.RemoteException;

    /**
     * [Partially depreciated in TC2.3+, stuill used for Notifications
     * groups] Get Users that you can Manage
     */
    public UserConfigurationResults getUsers(String sessionID) throws java.rmi.RemoteException;

    /**
     * [Depreciated in TC2.3+] Delete a user
     */
    public DeleteUserInfoResults deleteUserInfo(String sessionID, long userId) throws java.rmi.RemoteException;

    /**
     * [Depreciated in TC2.3+] Disable / Enable a user
     */
    public DisableEnableUserResults disableEnableUser(String sessionID, long userId, boolean stateToSet) throws java.rmi.RemoteException;

    /**
     * Update Eula or SMS Eula for a User
     */
    public WebMethodResults updateEula(String sessionID, long userId, int eula) throws java.rmi.RemoteException;

    /**
     * [Depreciated in TC2.3+] Get User information when editing another
     * user or editing yourself
     */
    public UserInfoResults getUserInfo(String sessionID, long userId) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Replacement for DeleteUserInfo. Deletes a Real User
     * or Marks Virtual user for Deletion
     */
    public DeleteUserResults deleteUser(String sessionID, long userId, int userTypeID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Replacement for DisableEnableUser. Disable / Enable
     * a user
     */
    public DisableEnableUserResults disableEnableUserEx(String sessionID, long userId, int userTypeId, boolean stateToSet, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Deprecated in TC Multilingual - [TC2.1+] Replacement for GetUserInfo.
     * Get User information when editing another user or editing yourself
     */
    public UserDetailResults getUserDetails(String sessionID, long manageUserId, int userTypeId, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Replacement for GetUserDetails. Get User information
     * when editing another user or editing yourself-Includes Wifi Lock as
     * well
     */
    public UserDetailsExResults getAllUserDetailsEx(String sessionID, long manageUserId, int userTypeId, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Replacement for GetUserDetails. Get User information
     * when editing another user or editing yourself
     */
    public UserDetailsExResults getUserDetailsEx(String sessionID, long manageUserId, int userTypeId, String additionalInput) throws java.rmi.RemoteException;

    /**
     * DEPRECATED in TC Multilingual - [TC2.1+] Replacement for SaveCreateUserInfo.
     * Stores User information when editing self/another user or creating
     * a new User
     */
    public SaveUserResults saveUser(String sessionID, UserDetails userDetails, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Replacement for SaveCreateUserInfo. Stores User information
     * when editing self/another user or creating a new User
     */
    public SaveUserResults saveUserEx(String sessionID, UserDetailsEx userDetails, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC3.8+] Created for Save MasterUsercode in TC if  MasterUsercode
     * changed in the panel.
     */
    public SaveUserResults saveMasterUserCode(String sessionID, long manageUserID, long deviceID, String panelUserCode, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Replacement for GetUsers. Returns List of Real Users
     * that one can manage if asked at AccountLevel. This also returns Real+Virtual
     * Users if asked at Location Level.
     */
    public UserListResults getUsersEx(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Synchronize Total Connect Users with Security System
     * user codes
     */
    public SynchronizeUserResults synchronizePanelUser(String sessionID, DeviceAuthorizingCode[] deviceList, boolean statusOnly, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.1+] Provides list of SMS Email Carriers
     */
    public SMSEmailCarrierResults getSMSEmailCarriers(String sessionID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [TC2.2+] Provides list of Notification Methods
     */
    public NotificationMethodResults getNotificationMethods(String sessionID) throws java.rmi.RemoteException;

    /**
     * Check if a UserName is ok to use
     */
    public IsUserNameValidResults isUserNameValid(String sessionID, UserNameInfo userNameInfo) throws java.rmi.RemoteException;

    /**
     * [Depreciated in TC2.3+] Add a user to an existing account,
     * save user updates to another user, save user updates to yourself
     */
    public SaveCreateUserInfoResults saveCreateUserInfo(String sessionID, UserInfo userInfo) throws java.rmi.RemoteException;

    /**
     * Save User-Client Preferences
     */
    public WebMethodResults saveUserClientPreferences(String sessionID, String preferencesString) throws java.rmi.RemoteException;

    /**
     * Get listing of Help Documents URLs
     */
    public ListHelpDocsResults getHelpDocuments(String sessionID) throws java.rmi.RemoteException;

    /**
     * Used to update only the Language (LocaleId value) for a User.
     * Country Code (ex. en-US) or a language Id as defined within TC2 can
     * be used to update the value in the User Table.
     */
    public WebMethodResults updateUserLanguage(String sessionID, String localeCode, long languageID) throws java.rmi.RemoteException;

    /**
     * Remote Request for authentication for the given username/password
     * using the specified client application.
     */
    public RemoteAuthenticateLoginResults remoteAuthenticateUserLogin(String userName, String password, int remoteApplicationID) throws java.rmi.RemoteException;

    /**
     * Request for authentication for the given username/password
     * using the specified client application.
     */
    public AuthenticateLoginResults authenticateUserLogin(String userName, String password, int applicationID, String applicationVersion) throws java.rmi.RemoteException;

    /**
     * Request for authentication for the given username/password
     * using the specified client application.
     */
    public AuthenticateLoginResults authenticateUserLoginEx(String userName, String password, int applicationID, String applicationVersion, String localeCode) throws java.rmi.RemoteException;

    /**
     * Request for authentication for the given GUID using the specified
     * client application.
     */
    public AuthenticateLoginResults authenticateGUIDLogin(String GUID, int applicationID, String applicationVersion) throws java.rmi.RemoteException;

    /**
     * Request for authentication for the given GUID using the specified
     * client application.
     */
    public AuthenticateLoginResults authenticateGUIDLoginEx(String GUID, int applicationID, String applicationVersion, String localeCode) throws java.rmi.RemoteException;

    /**
     * Request session details for the given sessionID
     */
    public SessionDetailResults getSessionDetails(String sessionID, int applicationID, String applicationVersion) throws java.rmi.RemoteException;

    /**
     * Request for authentication for the given username/password
     * using the specified client application and retrieves the session details
     * on successful authentication
     */
    public SessionDetailResults loginAndGetSessionDetails(String userName, String password, int applicationID, String applicationVersion, String localeCode) throws java.rmi.RemoteException;

    /**
     * Inquire about an active session for the purpose of avoiding
     * a server-side timeout.
     */
    public WebMethodResults keepAlive(String sessionID) throws java.rmi.RemoteException;

    /**
     * Request that the given sessionID be logged out and/or terminated.
     */
    public WebMethodResults logout(String sessionID) throws java.rmi.RemoteException;

    /**
     * Determines anything changed since last update. The result will
     * guide the UI further. NOTE: Deprecated and no longer supported.
     */
    public AnythingChangedResults anythingChanged(String sessionID, long locationID, Module[] modules) throws java.rmi.RemoteException;

    /**
     * [DEPRECIATED] Request InterfaceSchema details for the given
     * sessionID/username
     */
    public InterfaceSchemaResults getInterfaceSchemaDetails(String sessionID) throws java.rmi.RemoteException;

    /**
     * Request InterfaceSchema details for the given sessionID/username
     */
    public InterfaceSchemaResultsEx getInterfaceSchemaDetailsEx(String sessionID) throws java.rmi.RemoteException;

    /**
     * This will return the weather forecast for the device location.
     */
    public WiFiWeatherResponse wiFiWeatherFromDevice(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException;

    /**
     * This will return the results for one thermostat.
     */
    public ThermostatResponse getThermostat(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException;

    /**
     * Used to Save an image to an object PhotoClassId:1- location,
     * 2 - User image
     */
    public byte[] getImage(String sessionId, long imageId) throws java.rmi.RemoteException;

    /**
     * Used to Retrieve a Branding Image LOGO
     */
    public byte[] getLogoImage(long imageId) throws java.rmi.RemoteException;

    /**
     * Used to retrieve a content slideshow photo
     */
    public byte[] getContentImage(String sessionId, long locationId, long imageId) throws java.rmi.RemoteException;

    /**
     * Returns the data associated with a Location object from the
     * database
     */
    public LocationResult getLocation(String sessionId, long locationId) throws java.rmi.RemoteException;

    /**
     * Returns the data associated with the basic attributes of a
     * Location object from the database
     */
    public LocationSimpleResult getLocationSimple(String sessionId, long locationId) throws java.rmi.RemoteException;

    /**
     * Saves the data associated with a LocationInfo object to the
     * database.  Since this method will only update an existing Location,
     * you are required to pass in its LocationId.  Pass in a null value
     * for the Image byte array when either the image has not changed or
     * when the default imageIs to be used.  Any previous image will be deleted
     * when either a null or actual image is saved.  At the curent triggerTime,
     * the Alias is for the one security system associated with this location.
     */
    public LocationResult saveLocation(String sessionId, LocationInfo locale, byte[] image, boolean dataChanged, boolean imageChanged, String alias) throws java.rmi.RemoteException;

    /**
     * Saves the data associated with a LocationInfo object to the
     * database.  Since this method will only update an existing Location,
     * you are required to pass in its LocationId.  Pass in a null value
     * for the Image byte array when either the image has not changed or
     * when the default imageIs to be used.  Any previous image will be deleted
     * when either a null or actual image is saved.  At the curent triggerTime,
     * the Alias is for the one security system associated with this location.
     */
    public LocationSimpleResult saveLocationSimple(String sessionId, LocationInfoSimple locale, byte[] image, boolean dataChanged, boolean imageChanged, String alias) throws java.rmi.RemoteException;

    /**
     * Retrieve the list of supported countries
     */
    public CountryListResult getCountryList(String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the list of states for a country
     */
    public CountryStateListResult getCountryStateList(String sessionID, long countryID) throws java.rmi.RemoteException;

    /**
     * Retrieves the list of countries & States
     */
    public CountryStateListResultEx getAllCountryStateList(String sessionID) throws java.rmi.RemoteException;

    /**
     * Returns the Partners associated with a Location object from
     * the database
     */
    public PartnerListResult getAssociatedPartners(String sessionId, long locationId) throws java.rmi.RemoteException;

    /**
     * Returns the set of available triggerTime zone regions and their
     * ID
     */
    public TimeZonesResult getTimeZones(String sessionId) throws java.rmi.RemoteException;

    /**
     * Returns the set of available triggerTime zone regions and their
     * ID for Camera
     */
    public TimeZonesResult getTimeZonesForCamera(String sessionId) throws java.rmi.RemoteException;

    /**
     * Provides version information for the web service.
     */
    public WebMethodResults serviceVersion() throws java.rmi.RemoteException;

    /**
     * Retrieves the set of video file URLs for a device or audit
     * event record
     */
    public VideoFileURLResult getVideoFileURLs(String sessionId, long locationId, short filterClass, long eventRecordId) throws java.rmi.RemoteException;

    /**
     * Returns the notes associated with a device or audit event record
     */
    public NotesResult getEventNotes(String sessionId, short filterClass, long eventRecordId) throws java.rmi.RemoteException;

    /**
     * Returns a set of device or audit event records.  A maximum
     * of 100 records can be returned per call.
     */
    public EventsResult getEvents(String sessionId, short filterClass, long locationId, long deviceId, short maxRecords, long eventTypeFilter, boolean showHidden, String startDateTime, String endDateTime, short dateFormat, short timeFormat, int sortOrder, long lastEventIdReceived) throws java.rmi.RemoteException;

    /**
     * Returns a set of device or audit event records.  A maximum
     * of 100 records can be returned per call.
     */
    public EventsResult getAllEvents(String sessionId, short filterClass, long locationId, long deviceId, short maxRecords, long eventTypeFilter, boolean showHidden, String startDateTime, String endDateTime, short dateFormat, short timeFormat, int sortOrder, long lastEventIdReceived) throws java.rmi.RemoteException;

    /**
     * Returns a set of device or audit event records.  A maximum
     * of 100 records can be returned per call.
     */
    public EventsResult getEventsEx(String sessionId, short filterClass, long locationId, long deviceId, short maxRecords, int[] eventTypeFilterList, boolean showHidden, boolean showLocked, String startDateTime, String endDateTime, short dateFormat, short timeFormat, int sortOrder, long lastEventIdReceived) throws java.rmi.RemoteException;

    /**
     * Returns a list of available event type filter values that are
     * to be used for filtering the event record retrieval.
     */
    public EventTypeFilterResult getEventTypeFilter(String sessionId, short filterClass, long locationId) throws java.rmi.RemoteException;

    /**
     * Returns a list of available event type filter values that are
     * to be used for filtering the event record retrieval.
     */
    public EventTypeFilterResult getAllEventTypeFilter(String sessionId, short filterClass, long locationId) throws java.rmi.RemoteException;

    /**
     * Returns a set of device event records.  A maximum of 250 records
     * can be returned per call.  The parameter LastEventIdReceived is used
     * to retreive newer records than the ones previously obtained.  Entering
     * the most recent event id into this field will return all records that
     * are newer than that record
     */
    public EventsResult getLiveEvents(String sessionId, long locationId, long lastEventIdReceived, short maxRecords, short dateFormat, short timeFormat) throws java.rmi.RemoteException;

    /**
     * Returns a set of device event records.  A maximum of 250 records
     * can be returned per call.  The parameter LastEventIdReceived is used
     * to retreive newer records than the ones previously obtained.  Entering
     * the most recent event id into this field will return all records that
     * are newer than that record
     */
    public EventsResult getAllLiveEvents(String sessionId, long locationId, long lastEventIdReceived, short maxRecords, short dateFormat, short timeFormat) throws java.rmi.RemoteException;

    /**
     * Updates the note associated with a device or audit event. 
     * Storing an empty string will clear a note.
     */
    public WebMethodResults updateEventNotes(String sessionId, short filterClass, long eventRecordId, String note) throws java.rmi.RemoteException;

    /**
     * Updates the hidden state of a device or audit event record.
     * Hidden records are not returned during normal GetEvents requests unlessthe
     * ShowHidden parameter is true.
     */
    public WebMethodResults updateEventRecordHideState(String sessionId, short filterClass, long eventRecordId, boolean isHidden) throws java.rmi.RemoteException;

    /**
     * Updates the lock state of a device or audit event record. 
     * When a record is locked, the automated clean up process will retain
     * the locked record.  Only unlocked records will be removed.
     */
    public WebMethodResults updateEventRecordLockState(String sessionId, short filterClass, long eventRecordId, boolean isLocked) throws java.rmi.RemoteException;

    /**
     * Determine if the camera is available for a stream at the moment.
     * Current reasons for unavailability would be if the camera is updating
     */
    public WebMethodResults isCameraAvailable(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current state (flags, pan/tilt location, WLLED,
     * output state) for the given camera.
     */
    public CameraStateResult getCameraState(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current I/O state (flags, WLLED, output state)
     * for the given camera.
     */
    public CameraIOStateResult getCameraIOState(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current pan/tilt location for the given camera.
     */
    public CameraPositionResult getCameraPosition(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Request that the given camera move to the given preset pan/tilt
     * location.
     */
    public WebMethodResults gotoPreset(String MAC, String sessionID, int presetSlot) throws java.rmi.RemoteException;

    /**
     * Request that the current pan/tilt location be stored as the
     * given preset slot for the given camera.
     */
    public WebMethodResults storePreset(String MAC, String sessionID, int presetSlot) throws java.rmi.RemoteException;

    /**
     * Request that the given camera move in the specified direction,
     * speed and distance.
     */
    public WebMethodResults moveCamera(String MAC, String sessionID, int direction, int degrees, int panSpeed, int tiltSpeed) throws java.rmi.RemoteException;

    /**
     * Request that the given camera move to the specified location,
     * based on a 640x480 viewport mapping.
     */
    public WebMethodResults directPanTilt(String MAC, String sessionID, int x, int y) throws java.rmi.RemoteException;

    /**
     * Request that the WLLED for the given camera be turned on/off.
     */
    public WebMethodResults WLLED_Control(String MAC, String sessionID, int newState) throws java.rmi.RemoteException;

    /**
     * Request that the output control for the given camera be turned
     * on/off.
     */
    public WebMethodResults output_Control(String MAC, String sessionID, int outputNumber, int newState) throws java.rmi.RemoteException;

    /**
     * Request the given camera to archive a video clip to the server.
     */
    public WebMethodResults triggerVideoCapture(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Configure the given camera to use the specified video mode.
     */
    public ConfigStreamModeResult configStreamMode(String MAC, String sessionID, int modeSelector, int size, int framesPerSecond, int qualityType, int quality, int bitRate) throws java.rmi.RemoteException;

    /**
     * Retrieve the list of cameras for the specified session and
     * location.
     */
    public CameraListResult getLocationCameraList(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current configuration information for the given
     * camera.
     */
    public MediaServerConfigurationResults getMediaServerConfiguration(String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current configuration information for the given
     * camera.
     */
    public CameraConfigurationResults getCameraConfiguration(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current configuration information (including limits)
     * for the given camera.
     */
    public CameraConfigurationResults2 getCameraConfiguration2(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Update the configuration information for the given camera.
     */
    public WebMethodResults updateCameraConfiguration(String MAC, String sessionID, String cameraName, String SYSTEM_Data, String VIDEO_Data, String MOTION_Data, String IO_Data, String EVENT_Data, String PTZ_Data) throws java.rmi.RemoteException;

    /**
     * Adjust default camera settings
     */
    public WebMethodResults setDefaultCamera(String sessionID, String MAC, long locationID) throws java.rmi.RemoteException;

    /**
     * Request that the camera firmware be upgraded/changed to the
     * specified version (or default, if unspecified)
     */
    public WebMethodResults upgradeCameraFirmware(String MAC, String sessionID, int firmwareVersionNumber) throws java.rmi.RemoteException;

    /**
     * Request a list of available camera firmware upgrade options
     * for the given camera.
     */
    public CameraFirmwareListResult getFirmwareList(String MAC, String sessionID) throws java.rmi.RemoteException;

    /**
     * Get camera wireless status
     */
    public CameraSignalStrengthResults getWirelessStatus(String sessionID, String MAC, int searchType) throws java.rmi.RemoteException;

    /**
     * Get camera Information - provides camera wireless details and
     * Network data
     */
    public CameraInformationResults getCameraInformation(String sessionID, String MAC, int searchType) throws java.rmi.RemoteException;

    /**
     * Gets WAP clients status
     */
    public WAPClientsListResults getWAPClientsInfo(String sessionID, String MAC) throws java.rmi.RemoteException;

    /**
     * Gets Camera Battery Status
     */
    public CameraBatteryStatusResult getBatteryStatus(String sessionID, String MAC, int type) throws java.rmi.RemoteException;

    /**
     * Get the Event Metadata applicable for the Given Location. Used
     * for Notification Configuration
     */
    public EventMetaDataExResult getEventMetaDataEx(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Get Configured Notification Events at the Given Location.
     */
    public ConfiguredEventResult getConfiguredEvents(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Get Summary of Configured Notification Events in XML at the
     * Given Location.
     */
    public SummaryConfiguredEventXML getEventSummaryXML(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Get Summary of Configured Notification Events at the Given
     * Location.
     */
    public SummaryConfiguredEventString getEventSummary(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Update the stored data for the list of event notifications
     * for the given location
     */
    public WebMethodResults transactNotificationListEvents(String sessionID, long locationID, SentToPanelEvents[] sentToPanelEvents, EventNotification[] eventNotifications, SceneTrigger[] sceneTriggers, VideoTrigger[] videoTriggers, TimeTriggeredAction[] timeTriggeredActions, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Get the list of notification states permitted for this location.
     */
    public NotificationConditionalStateResult getAllNotificationConditionalStates(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Get the list of notification schedules available.
     */
    public NotificationScheduleResult getAllNotificationSchedules(String sessionID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Update the stored data for the list of event notification schedules
     */
    public WebMethodResults transactNotificationSchedules(String sessionID, NotificationSchedule[] notificationSchedules, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Retrieves the Notification Lists associated with current user's
     * TotalConnect account)
     */
    public GetAllNotificationListsResults getAllNotificationLists(String sessionID) throws java.rmi.RemoteException;

    /**
     * Updates the Notification List associated with the User
     */
    public TransactNotificationListResults transactNotificationLists(String sessionID, NotificationListBaseInfo[] notificationListCollection) throws java.rmi.RemoteException;

    /**
     * Sends Summary Email about the Notification List to the Admin
     * user
     */
    public WebMethodResults sendTestNotification(String sessionID, long locationID, long notificationListID) throws java.rmi.RemoteException;

    /**
     * Enable/disabled notifications for logged in user and/or return
     * notification pause status.
     */
    public NotificationPauseResult notificationPause(String sessionID, int mode, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [DEPRECATED] Get the Event Metadata applicable for the Given
     * Location. Used for Notification Configuration
     */
    public EventMetaDataResults getEventMetaData(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Request for Metadata and Full status of Security Panel for
     * the Given Location and User
     */
    public PanelMetadataAndStatusResults getPanelMetaDataAndFullStatus(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Request for Metadata and Full status of Security Panel for
     * the Given Location and User
     */
    public PanelMetadataAndStatusResultsEx getPanelMetaDataAndFullStatusEx(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Request for Full status of Security Panel for the Given Location
     * and User
     */
    public PanelStatusResults getPanelFullStatus(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Request for Full status of Security Panel for the Given DeviceID
     * and User
     */
    public PanelStatusResults getPanelFullStatusByDeviceID(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Request for Full status of Security Panel for the Given Location
     * and User
     */
    public PanelStatusResultsEx getPanelFullStatusEx(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Request for Full status of Security Panel for the Given DeviceID
     * and User
     */
    public PanelStatusResultsEx getPanelFullStatusByDeviceIDEx(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Get the zones in different states like Alarms, Faults, Trouble,
     * and Bypassed
     */
    public GetZonesListInStateResult getZonesListInState(String sessionID, long locationID, int partitionID, int listIdentifierID) throws java.rmi.RemoteException;

    /**
     * [Enriched Method] Get the zones in different states like Alarms,
     * Faults, Trouble, and Bypassed and whether it is Bypassable Zone or
     * Not
     */
    public GetZonesListInStateExResult getZonesListInStateEx(String sessionID, long locationID, int partitionID, int listIdentifierID) throws java.rmi.RemoteException;

    /**
     * Request for Metadata and Full status of Security Panel for
     * the Given DeviceID and User
     */
    public PanelMetadataAndStatusResults getPanelMetaDataAndFullStatusByDeviceID(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Request for Metadata and Full status of Security Panel for
     * the Given DeviceID and User
     */
    public PanelMetadataAndStatusResultsEx getPanelMetaDataAndFullStatusByDeviceIDEx(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException;

    /**
     * Initiates Zone Bypass
     */
    public ZoneBypassResults bypass(String sessionID, long locationID, long deviceID, int zone, int userCode) throws java.rmi.RemoteException;

    /**
     * Performs Security Panel Quick commands - Arm
     */
    public ArmSecuritySystemResults armSecuritySystem(String sessionID, long locationID, long deviceID, int armType, int userCode) throws java.rmi.RemoteException;

    /**
     * Performs Security Panel Quick Commands - CustomArm
     */
    public CustomArmSecuritySystemResults customArmSecuritySystem(String sessionID, long locationID, long deviceID, int armType, int userCode, CustomArmInfo customArmSettings) throws java.rmi.RemoteException;

    /**
     * Retrieves latest custom Arm settings set by the user
     */
    public CustomArmSettingsResult getCustomArmSettings(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException;

    /**
     * Performs Security Panel Quick commands - Disarm
     */
    public DisarmSecuritySystemResults disarmSecuritySystem(String sessionID, long locationID, long deviceID, int userCode) throws java.rmi.RemoteException;

    /**
     * Reads 16x2 Alpha Keypad Display and LED Status of Security
     * System
     */
    public ReadConsoleDisplayResults readConsoleDisplay(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException;

    /**
     * Establishes Live Connection to Security System
     */
    public WebMethodResults connectToPanel(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException;

    /**
     * Sends Keystroke to the Security Panel
     */
    public WebMethodResults sendKey(String sessionID, long locationID, long deviceID, String keyChar) throws java.rmi.RemoteException;

    /**
     * Override Current User's Security Panel Session with his own
     * Previous Session
     */
    public WebMethodResults overrideSecurityPanelSession(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException;

    /**
     * Return a Device Invite Token for a Sky Bell User.
     */
    public DeviceInviteTokenResults getDeviceInviteToken(String sessionId, long locationId, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Update DoorBell Details.
     */
    public UpdateDoorbellDetailResult updateDoorBellDetail(String sessionId, long locationId, WiFiDoorBellInfo wiFiDoorBellInfo, WiFiDoorBellUserInfo wiFiDoorBellUserInfo) throws java.rmi.RemoteException;

    /**
     * Removes Doorbell from TC and Skybell
     */
    public WebMethodResults removeDoorbellDevice(String sessionId, long locationId) throws java.rmi.RemoteException;

    /**
     * Get WiFi Door Bell Details.
     */
    public WiFiDoorBellInfoResult getWiFiDoorBellDeviceDetails(String sessionId, long locationId) throws java.rmi.RemoteException;

    /**
     * Stores MobileDeviceToken ID for a User
     */
    public WebMethodResults insertUserMobileDeviceToken(String sessionID, long userID, int clientApplicationID, String mobileDeviceID) throws java.rmi.RemoteException;

    /**
     * Update User's Push notification Subscription
     */
    public WebMethodResults updatePushSubscription(String sessionID, long userID, short pushNotificationStatus) throws java.rmi.RemoteException;

    /**
     * Remove User's MobileDevice token id
     */
    public WebMethodResults removeUserMobileDeviceToken(String sessionID, long userID, String mobileDeviceTokenID) throws java.rmi.RemoteException;

    /**
     * Pause / Allow all notifications for logged in user
     */
    public WebMethodResults pauseAllNotifications(String sessionID, boolean pause) throws java.rmi.RemoteException;

    /**
     * Return a list of WiFi locations and devices.
     */
    public WiFiLockLocationsResults getWiFiLockLocations(String sessionId, long locationId, String accessToken) throws java.rmi.RemoteException;

    /**
     * Add/Remoce WiFi Devices in Total Connect.
     */
    public WebMethodResults saveWiFiLockDevice(String sessionId, long locationId, String wifiLockLocationID, WiFiLockInfo[] wifiLockDevices) throws java.rmi.RemoteException;

    /**
     * Return a list of TCC WiFi locations and devices.
     */
    public TCCWiFiLocationsResults getWiFiThermostatLocations(String sessionID, long locationID, String TCCUsername, String TCCPassword) throws java.rmi.RemoteException;

    /**
     * To Add/Delete the TCC WiFi Thermostats in Total Connect.
     */
    public WebMethodResults addDeleteWiFiThermostats(String sessionID, long locationID, int TCCLocationID, TCCWiFiDeviceInfo[] TCCWiFiDeviceInfo) throws java.rmi.RemoteException;

    /**
     * Return Configured TCC WiFi Thermostat Schedules.
     */
    public WifiThermostatScheduleResults getWifiThermostatSchedule(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException;

    /**
     * Update the TCC WiFi Thermostat Schedules.
     */
    public WebMethodResults updateWifiThermostatSchedule(String sessionID, long deviceID, long thermostatID, SchedulePeriodInfo[] schedulePeriodInfo) throws java.rmi.RemoteException;

    /**
     * To Insert the Severe weather test message for the given locationID
     */
    public WebMethodResults testEmergencyAlert(long accountId, long locationId, String sessionId, String message, int acKrequired) throws java.rmi.RemoteException;

    /**
     * Update a Switch Icon (database only)
     */
    public UpdateSwitchIconResults updateSwitchIcon(String sessionID, long deviceID, long switchID, org.apache.axis.types.UnsignedByte switchIconID) throws java.rmi.RemoteException;

    /**
     * Update a Thermostat schedule (database only)
     */
    public UpdateThermostatScheduleResults updateThermostatSchedule(String sessionID, long deviceID, ThermostatSchedule thermostatSchedule) throws java.rmi.RemoteException;

    /**
     * Get a Thermostat schedule (from database)
     */
    public ThermostatScheduleResults getThermostatSchedule(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException;

    /**
     * Execute a single scene
     */
    public ExecuteASceneResults executeAScene(String sessionID, long deviceID, long sceneID) throws java.rmi.RemoteException;

    /**
     * Create or Edit a single scene
     */
    public CreateEditASceneResults createEditAScene(String sessionID, long deviceID, long sceneID, String sceneName, short sceneIconID, boolean isSceneEnabled, SceneSwitch[] automation_Switch, SceneThermostat[] automation_Thermostat, SceneLock[] automation_Lock) throws java.rmi.RemoteException;

    /**
     * Delete a single scene
     */
    public SceneDeletionResults deleteAScene(String sessionID, long deviceID, long sceneID) throws java.rmi.RemoteException;

    /**
     * Get a specific scene per Automation panel (database)
     */
    public SceneDataResults getAScene(String sessionID, long deviceID, long sceneID) throws java.rmi.RemoteException;

    /**
     * Get list of scenes per Automation panel (database)
     */
    public SceneListInfo getSceneList(String sessionID, long deviceID) throws java.rmi.RemoteException;

    /**
     * Get info for all Automation devices per Automation panel (during
     * a panel session from panel, otherwise from database)
     */
    public AutomationDataResults getAutomationDeviceStatus(String sessionID, long deviceID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [Transitional State for lock] Get info for all Automation devices
     * per Automation panel (during a panel session from panel, otherwise
     * from database) - Includes HB Thermostat as well
     */
    public AutomationDataResults_Transitional getAllAutomationDeviceStatusEx(String sessionID, long deviceID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * [Transitional State for lock] Get info for all Automation devices
     * per Automation panel (during a panel session from panel, otherwise
     * from database)
     */
    public AutomationDataResults_Transitional getAutomationDeviceStatusEx(String sessionID, long deviceID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Get Automation Lock Details.
     */
    public AutomationLockDataResult getAutomationLocks(String sessionId, long deviceId, long lockID, String additionalInput) throws java.rmi.RemoteException;

    /**
     * Execute a action on a Automation panel lock
     */
    public LockControlDataResults controlALock(String sessionID, long deviceID, long lockID, int lockDesiredState, String authorizingCode) throws java.rmi.RemoteException;

    /**
     * Execute a action on a Automation panel thermostat
     */
    public ThermostatControlDataResults controlAThermostat(String sessionID, long deviceID, long thermostatID, int currentOpModeID, int heatThreshold, int coolThreshold, int thermostatModeID, int heatSetPoint, int coolSetPoint, int thermostatFanModeID) throws java.rmi.RemoteException;

    /**
     * Execute a action on a Automation panel thermostat
     */
    public ThermostatControlDataResults controlAThermostatEx(String sessionID, long deviceID, long thermostatID, int currentOpModeID, int heatThreshold, int coolThreshold, int thermostatModeID, int heatSetPoint, int coolSetPoint, int thermostatFanModeID, String tempHoldTime) throws java.rmi.RemoteException;

    /**
     * Execute a single action on a Automation panel switch
     */
    public SwitchControlDataResults controlASwitch(String sessionID, long deviceID, long switchID, int switchAction) throws java.rmi.RemoteException;

    /**
     * Execute Security Panel and Automation Synchronization
     */
    public AutomationSyncResults synchronizeSecurityPanel(String sessionID, String installerCode, String userCode, long locationID, boolean forceImport) throws java.rmi.RemoteException;

    /**
     * Used to check the status of sync job
     */
    public SyncJobResult getSyncJobStatus(String sessionID, String jobID, long locationID) throws java.rmi.RemoteException;

    /**
     * Close Current Security Panel Session
     */
    public WebMethodResults disconnectPanel(String sessionID, long deviceID, long locationID) throws java.rmi.RemoteException;

    /**
     * Get DoorBell - Client ID
     */
    public WebMethodResults getDoorBellClientID(String sessionID) throws java.rmi.RemoteException;

    /**
     * Retrieve the configuration settings for all the Content
     */
    public ContentConfigurationResult getContentConfiguration(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Save the configuration settings for all the Content
     */
    public WebMethodResults saveContentConfiguration(String sessionID, long locationID, ContentConfigurationInfo contentConfiguration) throws java.rmi.RemoteException;

    /**
     * Retrieve the list of slide show photos and its url
     */
    public SlideShowPhotoResult getSlideShowPhotos(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Add a photo to slide show
     */
    public WebMethodResults addSlideShowPhoto(String sessionID, long locationID, byte[] image) throws java.rmi.RemoteException;

    /**
     * Delete a photo from slide show
     */
    public WebMethodResults deleteSlideShowPhoto(String sessionID, long locationID, long photoID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current weather condition
     */
    public CurrentWeatherResult getCurrentWeather(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Retrieve the five days forecast weather condition
     */
    public ForecastWeatherResult getForecastWeather(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Retrieve the top 5 dealer messages
     */
    public DealerMessageResult getDealerMessages(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Mark a dealer message as Read
     */
    public WebMethodResults updateDealerMessageReadState(String sessionID, long locationID, long messageID) throws java.rmi.RemoteException;

    /**
     * Used to validate an emailaddress in session
     */
    public EmailValidationResult validateEmailAddressInSession(String sessionId, String emailAddress, String validationKey) throws java.rmi.RemoteException;

    /**
     * Used to validate an emailaddress from an external source from
     * an email link
     */
    public EmailValidationResult validateEmailAddress(String userName, String validationKey) throws java.rmi.RemoteException;

    /**
     * Used to send an validation link to the user
     */
    public EmailValidationResult sendEmailValidationDetails(String sessionId, String emailAddress) throws java.rmi.RemoteException;

    /**
     * Used to retieve the list of GPS devices associated with a location.
     */
    public GPSDevicesResult getGPSDevices(String sessionId, long locationId) throws java.rmi.RemoteException;

    /**
     * Used to retrieve the most recent recorded Location related
     * data of the GPS device.
     */
    public GPSLocationResult getGPSDeviceLocationData(String sessionId, long deviceID, long locationId) throws java.rmi.RemoteException;

    /**
     * Used to retrieve the GeoFence information for a particular
     * GPS device
     */
    public GPSDeviceGeoFenceResult getGPSDeviceGeoFence(String sessionId, long deviceID) throws java.rmi.RemoteException;

    /**
     * Used to retrieve the the list of geofences that the GPS device
     * currently is in.
     */
    public GeofenceListResult getEnteredGPSGeofences(String sessionId, long deviceID) throws java.rmi.RemoteException;

    /**
     * this will cause the GPS device to return its current location
     * to the database.  Retrieval will be from a call to GetGPSDeviceLocationData.
     */
    public WebMethodResults sendGPSLocateNowMessage(String sessionId, long deviceID, long locationId) throws java.rmi.RemoteException;

    /**
     * Updates the Photo associated with a GPS Device and returns
     * the PhotoURL for it.
     */
    public PhotoURLResult savePhotoForGPSDevice(String sessionId, long deviceID, byte[] image) throws java.rmi.RemoteException;

    /**
     * Saves the Data for a GPSDevice Only.  No Photo alteration will
     * be done.
     */
    public WebMethodResults saveGPSDeviceData(String sessionId, GPSInfo GPSData) throws java.rmi.RemoteException;

    /**
     * Request TWM Session
     */
    public GPSPopupURLResult requestTWMSession(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * To add or Edit the Scenes
     */
    public WebMethodResults addEditSmartScene(String sessionID, long locationID, SmartScene smartScene) throws java.rmi.RemoteException;

    /**
     * To Retrieve the Scenes information
     */
    public GetScenesListResults getSmartSceneList(String sessionID, long locationID, long[] smartSceneIDs) throws java.rmi.RemoteException;

    /**
     * To Remove a Scenes
     */
    public WebMethodResults deleteSmartScene(String sessionID, long locationID, long smartSceneID) throws java.rmi.RemoteException;

    /**
     * To Execute the Scenes
     */
    public WebMethodResults runSmartScene(String sessionID, long locationID, long smartSceneID) throws java.rmi.RemoteException;

    /**
     * To Get the Smart Action Configuration
     */
    public GetSmartSceneConfigurationResults getSmartSceneConfiguration(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * To get the list of EULA's to be signed by the user.
     */
    public EULAResults getEulaInfo(String sessionID, boolean isPostLoginEula) throws java.rmi.RemoteException;

    /**
     * To get the EULA Text for the given language id and eula id
     */
    public EULATextResults getEulaText(long eulaID, long languageID, String sessionID) throws java.rmi.RemoteException;

    /**
     * To get the EULA Text for the given language id and eula id
     */
    public WebMethodResults signEULA(String sessionID, long eulaId, long languageId, long countryId) throws java.rmi.RemoteException;

    /**
     * To get the list of All EULA's befor login to be viewed by the
     * user.
     */
    public EULAResults getPreLoginEulaInfo() throws java.rmi.RemoteException;

    /**
     * To get the EULA Text for the given language id and eula id
     */
    public EULATextResults getPreLoginEulaText(long eulaID, long languageID) throws java.rmi.RemoteException;

    /**
     * To add or Edit the Smart Action
     */
    public WebMethodResults addEditSmartAction(String sessionID, long locationID, SmartAction smartAction, int userCode) throws java.rmi.RemoteException;

    /**
     * To Retrieve the Smart Action information
     */
    public GetSmartActionListResults getSmartActionList(String sessionID, long locationID, long[] smartActionIDs, boolean getState) throws java.rmi.RemoteException;

    /**
     * To Remove a single Smart Action
     */
    public WebMethodResults deleteSmartAction(String sessionID, long locationID, long smartActionID, int userCode) throws java.rmi.RemoteException;

    /**
     * To Remove the List of Smart Actions
     */
    public WebMethodResults deleteSmartActionList(String sessionID, long locationID, long[] smartActionIDs, int userCode) throws java.rmi.RemoteException;

    /**
     * To Set the Smart Action state
     */
    public WebMethodResults setSmartActionState(String sessionID, long locationID, long smartActionID, int state, int userCode) throws java.rmi.RemoteException;

    /**
     * To Execute the Smart Action
     */
    public WebMethodResults runSmartAction(String sessionID, long locationID, long smartActionID, int userCode) throws java.rmi.RemoteException;

    /**
     * To Get the Smart Action Configuration
     */
    public GetSmartActionConfigurationResults getSmartActionConfiguration(String sessionID, long locationID) throws java.rmi.RemoteException;

    /**
     * Retrieve the current configuration information for the given
     * Video PIR.
     */
    public VideoPIRConfigurationResults getVideoPIRConfiguration(String sessionID, long deviceID, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Retrieve the list of Video PIR for the specified session and
     * location.
     */
    public VideoPIRListResults getVideoPIRLocationDeviceList(String sessionID, long locationID, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Get the capturetypes for VideoPIR device
     */
    public VideoPIRCaptureTypesResults getVideoPIRCaptureTypes(String sessionID, int deviceClassID, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Update the configuration information for the given VideoPIR.
     */
    public WebMethodResults updateVideoPIRConfiguration(String sessionID, long deviceID, String deviceName, String SYSTEM_Data, String VIDEO_Data, String MOTION_Data, String EVENT_Data, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Returns the Video PIR event record based on Event TypeID
     */
    public GetVideoPIREventRecordResults getVideoPIREventRecord(String sessionId, long eventRecordId, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Trigger the Peek In Now Action for VideoPIR.
     */
    public WebMethodResults takeVideoPIRSnapshots(String sessionID, long deviceID, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Get VideoPIR device events with applied filter condition
     */
    public GetVideoPIRDeviceEventsResults getVideoPIRDeviceEvents(String sessionID, long deviceID, long eventID, long dateStamp, int captureFilterTypeID, int showHidden, String additionalInfo) throws java.rmi.RemoteException;

    /**
     * Return a list of WiFi locations and devices.
     */
    public WiFiLocationsResults getWiFiLocations(String sessionID, String lyricUsername, String lyricPassword) throws java.rmi.RemoteException;

    /**
     * Activate WiFi Devices in Total Connect.
     */
    public WebMethodResults activateWiFiDevice(String sessionID, int locationID, String lyricUsername, String lyricPassword, int lyricLocationID, LyricDevice[] lyricDevice) throws java.rmi.RemoteException;

    /**
     * Turn On/Off WiFi Smart Away
     */
    public WebMethodResults wiFiSmartAway(String sessionID, long deviceID, long thermostatID, int active, int hours) throws java.rmi.RemoteException;

    /**
     * Remove WiFi Device from Total Connect
     */
    public WebMethodResults removeWiFiDevice(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException;
}
