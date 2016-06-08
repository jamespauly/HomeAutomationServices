/**
 * PanelMetadataAndStatusInfoEx.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PanelMetadataAndStatusInfoEx extends PanelBaseInfoEx implements java.io.Serializable {
    private ZoneInfo[] zones;

    private boolean promptForImportSecuritySettings;

    public PanelMetadataAndStatusInfoEx() {
    }

    public PanelMetadataAndStatusInfoEx(
            long lastUpdatedTimestampTicks,
            int configurationSequenceNumber,
            boolean isInACLoss,
            boolean isInLowBattery,
            PartitionInfo[] partitions,
            boolean syncSecDeviceFlag,
            ZoneInfo[] zones,
            boolean promptForImportSecuritySettings) {
        super(
                lastUpdatedTimestampTicks,
                configurationSequenceNumber,
                isInACLoss,
                isInLowBattery,
                syncSecDeviceFlag,
                partitions);
        this.zones = zones;
        this.promptForImportSecuritySettings = promptForImportSecuritySettings;
    }


    /**
     * Gets the zones value for this PanelMetadataAndStatusInfoEx.
     *
     * @return zones
     */
    public ZoneInfo[] getZones() {
        return zones;
    }


    /**
     * Sets the zones value for this PanelMetadataAndStatusInfoEx.
     *
     * @param zones
     */
    public void setZones(ZoneInfo[] zones) {
        this.zones = zones;
    }


    /**
     * Gets the promptForImportSecuritySettings value for this PanelMetadataAndStatusInfoEx.
     *
     * @return promptForImportSecuritySettings
     */
    public boolean isPromptForImportSecuritySettings() {
        return promptForImportSecuritySettings;
    }


    /**
     * Sets the promptForImportSecuritySettings value for this PanelMetadataAndStatusInfoEx.
     *
     * @param promptForImportSecuritySettings
     */
    public void setPromptForImportSecuritySettings(boolean promptForImportSecuritySettings) {
        this.promptForImportSecuritySettings = promptForImportSecuritySettings;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelMetadataAndStatusInfoEx)) return false;
        PanelMetadataAndStatusInfoEx other = (PanelMetadataAndStatusInfoEx) obj;
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
                                java.util.Arrays.equals(this.zones, other.getZones()))) &&
                this.promptForImportSecuritySettings == other.isPromptForImportSecuritySettings();
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
        _hashCode += (isPromptForImportSecuritySettings() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PanelMetadataAndStatusInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusInfoEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zones");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Zones"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptForImportSecuritySettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PromptForImportSecuritySettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
