/**
 * CameraPositionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraPositionResult  extends WebMethodResults implements java.io.Serializable {
    private String currentPosition;

    private String homePosition;

    public CameraPositionResult() {
    }

    public CameraPositionResult(
           int resultCode,
           String resultData,
           String currentPosition,
           String homePosition) {
        super(
            resultCode,
            resultData);
        this.currentPosition = currentPosition;
        this.homePosition = homePosition;
    }


    /**
     * Gets the currentPosition value for this CameraPositionResult.
     * 
     * @return currentPosition
     */
    public String getCurrentPosition() {
        return currentPosition;
    }


    /**
     * Sets the currentPosition value for this CameraPositionResult.
     * 
     * @param currentPosition
     */
    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }


    /**
     * Gets the homePosition value for this CameraPositionResult.
     * 
     * @return homePosition
     */
    public String getHomePosition() {
        return homePosition;
    }


    /**
     * Sets the homePosition value for this CameraPositionResult.
     * 
     * @param homePosition
     */
    public void setHomePosition(String homePosition) {
        this.homePosition = homePosition;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraPositionResult)) return false;
        CameraPositionResult other = (CameraPositionResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currentPosition==null && other.getCurrentPosition()==null) || 
             (this.currentPosition!=null &&
              this.currentPosition.equals(other.getCurrentPosition()))) &&
            ((this.homePosition==null && other.getHomePosition()==null) || 
             (this.homePosition!=null &&
              this.homePosition.equals(other.getHomePosition())));
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
        if (getCurrentPosition() != null) {
            _hashCode += getCurrentPosition().hashCode();
        }
        if (getHomePosition() != null) {
            _hashCode += getHomePosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraPositionResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraPositionResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HomePosition"));
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
