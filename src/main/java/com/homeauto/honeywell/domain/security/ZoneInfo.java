/**
 * ZoneInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ZoneInfo  implements java.io.Serializable {
    private int zoneID;  // attribute

    private String zoneDescription;  // attribute

    private int zoneStatus;  // attribute

    private int partitionID;  // attribute

    public ZoneInfo() {
    }

    public ZoneInfo(
           int zoneID,
           String zoneDescription,
           int zoneStatus,
           int partitionID) {
           this.zoneID = zoneID;
           this.zoneDescription = zoneDescription;
           this.zoneStatus = zoneStatus;
           this.partitionID = partitionID;
    }


    /**
     * Gets the zoneID value for this ZoneInfo.
     * 
     * @return zoneID
     */
    public int getZoneID() {
        return zoneID;
    }


    /**
     * Sets the zoneID value for this ZoneInfo.
     * 
     * @param zoneID
     */
    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }


    /**
     * Gets the zoneDescription value for this ZoneInfo.
     * 
     * @return zoneDescription
     */
    public String getZoneDescription() {
        return zoneDescription;
    }


    /**
     * Sets the zoneDescription value for this ZoneInfo.
     * 
     * @param zoneDescription
     */
    public void setZoneDescription(String zoneDescription) {
        this.zoneDescription = zoneDescription;
    }


    /**
     * Gets the zoneStatus value for this ZoneInfo.
     * 
     * @return zoneStatus
     */
    public int getZoneStatus() {
        return zoneStatus;
    }


    /**
     * Sets the zoneStatus value for this ZoneInfo.
     * 
     * @param zoneStatus
     */
    public void setZoneStatus(int zoneStatus) {
        this.zoneStatus = zoneStatus;
    }


    /**
     * Gets the partitionID value for this ZoneInfo.
     * 
     * @return partitionID
     */
    public int getPartitionID() {
        return partitionID;
    }


    /**
     * Sets the partitionID value for this ZoneInfo.
     * 
     * @param partitionID
     */
    public void setPartitionID(int partitionID) {
        this.partitionID = partitionID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZoneInfo)) return false;
        ZoneInfo other = (ZoneInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.zoneID == other.getZoneID() &&
            ((this.zoneDescription==null && other.getZoneDescription()==null) || 
             (this.zoneDescription!=null &&
              this.zoneDescription.equals(other.getZoneDescription()))) &&
            this.zoneStatus == other.getZoneStatus() &&
            this.partitionID == other.getPartitionID();
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
        if (getZoneDescription() != null) {
            _hashCode += getZoneDescription().hashCode();
        }
        _hashCode += getZoneStatus();
        _hashCode += getPartitionID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZoneInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("zoneStatus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ZoneStatus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("partitionID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PartitionID"));
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
