/**
 * PanelStatusInfo.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PanelStatusInfo extends PanelBaseInfo implements java.io.Serializable {
    private ZoneStatusInfo[] zones;

    public PanelStatusInfo() {
    }

    public PanelStatusInfo(
            long lastUpdatedTimestampTicks,
            int configurationSequenceNumber,
            boolean isInACLoss,
            boolean isInLowBattery,
            PartitionInfo[] partitions,
            ZoneStatusInfo[] zones) {
        super(
                partitions,
                lastUpdatedTimestampTicks,
                configurationSequenceNumber,
                isInACLoss,
                isInLowBattery
        );
        this.zones = zones;
    }


    /**
     * Gets the zones value for this PanelStatusInfo.
     *
     * @return zones
     */
    public ZoneStatusInfo[] getZones() {
        return zones;
    }


    /**
     * Sets the zones value for this PanelStatusInfo.
     *
     * @param zones
     */
    public void setZones(ZoneStatusInfo[] zones) {
        this.zones = zones;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelStatusInfo)) return false;
        PanelStatusInfo other = (PanelStatusInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
                ((this.zones == null && other.getZones() == null) ||
                        (this.zones != null &&
                                java.util.Arrays.equals(this.zones, other.getZones())));
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
        if (getZones() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getZones());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getZones(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PanelStatusInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zones");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Zones"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfo"));
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
