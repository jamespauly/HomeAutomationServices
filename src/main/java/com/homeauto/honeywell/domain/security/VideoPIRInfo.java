/**
 * VideoPIRInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIRInfo  implements java.io.Serializable {
    private long deviceID;

    private int deviceClassID;

    private String MAC;

    private String deviceName;

    private int batteryStatus;

    private int firmwareAvailablity;

    private int firmwareDownLoad;

    private String featureFlags;

    private int wifiStatus;

    private VideoPIREvent videoPIREventInfo;

    public VideoPIRInfo() {
    }

    public VideoPIRInfo(
           long deviceID,
           int deviceClassID,
           String MAC,
           String deviceName,
           int batteryStatus,
           int firmwareAvailablity,
           int firmwareDownLoad,
           String featureFlags,
           int wifiStatus,
           VideoPIREvent videoPIREventInfo) {
           this.deviceID = deviceID;
           this.deviceClassID = deviceClassID;
           this.MAC = MAC;
           this.deviceName = deviceName;
           this.batteryStatus = batteryStatus;
           this.firmwareAvailablity = firmwareAvailablity;
           this.firmwareDownLoad = firmwareDownLoad;
           this.featureFlags = featureFlags;
           this.wifiStatus = wifiStatus;
           this.videoPIREventInfo = videoPIREventInfo;
    }


    /**
     * Gets the deviceID value for this VideoPIRInfo.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this VideoPIRInfo.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceClassID value for this VideoPIRInfo.
     * 
     * @return deviceClassID
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }


    /**
     * Sets the deviceClassID value for this VideoPIRInfo.
     * 
     * @param deviceClassID
     */
    public void setDeviceClassID(int deviceClassID) {
        this.deviceClassID = deviceClassID;
    }


    /**
     * Gets the MAC value for this VideoPIRInfo.
     * 
     * @return MAC
     */
    public String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this VideoPIRInfo.
     * 
     * @param MAC
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }


    /**
     * Gets the deviceName value for this VideoPIRInfo.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this VideoPIRInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the batteryStatus value for this VideoPIRInfo.
     * 
     * @return batteryStatus
     */
    public int getBatteryStatus() {
        return batteryStatus;
    }


    /**
     * Sets the batteryStatus value for this VideoPIRInfo.
     * 
     * @param batteryStatus
     */
    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }


    /**
     * Gets the firmwareAvailablity value for this VideoPIRInfo.
     * 
     * @return firmwareAvailablity
     */
    public int getFirmwareAvailablity() {
        return firmwareAvailablity;
    }


    /**
     * Sets the firmwareAvailablity value for this VideoPIRInfo.
     * 
     * @param firmwareAvailablity
     */
    public void setFirmwareAvailablity(int firmwareAvailablity) {
        this.firmwareAvailablity = firmwareAvailablity;
    }


    /**
     * Gets the firmwareDownLoad value for this VideoPIRInfo.
     * 
     * @return firmwareDownLoad
     */
    public int getFirmwareDownLoad() {
        return firmwareDownLoad;
    }


    /**
     * Sets the firmwareDownLoad value for this VideoPIRInfo.
     * 
     * @param firmwareDownLoad
     */
    public void setFirmwareDownLoad(int firmwareDownLoad) {
        this.firmwareDownLoad = firmwareDownLoad;
    }


    /**
     * Gets the featureFlags value for this VideoPIRInfo.
     * 
     * @return featureFlags
     */
    public String getFeatureFlags() {
        return featureFlags;
    }


    /**
     * Sets the featureFlags value for this VideoPIRInfo.
     * 
     * @param featureFlags
     */
    public void setFeatureFlags(String featureFlags) {
        this.featureFlags = featureFlags;
    }


    /**
     * Gets the wifiStatus value for this VideoPIRInfo.
     * 
     * @return wifiStatus
     */
    public int getWifiStatus() {
        return wifiStatus;
    }


    /**
     * Sets the wifiStatus value for this VideoPIRInfo.
     * 
     * @param wifiStatus
     */
    public void setWifiStatus(int wifiStatus) {
        this.wifiStatus = wifiStatus;
    }


    /**
     * Gets the videoPIREventInfo value for this VideoPIRInfo.
     * 
     * @return videoPIREventInfo
     */
    public VideoPIREvent getVideoPIREventInfo() {
        return videoPIREventInfo;
    }


    /**
     * Sets the videoPIREventInfo value for this VideoPIRInfo.
     * 
     * @param videoPIREventInfo
     */
    public void setVideoPIREventInfo(VideoPIREvent videoPIREventInfo) {
        this.videoPIREventInfo = videoPIREventInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIRInfo)) return false;
        VideoPIRInfo other = (VideoPIRInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            this.deviceClassID == other.getDeviceClassID() &&
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            this.batteryStatus == other.getBatteryStatus() &&
            this.firmwareAvailablity == other.getFirmwareAvailablity() &&
            this.firmwareDownLoad == other.getFirmwareDownLoad() &&
            ((this.featureFlags==null && other.getFeatureFlags()==null) || 
             (this.featureFlags!=null &&
              this.featureFlags.equals(other.getFeatureFlags()))) &&
            this.wifiStatus == other.getWifiStatus() &&
            ((this.videoPIREventInfo==null && other.getVideoPIREventInfo()==null) || 
             (this.videoPIREventInfo!=null &&
              this.videoPIREventInfo.equals(other.getVideoPIREventInfo())));
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
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += getDeviceClassID();
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        _hashCode += getBatteryStatus();
        _hashCode += getFirmwareAvailablity();
        _hashCode += getFirmwareDownLoad();
        if (getFeatureFlags() != null) {
            _hashCode += getFeatureFlags().hashCode();
        }
        _hashCode += getWifiStatus();
        if (getVideoPIREventInfo() != null) {
            _hashCode += getVideoPIREventInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPIRInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BatteryStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareAvailablity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareAvailablity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareDownLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareDownLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPIREventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent"));
        elemField.setMinOccurs(0);
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
