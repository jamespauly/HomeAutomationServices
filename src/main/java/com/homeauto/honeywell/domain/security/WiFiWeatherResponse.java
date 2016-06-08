/**
 * WiFiWeatherResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiWeatherResponse  extends WebMethodResults  implements java.io.Serializable {
    private WiFiWeatherResult[] weatherResult;

    public WiFiWeatherResponse() {
    }

    public WiFiWeatherResponse(
           int resultCode,
           String resultData,
           WiFiWeatherResult[] weatherResult) {
        super(
            resultCode,
            resultData);
        this.weatherResult = weatherResult;
    }


    /**
     * Gets the weatherResult value for this WiFiWeatherResponse.
     * 
     * @return weatherResult
     */
    public WiFiWeatherResult[] getWeatherResult() {
        return weatherResult;
    }


    /**
     * Sets the weatherResult value for this WiFiWeatherResponse.
     * 
     * @param weatherResult
     */
    public void setWeatherResult(WiFiWeatherResult[] weatherResult) {
        this.weatherResult = weatherResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiWeatherResponse)) return false;
        WiFiWeatherResponse other = (WiFiWeatherResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.weatherResult==null && other.getWeatherResult()==null) || 
             (this.weatherResult!=null &&
              java.util.Arrays.equals(this.weatherResult, other.getWeatherResult())));
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
        if (getWeatherResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeatherResult());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWeatherResult(), i);
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
        new org.apache.axis.description.TypeDesc(WiFiWeatherResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weatherResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WeatherResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResult"));
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
