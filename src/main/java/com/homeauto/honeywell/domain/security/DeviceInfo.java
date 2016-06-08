/**
 * DeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DeviceInfo  implements java.io.Serializable {
    private String deviceName;

    private long deviceId;

    private long locationId;

    private long accountId;

    private long deviceSerialNumber;

    private String deviceSerialText;

    private int deviceClassId;

    private String deviceAlias;

    private java.util.Calendar deviceCreatedTimeStamp;

    public DeviceInfo() {
    }

    public DeviceInfo(
           String deviceName,
           long deviceId,
           long locationId,
           long accountId,
           long deviceSerialNumber,
           String deviceSerialText,
           int deviceClassId,
           String deviceAlias,
           java.util.Calendar deviceCreatedTimeStamp) {
           this.deviceName = deviceName;
           this.deviceId = deviceId;
           this.locationId = locationId;
           this.accountId = accountId;
           this.deviceSerialNumber = deviceSerialNumber;
           this.deviceSerialText = deviceSerialText;
           this.deviceClassId = deviceClassId;
           this.deviceAlias = deviceAlias;
           this.deviceCreatedTimeStamp = deviceCreatedTimeStamp;
    }


    /**
     * Gets the deviceName value for this DeviceInfo.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceId value for this DeviceInfo.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this DeviceInfo.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the locationId value for this DeviceInfo.
     * 
     * @return locationId
     */
    public long getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this DeviceInfo.
     * 
     * @param locationId
     */
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the accountId value for this DeviceInfo.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this DeviceInfo.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the deviceSerialNumber value for this DeviceInfo.
     * 
     * @return deviceSerialNumber
     */
    public long getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this DeviceInfo.
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(long deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the deviceSerialText value for this DeviceInfo.
     * 
     * @return deviceSerialText
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }


    /**
     * Sets the deviceSerialText value for this DeviceInfo.
     * 
     * @param deviceSerialText
     */
    public void setDeviceSerialText(String deviceSerialText) {
        this.deviceSerialText = deviceSerialText;
    }


    /**
     * Gets the deviceClassId value for this DeviceInfo.
     * 
     * @return deviceClassId
     */
    public int getDeviceClassId() {
        return deviceClassId;
    }


    /**
     * Sets the deviceClassId value for this DeviceInfo.
     * 
     * @param deviceClassId
     */
    public void setDeviceClassId(int deviceClassId) {
        this.deviceClassId = deviceClassId;
    }


    /**
     * Gets the deviceAlias value for this DeviceInfo.
     * 
     * @return deviceAlias
     */
    public String getDeviceAlias() {
        return deviceAlias;
    }


    /**
     * Sets the deviceAlias value for this DeviceInfo.
     * 
     * @param deviceAlias
     */
    public void setDeviceAlias(String deviceAlias) {
        this.deviceAlias = deviceAlias;
    }


    /**
     * Gets the deviceCreatedTimeStamp value for this DeviceInfo.
     * 
     * @return deviceCreatedTimeStamp
     */
    public java.util.Calendar getDeviceCreatedTimeStamp() {
        return deviceCreatedTimeStamp;
    }


    /**
     * Sets the deviceCreatedTimeStamp value for this DeviceInfo.
     * 
     * @param deviceCreatedTimeStamp
     */
    public void setDeviceCreatedTimeStamp(java.util.Calendar deviceCreatedTimeStamp) {
        this.deviceCreatedTimeStamp = deviceCreatedTimeStamp;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeviceInfo)) return false;
        DeviceInfo other = (DeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            this.deviceId == other.getDeviceId() &&
            this.locationId == other.getLocationId() &&
            this.accountId == other.getAccountId() &&
            this.deviceSerialNumber == other.getDeviceSerialNumber() &&
            ((this.deviceSerialText==null && other.getDeviceSerialText()==null) || 
             (this.deviceSerialText!=null &&
              this.deviceSerialText.equals(other.getDeviceSerialText()))) &&
            this.deviceClassId == other.getDeviceClassId() &&
            ((this.deviceAlias==null && other.getDeviceAlias()==null) || 
             (this.deviceAlias!=null &&
              this.deviceAlias.equals(other.getDeviceAlias()))) &&
            ((this.deviceCreatedTimeStamp==null && other.getDeviceCreatedTimeStamp()==null) || 
             (this.deviceCreatedTimeStamp!=null &&
              this.deviceCreatedTimeStamp.equals(other.getDeviceCreatedTimeStamp())));
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        _hashCode += new Long(getDeviceId()).hashCode();
        _hashCode += new Long(getLocationId()).hashCode();
        _hashCode += new Long(getAccountId()).hashCode();
        _hashCode += new Long(getDeviceSerialNumber()).hashCode();
        if (getDeviceSerialText() != null) {
            _hashCode += getDeviceSerialText().hashCode();
        }
        _hashCode += getDeviceClassId();
        if (getDeviceAlias() != null) {
            _hashCode += getDeviceAlias().hashCode();
        }
        if (getDeviceCreatedTimeStamp() != null) {
            _hashCode += getDeviceCreatedTimeStamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceClassId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceClassId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCreatedTimeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceCreatedTimeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
