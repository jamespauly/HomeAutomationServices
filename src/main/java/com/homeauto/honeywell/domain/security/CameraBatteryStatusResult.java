/**
 * CameraBatteryStatusResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraBatteryStatusResult  extends WebMethodResults implements java.io.Serializable {
    private int batteryStrength;

    private String voltage;

    public CameraBatteryStatusResult() {
    }

    public CameraBatteryStatusResult(
           int resultCode,
           String resultData,
           int batteryStrength,
           String voltage) {
        super(
            resultCode,
            resultData);
        this.batteryStrength = batteryStrength;
        this.voltage = voltage;
    }


    /**
     * Gets the batteryStrength value for this CameraBatteryStatusResult.
     * 
     * @return batteryStrength
     */
    public int getBatteryStrength() {
        return batteryStrength;
    }


    /**
     * Sets the batteryStrength value for this CameraBatteryStatusResult.
     * 
     * @param batteryStrength
     */
    public void setBatteryStrength(int batteryStrength) {
        this.batteryStrength = batteryStrength;
    }


    /**
     * Gets the voltage value for this CameraBatteryStatusResult.
     * 
     * @return voltage
     */
    public String getVoltage() {
        return voltage;
    }


    /**
     * Sets the voltage value for this CameraBatteryStatusResult.
     * 
     * @param voltage
     */
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraBatteryStatusResult)) return false;
        CameraBatteryStatusResult other = (CameraBatteryStatusResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.batteryStrength == other.getBatteryStrength() &&
            ((this.voltage==null && other.getVoltage()==null) || 
             (this.voltage!=null &&
              this.voltage.equals(other.getVoltage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getBatteryStrength();
        if (getVoltage() != null) {
            _hashCode += getVoltage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraBatteryStatusResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraBatteryStatusResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryStrength");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BatteryStrength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voltage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Voltage"));
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
