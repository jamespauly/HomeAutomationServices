/**
 * VideoPIRConfigurationResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIRConfigurationResults  extends WebMethodResults implements java.io.Serializable {
    private String deviceName;

    private String featureFlags;

    private String SYSTEM_Data;

    private String VIDEO_Data;

    private String MOTION_Data;

    private String EVENT_Data;

    public VideoPIRConfigurationResults() {
    }

    public VideoPIRConfigurationResults(
           int resultCode,
           String resultData,
           String deviceName,
           String featureFlags,
           String SYSTEM_Data,
           String VIDEO_Data,
           String MOTION_Data,
           String EVENT_Data) {
        super(
            resultCode,
            resultData);
        this.deviceName = deviceName;
        this.featureFlags = featureFlags;
        this.SYSTEM_Data = SYSTEM_Data;
        this.VIDEO_Data = VIDEO_Data;
        this.MOTION_Data = MOTION_Data;
        this.EVENT_Data = EVENT_Data;
    }


    /**
     * Gets the deviceName value for this VideoPIRConfigurationResults.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this VideoPIRConfigurationResults.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the featureFlags value for this VideoPIRConfigurationResults.
     * 
     * @return featureFlags
     */
    public String getFeatureFlags() {
        return featureFlags;
    }


    /**
     * Sets the featureFlags value for this VideoPIRConfigurationResults.
     * 
     * @param featureFlags
     */
    public void setFeatureFlags(String featureFlags) {
        this.featureFlags = featureFlags;
    }


    /**
     * Gets the SYSTEM_Data value for this VideoPIRConfigurationResults.
     * 
     * @return SYSTEM_Data
     */
    public String getSYSTEM_Data() {
        return SYSTEM_Data;
    }


    /**
     * Sets the SYSTEM_Data value for this VideoPIRConfigurationResults.
     * 
     * @param SYSTEM_Data
     */
    public void setSYSTEM_Data(String SYSTEM_Data) {
        this.SYSTEM_Data = SYSTEM_Data;
    }


    /**
     * Gets the VIDEO_Data value for this VideoPIRConfigurationResults.
     * 
     * @return VIDEO_Data
     */
    public String getVIDEO_Data() {
        return VIDEO_Data;
    }


    /**
     * Sets the VIDEO_Data value for this VideoPIRConfigurationResults.
     * 
     * @param VIDEO_Data
     */
    public void setVIDEO_Data(String VIDEO_Data) {
        this.VIDEO_Data = VIDEO_Data;
    }


    /**
     * Gets the MOTION_Data value for this VideoPIRConfigurationResults.
     * 
     * @return MOTION_Data
     */
    public String getMOTION_Data() {
        return MOTION_Data;
    }


    /**
     * Sets the MOTION_Data value for this VideoPIRConfigurationResults.
     * 
     * @param MOTION_Data
     */
    public void setMOTION_Data(String MOTION_Data) {
        this.MOTION_Data = MOTION_Data;
    }


    /**
     * Gets the EVENT_Data value for this VideoPIRConfigurationResults.
     * 
     * @return EVENT_Data
     */
    public String getEVENT_Data() {
        return EVENT_Data;
    }


    /**
     * Sets the EVENT_Data value for this VideoPIRConfigurationResults.
     * 
     * @param EVENT_Data
     */
    public void setEVENT_Data(String EVENT_Data) {
        this.EVENT_Data = EVENT_Data;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIRConfigurationResults)) return false;
        VideoPIRConfigurationResults other = (VideoPIRConfigurationResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.featureFlags==null && other.getFeatureFlags()==null) || 
             (this.featureFlags!=null &&
              this.featureFlags.equals(other.getFeatureFlags()))) &&
            ((this.SYSTEM_Data==null && other.getSYSTEM_Data()==null) || 
             (this.SYSTEM_Data!=null &&
              this.SYSTEM_Data.equals(other.getSYSTEM_Data()))) &&
            ((this.VIDEO_Data==null && other.getVIDEO_Data()==null) || 
             (this.VIDEO_Data!=null &&
              this.VIDEO_Data.equals(other.getVIDEO_Data()))) &&
            ((this.MOTION_Data==null && other.getMOTION_Data()==null) || 
             (this.MOTION_Data!=null &&
              this.MOTION_Data.equals(other.getMOTION_Data()))) &&
            ((this.EVENT_Data==null && other.getEVENT_Data()==null) || 
             (this.EVENT_Data!=null &&
              this.EVENT_Data.equals(other.getEVENT_Data())));
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getFeatureFlags() != null) {
            _hashCode += getFeatureFlags().hashCode();
        }
        if (getSYSTEM_Data() != null) {
            _hashCode += getSYSTEM_Data().hashCode();
        }
        if (getVIDEO_Data() != null) {
            _hashCode += getVIDEO_Data().hashCode();
        }
        if (getMOTION_Data() != null) {
            _hashCode += getMOTION_Data().hashCode();
        }
        if (getEVENT_Data() != null) {
            _hashCode += getEVENT_Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPIRConfigurationResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRConfigurationResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSTEM_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SYSTEM_Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VIDEO_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VIDEO_Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MOTION_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MOTION_Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EVENT_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EVENT_Data"));
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
