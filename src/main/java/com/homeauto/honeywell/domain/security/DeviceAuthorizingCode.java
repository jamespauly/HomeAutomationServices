/**
 * DeviceAuthorizingCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DeviceAuthorizingCode  implements java.io.Serializable {
    private long locationID;

    private long deviceID;

    private String authorizingCode;

    public DeviceAuthorizingCode() {
    }

    public DeviceAuthorizingCode(
           long locationID,
           long deviceID,
           String authorizingCode) {
           this.locationID = locationID;
           this.deviceID = deviceID;
           this.authorizingCode = authorizingCode;
    }


    /**
     * Gets the locationID value for this DeviceAuthorizingCode.
     * 
     * @return locationID
     */
    public long getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this DeviceAuthorizingCode.
     * 
     * @param locationID
     */
    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the deviceID value for this DeviceAuthorizingCode.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this DeviceAuthorizingCode.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the authorizingCode value for this DeviceAuthorizingCode.
     * 
     * @return authorizingCode
     */
    public String getAuthorizingCode() {
        return authorizingCode;
    }


    /**
     * Sets the authorizingCode value for this DeviceAuthorizingCode.
     * 
     * @param authorizingCode
     */
    public void setAuthorizingCode(String authorizingCode) {
        this.authorizingCode = authorizingCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeviceAuthorizingCode)) return false;
        DeviceAuthorizingCode other = (DeviceAuthorizingCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.locationID == other.getLocationID() &&
            this.deviceID == other.getDeviceID() &&
            ((this.authorizingCode==null && other.getAuthorizingCode()==null) || 
             (this.authorizingCode!=null &&
              this.authorizingCode.equals(other.getAuthorizingCode())));
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
        _hashCode += new Long(getLocationID()).hashCode();
        _hashCode += new Long(getDeviceID()).hashCode();
        if (getAuthorizingCode() != null) {
            _hashCode += getAuthorizingCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceAuthorizingCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAuthorizingCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthorizingCode"));
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
