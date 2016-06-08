/**
 * WiFiLocationsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiLocationsResults  extends WebMethodResults  implements java.io.Serializable {
    private WiFiLocationInfo[] wiFiLocations;

    public WiFiLocationsResults() {
    }

    public WiFiLocationsResults(
           int resultCode,
           String resultData,
           WiFiLocationInfo[] wiFiLocations) {
        super(
            resultCode,
            resultData);
        this.wiFiLocations = wiFiLocations;
    }


    /**
     * Gets the wiFiLocations value for this WiFiLocationsResults.
     * 
     * @return wiFiLocations
     */
    public WiFiLocationInfo[] getWiFiLocations() {
        return wiFiLocations;
    }


    /**
     * Sets the wiFiLocations value for this WiFiLocationsResults.
     * 
     * @param wiFiLocations
     */
    public void setWiFiLocations(WiFiLocationInfo[] wiFiLocations) {
        this.wiFiLocations = wiFiLocations;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiLocationsResults)) return false;
        WiFiLocationsResults other = (WiFiLocationsResults) obj;
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
        new org.apache.axis.description.TypeDesc(WiFiLocationsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiFiLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationInfo"));
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
