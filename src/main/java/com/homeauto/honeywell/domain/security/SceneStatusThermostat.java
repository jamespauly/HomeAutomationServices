/**
 * SceneStatusThermostat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneStatusThermostat  implements java.io.Serializable {
    private ThermostatInfo sceneThermostatInfo;

    private SceneThermostat sceneThermostat;

    public SceneStatusThermostat() {
    }

    public SceneStatusThermostat(
           ThermostatInfo sceneThermostatInfo,
           SceneThermostat sceneThermostat) {
           this.sceneThermostatInfo = sceneThermostatInfo;
           this.sceneThermostat = sceneThermostat;
    }


    /**
     * Gets the sceneThermostatInfo value for this SceneStatusThermostat.
     * 
     * @return sceneThermostatInfo
     */
    public ThermostatInfo getSceneThermostatInfo() {
        return sceneThermostatInfo;
    }


    /**
     * Sets the sceneThermostatInfo value for this SceneStatusThermostat.
     * 
     * @param sceneThermostatInfo
     */
    public void setSceneThermostatInfo(ThermostatInfo sceneThermostatInfo) {
        this.sceneThermostatInfo = sceneThermostatInfo;
    }


    /**
     * Gets the sceneThermostat value for this SceneStatusThermostat.
     * 
     * @return sceneThermostat
     */
    public SceneThermostat getSceneThermostat() {
        return sceneThermostat;
    }


    /**
     * Sets the sceneThermostat value for this SceneStatusThermostat.
     * 
     * @param sceneThermostat
     */
    public void setSceneThermostat(SceneThermostat sceneThermostat) {
        this.sceneThermostat = sceneThermostat;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneStatusThermostat)) return false;
        SceneStatusThermostat other = (SceneStatusThermostat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sceneThermostatInfo==null && other.getSceneThermostatInfo()==null) || 
             (this.sceneThermostatInfo!=null &&
              this.sceneThermostatInfo.equals(other.getSceneThermostatInfo()))) &&
            ((this.sceneThermostat==null && other.getSceneThermostat()==null) || 
             (this.sceneThermostat!=null &&
              this.sceneThermostat.equals(other.getSceneThermostat())));
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
        if (getSceneThermostatInfo() != null) {
            _hashCode += getSceneThermostatInfo().hashCode();
        }
        if (getSceneThermostat() != null) {
            _hashCode += getSceneThermostat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneStatusThermostat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusThermostat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostatInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat"));
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
