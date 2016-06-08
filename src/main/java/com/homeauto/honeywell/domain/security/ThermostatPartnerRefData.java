/**
 * ThermostatPartnerRefData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ThermostatPartnerRefData  implements java.io.Serializable {
    private int lyricLocationID;

    private String lyricDeviceID;

    private String temperatureScale;

    public ThermostatPartnerRefData() {
    }

    public ThermostatPartnerRefData(
           int lyricLocationID,
           String lyricDeviceID,
           String temperatureScale) {
           this.lyricLocationID = lyricLocationID;
           this.lyricDeviceID = lyricDeviceID;
           this.temperatureScale = temperatureScale;
    }


    /**
     * Gets the lyricLocationID value for this ThermostatPartnerRefData.
     * 
     * @return lyricLocationID
     */
    public int getLyricLocationID() {
        return lyricLocationID;
    }


    /**
     * Sets the lyricLocationID value for this ThermostatPartnerRefData.
     * 
     * @param lyricLocationID
     */
    public void setLyricLocationID(int lyricLocationID) {
        this.lyricLocationID = lyricLocationID;
    }


    /**
     * Gets the lyricDeviceID value for this ThermostatPartnerRefData.
     * 
     * @return lyricDeviceID
     */
    public String getLyricDeviceID() {
        return lyricDeviceID;
    }


    /**
     * Sets the lyricDeviceID value for this ThermostatPartnerRefData.
     * 
     * @param lyricDeviceID
     */
    public void setLyricDeviceID(String lyricDeviceID) {
        this.lyricDeviceID = lyricDeviceID;
    }


    /**
     * Gets the temperatureScale value for this ThermostatPartnerRefData.
     * 
     * @return temperatureScale
     */
    public String getTemperatureScale() {
        return temperatureScale;
    }


    /**
     * Sets the temperatureScale value for this ThermostatPartnerRefData.
     * 
     * @param temperatureScale
     */
    public void setTemperatureScale(String temperatureScale) {
        this.temperatureScale = temperatureScale;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ThermostatPartnerRefData)) return false;
        ThermostatPartnerRefData other = (ThermostatPartnerRefData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lyricLocationID == other.getLyricLocationID() &&
            ((this.lyricDeviceID==null && other.getLyricDeviceID()==null) || 
             (this.lyricDeviceID!=null &&
              this.lyricDeviceID.equals(other.getLyricDeviceID()))) &&
            ((this.temperatureScale==null && other.getTemperatureScale()==null) || 
             (this.temperatureScale!=null &&
              this.temperatureScale.equals(other.getTemperatureScale())));
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
        _hashCode += getLyricLocationID();
        if (getLyricDeviceID() != null) {
            _hashCode += getLyricDeviceID().hashCode();
        }
        if (getTemperatureScale() != null) {
            _hashCode += getTemperatureScale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatPartnerRefData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatPartnerRefData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lyricLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lyricDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperatureScale");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TemperatureScale"));
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
