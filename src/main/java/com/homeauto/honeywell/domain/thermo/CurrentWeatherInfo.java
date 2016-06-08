/**
 * CurrentWeatherInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class CurrentWeatherInfo  implements java.io.Serializable {
    private boolean isDefined;

    private boolean isValid;

    private WeatherCondition condition;

    private java.math.BigDecimal temperature;

    private TempUnit tempUnit;

    private int humidity;

    private String phraseKey;

    public CurrentWeatherInfo() {
    }

    public CurrentWeatherInfo(
           boolean isDefined,
           boolean isValid,
           WeatherCondition condition,
           java.math.BigDecimal temperature,
           TempUnit tempUnit,
           int humidity,
           String phraseKey) {
           this.isDefined = isDefined;
           this.isValid = isValid;
           this.condition = condition;
           this.temperature = temperature;
           this.tempUnit = tempUnit;
           this.humidity = humidity;
           this.phraseKey = phraseKey;
    }


    /**
     * Gets the isDefined value for this CurrentWeatherInfo.
     * 
     * @return isDefined
     */
    public boolean isIsDefined() {
        return isDefined;
    }


    /**
     * Sets the isDefined value for this CurrentWeatherInfo.
     * 
     * @param isDefined
     */
    public void setIsDefined(boolean isDefined) {
        this.isDefined = isDefined;
    }


    /**
     * Gets the isValid value for this CurrentWeatherInfo.
     * 
     * @return isValid
     */
    public boolean isIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this CurrentWeatherInfo.
     * 
     * @param isValid
     */
    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets the condition value for this CurrentWeatherInfo.
     * 
     * @return condition
     */
    public WeatherCondition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this CurrentWeatherInfo.
     * 
     * @param condition
     */
    public void setCondition(WeatherCondition condition) {
        this.condition = condition;
    }


    /**
     * Gets the temperature value for this CurrentWeatherInfo.
     * 
     * @return temperature
     */
    public java.math.BigDecimal getTemperature() {
        return temperature;
    }


    /**
     * Sets the temperature value for this CurrentWeatherInfo.
     * 
     * @param temperature
     */
    public void setTemperature(java.math.BigDecimal temperature) {
        this.temperature = temperature;
    }


    /**
     * Gets the tempUnit value for this CurrentWeatherInfo.
     * 
     * @return tempUnit
     */
    public TempUnit getTempUnit() {
        return tempUnit;
    }


    /**
     * Sets the tempUnit value for this CurrentWeatherInfo.
     * 
     * @param tempUnit
     */
    public void setTempUnit(TempUnit tempUnit) {
        this.tempUnit = tempUnit;
    }


    /**
     * Gets the humidity value for this CurrentWeatherInfo.
     * 
     * @return humidity
     */
    public int getHumidity() {
        return humidity;
    }


    /**
     * Sets the humidity value for this CurrentWeatherInfo.
     * 
     * @param humidity
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


    /**
     * Gets the phraseKey value for this CurrentWeatherInfo.
     * 
     * @return phraseKey
     */
    public String getPhraseKey() {
        return phraseKey;
    }


    /**
     * Sets the phraseKey value for this CurrentWeatherInfo.
     * 
     * @param phraseKey
     */
    public void setPhraseKey(String phraseKey) {
        this.phraseKey = phraseKey;
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
            this.isDefined == other.isIsDefined() &&
            this.isValid == other.isIsValid() &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.temperature==null && other.getTemperature()==null) || 
             (this.temperature!=null &&
              this.temperature.equals(other.getTemperature()))) &&
            ((this.tempUnit==null && other.getTempUnit()==null) || 
             (this.tempUnit!=null &&
              this.tempUnit.equals(other.getTempUnit()))) &&
            this.humidity == other.getHumidity() &&
            ((this.phraseKey==null && other.getPhraseKey()==null) || 
             (this.phraseKey!=null &&
              this.phraseKey.equals(other.getPhraseKey())));
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
        _hashCode += (isIsDefined() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getTemperature() != null) {
            _hashCode += getTemperature().hashCode();
        }
        if (getTempUnit() != null) {
            _hashCode += getTempUnit().hashCode();
        }
        _hashCode += getHumidity();
        if (getPhraseKey() != null) {
            _hashCode += getPhraseKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrentWeatherInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CurrentWeatherInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IsDefined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WeatherCondition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Temperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TempUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TempUnit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Humidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phraseKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PhraseKey"));
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
