/**
 * ThermostatSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ThermostatSubAction  implements java.io.Serializable {
    private long subActionID;

    private long thermostatID;

    private int mode;

    private int fanMode;

    private int heatSetPoint;

    private int coolSetPoint;

    public ThermostatSubAction() {
    }

    public ThermostatSubAction(
           long subActionID,
           long thermostatID,
           int mode,
           int fanMode,
           int heatSetPoint,
           int coolSetPoint) {
           this.subActionID = subActionID;
           this.thermostatID = thermostatID;
           this.mode = mode;
           this.fanMode = fanMode;
           this.heatSetPoint = heatSetPoint;
           this.coolSetPoint = coolSetPoint;
    }


    /**
     * Gets the subActionID value for this ThermostatSubAction.
     * 
     * @return subActionID
     */
    public long getSubActionID() {
        return subActionID;
    }


    /**
     * Sets the subActionID value for this ThermostatSubAction.
     * 
     * @param subActionID
     */
    public void setSubActionID(long subActionID) {
        this.subActionID = subActionID;
    }


    /**
     * Gets the thermostatID value for this ThermostatSubAction.
     * 
     * @return thermostatID
     */
    public long getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this ThermostatSubAction.
     * 
     * @param thermostatID
     */
    public void setThermostatID(long thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the mode value for this ThermostatSubAction.
     * 
     * @return mode
     */
    public int getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this ThermostatSubAction.
     * 
     * @param mode
     */
    public void setMode(int mode) {
        this.mode = mode;
    }


    /**
     * Gets the fanMode value for this ThermostatSubAction.
     * 
     * @return fanMode
     */
    public int getFanMode() {
        return fanMode;
    }


    /**
     * Sets the fanMode value for this ThermostatSubAction.
     * 
     * @param fanMode
     */
    public void setFanMode(int fanMode) {
        this.fanMode = fanMode;
    }


    /**
     * Gets the heatSetPoint value for this ThermostatSubAction.
     * 
     * @return heatSetPoint
     */
    public int getHeatSetPoint() {
        return heatSetPoint;
    }


    /**
     * Sets the heatSetPoint value for this ThermostatSubAction.
     * 
     * @param heatSetPoint
     */
    public void setHeatSetPoint(int heatSetPoint) {
        this.heatSetPoint = heatSetPoint;
    }


    /**
     * Gets the coolSetPoint value for this ThermostatSubAction.
     * 
     * @return coolSetPoint
     */
    public int getCoolSetPoint() {
        return coolSetPoint;
    }


    /**
     * Sets the coolSetPoint value for this ThermostatSubAction.
     * 
     * @param coolSetPoint
     */
    public void setCoolSetPoint(int coolSetPoint) {
        this.coolSetPoint = coolSetPoint;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ThermostatSubAction)) return false;
        ThermostatSubAction other = (ThermostatSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subActionID == other.getSubActionID() &&
            this.thermostatID == other.getThermostatID() &&
            this.mode == other.getMode() &&
            this.fanMode == other.getFanMode() &&
            this.heatSetPoint == other.getHeatSetPoint() &&
            this.coolSetPoint == other.getCoolSetPoint();
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
        _hashCode += new Long(getSubActionID()).hashCode();
        _hashCode += new Long(getThermostatID()).hashCode();
        _hashCode += getMode();
        _hashCode += getFanMode();
        _hashCode += getHeatSetPoint();
        _hashCode += getCoolSetPoint();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subActionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SubActionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fanMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FanMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolSetPoint"));
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
