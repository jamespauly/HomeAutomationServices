/**
 * WiFiDeviceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiDeviceResponse  implements java.io.Serializable {
    private String lyricDeviceID;

    private String deviceName;

    private String deviceAlias;

    private boolean isAlive;

    private boolean isUpgrading;

    private String deviceSerialText;

    private String deviceVersion;

    public WiFiDeviceResponse() {
    }

    public WiFiDeviceResponse(
           String lyricDeviceID,
           String deviceName,
           String deviceAlias,
           boolean isAlive,
           boolean isUpgrading,
           String deviceSerialText,
           String deviceVersion) {
           this.lyricDeviceID = lyricDeviceID;
           this.deviceName = deviceName;
           this.deviceAlias = deviceAlias;
           this.isAlive = isAlive;
           this.isUpgrading = isUpgrading;
           this.deviceSerialText = deviceSerialText;
           this.deviceVersion = deviceVersion;
    }


    /**
     * Gets the lyricDeviceID value for this WiFiDeviceResponse.
     * 
     * @return lyricDeviceID
     */
    public String getLyricDeviceID() {
        return lyricDeviceID;
    }


    /**
     * Sets the lyricDeviceID value for this WiFiDeviceResponse.
     * 
     * @param lyricDeviceID
     */
    public void setLyricDeviceID(String lyricDeviceID) {
        this.lyricDeviceID = lyricDeviceID;
    }


    /**
     * Gets the deviceName value for this WiFiDeviceResponse.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this WiFiDeviceResponse.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceAlias value for this WiFiDeviceResponse.
     * 
     * @return deviceAlias
     */
    public String getDeviceAlias() {
        return deviceAlias;
    }


    /**
     * Sets the deviceAlias value for this WiFiDeviceResponse.
     * 
     * @param deviceAlias
     */
    public void setDeviceAlias(String deviceAlias) {
        this.deviceAlias = deviceAlias;
    }


    /**
     * Gets the isAlive value for this WiFiDeviceResponse.
     * 
     * @return isAlive
     */
    public boolean isIsAlive() {
        return isAlive;
    }


    /**
     * Sets the isAlive value for this WiFiDeviceResponse.
     * 
     * @param isAlive
     */
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }


    /**
     * Gets the isUpgrading value for this WiFiDeviceResponse.
     * 
     * @return isUpgrading
     */
    public boolean isIsUpgrading() {
        return isUpgrading;
    }


    /**
     * Sets the isUpgrading value for this WiFiDeviceResponse.
     * 
     * @param isUpgrading
     */
    public void setIsUpgrading(boolean isUpgrading) {
        this.isUpgrading = isUpgrading;
    }


    /**
     * Gets the deviceSerialText value for this WiFiDeviceResponse.
     * 
     * @return deviceSerialText
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }


    /**
     * Sets the deviceSerialText value for this WiFiDeviceResponse.
     * 
     * @param deviceSerialText
     */
    public void setDeviceSerialText(String deviceSerialText) {
        this.deviceSerialText = deviceSerialText;
    }


    /**
     * Gets the deviceVersion value for this WiFiDeviceResponse.
     * 
     * @return deviceVersion
     */
    public String getDeviceVersion() {
        return deviceVersion;
    }


    /**
     * Sets the deviceVersion value for this WiFiDeviceResponse.
     * 
     * @param deviceVersion
     */
    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiDeviceResponse)) return false;
        WiFiDeviceResponse other = (WiFiDeviceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lyricDeviceID==null && other.getLyricDeviceID()==null) || 
             (this.lyricDeviceID!=null &&
              this.lyricDeviceID.equals(other.getLyricDeviceID()))) &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.deviceAlias==null && other.getDeviceAlias()==null) || 
             (this.deviceAlias!=null &&
              this.deviceAlias.equals(other.getDeviceAlias()))) &&
            this.isAlive == other.isIsAlive() &&
            this.isUpgrading == other.isIsUpgrading() &&
            ((this.deviceSerialText==null && other.getDeviceSerialText()==null) || 
             (this.deviceSerialText!=null &&
              this.deviceSerialText.equals(other.getDeviceSerialText()))) &&
            ((this.deviceVersion==null && other.getDeviceVersion()==null) || 
             (this.deviceVersion!=null &&
              this.deviceVersion.equals(other.getDeviceVersion())));
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
        if (getLyricDeviceID() != null) {
            _hashCode += getLyricDeviceID().hashCode();
        }
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getDeviceAlias() != null) {
            _hashCode += getDeviceAlias().hashCode();
        }
        _hashCode += (isIsAlive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsUpgrading() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeviceSerialText() != null) {
            _hashCode += getDeviceSerialText().hashCode();
        }
        if (getDeviceVersion() != null) {
            _hashCode += getDeviceVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiDeviceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDeviceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lyricDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAlive");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsAlive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUpgrading");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsUpgrading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceVersion"));
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
