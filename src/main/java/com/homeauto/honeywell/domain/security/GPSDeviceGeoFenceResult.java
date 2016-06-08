/**
 * GPSDeviceGeoFenceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GPSDeviceGeoFenceResult  extends WebMethodResults implements java.io.Serializable {
    private GPSDeviceGeoFenceData geoFenceData;

    public GPSDeviceGeoFenceResult() {
    }

    public GPSDeviceGeoFenceResult(
           int resultCode,
           String resultData,
           GPSDeviceGeoFenceData geoFenceData) {
        super(
            resultCode,
            resultData);
        this.geoFenceData = geoFenceData;
    }


    /**
     * Gets the geoFenceData value for this GPSDeviceGeoFenceResult.
     * 
     * @return geoFenceData
     */
    public GPSDeviceGeoFenceData getGeoFenceData() {
        return geoFenceData;
    }


    /**
     * Sets the geoFenceData value for this GPSDeviceGeoFenceResult.
     * 
     * @param geoFenceData
     */
    public void setGeoFenceData(GPSDeviceGeoFenceData geoFenceData) {
        this.geoFenceData = geoFenceData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GPSDeviceGeoFenceResult)) return false;
        GPSDeviceGeoFenceResult other = (GPSDeviceGeoFenceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.geoFenceData==null && other.getGeoFenceData()==null) || 
             (this.geoFenceData!=null &&
              this.geoFenceData.equals(other.getGeoFenceData())));
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
        if (getGeoFenceData() != null) {
            _hashCode += getGeoFenceData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GPSDeviceGeoFenceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceGeoFenceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoFenceData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeoFenceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceGeoFenceData"));
        elemField.setMinOccurs(0);
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
