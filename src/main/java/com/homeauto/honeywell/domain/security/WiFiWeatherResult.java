/**
 * WiFiWeatherResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiWeatherResult  implements java.io.Serializable {
    private String dateTime;

    private int epochDateTime;

    private String iconPhrase;

    private int weatherIcon;

    private ValueUnitType temperature;

    private ValueUnitType realFeelTemperature;

    private int relativeHumidity;

    public WiFiWeatherResult() {
    }

    public WiFiWeatherResult(
           String dateTime,
           int epochDateTime,
           String iconPhrase,
           int weatherIcon,
           ValueUnitType temperature,
           ValueUnitType realFeelTemperature,
           int relativeHumidity) {
           this.dateTime = dateTime;
           this.epochDateTime = epochDateTime;
           this.iconPhrase = iconPhrase;
           this.weatherIcon = weatherIcon;
           this.temperature = temperature;
           this.realFeelTemperature = realFeelTemperature;
           this.relativeHumidity = relativeHumidity;
    }


    /**
     * Gets the dateTime value for this WiFiWeatherResult.
     * 
     * @return dateTime
     */
    public String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this WiFiWeatherResult.
     * 
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the epochDateTime value for this WiFiWeatherResult.
     * 
     * @return epochDateTime
     */
    public int getEpochDateTime() {
        return epochDateTime;
    }


    /**
     * Sets the epochDateTime value for this WiFiWeatherResult.
     * 
     * @param epochDateTime
     */
    public void setEpochDateTime(int epochDateTime) {
        this.epochDateTime = epochDateTime;
    }


    /**
     * Gets the iconPhrase value for this WiFiWeatherResult.
     * 
     * @return iconPhrase
     */
    public String getIconPhrase() {
        return iconPhrase;
    }


    /**
     * Sets the iconPhrase value for this WiFiWeatherResult.
     * 
     * @param iconPhrase
     */
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }


    /**
     * Gets the weatherIcon value for this WiFiWeatherResult.
     * 
     * @return weatherIcon
     */
    public int getWeatherIcon() {
        return weatherIcon;
    }


    /**
     * Sets the weatherIcon value for this WiFiWeatherResult.
     * 
     * @param weatherIcon
     */
    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }


    /**
     * Gets the temperature value for this WiFiWeatherResult.
     * 
     * @return temperature
     */
    public ValueUnitType getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this WiFiWeatherResult.
     * 
     * @param temperature
     */
    public void setTemperature(ValueUnitType temperature) {
        this.temperature = temperature;
    }


    /**
     * Gets the realFeelTemperature value for this WiFiWeatherResult.
     * 
     * @return realFeelTemperature
     */
    public ValueUnitType getRealFeelTemperature() {
        return realFeelTemperature;
    }


    /**
     * Sets the realFeelTemperature value for this WiFiWeatherResult.
     * 
     * @param realFeelTemperature
     */
    public void setRealFeelTemperature(ValueUnitType realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }


    /**
     * Gets the relativeHumidity value for this WiFiWeatherResult.
     * 
     * @return relativeHumidity
     */
    public int getRelativeHumidity() {
        return relativeHumidity;
    }


    /**
     * Sets the relativeHumidity value for this WiFiWeatherResult.
     * 
     * @param relativeHumidity
     */
    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiWeatherResult)) return false;
        WiFiWeatherResult other = (WiFiWeatherResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            this.epochDateTime == other.getEpochDateTime() &&
            ((this.iconPhrase==null && other.getIconPhrase()==null) || 
             (this.iconPhrase!=null &&
              this.iconPhrase.equals(other.getIconPhrase()))) &&
            this.weatherIcon == other.getWeatherIcon() &&
            ((this.temperature==null && other.getTemperature()==null) || 
             (this.temperature!=null &&
              this.temperature.equals(other.getTemperature()))) &&
            ((this.realFeelTemperature==null && other.getRealFeelTemperature()==null) || 
             (this.realFeelTemperature!=null &&
              this.realFeelTemperature.equals(other.getRealFeelTemperature()))) &&
            this.relativeHumidity == other.getRelativeHumidity();
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
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        _hashCode += getEpochDateTime();
        if (getIconPhrase() != null) {
            _hashCode += getIconPhrase().hashCode();
        }
        _hashCode += getWeatherIcon();
        if (getTemperature() != null) {
            _hashCode += getTemperature().hashCode();
        }
        if (getRealFeelTemperature() != null) {
            _hashCode += getRealFeelTemperature().hashCode();
        }
        _hashCode += getRelativeHumidity();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiWeatherResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "dateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epochDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "epochDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconPhrase");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "iconPhrase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherIcon");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "weatherIcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "temperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValueUnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realFeelTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "realFeelTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValueUnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeHumidity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "relativeHumidity"));
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
