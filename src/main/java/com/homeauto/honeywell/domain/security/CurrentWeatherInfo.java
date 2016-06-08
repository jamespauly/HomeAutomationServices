/**
 * CurrentWeatherInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CurrentWeatherInfo  implements java.io.Serializable {
    private int unit;

    private String time;

    private CurrentWeatherRecord currentWeather;

    public CurrentWeatherInfo() {
    }

    public CurrentWeatherInfo(
           int unit,
           String time,
           CurrentWeatherRecord currentWeather) {
           this.unit = unit;
           this.time = time;
           this.currentWeather = currentWeather;
    }


    /**
     * Gets the unit value for this CurrentWeatherInfo.
     * 
     * @return unit
     */
    public int getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this CurrentWeatherInfo.
     * 
     * @param unit
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }


    /**
     * Gets the time value for this CurrentWeatherInfo.
     * 
     * @return time
     */
    public String getTime() {
        return time;
    }


    /**
     * Sets the time value for this CurrentWeatherInfo.
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }


    /**
     * Gets the currentWeather value for this CurrentWeatherInfo.
     * 
     * @return currentWeather
     */
    public CurrentWeatherRecord getCurrentWeather() {
        return currentWeather;
    }


    /**
     * Sets the currentWeather value for this CurrentWeatherInfo.
     * 
     * @param currentWeather
     */
    public void setCurrentWeather(CurrentWeatherRecord currentWeather) {
        this.currentWeather = currentWeather;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrentWeatherInfo)) return false;
        CurrentWeatherInfo other = (CurrentWeatherInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.unit == other.getUnit() &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.currentWeather==null && other.getCurrentWeather()==null) || 
             (this.currentWeather!=null &&
              this.currentWeather.equals(other.getCurrentWeather())));
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
        _hashCode += getUnit();
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getCurrentWeather() != null) {
            _hashCode += getCurrentWeather().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrentWeatherInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentWeather");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeather"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherRecord"));
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
