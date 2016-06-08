/**
 * SceneSwitchSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneSwitchSubAction  implements java.io.Serializable {
    private long switchID;

    private short switchState;

    private int switchType;

    private short switchLevel;

    public SceneSwitchSubAction() {
    }

    public SceneSwitchSubAction(
           long switchID,
           short switchState,
           int switchType,
           short switchLevel) {
           this.switchID = switchID;
           this.switchState = switchState;
           this.switchType = switchType;
           this.switchLevel = switchLevel;
    }


    /**
     * Gets the switchID value for this SceneSwitchSubAction.
     * 
     * @return switchID
     */
    public long getSwitchID() {
        return switchID;
    }


    /**
     * Sets the switchID value for this SceneSwitchSubAction.
     * 
     * @param switchID
     */
    public void setSwitchID(long switchID) {
        this.switchID = switchID;
    }


    /**
     * Gets the switchState value for this SceneSwitchSubAction.
     * 
     * @return switchState
     */
    public short getSwitchState() {
        return switchState;
    }


    /**
     * Sets the switchState value for this SceneSwitchSubAction.
     * 
     * @param switchState
     */
    public void setSwitchState(short switchState) {
        this.switchState = switchState;
    }


    /**
     * Gets the switchType value for this SceneSwitchSubAction.
     * 
     * @return switchType
     */
    public int getSwitchType() {
        return switchType;
    }


    /**
     * Sets the switchType value for this SceneSwitchSubAction.
     * 
     * @param switchType
     */
    public void setSwitchType(int switchType) {
        this.switchType = switchType;
    }


    /**
     * Gets the switchLevel value for this SceneSwitchSubAction.
     * 
     * @return switchLevel
     */
    public short getSwitchLevel() {
        return switchLevel;
    }


    /**
     * Sets the switchLevel value for this SceneSwitchSubAction.
     * 
     * @param switchLevel
     */
    public void setSwitchLevel(short switchLevel) {
        this.switchLevel = switchLevel;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneSwitchSubAction)) return false;
        SceneSwitchSubAction other = (SceneSwitchSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.switchID == other.getSwitchID() &&
            this.switchState == other.getSwitchState() &&
            this.switchType == other.getSwitchType() &&
            this.switchLevel == other.getSwitchLevel();
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
        _hashCode += new Long(getSwitchID()).hashCode();
        _hashCode += getSwitchState();
        _hashCode += getSwitchType();
        _hashCode += getSwitchLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneSwitchSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
