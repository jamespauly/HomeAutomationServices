/**
 * CameraSimple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraSimple  implements java.io.Serializable {
    private long cameraDeviceID;

    private String cameraName;

    public CameraSimple() {
    }

    public CameraSimple(
           long cameraDeviceID,
           String cameraName) {
           this.cameraDeviceID = cameraDeviceID;
           this.cameraName = cameraName;
    }


    /**
     * Gets the cameraDeviceID value for this CameraSimple.
     * 
     * @return cameraDeviceID
     */
    public long getCameraDeviceID() {
        return cameraDeviceID;
    }


    /**
     * Sets the cameraDeviceID value for this CameraSimple.
     * 
     * @param cameraDeviceID
     */
    public void setCameraDeviceID(long cameraDeviceID) {
        this.cameraDeviceID = cameraDeviceID;
    }


    /**
     * Gets the cameraName value for this CameraSimple.
     * 
     * @return cameraName
     */
    public String getCameraName() {
        return cameraName;
    }


    /**
     * Sets the cameraName value for this CameraSimple.
     * 
     * @param cameraName
     */
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraSimple)) return false;
        CameraSimple other = (CameraSimple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cameraDeviceID == other.getCameraDeviceID() &&
            ((this.cameraName==null && other.getCameraName()==null) || 
             (this.cameraName!=null &&
              this.cameraName.equals(other.getCameraName())));
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
        _hashCode += new Long(getCameraDeviceID()).hashCode();
        if (getCameraName() != null) {
            _hashCode += getCameraName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraSimple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSimple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraName"));
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
