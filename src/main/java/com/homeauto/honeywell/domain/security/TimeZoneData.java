/**
 * TimeZoneData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TimeZoneData  implements java.io.Serializable {
    private int timeZoneID;

    private String timeZoneName;

    private int cameraTimeZoneID;

    private boolean isDSTSupported;

    public TimeZoneData() {
    }

    public TimeZoneData(
           int timeZoneID,
           String timeZoneName,
           int cameraTimeZoneID,
           boolean isDSTSupported) {
           this.timeZoneID = timeZoneID;
           this.timeZoneName = timeZoneName;
           this.cameraTimeZoneID = cameraTimeZoneID;
           this.isDSTSupported = isDSTSupported;
    }


    /**
     * Gets the timeZoneID value for this TimeZoneData.
     * 
     * @return timeZoneID
     */
    public int getTimeZoneID() {
        return timeZoneID;
    }


    /**
     * Sets the timeZoneID value for this TimeZoneData.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(int timeZoneID) {
        this.timeZoneID = timeZoneID;
    }


    /**
     * Gets the timeZoneName value for this TimeZoneData.
     * 
     * @return timeZoneName
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }


    /**
     * Sets the timeZoneName value for this TimeZoneData.
     * 
     * @param timeZoneName
     */
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }


    /**
     * Gets the cameraTimeZoneID value for this TimeZoneData.
     * 
     * @return cameraTimeZoneID
     */
    public int getCameraTimeZoneID() {
        return cameraTimeZoneID;
    }


    /**
     * Sets the cameraTimeZoneID value for this TimeZoneData.
     * 
     * @param cameraTimeZoneID
     */
    public void setCameraTimeZoneID(int cameraTimeZoneID) {
        this.cameraTimeZoneID = cameraTimeZoneID;
    }


    /**
     * Gets the isDSTSupported value for this TimeZoneData.
     * 
     * @return isDSTSupported
     */
    public boolean isIsDSTSupported() {
        return isDSTSupported;
    }


    /**
     * Sets the isDSTSupported value for this TimeZoneData.
     * 
     * @param isDSTSupported
     */
    public void setIsDSTSupported(boolean isDSTSupported) {
        this.isDSTSupported = isDSTSupported;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeZoneData)) return false;
        TimeZoneData other = (TimeZoneData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.timeZoneID == other.getTimeZoneID() &&
            ((this.timeZoneName==null && other.getTimeZoneName()==null) || 
             (this.timeZoneName!=null &&
              this.timeZoneName.equals(other.getTimeZoneName()))) &&
            this.cameraTimeZoneID == other.getCameraTimeZoneID() &&
            this.isDSTSupported == other.isIsDSTSupported();
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
        _hashCode += getTimeZoneID();
        if (getTimeZoneName() != null) {
            _hashCode += getTimeZoneName().hashCode();
        }
        _hashCode += getCameraTimeZoneID();
        _hashCode += (isIsDSTSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeZoneData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraTimeZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraTimeZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDSTSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsDSTSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
