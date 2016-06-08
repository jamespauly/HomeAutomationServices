/**
 * SceneThermostat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneThermostat  implements java.io.Serializable {
    private long thermostatID;

    private int sceneThermostatModeID;

    private int sceneThermostatFanMode;

    private int sceneThermostatHeatSetPoint;

    private int sceneThermostatCoolSetPoint;

    public SceneThermostat() {
    }

    public SceneThermostat(
           long thermostatID,
           int sceneThermostatModeID,
           int sceneThermostatFanMode,
           int sceneThermostatHeatSetPoint,
           int sceneThermostatCoolSetPoint) {
           this.thermostatID = thermostatID;
           this.sceneThermostatModeID = sceneThermostatModeID;
           this.sceneThermostatFanMode = sceneThermostatFanMode;
           this.sceneThermostatHeatSetPoint = sceneThermostatHeatSetPoint;
           this.sceneThermostatCoolSetPoint = sceneThermostatCoolSetPoint;
    }


    /**
     * Gets the thermostatID value for this SceneThermostat.
     * 
     * @return thermostatID
     */
    public long getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this SceneThermostat.
     * 
     * @param thermostatID
     */
    public void setThermostatID(long thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the sceneThermostatModeID value for this SceneThermostat.
     * 
     * @return sceneThermostatModeID
     */
    public int getSceneThermostatModeID() {
        return sceneThermostatModeID;
    }


    /**
     * Sets the sceneThermostatModeID value for this SceneThermostat.
     * 
     * @param sceneThermostatModeID
     */
    public void setSceneThermostatModeID(int sceneThermostatModeID) {
        this.sceneThermostatModeID = sceneThermostatModeID;
    }


    /**
     * Gets the sceneThermostatFanMode value for this SceneThermostat.
     * 
     * @return sceneThermostatFanMode
     */
    public int getSceneThermostatFanMode() {
        return sceneThermostatFanMode;
    }


    /**
     * Sets the sceneThermostatFanMode value for this SceneThermostat.
     * 
     * @param sceneThermostatFanMode
     */
    public void setSceneThermostatFanMode(int sceneThermostatFanMode) {
        this.sceneThermostatFanMode = sceneThermostatFanMode;
    }


    /**
     * Gets the sceneThermostatHeatSetPoint value for this SceneThermostat.
     * 
     * @return sceneThermostatHeatSetPoint
     */
    public int getSceneThermostatHeatSetPoint() {
        return sceneThermostatHeatSetPoint;
    }


    /**
     * Sets the sceneThermostatHeatSetPoint value for this SceneThermostat.
     * 
     * @param sceneThermostatHeatSetPoint
     */
    public void setSceneThermostatHeatSetPoint(int sceneThermostatHeatSetPoint) {
        this.sceneThermostatHeatSetPoint = sceneThermostatHeatSetPoint;
    }


    /**
     * Gets the sceneThermostatCoolSetPoint value for this SceneThermostat.
     * 
     * @return sceneThermostatCoolSetPoint
     */
    public int getSceneThermostatCoolSetPoint() {
        return sceneThermostatCoolSetPoint;
    }


    /**
     * Sets the sceneThermostatCoolSetPoint value for this SceneThermostat.
     * 
     * @param sceneThermostatCoolSetPoint
     */
    public void setSceneThermostatCoolSetPoint(int sceneThermostatCoolSetPoint) {
        this.sceneThermostatCoolSetPoint = sceneThermostatCoolSetPoint;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneThermostat)) return false;
        SceneThermostat other = (SceneThermostat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.thermostatID == other.getThermostatID() &&
            this.sceneThermostatModeID == other.getSceneThermostatModeID() &&
            this.sceneThermostatFanMode == other.getSceneThermostatFanMode() &&
            this.sceneThermostatHeatSetPoint == other.getSceneThermostatHeatSetPoint() &&
            this.sceneThermostatCoolSetPoint == other.getSceneThermostatCoolSetPoint();
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
        _hashCode += getSceneThermostatModeID();
        _hashCode += getSceneThermostatFanMode();
        _hashCode += getSceneThermostatHeatSetPoint();
        _hashCode += getSceneThermostatCoolSetPoint();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneThermostat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostatModeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatModeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostatFanMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatFanMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostatHeatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatHeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostatCoolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatCoolSetPoint"));
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
