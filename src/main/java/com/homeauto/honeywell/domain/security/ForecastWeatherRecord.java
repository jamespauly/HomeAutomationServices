/**
 * ForecastWeatherRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ForecastWeatherRecord  implements java.io.Serializable {
    private int day;

    private String dayCode;

    private String date;

    private String weatherText;

    private int weatherIcon;

    private int highTemperature;

    private int lowTemperature;

    public ForecastWeatherRecord() {
    }

    public ForecastWeatherRecord(
           int day,
           String dayCode,
           String date,
           String weatherText,
           int weatherIcon,
           int highTemperature,
           int lowTemperature) {
           this.day = day;
           this.dayCode = dayCode;
           this.date = date;
           this.weatherText = weatherText;
           this.weatherIcon = weatherIcon;
           this.highTemperature = highTemperature;
           this.lowTemperature = lowTemperature;
    }


    /**
     * Gets the day value for this ForecastWeatherRecord.
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this ForecastWeatherRecord.
     * 
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the dayCode value for this ForecastWeatherRecord.
     * 
     * @return dayCode
     */
    public String getDayCode() {
        return dayCode;
    }


    /**
     * Sets the dayCode value for this ForecastWeatherRecord.
     * 
     * @param dayCode
     */
    public void setDayCode(String dayCode) {
        this.dayCode = dayCode;
    }


    /**
     * Gets the date value for this ForecastWeatherRecord.
     * 
     * @return date
     */
    public String getDate() {
        return date;
    }


    /**
     * Sets the date value for this ForecastWeatherRecord.
     * 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * Gets the weatherText value for this ForecastWeatherRecord.
     * 
     * @return weatherText
     */
    public String getWeatherText() {
        return weatherText;
    }


    /**
     * Sets the weatherText value for this ForecastWeatherRecord.
     * 
     * @param weatherText
     */
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }


    /**
     * Gets the weatherIcon value for this ForecastWeatherRecord.
     * 
     * @return weatherIcon
     */
    public int getWeatherIcon() {
        return weatherIcon;
    }


    /**
     * Sets the weatherIcon value for this ForecastWeatherRecord.
     * 
     * @param weatherIcon
     */
    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }


    /**
     * Gets the highTemperature value for this ForecastWeatherRecord.
     * 
     * @return highTemperature
     */
    public int getHighTemperature() {
        return highTemperature;
    }


    /**
     * Sets the highTemperature value for this ForecastWeatherRecord.
     * 
     * @param highTemperature
     */
    public void setHighTemperature(int highTemperature) {
        this.highTemperature = highTemperature;
    }


    /**
     * Gets the lowTemperature value for this ForecastWeatherRecord.
     * 
     * @return lowTemperature
     */
    public int getLowTemperature() {
        return lowTemperature;
    }


    /**
     * Sets the lowTemperature value for this ForecastWeatherRecord.
     * 
     * @param lowTemperature
     */
    public void setLowTemperature(int lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ForecastWeatherRecord)) return false;
        ForecastWeatherRecord other = (ForecastWeatherRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.day == other.getDay() &&
            ((this.dayCode==null && other.getDayCode()==null) || 
             (this.dayCode!=null &&
              this.dayCode.equals(other.getDayCode()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.weatherText==null && other.getWeatherText()==null) || 
             (this.weatherText!=null &&
              this.weatherText.equals(other.getWeatherText()))) &&
            this.weatherIcon == other.getWeatherIcon() &&
            this.highTemperature == other.getHighTemperature() &&
            this.lowTemperature == other.getLowTemperature();
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
        _hashCode += getDay();
        if (getDayCode() != null) {
            _hashCode += getDayCode().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getWeatherText() != null) {
            _hashCode += getWeatherText().hashCode();
        }
        _hashCode += getWeatherIcon();
        _hashCode += getHighTemperature();
        _hashCode += getLowTemperature();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastWeatherRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DayCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Date"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HighTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LowTemperature"));
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
