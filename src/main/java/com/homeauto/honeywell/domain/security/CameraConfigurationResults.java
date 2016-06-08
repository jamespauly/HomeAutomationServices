/**
 * CameraConfigurationResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraConfigurationResults  extends WebMethodResults implements java.io.Serializable {
    private String cameraName;

    private String featureFlags;

    private String SYSTEM_Data;

    private String VIDEO_Data;

    private String MOTION_Data;

    private String IO_Data;

    private String EVENT_Data;

    private String PTZ_Data;

    public CameraConfigurationResults() {
    }

    public CameraConfigurationResults(
           int resultCode,
           String resultData,
           String cameraName,
           String featureFlags,
           String SYSTEM_Data,
           String VIDEO_Data,
           String MOTION_Data,
           String IO_Data,
           String EVENT_Data,
           String PTZ_Data) {
        super(
            resultCode,
            resultData);
        this.cameraName = cameraName;
        this.featureFlags = featureFlags;
        this.SYSTEM_Data = SYSTEM_Data;
        this.VIDEO_Data = VIDEO_Data;
        this.MOTION_Data = MOTION_Data;
        this.IO_Data = IO_Data;
        this.EVENT_Data = EVENT_Data;
        this.PTZ_Data = PTZ_Data;
    }


    /**
     * Gets the cameraName value for this CameraConfigurationResults.
     * 
     * @return cameraName
     */
    public String getCameraName() {
        return cameraName;
    }


    /**
     * Sets the cameraName value for this CameraConfigurationResults.
     * 
     * @param cameraName
     */
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }


    /**
     * Gets the featureFlags value for this CameraConfigurationResults.
     * 
     * @return featureFlags
     */
    public String getFeatureFlags() {
        return featureFlags;
    }


    /**
     * Sets the featureFlags value for this CameraConfigurationResults.
     * 
     * @param featureFlags
     */
    public void setFeatureFlags(String featureFlags) {
        this.featureFlags = featureFlags;
    }


    /**
     * Gets the SYSTEM_Data value for this CameraConfigurationResults.
     * 
     * @return SYSTEM_Data
     */
    public String getSYSTEM_Data() {
        return SYSTEM_Data;
    }


    /**
     * Sets the SYSTEM_Data value for this CameraConfigurationResults.
     * 
     * @param SYSTEM_Data
     */
    public void setSYSTEM_Data(String SYSTEM_Data) {
        this.SYSTEM_Data = SYSTEM_Data;
    }


    /**
     * Gets the VIDEO_Data value for this CameraConfigurationResults.
     * 
     * @return VIDEO_Data
     */
    public String getVIDEO_Data() {
        return VIDEO_Data;
    }


    /**
     * Sets the VIDEO_Data value for this CameraConfigurationResults.
     * 
     * @param VIDEO_Data
     */
    public void setVIDEO_Data(String VIDEO_Data) {
        this.VIDEO_Data = VIDEO_Data;
    }


    /**
     * Gets the MOTION_Data value for this CameraConfigurationResults.
     * 
     * @return MOTION_Data
     */
    public String getMOTION_Data() {
        return MOTION_Data;
    }


    /**
     * Sets the MOTION_Data value for this CameraConfigurationResults.
     * 
     * @param MOTION_Data
     */
    public void setMOTION_Data(String MOTION_Data) {
        this.MOTION_Data = MOTION_Data;
    }


    /**
     * Gets the IO_Data value for this CameraConfigurationResults.
     * 
     * @return IO_Data
     */
    public String getIO_Data() {
        return IO_Data;
    }


    /**
     * Sets the IO_Data value for this CameraConfigurationResults.
     * 
     * @param IO_Data
     */
    public void setIO_Data(String IO_Data) {
        this.IO_Data = IO_Data;
    }


    /**
     * Gets the EVENT_Data value for this CameraConfigurationResults.
     * 
     * @return EVENT_Data
     */
    public String getEVENT_Data() {
        return EVENT_Data;
    }


    /**
     * Sets the EVENT_Data value for this CameraConfigurationResults.
     * 
     * @param EVENT_Data
     */
    public void setEVENT_Data(String EVENT_Data) {
        this.EVENT_Data = EVENT_Data;
    }


    /**
     * Gets the PTZ_Data value for this CameraConfigurationResults.
     * 
     * @return PTZ_Data
     */
    public String getPTZ_Data() {
        return PTZ_Data;
    }


    /**
     * Sets the PTZ_Data value for this CameraConfigurationResults.
     * 
     * @param PTZ_Data
     */
    public void setPTZ_Data(String PTZ_Data) {
        this.PTZ_Data = PTZ_Data;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraConfigurationResults)) return false;
        CameraConfigurationResults other = (CameraConfigurationResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cameraName==null && other.getCameraName()==null) || 
             (this.cameraName!=null &&
              this.cameraName.equals(other.getCameraName()))) &&
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
            ((this.IO_Data==null && other.getIO_Data()==null) || 
             (this.IO_Data!=null &&
              this.IO_Data.equals(other.getIO_Data()))) &&
            ((this.EVENT_Data==null && other.getEVENT_Data()==null) || 
             (this.EVENT_Data!=null &&
              this.EVENT_Data.equals(other.getEVENT_Data()))) &&
            ((this.PTZ_Data==null && other.getPTZ_Data()==null) || 
             (this.PTZ_Data!=null &&
              this.PTZ_Data.equals(other.getPTZ_Data())));
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
        if (getCameraName() != null) {
            _hashCode += getCameraName().hashCode();
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
        if (getIO_Data() != null) {
            _hashCode += getIO_Data().hashCode();
        }
        if (getEVENT_Data() != null) {
            _hashCode += getEVENT_Data().hashCode();
        }
        if (getPTZ_Data() != null) {
            _hashCode += getPTZ_Data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraConfigurationResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraConfigurationResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("IO_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IO_Data"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PTZ_Data");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PTZ_Data"));
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
