/**
 * DeviceInfoBasic_UserEnabled.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DeviceInfoBasic_UserEnabled  implements java.io.Serializable {
    private long deviceID;

    private String deviceName;

    private int deviceClassID;

    private String deviceSerialNumber;

    private boolean isAccessGranted;

    private String panelSlotNumber;

    private String panelUserCode;

    public DeviceInfoBasic_UserEnabled() {
    }

    public DeviceInfoBasic_UserEnabled(
           long deviceID,
           String deviceName,
           int deviceClassID,
           String deviceSerialNumber,
           boolean isAccessGranted,
           String panelSlotNumber,
           String panelUserCode) {
           this.deviceID = deviceID;
           this.deviceName = deviceName;
           this.deviceClassID = deviceClassID;
           this.deviceSerialNumber = deviceSerialNumber;
           this.isAccessGranted = isAccessGranted;
           this.panelSlotNumber = panelSlotNumber;
           this.panelUserCode = panelUserCode;
    }


    /**
     * Gets the deviceID value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceName value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceClassID value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return deviceClassID
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }


    /**
     * Sets the deviceClassID value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param deviceClassID
     */
    public void setDeviceClassID(int deviceClassID) {
        this.deviceClassID = deviceClassID;
    }


    /**
     * Gets the deviceSerialNumber value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return deviceSerialNumber
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the isAccessGranted value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return isAccessGranted
     */
    public boolean isIsAccessGranted() {
        return isAccessGranted;
    }


    /**
     * Sets the isAccessGranted value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param isAccessGranted
     */
    public void setIsAccessGranted(boolean isAccessGranted) {
        this.isAccessGranted = isAccessGranted;
    }


    /**
     * Gets the panelSlotNumber value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return panelSlotNumber
     */
    public String getPanelSlotNumber() {
        return panelSlotNumber;
    }


    /**
     * Sets the panelSlotNumber value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param panelSlotNumber
     */
    public void setPanelSlotNumber(String panelSlotNumber) {
        this.panelSlotNumber = panelSlotNumber;
    }


    /**
     * Gets the panelUserCode value for this DeviceInfoBasic_UserEnabled.
     * 
     * @return panelUserCode
     */
    public String getPanelUserCode() {
        return panelUserCode;
    }


    /**
     * Sets the panelUserCode value for this DeviceInfoBasic_UserEnabled.
     * 
     * @param panelUserCode
     */
    public void setPanelUserCode(String panelUserCode) {
        this.panelUserCode = panelUserCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeviceInfoBasic_UserEnabled)) return false;
        DeviceInfoBasic_UserEnabled other = (DeviceInfoBasic_UserEnabled) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            this.deviceClassID == other.getDeviceClassID() &&
            ((this.deviceSerialNumber==null && other.getDeviceSerialNumber()==null) || 
             (this.deviceSerialNumber!=null &&
              this.deviceSerialNumber.equals(other.getDeviceSerialNumber()))) &&
            this.isAccessGranted == other.isIsAccessGranted() &&
            ((this.panelSlotNumber==null && other.getPanelSlotNumber()==null) || 
             (this.panelSlotNumber!=null &&
              this.panelSlotNumber.equals(other.getPanelSlotNumber()))) &&
            ((this.panelUserCode==null && other.getPanelUserCode()==null) || 
             (this.panelUserCode!=null &&
              this.panelUserCode.equals(other.getPanelUserCode())));
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        _hashCode += getDeviceClassID();
        if (getDeviceSerialNumber() != null) {
            _hashCode += getDeviceSerialNumber().hashCode();
        }
        _hashCode += (isIsAccessGranted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPanelSlotNumber() != null) {
            _hashCode += getPanelSlotNumber().hashCode();
        }
        if (getPanelUserCode() != null) {
            _hashCode += getPanelUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceInfoBasic_UserEnabled.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic_UserEnabled"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("deviceClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAccessGranted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsAccessGranted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panelSlotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelSlotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panelUserCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelUserCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
