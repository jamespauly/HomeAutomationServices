/**
 * SceneThermostatSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneThermostatSubAction  implements java.io.Serializable {
    private long thermostatID;

    private int modeID;

    private int fanMode;

    private int heatSetPoint;

    private int coolSetPoint;

    public SceneThermostatSubAction() {
    }

    public SceneThermostatSubAction(
           long thermostatID,
           int modeID,
           int fanMode,
           int heatSetPoint,
           int coolSetPoint) {
           this.thermostatID = thermostatID;
           this.modeID = modeID;
           this.fanMode = fanMode;
           this.heatSetPoint = heatSetPoint;
           this.coolSetPoint = coolSetPoint;
    }


    /**
     * Gets the thermostatID value for this SceneThermostatSubAction.
     * 
     * @return thermostatID
     */
    public long getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this SceneThermostatSubAction.
     * 
     * @param thermostatID
     */
    public void setThermostatID(long thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the modeID value for this SceneThermostatSubAction.
     * 
     * @return modeID
     */
    public int getModeID() {
        return modeID;
    }


    /**
     * Sets the modeID value for this SceneThermostatSubAction.
     * 
     * @param modeID
     */
    public void setModeID(int modeID) {
        this.modeID = modeID;
    }


    /**
     * Gets the fanMode value for this SceneThermostatSubAction.
     * 
     * @return fanMode
     */
    public int getFanMode() {
        return fanMode;
    }


    /**
     * Sets the fanMode value for this SceneThermostatSubAction.
     * 
     * @param fanMode
     */
    public void setFanMode(int fanMode) {
        this.fanMode = fanMode;
    }


    /**
     * Gets the heatSetPoint value for this SceneThermostatSubAction.
     * 
     * @return heatSetPoint
     */
    public int getHeatSetPoint() {
        return heatSetPoint;
    }


    /**
     * Sets the heatSetPoint value for this SceneThermostatSubAction.
     * 
     * @param heatSetPoint
     */
    public void setHeatSetPoint(int heatSetPoint) {
        this.heatSetPoint = heatSetPoint;
    }


    /**
     * Gets the coolSetPoint value for this SceneThermostatSubAction.
     * 
     * @return coolSetPoint
     */
    public int getCoolSetPoint() {
        return coolSetPoint;
    }


    /**
     * Sets the coolSetPoint value for this SceneThermostatSubAction.
     * 
     * @param coolSetPoint
     */
    public void setCoolSetPoint(int coolSetPoint) {
        this.coolSetPoint = coolSetPoint;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneThermostatSubAction)) return false;
        SceneThermostatSubAction other = (SceneThermostatSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.thermostatID == other.getThermostatID() &&
            this.modeID == other.getModeID() &&
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
        _hashCode += new Long(getThermostatID()).hashCode();
        _hashCode += getModeID();
        _hashCode += getFanMode();
        _hashCode += getHeatSetPoint();
        _hashCode += getCoolSetPoint();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneThermostatSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeID"));
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
