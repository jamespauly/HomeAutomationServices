/**
 * WiFiThermostatConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiThermostatConfigInfo  implements java.io.Serializable {
    private long thermostatID;

    private int thermostatConfigState;

    public WiFiThermostatConfigInfo() {
    }

    public WiFiThermostatConfigInfo(
           long thermostatID,
           int thermostatConfigState) {
           this.thermostatID = thermostatID;
           this.thermostatConfigState = thermostatConfigState;
    }


    /**
     * Gets the thermostatID value for this WiFiThermostatConfigInfo.
     * 
     * @return thermostatID
     */
    public long getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this WiFiThermostatConfigInfo.
     * 
     * @param thermostatID
     */
    public void setThermostatID(long thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the thermostatConfigState value for this WiFiThermostatConfigInfo.
     * 
     * @return thermostatConfigState
     */
    public int getThermostatConfigState() {
        return thermostatConfigState;
    }


    /**
     * Sets the thermostatConfigState value for this WiFiThermostatConfigInfo.
     * 
     * @param thermostatConfigState
     */
    public void setThermostatConfigState(int thermostatConfigState) {
        this.thermostatConfigState = thermostatConfigState;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiThermostatConfigInfo)) return false;
        WiFiThermostatConfigInfo other = (WiFiThermostatConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.thermostatID == other.getThermostatID() &&
            this.thermostatConfigState == other.getThermostatConfigState();
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
        _hashCode += new Long(getThermostatID()).hashCode();
        _hashCode += getThermostatConfigState();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiThermostatConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiThermostatConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatConfigState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatConfigState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
