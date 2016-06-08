/**
 * WAPClientsListResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WAPClientsListResults  extends WebMethodResults implements java.io.Serializable {
    private CameraSignalStrength[] WAPClients;

    public WAPClientsListResults() {
    }

    public WAPClientsListResults(
           int resultCode,
           String resultData,
           CameraSignalStrength[] WAPClients) {
        super(
            resultCode,
            resultData);
        this.WAPClients = WAPClients;
    }


    /**
     * Gets the WAPClients value for this WAPClientsListResults.
     * 
     * @return WAPClients
     */
    public CameraSignalStrength[] getWAPClients() {
        return WAPClients;
    }


    /**
     * Sets the WAPClients value for this WAPClientsListResults.
     * 
     * @param WAPClients
     */
    public void setWAPClients(CameraSignalStrength[] WAPClients) {
        this.WAPClients = WAPClients;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WAPClientsListResults)) return false;
        WAPClientsListResults other = (WAPClientsListResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.WAPClients==null && other.getWAPClients()==null) || 
             (this.WAPClients!=null &&
              java.util.Arrays.equals(this.WAPClients, other.getWAPClients())));
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
        if (getWAPClients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWAPClients());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWAPClients(), i);
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
        new org.apache.axis.description.TypeDesc(WAPClientsListResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WAPClientsListResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WAPClients");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WAPClients"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength"));
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
