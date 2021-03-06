/**
 * VideoPIREventCaptureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIREventCaptureType  implements java.io.Serializable {
    private int captureTypeID;

    private String captureTypeDescription;

    public VideoPIREventCaptureType() {
    }

    public VideoPIREventCaptureType(
           int captureTypeID,
           String captureTypeDescription) {
           this.captureTypeID = captureTypeID;
           this.captureTypeDescription = captureTypeDescription;
    }


    /**
     * Gets the captureTypeID value for this VideoPIREventCaptureType.
     * 
     * @return captureTypeID
     */
    public int getCaptureTypeID() {
        return captureTypeID;
    }


    /**
     * Sets the captureTypeID value for this VideoPIREventCaptureType.
     * 
     * @param captureTypeID
     */
    public void setCaptureTypeID(int captureTypeID) {
        this.captureTypeID = captureTypeID;
    }


    /**
     * Gets the captureTypeDescription value for this VideoPIREventCaptureType.
     * 
     * @return captureTypeDescription
     */
    public String getCaptureTypeDescription() {
        return captureTypeDescription;
    }


    /**
     * Sets the captureTypeDescription value for this VideoPIREventCaptureType.
     * 
     * @param captureTypeDescription
     */
    public void setCaptureTypeDescription(String captureTypeDescription) {
        this.captureTypeDescription = captureTypeDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIREventCaptureType)) return false;
        VideoPIREventCaptureType other = (VideoPIREventCaptureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.captureTypeID == other.getCaptureTypeID() &&
            ((this.captureTypeDescription==null && other.getCaptureTypeDescription()==null) || 
             (this.captureTypeDescription!=null &&
              this.captureTypeDescription.equals(other.getCaptureTypeDescription())));
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
        _hashCode += getCaptureTypeID();
        if (getCaptureTypeDescription() != null) {
            _hashCode += getCaptureTypeDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPIREventCaptureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventCaptureType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CaptureTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CaptureTypeDescription"));
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
