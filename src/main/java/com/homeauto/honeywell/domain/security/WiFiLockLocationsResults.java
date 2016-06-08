/**
 * WiFiLockLocationsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiLockLocationsResults  extends WebMethodResults  implements java.io.Serializable {
    private WiFiLockLocationInfo[] wiFiLocations;

    public WiFiLockLocationsResults() {
    }

    public WiFiLockLocationsResults(
           int resultCode,
           String resultData,
           WiFiLockLocationInfo[] wiFiLocations) {
        super(
            resultCode,
            resultData);
        this.wiFiLocations = wiFiLocations;
    }


    /**
     * Gets the wiFiLocations value for this WiFiLockLocationsResults.
     * 
     * @return wiFiLocations
     */
    public WiFiLockLocationInfo[] getWiFiLocations() {
        return wiFiLocations;
    }


    /**
     * Sets the wiFiLocations value for this WiFiLockLocationsResults.
     * 
     * @param wiFiLocations
     */
    public void setWiFiLocations(WiFiLockLocationInfo[] wiFiLocations) {
        this.wiFiLocations = wiFiLocations;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiLockLocationsResults)) return false;
        WiFiLockLocationsResults other = (WiFiLockLocationsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.wiFiLocations==null && other.getWiFiLocations()==null) || 
             (this.wiFiLocations!=null &&
              java.util.Arrays.equals(this.wiFiLocations, other.getWiFiLocations())));
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
        if (getWiFiLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWiFiLocations());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWiFiLocations(), i);
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
        new org.apache.axis.description.TypeDesc(WiFiLockLocationsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiFiLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationInfo"));
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
