/**
 * GeofenceListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GeofenceListResult  extends WebMethodResults implements java.io.Serializable {
    private GeofenceInfo[] geoFences;

    public GeofenceListResult() {
    }

    public GeofenceListResult(
           int resultCode,
           String resultData,
           GeofenceInfo[] geoFences) {
        super(
            resultCode,
            resultData);
        this.geoFences = geoFences;
    }


    /**
     * Gets the geoFences value for this GeofenceListResult.
     * 
     * @return geoFences
     */
    public GeofenceInfo[] getGeoFences() {
        return geoFences;
    }


    /**
     * Sets the geoFences value for this GeofenceListResult.
     * 
     * @param geoFences
     */
    public void setGeoFences(GeofenceInfo[] geoFences) {
        this.geoFences = geoFences;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeofenceListResult)) return false;
        GeofenceListResult other = (GeofenceListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.geoFences==null && other.getGeoFences()==null) || 
             (this.geoFences!=null &&
              java.util.Arrays.equals(this.geoFences, other.getGeoFences())));
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
        if (getGeoFences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGeoFences());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGeoFences(), i);
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
        new org.apache.axis.description.TypeDesc(GeofenceListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoFences");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeoFences"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceInfo"));
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
