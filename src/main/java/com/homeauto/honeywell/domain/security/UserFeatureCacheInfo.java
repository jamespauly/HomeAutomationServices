/**
 * UserFeatureCacheInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class UserFeatureCacheInfo  implements java.io.Serializable {
    private int featureId;

    private String featureName;

    private boolean featureEnabled;

    public UserFeatureCacheInfo() {
    }

    public UserFeatureCacheInfo(
           int featureId,
           String featureName,
           boolean featureEnabled) {
           this.featureId = featureId;
           this.featureName = featureName;
           this.featureEnabled = featureEnabled;
    }


    /**
     * Gets the featureId value for this UserFeatureCacheInfo.
     * 
     * @return featureId
     */
    public int getFeatureId() {
        return featureId;
    }


    /**
     * Sets the featureId value for this UserFeatureCacheInfo.
     * 
     * @param featureId
     */
    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }


    /**
     * Gets the featureName value for this UserFeatureCacheInfo.
     * 
     * @return featureName
     */
    public String getFeatureName() {
        return featureName;
    }


    /**
     * Sets the featureName value for this UserFeatureCacheInfo.
     * 
     * @param featureName
     */
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }


    /**
     * Gets the featureEnabled value for this UserFeatureCacheInfo.
     * 
     * @return featureEnabled
     */
    public boolean isFeatureEnabled() {
        return featureEnabled;
    }


    /**
     * Sets the featureEnabled value for this UserFeatureCacheInfo.
     * 
     * @param featureEnabled
     */
    public void setFeatureEnabled(boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserFeatureCacheInfo)) return false;
        UserFeatureCacheInfo other = (UserFeatureCacheInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.featureId == other.getFeatureId() &&
            ((this.featureName==null && other.getFeatureName()==null) || 
             (this.featureName!=null &&
              this.featureName.equals(other.getFeatureName()))) &&
            this.featureEnabled == other.isFeatureEnabled();
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
        _hashCode += getFeatureId();
        if (getFeatureName() != null) {
            _hashCode += getFeatureName().hashCode();
        }
        _hashCode += (isFeatureEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserFeatureCacheInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureCacheInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureEnabled"));
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
