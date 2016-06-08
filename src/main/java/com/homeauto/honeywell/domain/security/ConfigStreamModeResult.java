/**
 * ConfigStreamModeResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ConfigStreamModeResult  extends WebMethodResults implements java.io.Serializable {
    private String MAC;

    private String cameraIPAddress;

    private String cameraName;

    private String featureFlags;

    private String RTSP_Parameters;

    public ConfigStreamModeResult() {
    }

    public ConfigStreamModeResult(
           int resultCode,
           String resultData,
           String MAC,
           String cameraIPAddress,
           String cameraName,
           String featureFlags,
           String RTSP_Parameters) {
        super(
            resultCode,
            resultData);
        this.MAC = MAC;
        this.cameraIPAddress = cameraIPAddress;
        this.cameraName = cameraName;
        this.featureFlags = featureFlags;
        this.RTSP_Parameters = RTSP_Parameters;
    }


    /**
     * Gets the MAC value for this ConfigStreamModeResult.
     * 
     * @return MAC
     */
    public String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this ConfigStreamModeResult.
     * 
     * @param MAC
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }


    /**
     * Gets the cameraIPAddress value for this ConfigStreamModeResult.
     * 
     * @return cameraIPAddress
     */
    public String getCameraIPAddress() {
        return cameraIPAddress;
    }


    /**
     * Sets the cameraIPAddress value for this ConfigStreamModeResult.
     * 
     * @param cameraIPAddress
     */
    public void setCameraIPAddress(String cameraIPAddress) {
        this.cameraIPAddress = cameraIPAddress;
    }


    /**
     * Gets the cameraName value for this ConfigStreamModeResult.
     * 
     * @return cameraName
     */
    public String getCameraName() {
        return cameraName;
    }


    /**
     * Sets the cameraName value for this ConfigStreamModeResult.
     * 
     * @param cameraName
     */
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }


    /**
     * Gets the featureFlags value for this ConfigStreamModeResult.
     * 
     * @return featureFlags
     */
    public String getFeatureFlags() {
        return featureFlags;
    }


    /**
     * Sets the featureFlags value for this ConfigStreamModeResult.
     * 
     * @param featureFlags
     */
    public void setFeatureFlags(String featureFlags) {
        this.featureFlags = featureFlags;
    }


    /**
     * Gets the RTSP_Parameters value for this ConfigStreamModeResult.
     * 
     * @return RTSP_Parameters
     */
    public String getRTSP_Parameters() {
        return RTSP_Parameters;
    }


    /**
     * Sets the RTSP_Parameters value for this ConfigStreamModeResult.
     * 
     * @param RTSP_Parameters
     */
    public void setRTSP_Parameters(String RTSP_Parameters) {
        this.RTSP_Parameters = RTSP_Parameters;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConfigStreamModeResult)) return false;
        ConfigStreamModeResult other = (ConfigStreamModeResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC()))) &&
            ((this.cameraIPAddress==null && other.getCameraIPAddress()==null) || 
             (this.cameraIPAddress!=null &&
              this.cameraIPAddress.equals(other.getCameraIPAddress()))) &&
            ((this.cameraName==null && other.getCameraName()==null) || 
             (this.cameraName!=null &&
              this.cameraName.equals(other.getCameraName()))) &&
            ((this.featureFlags==null && other.getFeatureFlags()==null) || 
             (this.featureFlags!=null &&
              this.featureFlags.equals(other.getFeatureFlags()))) &&
            ((this.RTSP_Parameters==null && other.getRTSP_Parameters()==null) || 
             (this.RTSP_Parameters!=null &&
              this.RTSP_Parameters.equals(other.getRTSP_Parameters())));
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
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        if (getCameraIPAddress() != null) {
            _hashCode += getCameraIPAddress().hashCode();
        }
        if (getCameraName() != null) {
            _hashCode += getCameraName().hashCode();
        }
        if (getFeatureFlags() != null) {
            _hashCode += getFeatureFlags().hashCode();
        }
        if (getRTSP_Parameters() != null) {
            _hashCode += getRTSP_Parameters().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigStreamModeResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfigStreamModeResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraName"));
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
        elemField.setFieldName("RTSP_Parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RTSP_Parameters"));
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
