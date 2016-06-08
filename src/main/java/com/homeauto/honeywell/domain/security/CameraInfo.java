/**
 * CameraInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraInfo  implements java.io.Serializable {
    private String MAC;

    private String cameraName;

    private String featureFlags;

    private org.apache.axis.types.UnsignedByte defaultCamera;

    public CameraInfo() {
    }

    public CameraInfo(
           String MAC,
           String cameraName,
           String featureFlags,
           org.apache.axis.types.UnsignedByte defaultCamera) {
           this.MAC = MAC;
           this.cameraName = cameraName;
           this.featureFlags = featureFlags;
           this.defaultCamera = defaultCamera;
    }


    /**
     * Gets the MAC value for this CameraInfo.
     * 
     * @return MAC
     */
    public String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this CameraInfo.
     * 
     * @param MAC
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }


    /**
     * Gets the cameraName value for this CameraInfo.
     * 
     * @return cameraName
     */
    public String getCameraName() {
        return cameraName;
    }


    /**
     * Sets the cameraName value for this CameraInfo.
     * 
     * @param cameraName
     */
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }


    /**
     * Gets the featureFlags value for this CameraInfo.
     * 
     * @return featureFlags
     */
    public String getFeatureFlags() {
        return featureFlags;
    }


    /**
     * Sets the featureFlags value for this CameraInfo.
     * 
     * @param featureFlags
     */
    public void setFeatureFlags(String featureFlags) {
        this.featureFlags = featureFlags;
    }


    /**
     * Gets the defaultCamera value for this CameraInfo.
     * 
     * @return defaultCamera
     */
    public org.apache.axis.types.UnsignedByte getDefaultCamera() {
        return defaultCamera;
    }


    /**
     * Sets the defaultCamera value for this CameraInfo.
     * 
     * @param defaultCamera
     */
    public void setDefaultCamera(org.apache.axis.types.UnsignedByte defaultCamera) {
        this.defaultCamera = defaultCamera;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraInfo)) return false;
        CameraInfo other = (CameraInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC()))) &&
            ((this.cameraName==null && other.getCameraName()==null) || 
             (this.cameraName!=null &&
              this.cameraName.equals(other.getCameraName()))) &&
            ((this.featureFlags==null && other.getFeatureFlags()==null) || 
             (this.featureFlags!=null &&
              this.featureFlags.equals(other.getFeatureFlags()))) &&
            ((this.defaultCamera==null && other.getDefaultCamera()==null) || 
             (this.defaultCamera!=null &&
              this.defaultCamera.equals(other.getDefaultCamera())));
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
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        if (getCameraName() != null) {
            _hashCode += getCameraName().hashCode();
        }
        if (getFeatureFlags() != null) {
            _hashCode += getFeatureFlags().hashCode();
        }
        if (getDefaultCamera() != null) {
            _hashCode += getDefaultCamera().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCamera");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DefaultCamera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
