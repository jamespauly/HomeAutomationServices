/**
 * CameraConfigurationResults2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraConfigurationResults2  extends CameraConfigurationResults  implements java.io.Serializable {
    private String LIMITS_Data;

    public CameraConfigurationResults2() {
    }

    public CameraConfigurationResults2(
           int resultCode,
           String resultData,
           String cameraName,
           String featureFlags,
           String SYSTEM_Data,
           String VIDEO_Data,
           String MOTION_Data,
           String IO_Data,
           String EVENT_Data,
           String PTZ_Data,
           String LIMITS_Data) {
        super(
            resultCode,
            resultData,
            cameraName,
            featureFlags,
            SYSTEM_Data,
            VIDEO_Data,
            MOTION_Data,
            IO_Data,
            EVENT_Data,
            PTZ_Data);
        this.LIMITS_Data = LIMITS_Data;
    }


    /**
     * Gets the LIMITS_Data value for this CameraConfigurationResults2.
     * 
     * @return LIMITS_Data
     */
    public String getLIMITS_Data() {
        return LIMITS_Data;
    }


    /**
     * Sets the LIMITS_Data value for this CameraConfigurationResults2.
     * 
     * @param LIMITS_Data
     */
    public void setLIMITS_Data(String LIMITS_Data) {
        this.LIMITS_Data = LIMITS_Data;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraConfigurationResults2)) return false;
        CameraConfigurationResults2 other = (CameraConfigurationResults2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.LIMITS_Data==null && other.getLIMITS_Data()==null) || 
             (this.LIMITS_Data!=null &&
              this.LIMITS_Data.equals(other.getLIMITS_Data())));
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
        if (getLIMITS_Data() != null) {
            _hashCode += getLIMITS_Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraConfigurationResults2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraConfigurationResults2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LIMITS_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LIMITS_Data"));
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
