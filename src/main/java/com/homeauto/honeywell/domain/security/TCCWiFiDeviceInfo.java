/**
 * TCCWiFiDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TCCWiFiDeviceInfo  implements java.io.Serializable {
    private int TCCDeviceID;

    private String deviceName;

    private WiFiThermostatConfigInfo thermostatConfiguration;

    public TCCWiFiDeviceInfo() {
    }

    public TCCWiFiDeviceInfo(
           int TCCDeviceID,
           String deviceName,
           WiFiThermostatConfigInfo thermostatConfiguration) {
           this.TCCDeviceID = TCCDeviceID;
           this.deviceName = deviceName;
           this.thermostatConfiguration = thermostatConfiguration;
    }


    /**
     * Gets the TCCDeviceID value for this TCCWiFiDeviceInfo.
     * 
     * @return TCCDeviceID
     */
    public int getTCCDeviceID() {
        return TCCDeviceID;
    }


    /**
     * Sets the TCCDeviceID value for this TCCWiFiDeviceInfo.
     * 
     * @param TCCDeviceID
     */
    public void setTCCDeviceID(int TCCDeviceID) {
        this.TCCDeviceID = TCCDeviceID;
    }


    /**
     * Gets the deviceName value for this TCCWiFiDeviceInfo.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this TCCWiFiDeviceInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the thermostatConfiguration value for this TCCWiFiDeviceInfo.
     * 
     * @return thermostatConfiguration
     */
    public WiFiThermostatConfigInfo getThermostatConfiguration() {
        return thermostatConfiguration;
    }


    /**
     * Sets the thermostatConfiguration value for this TCCWiFiDeviceInfo.
     * 
     * @param thermostatConfiguration
     */
    public void setThermostatConfiguration(WiFiThermostatConfigInfo thermostatConfiguration) {
        this.thermostatConfiguration = thermostatConfiguration;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TCCWiFiDeviceInfo)) return false;
        TCCWiFiDeviceInfo other = (TCCWiFiDeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.TCCDeviceID == other.getTCCDeviceID() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.thermostatConfiguration==null && other.getThermostatConfiguration()==null) || 
             (this.thermostatConfiguration!=null &&
              this.thermostatConfiguration.equals(other.getThermostatConfiguration())));
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
        _hashCode += getTCCDeviceID();
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getThermostatConfiguration() != null) {
            _hashCode += getThermostatConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCCWiFiDeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCCDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("thermostatConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiThermostatConfigInfo"));
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
