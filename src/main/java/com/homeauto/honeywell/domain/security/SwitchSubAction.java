/**
 * SwitchSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SwitchSubAction  implements java.io.Serializable {
    private long subActionID;

    private int switchType;

    private long switchID;

    private int state;

    private int level;

    public SwitchSubAction() {
    }

    public SwitchSubAction(
           long subActionID,
           int switchType,
           long switchID,
           int state,
           int level) {
           this.subActionID = subActionID;
           this.switchType = switchType;
           this.switchID = switchID;
           this.state = state;
           this.level = level;
    }


    /**
     * Gets the subActionID value for this SwitchSubAction.
     * 
     * @return subActionID
     */
    public long getSubActionID() {
        return subActionID;
    }


    /**
     * Sets the subActionID value for this SwitchSubAction.
     * 
     * @param subActionID
     */
    public void setSubActionID(long subActionID) {
        this.subActionID = subActionID;
    }


    /**
     * Gets the switchType value for this SwitchSubAction.
     * 
     * @return switchType
     */
    public int getSwitchType() {
        return switchType;
    }


    /**
     * Sets the switchType value for this SwitchSubAction.
     * 
     * @param switchType
     */
    public void setSwitchType(int switchType) {
        this.switchType = switchType;
    }


    /**
     * Gets the switchID value for this SwitchSubAction.
     * 
     * @return switchID
     */
    public long getSwitchID() {
        return switchID;
    }


    /**
     * Sets the switchID value for this SwitchSubAction.
     * 
     * @param switchID
     */
    public void setSwitchID(long switchID) {
        this.switchID = switchID;
    }


    /**
     * Gets the state value for this SwitchSubAction.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this SwitchSubAction.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the level value for this SwitchSubAction.
     * 
     * @return level
     */
    public int getLevel() {
        return level;
    }


    /**
     * Sets the level value for this SwitchSubAction.
     * 
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SwitchSubAction)) return false;
        SwitchSubAction other = (SwitchSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subActionID == other.getSubActionID() &&
            this.switchType == other.getSwitchType() &&
            this.switchID == other.getSwitchID() &&
            this.state == other.getState() &&
            this.level == other.getLevel();
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
        _hashCode += getSwitchType();
        _hashCode += new Long(getSwitchID()).hashCode();
        _hashCode += getState();
        _hashCode += getLevel();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwitchSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subActionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SubActionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Level"));
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
