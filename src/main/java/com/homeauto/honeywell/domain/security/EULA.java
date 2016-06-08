/**
 * EULA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EULA  implements java.io.Serializable {
    private Language[] languageList;

    private long eulaId;  // attribute

    private long countryId;  // attribute

    private String countryName;  // attribute

    private java.util.Calendar dateActiveFrom;  // attribute

    public EULA() {
    }

    public EULA(
           Language[] languageList,
           long eulaId,
           long countryId,
           String countryName,
           java.util.Calendar dateActiveFrom) {
           this.languageList = languageList;
           this.eulaId = eulaId;
           this.countryId = countryId;
           this.countryName = countryName;
           this.dateActiveFrom = dateActiveFrom;
    }


    /**
     * Gets the languageList value for this EULA.
     * 
     * @return languageList
     */
    public Language[] getLanguageList() {
        return languageList;
    }


    /**
     * Sets the languageList value for this EULA.
     * 
     * @param languageList
     */
    public void setLanguageList(Language[] languageList) {
        this.languageList = languageList;
    }


    /**
     * Gets the eulaId value for this EULA.
     * 
     * @return eulaId
     */
    public long getEulaId() {
        return eulaId;
    }


    /**
     * Sets the eulaId value for this EULA.
     * 
     * @param eulaId
     */
    public void setEulaId(long eulaId) {
        this.eulaId = eulaId;
    }


    /**
     * Gets the countryId value for this EULA.
     * 
     * @return countryId
     */
    public long getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this EULA.
     * 
     * @param countryId
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the countryName value for this EULA.
     * 
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this EULA.
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    /**
     * Gets the dateActiveFrom value for this EULA.
     * 
     * @return dateActiveFrom
     */
    public java.util.Calendar getDateActiveFrom() {
        return dateActiveFrom;
    }


    /**
     * Sets the dateActiveFrom value for this EULA.
     * 
     * @param dateActiveFrom
     */
    public void setDateActiveFrom(java.util.Calendar dateActiveFrom) {
        this.dateActiveFrom = dateActiveFrom;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EULA)) return false;
        EULA other = (EULA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.languageList==null && other.getLanguageList()==null) || 
             (this.languageList!=null &&
              java.util.Arrays.equals(this.languageList, other.getLanguageList()))) &&
            this.eulaId == other.getEulaId() &&
            this.countryId == other.getCountryId() &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName()))) &&
            ((this.dateActiveFrom==null && other.getDateActiveFrom()==null) || 
             (this.dateActiveFrom!=null &&
              this.dateActiveFrom.equals(other.getDateActiveFrom())));
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
        if (getLanguageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguageList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLanguageList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getEulaId()).hashCode();
        _hashCode += new Long(getCountryId()).hashCode();
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        if (getDateActiveFrom() != null) {
            _hashCode += getDateActiveFrom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EULA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULA"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eulaId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EulaId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("countryId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CountryId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("countryName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CountryName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateActiveFrom");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateActiveFrom"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language"));
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
