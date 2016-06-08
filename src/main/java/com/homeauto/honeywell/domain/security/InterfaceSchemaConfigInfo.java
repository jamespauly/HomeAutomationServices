/**
 * InterfaceSchemaConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class InterfaceSchemaConfigInfo  implements java.io.Serializable {
    private String appleDownloadURL;

    private String androidDownloadURL;

    private String latestSupportedAppVersion;

    public InterfaceSchemaConfigInfo() {
    }

    public InterfaceSchemaConfigInfo(
           String appleDownloadURL,
           String androidDownloadURL,
           String latestSupportedAppVersion) {
           this.appleDownloadURL = appleDownloadURL;
           this.androidDownloadURL = androidDownloadURL;
           this.latestSupportedAppVersion = latestSupportedAppVersion;
    }


    /**
     * Gets the appleDownloadURL value for this InterfaceSchemaConfigInfo.
     * 
     * @return appleDownloadURL
     */
    public String getAppleDownloadURL() {
        return appleDownloadURL;
    }


    /**
     * Sets the appleDownloadURL value for this InterfaceSchemaConfigInfo.
     * 
     * @param appleDownloadURL
     */
    public void setAppleDownloadURL(String appleDownloadURL) {
        this.appleDownloadURL = appleDownloadURL;
    }


    /**
     * Gets the androidDownloadURL value for this InterfaceSchemaConfigInfo.
     * 
     * @return androidDownloadURL
     */
    public String getAndroidDownloadURL() {
        return androidDownloadURL;
    }


    /**
     * Sets the androidDownloadURL value for this InterfaceSchemaConfigInfo.
     * 
     * @param androidDownloadURL
     */
    public void setAndroidDownloadURL(String androidDownloadURL) {
        this.androidDownloadURL = androidDownloadURL;
    }


    /**
     * Gets the latestSupportedAppVersion value for this InterfaceSchemaConfigInfo.
     * 
     * @return latestSupportedAppVersion
     */
    public String getLatestSupportedAppVersion() {
        return latestSupportedAppVersion;
    }


    /**
     * Sets the latestSupportedAppVersion value for this InterfaceSchemaConfigInfo.
     * 
     * @param latestSupportedAppVersion
     */
    public void setLatestSupportedAppVersion(String latestSupportedAppVersion) {
        this.latestSupportedAppVersion = latestSupportedAppVersion;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InterfaceSchemaConfigInfo)) return false;
        InterfaceSchemaConfigInfo other = (InterfaceSchemaConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appleDownloadURL==null && other.getAppleDownloadURL()==null) || 
             (this.appleDownloadURL!=null &&
              this.appleDownloadURL.equals(other.getAppleDownloadURL()))) &&
            ((this.androidDownloadURL==null && other.getAndroidDownloadURL()==null) || 
             (this.androidDownloadURL!=null &&
              this.androidDownloadURL.equals(other.getAndroidDownloadURL()))) &&
            ((this.latestSupportedAppVersion==null && other.getLatestSupportedAppVersion()==null) || 
             (this.latestSupportedAppVersion!=null &&
              this.latestSupportedAppVersion.equals(other.getLatestSupportedAppVersion())));
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
        if (getAppleDownloadURL() != null) {
            _hashCode += getAppleDownloadURL().hashCode();
        }
        if (getAndroidDownloadURL() != null) {
            _hashCode += getAndroidDownloadURL().hashCode();
        }
        if (getLatestSupportedAppVersion() != null) {
            _hashCode += getLatestSupportedAppVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterfaceSchemaConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("latestSupportedAppVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LatestSupportedAppVersion"));
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
