/**
 * ForecastWeatherInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ForecastWeatherInfo  implements java.io.Serializable {
    private int unit;

    private String time;

    private ForecastWeatherRecord[] forecastWeatherList;

    public ForecastWeatherInfo() {
    }

    public ForecastWeatherInfo(
           int unit,
           String time,
           ForecastWeatherRecord[] forecastWeatherList) {
           this.unit = unit;
           this.time = time;
           this.forecastWeatherList = forecastWeatherList;
    }


    /**
     * Gets the unit value for this ForecastWeatherInfo.
     * 
     * @return unit
     */
    public int getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ForecastWeatherInfo.
     * 
     * @param unit
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }


    /**
     * Gets the time value for this ForecastWeatherInfo.
     * 
     * @return time
     */
    public String getTime() {
        return time;
    }


    /**
     * Sets the time value for this ForecastWeatherInfo.
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }


    /**
     * Gets the forecastWeatherList value for this ForecastWeatherInfo.
     * 
     * @return forecastWeatherList
     */
    public ForecastWeatherRecord[] getForecastWeatherList() {
        return forecastWeatherList;
    }


    /**
     * Sets the forecastWeatherList value for this ForecastWeatherInfo.
     * 
     * @param forecastWeatherList
     */
    public void setForecastWeatherList(ForecastWeatherRecord[] forecastWeatherList) {
        this.forecastWeatherList = forecastWeatherList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ForecastWeatherInfo)) return false;
        ForecastWeatherInfo other = (ForecastWeatherInfo) obj;
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
            ((this.forecastWeatherList==null && other.getForecastWeatherList()==null) || 
             (this.forecastWeatherList!=null &&
              java.util.Arrays.equals(this.forecastWeatherList, other.getForecastWeatherList())));
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
        if (getForecastWeatherList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastWeatherList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getForecastWeatherList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastWeatherInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherInfo"));
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
        elemField.setFieldName("forecastWeatherList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherRecord"));
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
