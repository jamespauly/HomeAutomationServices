/**
 * CameraList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraList  implements java.io.Serializable {
    private int cameraCount;

    private CameraInfo[] cameras;

    public CameraList() {
    }

    public CameraList(
           int cameraCount,
           CameraInfo[] cameras) {
           this.cameraCount = cameraCount;
           this.cameras = cameras;
    }


    /**
     * Gets the cameraCount value for this CameraList.
     * 
     * @return cameraCount
     */
    public int getCameraCount() {
        return cameraCount;
    }


    /**
     * Sets the cameraCount value for this CameraList.
     * 
     * @param cameraCount
     */
    public void setCameraCount(int cameraCount) {
        this.cameraCount = cameraCount;
    }


    /**
     * Gets the cameras value for this CameraList.
     * 
     * @return cameras
     */
    public CameraInfo[] getCameras() {
        return cameras;
    }


    /**
     * Sets the cameras value for this CameraList.
     * 
     * @param cameras
     */
    public void setCameras(CameraInfo[] cameras) {
        this.cameras = cameras;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraList)) return false;
        CameraList other = (CameraList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cameraCount == other.getCameraCount() &&
            ((this.cameras==null && other.getCameras()==null) || 
             (this.cameras!=null &&
              java.util.Arrays.equals(this.cameras, other.getCameras())));
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
        _hashCode += getCameraCount();
        if (getCameras() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCameras());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCameras(), i);
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
        new org.apache.axis.description.TypeDesc(CameraList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameras");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Cameras"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInfo"));
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
