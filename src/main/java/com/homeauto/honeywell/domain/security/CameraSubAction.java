/**
 * CameraSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraSubAction  implements java.io.Serializable {
    private long subActionID;

    private long deviceID;

    private int type;

    private int action;

    public CameraSubAction() {
    }

    public CameraSubAction(
           long subActionID,
           long deviceID,
           int type,
           int action) {
           this.subActionID = subActionID;
           this.deviceID = deviceID;
           this.type = type;
           this.action = action;
    }


    /**
     * Gets the subActionID value for this CameraSubAction.
     * 
     * @return subActionID
     */
    public long getSubActionID() {
        return subActionID;
    }


    /**
     * Sets the subActionID value for this CameraSubAction.
     * 
     * @param subActionID
     */
    public void setSubActionID(long subActionID) {
        this.subActionID = subActionID;
    }


    /**
     * Gets the deviceID value for this CameraSubAction.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this CameraSubAction.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the type value for this CameraSubAction.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this CameraSubAction.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the action value for this CameraSubAction.
     * 
     * @return action
     */
    public int getAction() {
        return action;
    }


    /**
     * Sets the action value for this CameraSubAction.
     * 
     * @param action
     */
    public void setAction(int action) {
        this.action = action;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraSubAction)) return false;
        CameraSubAction other = (CameraSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subActionID == other.getSubActionID() &&
            this.deviceID == other.getDeviceID() &&
            this.type == other.getType() &&
            this.action == other.getAction();
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
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += getType();
        _hashCode += getAction();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subActionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SubActionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Action"));
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
