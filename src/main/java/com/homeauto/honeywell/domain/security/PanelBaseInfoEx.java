/**
 * PanelBaseInfoEx.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public abstract class PanelBaseInfoEx extends PanelBaseInfo implements java.io.Serializable {
    private boolean syncSecDeviceFlag;  // attribute

    public PanelBaseInfoEx() {
    }

   /* PartitionInfo[] partitions,
    long lastUpdatedTimestampTicks,
    int configurationSequenceNumber,
    boolean isInACLoss,
    boolean isInLowBattery) {*/

    public PanelBaseInfoEx(
            long lastUpdatedTimestampTicks,
            int configurationSequenceNumber,
            boolean isInACLoss,
            boolean isInLowBattery,
            boolean syncSecDeviceFlag,
            PartitionInfo[] partitions) {
        super(
                partitions,
                lastUpdatedTimestampTicks,
                configurationSequenceNumber,
                isInACLoss,
                isInLowBattery);
        this.syncSecDeviceFlag = syncSecDeviceFlag;
    }


    /**
     * Gets the syncSecDeviceFlag value for this PanelBaseInfoEx.
     *
     * @return syncSecDeviceFlag
     */
    public boolean isSyncSecDeviceFlag() {
        return syncSecDeviceFlag;
    }


    /**
     * Sets the syncSecDeviceFlag value for this PanelBaseInfoEx.
     *
     * @param syncSecDeviceFlag
     */
    public void setSyncSecDeviceFlag(boolean syncSecDeviceFlag) {
        this.syncSecDeviceFlag = syncSecDeviceFlag;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelBaseInfoEx)) return false;
        PanelBaseInfoEx other = (PanelBaseInfoEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                this.syncSecDeviceFlag == other.isSyncSecDeviceFlag();
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
        _hashCode += (isSyncSecDeviceFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PanelBaseInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelBaseInfoEx"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("syncSecDeviceFlag");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SyncSecDeviceFlag"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
                new org.apache.axis.encoding.ser.BeanSerializer(
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
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
