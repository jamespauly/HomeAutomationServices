/**
 * GPSPopupURLResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GPSPopupURLResult  extends WebMethodResults implements java.io.Serializable {
    private String GPSPopupURL;

    public GPSPopupURLResult() {
    }

    public GPSPopupURLResult(
           int resultCode,
           String resultData,
           String GPSPopupURL) {
        super(
            resultCode,
            resultData);
        this.GPSPopupURL = GPSPopupURL;
    }


    /**
     * Gets the GPSPopupURL value for this GPSPopupURLResult.
     * 
     * @return GPSPopupURL
     */
    public String getGPSPopupURL() {
        return GPSPopupURL;
    }


    /**
     * Sets the GPSPopupURL value for this GPSPopupURLResult.
     * 
     * @param GPSPopupURL
     */
    public void setGPSPopupURL(String GPSPopupURL) {
        this.GPSPopupURL = GPSPopupURL;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GPSPopupURLResult)) return false;
        GPSPopupURLResult other = (GPSPopupURLResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.GPSPopupURL==null && other.getGPSPopupURL()==null) || 
             (this.GPSPopupURL!=null &&
              this.GPSPopupURL.equals(other.getGPSPopupURL())));
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
        if (getGPSPopupURL() != null) {
            _hashCode += getGPSPopupURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GPSPopupURLResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSPopupURLResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSPopupURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSPopupURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
