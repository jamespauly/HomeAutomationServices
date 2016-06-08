/**
 * ZoneStatusInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ZoneStatusInfo  implements java.io.Serializable {
    private int zoneID;  // attribute

    private int zoneStatus;  // attribute

    private int zoneTypeId;  // attribute

    public ZoneStatusInfo() {
    }

    public ZoneStatusInfo(
           int zoneID,
           int zoneStatus,
           int zoneTypeId) {
           this.zoneID = zoneID;
           this.zoneStatus = zoneStatus;
           this.zoneTypeId = zoneTypeId;
    }


    /**
     * Gets the zoneID value for this ZoneStatusInfo.
     * 
     * @return zoneID
     */
    public int getZoneID() {
        return zoneID;
    }


    /**
     * Sets the zoneID value for this ZoneStatusInfo.
     * 
     * @param zoneID
     */
    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }


    /**
     * Gets the zoneStatus value for this ZoneStatusInfo.
     * 
     * @return zoneStatus
     */
    public int getZoneStatus() {
        return zoneStatus;
    }


    /**
     * Sets the zoneStatus value for this ZoneStatusInfo.
     * 
     * @param zoneStatus
     */
    public void setZoneStatus(int zoneStatus) {
        this.zoneStatus = zoneStatus;
    }


    /**
     * Gets the zoneTypeId value for this ZoneStatusInfo.
     * 
     * @return zoneTypeId
     */
    public int getZoneTypeId() {
        return zoneTypeId;
    }


    /**
     * Sets the zoneTypeId value for this ZoneStatusInfo.
     * 
     * @param zoneTypeId
     */
    public void setZoneTypeId(int zoneTypeId) {
        this.zoneTypeId = zoneTypeId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZoneStatusInfo)) return false;
        ZoneStatusInfo other = (ZoneStatusInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.zoneID == other.getZoneID() &&
            this.zoneStatus == other.getZoneStatus() &&
            this.zoneTypeId == other.getZoneTypeId();
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
        _hashCode += getZoneStatus();
        _hashCode += getZoneTypeId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZoneStatusInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneTypeId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneTypeId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
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
