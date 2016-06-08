/**
 * ContentConfigurationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ContentConfigurationResult  extends WebMethodResults implements java.io.Serializable {
    private ContentConfigurationInfo contentConfiguration;

    public ContentConfigurationResult() {
    }

    public ContentConfigurationResult(
           int resultCode,
           String resultData,
           ContentConfigurationInfo contentConfiguration) {
        super(
            resultCode,
            resultData);
        this.contentConfiguration = contentConfiguration;
    }


    /**
     * Gets the contentConfiguration value for this ContentConfigurationResult.
     * 
     * @return contentConfiguration
     */
    public ContentConfigurationInfo getContentConfiguration() {
        return contentConfiguration;
    }


    /**
     * Sets the contentConfiguration value for this ContentConfigurationResult.
     * 
     * @param contentConfiguration
     */
    public void setContentConfiguration(ContentConfigurationInfo contentConfiguration) {
        this.contentConfiguration = contentConfiguration;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContentConfigurationResult)) return false;
        ContentConfigurationResult other = (ContentConfigurationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contentConfiguration==null && other.getContentConfiguration()==null) || 
             (this.contentConfiguration!=null &&
              this.contentConfiguration.equals(other.getContentConfiguration())));
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
        if (getContentConfiguration() != null) {
            _hashCode += getContentConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentConfigurationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationInfo"));
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
