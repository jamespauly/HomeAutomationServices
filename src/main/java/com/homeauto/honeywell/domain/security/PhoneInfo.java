/**
 * PhoneInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PhoneInfo  implements java.io.Serializable {
    private String phoneNumber;

    private boolean isPhoneValidated;

    private boolean isSMSControlEnabled;

    public PhoneInfo() {
    }

    public PhoneInfo(
           String phoneNumber,
           boolean isPhoneValidated,
           boolean isSMSControlEnabled) {
           this.phoneNumber = phoneNumber;
           this.isPhoneValidated = isPhoneValidated;
           this.isSMSControlEnabled = isSMSControlEnabled;
    }


    /**
     * Gets the phoneNumber value for this PhoneInfo.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this PhoneInfo.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the isPhoneValidated value for this PhoneInfo.
     * 
     * @return isPhoneValidated
     */
    public boolean isIsPhoneValidated() {
        return isPhoneValidated;
    }


    /**
     * Sets the isPhoneValidated value for this PhoneInfo.
     * 
     * @param isPhoneValidated
     */
    public void setIsPhoneValidated(boolean isPhoneValidated) {
        this.isPhoneValidated = isPhoneValidated;
    }


    /**
     * Gets the isSMSControlEnabled value for this PhoneInfo.
     * 
     * @return isSMSControlEnabled
     */
    public boolean isIsSMSControlEnabled() {
        return isSMSControlEnabled;
    }


    /**
     * Sets the isSMSControlEnabled value for this PhoneInfo.
     * 
     * @param isSMSControlEnabled
     */
    public void setIsSMSControlEnabled(boolean isSMSControlEnabled) {
        this.isSMSControlEnabled = isSMSControlEnabled;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PhoneInfo)) return false;
        PhoneInfo other = (PhoneInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            this.isPhoneValidated == other.isIsPhoneValidated() &&
            this.isSMSControlEnabled == other.isIsSMSControlEnabled();
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
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        _hashCode += (isIsPhoneValidated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSMSControlEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPhoneValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsPhoneValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSMSControlEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsSMSControlEnabled"));
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
