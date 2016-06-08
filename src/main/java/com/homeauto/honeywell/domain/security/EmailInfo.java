/**
 * EmailInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EmailInfo  implements java.io.Serializable {
    private String emailAddress;

    private boolean isEmailValidated;

    private int notificationMethodID;

    private int countryCallingCode;

    public EmailInfo() {
    }

    public EmailInfo(
           String emailAddress,
           boolean isEmailValidated,
           int notificationMethodID,
           int countryCallingCode) {
           this.emailAddress = emailAddress;
           this.isEmailValidated = isEmailValidated;
           this.notificationMethodID = notificationMethodID;
           this.countryCallingCode = countryCallingCode;
    }


    /**
     * Gets the emailAddress value for this EmailInfo.
     * 
     * @return emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this EmailInfo.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the isEmailValidated value for this EmailInfo.
     * 
     * @return isEmailValidated
     */
    public boolean isIsEmailValidated() {
        return isEmailValidated;
    }


    /**
     * Sets the isEmailValidated value for this EmailInfo.
     * 
     * @param isEmailValidated
     */
    public void setIsEmailValidated(boolean isEmailValidated) {
        this.isEmailValidated = isEmailValidated;
    }


    /**
     * Gets the notificationMethodID value for this EmailInfo.
     * 
     * @return notificationMethodID
     */
    public int getNotificationMethodID() {
        return notificationMethodID;
    }


    /**
     * Sets the notificationMethodID value for this EmailInfo.
     * 
     * @param notificationMethodID
     */
    public void setNotificationMethodID(int notificationMethodID) {
        this.notificationMethodID = notificationMethodID;
    }


    /**
     * Gets the countryCallingCode value for this EmailInfo.
     * 
     * @return countryCallingCode
     */
    public int getCountryCallingCode() {
        return countryCallingCode;
    }


    /**
     * Sets the countryCallingCode value for this EmailInfo.
     * 
     * @param countryCallingCode
     */
    public void setCountryCallingCode(int countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmailInfo)) return false;
        EmailInfo other = (EmailInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            this.isEmailValidated == other.isIsEmailValidated() &&
            this.notificationMethodID == other.getNotificationMethodID() &&
            this.countryCallingCode == other.getCountryCallingCode();
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
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        _hashCode += (isIsEmailValidated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNotificationMethodID();
        _hashCode += getCountryCallingCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEmailValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsEmailValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMethodID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethodID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCallingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryCallingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
