/**
 * CustomArmInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CustomArmInfo  implements java.io.Serializable {
    private int armMode;

    private int armDelay;

    private ZoneWithBypassInfo[] zonesList;

    public CustomArmInfo() {
    }

    public CustomArmInfo(
           int armMode,
           int armDelay,
           ZoneWithBypassInfo[] zonesList) {
           this.armMode = armMode;
           this.armDelay = armDelay;
           this.zonesList = zonesList;
    }


    /**
     * Gets the armMode value for this CustomArmInfo.
     * 
     * @return armMode
     */
    public int getArmMode() {
        return armMode;
    }


    /**
     * Sets the armMode value for this CustomArmInfo.
     * 
     * @param armMode
     */
    public void setArmMode(int armMode) {
        this.armMode = armMode;
    }


    /**
     * Gets the armDelay value for this CustomArmInfo.
     * 
     * @return armDelay
     */
    public int getArmDelay() {
        return armDelay;
    }


    /**
     * Sets the armDelay value for this CustomArmInfo.
     * 
     * @param armDelay
     */
    public void setArmDelay(int armDelay) {
        this.armDelay = armDelay;
    }


    /**
     * Gets the zonesList value for this CustomArmInfo.
     * 
     * @return zonesList
     */
    public ZoneWithBypassInfo[] getZonesList() {
        return zonesList;
    }


    /**
     * Sets the zonesList value for this CustomArmInfo.
     * 
     * @param zonesList
     */
    public void setZonesList(ZoneWithBypassInfo[] zonesList) {
        this.zonesList = zonesList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomArmInfo)) return false;
        CustomArmInfo other = (CustomArmInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.armMode == other.getArmMode() &&
            this.armDelay == other.getArmDelay() &&
            ((this.zonesList==null && other.getZonesList()==null) || 
             (this.zonesList!=null &&
              java.util.Arrays.equals(this.zonesList, other.getZonesList())));
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
        _hashCode += getArmMode();
        _hashCode += getArmDelay();
        if (getZonesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZonesList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getZonesList(), i);
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
        new org.apache.axis.description.TypeDesc(CustomArmInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("armDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonesList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZonesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneWithBypassInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneWithBypassInfo"));
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
