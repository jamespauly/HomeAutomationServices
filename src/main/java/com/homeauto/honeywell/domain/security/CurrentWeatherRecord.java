/**
 * CurrentWeatherRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CurrentWeatherRecord  implements java.io.Serializable {
    private int temperature;

    private int apparentTemperature;

    private String humidity;

    private String weatherText;

    private int weatherIcon;

    public CurrentWeatherRecord() {
    }

    public CurrentWeatherRecord(
           int temperature,
           int apparentTemperature,
           String humidity,
           String weatherText,
           int weatherIcon) {
           this.temperature = temperature;
           this.apparentTemperature = apparentTemperature;
           this.humidity = humidity;
           this.weatherText = weatherText;
           this.weatherIcon = weatherIcon;
    }


    /**
     * Gets the temperature value for this CurrentWeatherRecord.
     * 
     * @return temperature
     */
    public int getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this CurrentWeatherRecord.
     * 
     * @param temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    /**
     * Gets the apparentTemperature value for this CurrentWeatherRecord.
     * 
     * @return apparentTemperature
     */
    public int getApparentTemperature() {
        return apparentTemperature;
    }


    /**
     * Sets the apparentTemperature value for this CurrentWeatherRecord.
     * 
     * @param apparentTemperature
     */
    public void setApparentTemperature(int apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }


    /**
     * Gets the humidity value for this CurrentWeatherRecord.
     * 
     * @return humidity
     */
    public String getHumidity() {
        return humidity;
    }


    /**
     * Sets the humidity value for this CurrentWeatherRecord.
     * 
     * @param humidity
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }


    /**
     * Gets the weatherText value for this CurrentWeatherRecord.
     * 
     * @return weatherText
     */
    public String getWeatherText() {
        return weatherText;
    }


    /**
     * Sets the weatherText value for this CurrentWeatherRecord.
     * 
     * @param weatherText
     */
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }


    /**
     * Gets the weatherIcon value for this CurrentWeatherRecord.
     * 
     * @return weatherIcon
     */
    public int getWeatherIcon() {
        return weatherIcon;
    }


    /**
     * Sets the weatherIcon value for this CurrentWeatherRecord.
     * 
     * @param weatherIcon
     */
    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrentWeatherRecord)) return false;
        CurrentWeatherRecord other = (CurrentWeatherRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.temperature == other.getTemperature() &&
            this.apparentTemperature == other.getApparentTemperature() &&
            ((this.humidity==null && other.getHumidity()==null) || 
             (this.humidity!=null &&
              this.humidity.equals(other.getHumidity()))) &&
            ((this.weatherText==null && other.getWeatherText()==null) || 
             (this.weatherText!=null &&
              this.weatherText.equals(other.getWeatherText()))) &&
            this.weatherIcon == other.getWeatherIcon();
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
        _hashCode += getTemperature();
        _hashCode += getApparentTemperature();
        if (getHumidity() != null) {
            _hashCode += getHumidity().hashCode();
        }
        if (getWeatherText() != null) {
            _hashCode += getWeatherText().hashCode();
        }
        _hashCode += getWeatherIcon();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrentWeatherRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Temperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apparentTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApparentTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Humidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WeatherText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WeatherIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
