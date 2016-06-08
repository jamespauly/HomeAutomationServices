/**
 * Language.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class Language  implements java.io.Serializable {
    private long languageId;  // attribute

    private String languageDesc;  // attribute

    private int languagePriority;  // attribute

    public Language() {
    }

    public Language(
           long languageId,
           String languageDesc,
           int languagePriority) {
           this.languageId = languageId;
           this.languageDesc = languageDesc;
           this.languagePriority = languagePriority;
    }


    /**
     * Gets the languageId value for this Language.
     * 
     * @return languageId
     */
    public long getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this Language.
     * 
     * @param languageId
     */
    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the languageDesc value for this Language.
     * 
     * @return languageDesc
     */
    public String getLanguageDesc() {
        return languageDesc;
    }


    /**
     * Sets the languageDesc value for this Language.
     * 
     * @param languageDesc
     */
    public void setLanguageDesc(String languageDesc) {
        this.languageDesc = languageDesc;
    }


    /**
     * Gets the languagePriority value for this Language.
     * 
     * @return languagePriority
     */
    public int getLanguagePriority() {
        return languagePriority;
    }


    /**
     * Sets the languagePriority value for this Language.
     * 
     * @param languagePriority
     */
    public void setLanguagePriority(int languagePriority) {
        this.languagePriority = languagePriority;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Language)) return false;
        Language other = (Language) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.languageId == other.getLanguageId() &&
            ((this.languageDesc==null && other.getLanguageDesc()==null) || 
             (this.languageDesc!=null &&
              this.languageDesc.equals(other.getLanguageDesc()))) &&
            this.languagePriority == other.getLanguagePriority();
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
        _hashCode += new Long(getLanguageId()).hashCode();
        if (getLanguageDesc() != null) {
            _hashCode += getLanguageDesc().hashCode();
        }
        _hashCode += getLanguagePriority();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Language.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LanguageId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageDesc");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LanguageDesc"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languagePriority");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LanguagePriority"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
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
