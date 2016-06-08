/**
 * ForecastWeatherResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ForecastWeatherResult  extends WebMethodResults implements java.io.Serializable {
    private ForecastWeatherInfo weatherData;

    public ForecastWeatherResult() {
    }

    public ForecastWeatherResult(
           int resultCode,
           String resultData,
           ForecastWeatherInfo weatherData) {
        super(
            resultCode,
            resultData);
        this.weatherData = weatherData;
    }


    /**
     * Gets the weatherData value for this ForecastWeatherResult.
     * 
     * @return weatherData
     */
    public ForecastWeatherInfo getWeatherData() {
        return weatherData;
    }


    /**
     * Sets the weatherData value for this ForecastWeatherResult.
     * 
     * @param weatherData
     */
    public void setWeatherData(ForecastWeatherInfo weatherData) {
        this.weatherData = weatherData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ForecastWeatherResult)) return false;
        ForecastWeatherResult other = (ForecastWeatherResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.weatherData==null && other.getWeatherData()==null) || 
             (this.weatherData!=null &&
              this.weatherData.equals(other.getWeatherData())));
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
        if (getWeatherData() != null) {
            _hashCode += getWeatherData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastWeatherResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WeatherData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherInfo"));
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
