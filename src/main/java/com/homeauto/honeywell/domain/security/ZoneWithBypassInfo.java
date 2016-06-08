/**
 * ZoneWithBypassInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ZoneWithBypassInfo  implements java.io.Serializable {
    private int zoneID;

    private boolean byPass;

    private int zoneStatus;

    public ZoneWithBypassInfo() {
    }

    public ZoneWithBypassInfo(
           int zoneID,
           boolean byPass,
           int zoneStatus) {
           this.zoneID = zoneID;
           this.byPass = byPass;
           this.zoneStatus = zoneStatus;
    }


    /**
     * Gets the zoneID value for this ZoneWithBypassInfo.
     * 
     * @return zoneID
     */
    public int getZoneID() {
        return zoneID;
    }


    /**
     * Sets the zoneID value for this ZoneWithBypassInfo.
     * 
     * @param zoneID
     */
    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }


    /**
     * Gets the byPass value for this ZoneWithBypassInfo.
     * 
     * @return byPass
     */
    public boolean isByPass() {
        return byPass;
    }


    /**
     * Sets the byPass value for this ZoneWithBypassInfo.
     * 
     * @param byPass
     */
    public void setByPass(boolean byPass) {
        this.byPass = byPass;
    }


    /**
     * Gets the zoneStatus value for this ZoneWithBypassInfo.
     * 
     * @return zoneStatus
     */
    public int getZoneStatus() {
        return zoneStatus;
    }


    /**
     * Sets the zoneStatus value for this ZoneWithBypassInfo.
     * 
     * @param zoneStatus
     */
    public void setZoneStatus(int zoneStatus) {
        this.zoneStatus = zoneStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZoneWithBypassInfo)) return false;
        ZoneWithBypassInfo other = (ZoneWithBypassInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.zoneID == other.getZoneID() &&
            this.byPass == other.isByPass() &&
            this.zoneStatus == other.getZoneStatus();
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
        _hashCode += getZoneID();
        _hashCode += (isByPass() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getZoneStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZoneWithBypassInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneWithBypassInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byPass");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ByPass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatus"));
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
