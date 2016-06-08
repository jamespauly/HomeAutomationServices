/**
 * EULAText.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EULAText  implements java.io.Serializable {
    private int resultCode;

    private long languageID;

    private String languageText;

    private String privacyStatementText;

    private java.util.Calendar eulaDateActiveFrom;

    private long eulaID;

    public EULAText() {
    }

    public EULAText(
           int resultCode,
           long languageID,
           String languageText,
           String privacyStatementText,
           java.util.Calendar eulaDateActiveFrom,
           long eulaID) {
           this.resultCode = resultCode;
           this.languageID = languageID;
           this.languageText = languageText;
           this.privacyStatementText = privacyStatementText;
           this.eulaDateActiveFrom = eulaDateActiveFrom;
           this.eulaID = eulaID;
    }


    /**
     * Gets the resultCode value for this EULAText.
     * 
     * @return resultCode
     */
    public int getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this EULAText.
     * 
     * @param resultCode
     */
    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the languageID value for this EULAText.
     * 
     * @return languageID
     */
    public long getLanguageID() {
        return languageID;
    }


    /**
     * Sets the languageID value for this EULAText.
     * 
     * @param languageID
     */
    public void setLanguageID(long languageID) {
        this.languageID = languageID;
    }


    /**
     * Gets the languageText value for this EULAText.
     * 
     * @return languageText
     */
    public String getLanguageText() {
        return languageText;
    }


    /**
     * Sets the languageText value for this EULAText.
     * 
     * @param languageText
     */
    public void setLanguageText(String languageText) {
        this.languageText = languageText;
    }


    /**
     * Gets the privacyStatementText value for this EULAText.
     * 
     * @return privacyStatementText
     */
    public String getPrivacyStatementText() {
        return privacyStatementText;
    }


    /**
     * Sets the privacyStatementText value for this EULAText.
     * 
     * @param privacyStatementText
     */
    public void setPrivacyStatementText(String privacyStatementText) {
        this.privacyStatementText = privacyStatementText;
    }


    /**
     * Gets the eulaDateActiveFrom value for this EULAText.
     * 
     * @return eulaDateActiveFrom
     */
    public java.util.Calendar getEulaDateActiveFrom() {
        return eulaDateActiveFrom;
    }


    /**
     * Sets the eulaDateActiveFrom value for this EULAText.
     * 
     * @param eulaDateActiveFrom
     */
    public void setEulaDateActiveFrom(java.util.Calendar eulaDateActiveFrom) {
        this.eulaDateActiveFrom = eulaDateActiveFrom;
    }


    /**
     * Gets the eulaID value for this EULAText.
     * 
     * @return eulaID
     */
    public long getEulaID() {
        return eulaID;
    }


    /**
     * Sets the eulaID value for this EULAText.
     * 
     * @param eulaID
     */
    public void setEulaID(long eulaID) {
        this.eulaID = eulaID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EULAText)) return false;
        EULAText other = (EULAText) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultCode == other.getResultCode() &&
            this.languageID == other.getLanguageID() &&
            ((this.languageText==null && other.getLanguageText()==null) || 
             (this.languageText!=null &&
              this.languageText.equals(other.getLanguageText()))) &&
            ((this.privacyStatementText==null && other.getPrivacyStatementText()==null) || 
             (this.privacyStatementText!=null &&
              this.privacyStatementText.equals(other.getPrivacyStatementText()))) &&
            ((this.eulaDateActiveFrom==null && other.getEulaDateActiveFrom()==null) || 
             (this.eulaDateActiveFrom!=null &&
              this.eulaDateActiveFrom.equals(other.getEulaDateActiveFrom()))) &&
            this.eulaID == other.getEulaID();
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
        _hashCode += getResultCode();
        _hashCode += new Long(getLanguageID()).hashCode();
        if (getLanguageText() != null) {
            _hashCode += getLanguageText().hashCode();
        }
        if (getPrivacyStatementText() != null) {
            _hashCode += getPrivacyStatementText().hashCode();
        }
        if (getEulaDateActiveFrom() != null) {
            _hashCode += getEulaDateActiveFrom().hashCode();
        }
        _hashCode += new Long(getEulaID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EULAText.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULAText"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privacyStatementText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PrivacyStatementText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eulaDateActiveFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EulaDateActiveFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eulaID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EulaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
