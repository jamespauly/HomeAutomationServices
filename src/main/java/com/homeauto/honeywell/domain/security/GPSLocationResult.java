/**
 * GPSLocationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GPSLocationResult  extends WebMethodResults implements java.io.Serializable {
    private GPSLocationInfo GPSLocationData;

    public GPSLocationResult() {
    }

    public GPSLocationResult(
           int resultCode,
           String resultData,
           GPSLocationInfo GPSLocationData) {
        super(
            resultCode,
            resultData);
        this.GPSLocationData = GPSLocationData;
    }


    /**
     * Gets the GPSLocationData value for this GPSLocationResult.
     * 
     * @return GPSLocationData
     */
    public GPSLocationInfo getGPSLocationData() {
        return GPSLocationData;
    }


    /**
     * Sets the GPSLocationData value for this GPSLocationResult.
     * 
     * @param GPSLocationData
     */
    public void setGPSLocationData(GPSLocationInfo GPSLocationData) {
        this.GPSLocationData = GPSLocationData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GPSLocationResult)) return false;
        GPSLocationResult other = (GPSLocationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.GPSLocationData==null && other.getGPSLocationData()==null) || 
             (this.GPSLocationData!=null &&
              this.GPSLocationData.equals(other.getGPSLocationData())));
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
        if (getGPSLocationData() != null) {
            _hashCode += getGPSLocationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GPSLocationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSLocationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSLocationData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSLocationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSLocationInfo"));
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
