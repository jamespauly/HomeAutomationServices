/**
 * ZoneStatusInfoEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ZoneStatusInfoEx  extends ZoneStatusInfo  implements java.io.Serializable {
    private int canBeBypassed;  // attribute

    private String zoneFlags;  // attribute

    public ZoneStatusInfoEx() {
    }

    public ZoneStatusInfoEx(
           int zoneID,
           int zoneStatus,
           int zoneTypeId,
           int canBeBypassed,
           String zoneFlags) {
        super(
            zoneID,
            zoneStatus,
            zoneTypeId);
        this.canBeBypassed = canBeBypassed;
        this.zoneFlags = zoneFlags;
    }


    /**
     * Gets the canBeBypassed value for this ZoneStatusInfoEx.
     * 
     * @return canBeBypassed
     */
    public int getCanBeBypassed() {
        return canBeBypassed;
    }


    /**
     * Sets the canBeBypassed value for this ZoneStatusInfoEx.
     * 
     * @param canBeBypassed
     */
    public void setCanBeBypassed(int canBeBypassed) {
        this.canBeBypassed = canBeBypassed;
    }


    /**
     * Gets the zoneFlags value for this ZoneStatusInfoEx.
     * 
     * @return zoneFlags
     */
    public String getZoneFlags() {
        return zoneFlags;
    }


    /**
     * Sets the zoneFlags value for this ZoneStatusInfoEx.
     * 
     * @param zoneFlags
     */
    public void setZoneFlags(String zoneFlags) {
        this.zoneFlags = zoneFlags;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZoneStatusInfoEx)) return false;
        ZoneStatusInfoEx other = (ZoneStatusInfoEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.canBeBypassed == other.getCanBeBypassed() &&
            ((this.zoneFlags==null && other.getZoneFlags()==null) || 
             (this.zoneFlags!=null &&
              this.zoneFlags.equals(other.getZoneFlags())));
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
        _hashCode += getCanBeBypassed();
        if (getZoneFlags() != null) {
            _hashCode += getZoneFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZoneStatusInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfoEx"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("canBeBypassed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CanBeBypassed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneFlags");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneFlags"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
