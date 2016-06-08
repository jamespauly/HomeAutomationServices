/**
 * WiFiDoorBellInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiDoorBellInfo  implements java.io.Serializable {
    private int deviceModel;

    private int timeZoneID;

    private String state;

    private int setupStateID;

    private String wiFiName;

    private int wiFiStrength;

    private String LEDColorInDevice;

    private int isExistingDoorBellUser;

    private long lockID;

    private int isMotionEnabled;

    private int setupErrorID;

    private int pushNotificationFlag;

    private short isOffline;

    public WiFiDoorBellInfo() {
    }

    public WiFiDoorBellInfo(
           int deviceModel,
           int timeZoneID,
           String state,
           int setupStateID,
           String wiFiName,
           int wiFiStrength,
           String LEDColorInDevice,
           int isExistingDoorBellUser,
           long lockID,
           int isMotionEnabled,
           int setupErrorID,
           int pushNotificationFlag,
           short isOffline) {
           this.deviceModel = deviceModel;
           this.timeZoneID = timeZoneID;
           this.state = state;
           this.setupStateID = setupStateID;
           this.wiFiName = wiFiName;
           this.wiFiStrength = wiFiStrength;
           this.LEDColorInDevice = LEDColorInDevice;
           this.isExistingDoorBellUser = isExistingDoorBellUser;
           this.lockID = lockID;
           this.isMotionEnabled = isMotionEnabled;
           this.setupErrorID = setupErrorID;
           this.pushNotificationFlag = pushNotificationFlag;
           this.isOffline = isOffline;
    }


    /**
     * Gets the deviceModel value for this WiFiDoorBellInfo.
     * 
     * @return deviceModel
     */
    public int getDeviceModel() {
        return deviceModel;
    }


    /**
     * Sets the deviceModel value for this WiFiDoorBellInfo.
     * 
     * @param deviceModel
     */
    public void setDeviceModel(int deviceModel) {
        this.deviceModel = deviceModel;
    }


    /**
     * Gets the timeZoneID value for this WiFiDoorBellInfo.
     * 
     * @return timeZoneID
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }


    /**
     * Sets the timeZoneID value for this WiFiDoorBellInfo.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(int timeZoneID) {
        this.timeZoneID = timeZoneID;
    }


    /**
     * Gets the state value for this WiFiDoorBellInfo.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this WiFiDoorBellInfo.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the setupStateID value for this WiFiDoorBellInfo.
     * 
     * @return setupStateID
     */
    public int getSetupStateID() {
        return setupStateID;
    }


    /**
     * Sets the setupStateID value for this WiFiDoorBellInfo.
     * 
     * @param setupStateID
     */
    public void setSetupStateID(int setupStateID) {
        this.setupStateID = setupStateID;
    }


    /**
     * Gets the wiFiName value for this WiFiDoorBellInfo.
     * 
     * @return wiFiName
     */
    public String getWiFiName() {
        return wiFiName;
    }


    /**
     * Sets the wiFiName value for this WiFiDoorBellInfo.
     * 
     * @param wiFiName
     */
    public void setWiFiName(String wiFiName) {
        this.wiFiName = wiFiName;
    }


    /**
     * Gets the wiFiStrength value for this WiFiDoorBellInfo.
     * 
     * @return wiFiStrength
     */
    public int getWiFiStrength() {
        return wiFiStrength;
    }


    /**
     * Sets the wiFiStrength value for this WiFiDoorBellInfo.
     * 
     * @param wiFiStrength
     */
    public void setWiFiStrength(int wiFiStrength) {
        this.wiFiStrength = wiFiStrength;
    }


    /**
     * Gets the LEDColorInDevice value for this WiFiDoorBellInfo.
     * 
     * @return LEDColorInDevice
     */
    public String getLEDColorInDevice() {
        return LEDColorInDevice;
    }


    /**
     * Sets the LEDColorInDevice value for this WiFiDoorBellInfo.
     * 
     * @param LEDColorInDevice
     */
    public void setLEDColorInDevice(String LEDColorInDevice) {
        this.LEDColorInDevice = LEDColorInDevice;
    }


    /**
     * Gets the isExistingDoorBellUser value for this WiFiDoorBellInfo.
     * 
     * @return isExistingDoorBellUser
     */
    public int getIsExistingDoorBellUser() {
        return isExistingDoorBellUser;
    }


    /**
     * Sets the isExistingDoorBellUser value for this WiFiDoorBellInfo.
     * 
     * @param isExistingDoorBellUser
     */
    public void setIsExistingDoorBellUser(int isExistingDoorBellUser) {
        this.isExistingDoorBellUser = isExistingDoorBellUser;
    }


    /**
     * Gets the lockID value for this WiFiDoorBellInfo.
     * 
     * @return lockID
     */
    public long getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this WiFiDoorBellInfo.
     * 
     * @param lockID
     */
    public void setLockID(long lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the isMotionEnabled value for this WiFiDoorBellInfo.
     * 
     * @return isMotionEnabled
     */
    public int getIsMotionEnabled() {
        return isMotionEnabled;
    }


    /**
     * Sets the isMotionEnabled value for this WiFiDoorBellInfo.
     * 
     * @param isMotionEnabled
     */
    public void setIsMotionEnabled(int isMotionEnabled) {
        this.isMotionEnabled = isMotionEnabled;
    }


    /**
     * Gets the setupErrorID value for this WiFiDoorBellInfo.
     * 
     * @return setupErrorID
     */
    public int getSetupErrorID() {
        return setupErrorID;
    }


    /**
     * Sets the setupErrorID value for this WiFiDoorBellInfo.
     * 
     * @param setupErrorID
     */
    public void setSetupErrorID(int setupErrorID) {
        this.setupErrorID = setupErrorID;
    }


    /**
     * Gets the pushNotificationFlag value for this WiFiDoorBellInfo.
     * 
     * @return pushNotificationFlag
     */
    public int getPushNotificationFlag() {
        return pushNotificationFlag;
    }


    /**
     * Sets the pushNotificationFlag value for this WiFiDoorBellInfo.
     * 
     * @param pushNotificationFlag
     */
    public void setPushNotificationFlag(int pushNotificationFlag) {
        this.pushNotificationFlag = pushNotificationFlag;
    }


    /**
     * Gets the isOffline value for this WiFiDoorBellInfo.
     * 
     * @return isOffline
     */
    public short getIsOffline() {
        return isOffline;
    }


    /**
     * Sets the isOffline value for this WiFiDoorBellInfo.
     * 
     * @param isOffline
     */
    public void setIsOffline(short isOffline) {
        this.isOffline = isOffline;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiDoorBellInfo)) return false;
        WiFiDoorBellInfo other = (WiFiDoorBellInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceModel == other.getDeviceModel() &&
            this.timeZoneID == other.getTimeZoneID() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.setupStateID == other.getSetupStateID() &&
            ((this.wiFiName==null && other.getWiFiName()==null) || 
             (this.wiFiName!=null &&
              this.wiFiName.equals(other.getWiFiName()))) &&
            this.wiFiStrength == other.getWiFiStrength() &&
            ((this.LEDColorInDevice==null && other.getLEDColorInDevice()==null) || 
             (this.LEDColorInDevice!=null &&
              this.LEDColorInDevice.equals(other.getLEDColorInDevice()))) &&
            this.isExistingDoorBellUser == other.getIsExistingDoorBellUser() &&
            this.lockID == other.getLockID() &&
            this.isMotionEnabled == other.getIsMotionEnabled() &&
            this.setupErrorID == other.getSetupErrorID() &&
            this.pushNotificationFlag == other.getPushNotificationFlag() &&
            this.isOffline == other.getIsOffline();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getDeviceModel();
        _hashCode += getTimeZoneID();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += getSetupStateID();
        if (getWiFiName() != null) {
            _hashCode += getWiFiName().hashCode();
        }
        _hashCode += getWiFiStrength();
        if (getLEDColorInDevice() != null) {
            _hashCode += getLEDColorInDevice().hashCode();
        }
        _hashCode += getIsExistingDoorBellUser();
        _hashCode += new Long(getLockID()).hashCode();
        _hashCode += getIsMotionEnabled();
        _hashCode += getSetupErrorID();
        _hashCode += getPushNotificationFlag();
        _hashCode += getIsOffline();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiDoorBellInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupStateID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetupStateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiFiName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiFiStrength");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiStrength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEDColorInDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LEDColorInDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExistingDoorBellUser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsExistingDoorBellUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMotionEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsMotionEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupErrorID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetupErrorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushNotificationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PushNotificationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
