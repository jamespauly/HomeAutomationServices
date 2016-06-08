/**
 * InterfaceSchemaInfoEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class InterfaceSchemaInfoEx  extends InterfaceSchemaInfo  implements java.io.Serializable {
    private String loginURL;

    private String supportPhoneNumber;

    private String companyEmailAddress;

    private String appleDownloadURL;

    private String androidDownloadURL;

    private String blackBerryDownloadURL;

    public InterfaceSchemaInfoEx() {
    }

    public InterfaceSchemaInfoEx(
           int interfaceSchemaID,
           String schemaName,
           String baseURL,
           String productName,
           String companyName,
           String companyPhoneNumber,
           String websiteURL,
           String logoURL,
           String helpURL,
           String customHeaderMessage,
           String customFooterMessage,
           String miscellaneousAttributes,
           String mailSenderName,
           boolean skinningEnabled,
           String loginURL,
           String supportPhoneNumber,
           String companyEmailAddress,
           String appleDownloadURL,
           String androidDownloadURL,
           String blackBerryDownloadURL) {
        super(
            interfaceSchemaID,
            schemaName,
            baseURL,
            productName,
            companyName,
            companyPhoneNumber,
            websiteURL,
            logoURL,
            helpURL,
            customHeaderMessage,
            customFooterMessage,
            miscellaneousAttributes,
            mailSenderName,
            skinningEnabled);
        this.loginURL = loginURL;
        this.supportPhoneNumber = supportPhoneNumber;
        this.companyEmailAddress = companyEmailAddress;
        this.appleDownloadURL = appleDownloadURL;
        this.androidDownloadURL = androidDownloadURL;
        this.blackBerryDownloadURL = blackBerryDownloadURL;
    }


    /**
     * Gets the loginURL value for this InterfaceSchemaInfoEx.
     * 
     * @return loginURL
     */
    public String getLoginURL() {
        return loginURL;
    }


    /**
     * Sets the loginURL value for this InterfaceSchemaInfoEx.
     * 
     * @param loginURL
     */
    public void setLoginURL(String loginURL) {
        this.loginURL = loginURL;
    }


    /**
     * Gets the supportPhoneNumber value for this InterfaceSchemaInfoEx.
     * 
     * @return supportPhoneNumber
     */
    public String getSupportPhoneNumber() {
        return supportPhoneNumber;
    }


    /**
     * Sets the supportPhoneNumber value for this InterfaceSchemaInfoEx.
     * 
     * @param supportPhoneNumber
     */
    public void setSupportPhoneNumber(String supportPhoneNumber) {
        this.supportPhoneNumber = supportPhoneNumber;
    }


    /**
     * Gets the companyEmailAddress value for this InterfaceSchemaInfoEx.
     * 
     * @return companyEmailAddress
     */
    public String getCompanyEmailAddress() {
        return companyEmailAddress;
    }


    /**
     * Sets the companyEmailAddress value for this InterfaceSchemaInfoEx.
     * 
     * @param companyEmailAddress
     */
    public void setCompanyEmailAddress(String companyEmailAddress) {
        this.companyEmailAddress = companyEmailAddress;
    }


    /**
     * Gets the appleDownloadURL value for this InterfaceSchemaInfoEx.
     * 
     * @return appleDownloadURL
     */
    public String getAppleDownloadURL() {
        return appleDownloadURL;
    }


    /**
     * Sets the appleDownloadURL value for this InterfaceSchemaInfoEx.
     * 
     * @param appleDownloadURL
     */
    public void setAppleDownloadURL(String appleDownloadURL) {
        this.appleDownloadURL = appleDownloadURL;
    }


    /**
     * Gets the androidDownloadURL value for this InterfaceSchemaInfoEx.
     * 
     * @return androidDownloadURL
     */
    public String getAndroidDownloadURL() {
        return androidDownloadURL;
    }


    /**
     * Sets the androidDownloadURL value for this InterfaceSchemaInfoEx.
     * 
     * @param androidDownloadURL
     */
    public void setAndroidDownloadURL(String androidDownloadURL) {
        this.androidDownloadURL = androidDownloadURL;
    }


    /**
     * Gets the blackBerryDownloadURL value for this InterfaceSchemaInfoEx.
     * 
     * @return blackBerryDownloadURL
     */
    public String getBlackBerryDownloadURL() {
        return blackBerryDownloadURL;
    }


    /**
     * Sets the blackBerryDownloadURL value for this InterfaceSchemaInfoEx.
     * 
     * @param blackBerryDownloadURL
     */
    public void setBlackBerryDownloadURL(String blackBerryDownloadURL) {
        this.blackBerryDownloadURL = blackBerryDownloadURL;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InterfaceSchemaInfoEx)) return false;
        InterfaceSchemaInfoEx other = (InterfaceSchemaInfoEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.loginURL==null && other.getLoginURL()==null) || 
             (this.loginURL!=null &&
              this.loginURL.equals(other.getLoginURL()))) &&
            ((this.supportPhoneNumber==null && other.getSupportPhoneNumber()==null) || 
             (this.supportPhoneNumber!=null &&
              this.supportPhoneNumber.equals(other.getSupportPhoneNumber()))) &&
            ((this.companyEmailAddress==null && other.getCompanyEmailAddress()==null) || 
             (this.companyEmailAddress!=null &&
              this.companyEmailAddress.equals(other.getCompanyEmailAddress()))) &&
            ((this.appleDownloadURL==null && other.getAppleDownloadURL()==null) || 
             (this.appleDownloadURL!=null &&
              this.appleDownloadURL.equals(other.getAppleDownloadURL()))) &&
            ((this.androidDownloadURL==null && other.getAndroidDownloadURL()==null) || 
             (this.androidDownloadURL!=null &&
              this.androidDownloadURL.equals(other.getAndroidDownloadURL()))) &&
            ((this.blackBerryDownloadURL==null && other.getBlackBerryDownloadURL()==null) || 
             (this.blackBerryDownloadURL!=null &&
              this.blackBerryDownloadURL.equals(other.getBlackBerryDownloadURL())));
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
        if (getLoginURL() != null) {
            _hashCode += getLoginURL().hashCode();
        }
        if (getSupportPhoneNumber() != null) {
            _hashCode += getSupportPhoneNumber().hashCode();
        }
        if (getCompanyEmailAddress() != null) {
            _hashCode += getCompanyEmailAddress().hashCode();
        }
        if (getAppleDownloadURL() != null) {
            _hashCode += getAppleDownloadURL().hashCode();
        }
        if (getAndroidDownloadURL() != null) {
            _hashCode += getAndroidDownloadURL().hashCode();
        }
        if (getBlackBerryDownloadURL() != null) {
            _hashCode += getBlackBerryDownloadURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterfaceSchemaInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaInfoEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LoginURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SupportPhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CompanyEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appleDownloadURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AppleDownloadURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("androidDownloadURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AndroidDownloadURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blackBerryDownloadURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BlackBerryDownloadURL"));
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
