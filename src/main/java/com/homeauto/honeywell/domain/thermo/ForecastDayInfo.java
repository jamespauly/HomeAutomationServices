/**
 * ForecastDayInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ForecastDayInfo  implements java.io.Serializable {
    private java.util.Calendar date;

    private WeatherCondition condition;

    private java.math.BigDecimal low;

    private TempUnit lowUnit;

    private java.math.BigDecimal high;

    private TempUnit highUnit;

    private String phrase;

    public ForecastDayInfo() {
    }

    public ForecastDayInfo(
           java.util.Calendar date,
           WeatherCondition condition,
           java.math.BigDecimal low,
           TempUnit lowUnit,
           java.math.BigDecimal high,
           TempUnit highUnit,
           String phrase) {
           this.date = date;
           this.condition = condition;
           this.low = low;
           this.lowUnit = lowUnit;
           this.high = high;
           this.highUnit = highUnit;
           this.phrase = phrase;
    }


    /**
     * Gets the date value for this ForecastDayInfo.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this ForecastDayInfo.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the condition value for this ForecastDayInfo.
     * 
     * @return condition
     */
    public WeatherCondition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this ForecastDayInfo.
     * 
     * @param condition
     */
    public void setCondition(WeatherCondition condition) {
        this.condition = condition;
    }


    /**
     * Gets the low value for this ForecastDayInfo.
     * 
     * @return low
     */
    public java.math.BigDecimal getLow() {
        return low;
    }


    /**
     * Sets the low value for this ForecastDayInfo.
     * 
     * @param low
     */
    public void setLow(java.math.BigDecimal low) {
        this.low = low;
    }


    /**
     * Gets the lowUnit value for this ForecastDayInfo.
     * 
     * @return lowUnit
     */
    public TempUnit getLowUnit() {
        return lowUnit;
    }


    /**
     * Sets the lowUnit value for this ForecastDayInfo.
     * 
     * @param lowUnit
     */
    public void setLowUnit(TempUnit lowUnit) {
        this.lowUnit = lowUnit;
    }


    /**
     * Gets the high value for this ForecastDayInfo.
     * 
     * @return high
     */
    public java.math.BigDecimal getHigh() {
        return high;
    }


    /**
     * Sets the high value for this ForecastDayInfo.
     * 
     * @param high
     */
    public void setHigh(java.math.BigDecimal high) {
        this.high = high;
    }


    /**
     * Gets the highUnit value for this ForecastDayInfo.
     * 
     * @return highUnit
     */
    public TempUnit getHighUnit() {
        return highUnit;
    }


    /**
     * Sets the highUnit value for this ForecastDayInfo.
     * 
     * @param highUnit
     */
    public void setHighUnit(TempUnit highUnit) {
        this.highUnit = highUnit;
    }


    /**
     * Gets the phrase value for this ForecastDayInfo.
     * 
     * @return phrase
     */
    public String getPhrase() {
        return phrase;
    }


    /**
     * Sets the phrase value for this ForecastDayInfo.
     * 
     * @param phrase
     */
    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ForecastDayInfo)) return false;
        ForecastDayInfo other = (ForecastDayInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.low==null && other.getLow()==null) || 
             (this.low!=null &&
              this.low.equals(other.getLow()))) &&
            ((this.lowUnit==null && other.getLowUnit()==null) || 
             (this.lowUnit!=null &&
              this.lowUnit.equals(other.getLowUnit()))) &&
            ((this.high==null && other.getHigh()==null) || 
             (this.high!=null &&
              this.high.equals(other.getHigh()))) &&
            ((this.highUnit==null && other.getHighUnit()==null) || 
             (this.highUnit!=null &&
              this.highUnit.equals(other.getHighUnit()))) &&
            ((this.phrase==null && other.getPhrase()==null) || 
             (this.phrase!=null &&
              this.phrase.equals(other.getPhrase())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getLow() != null) {
            _hashCode += getLow().hashCode();
        }
        if (getLowUnit() != null) {
            _hashCode += getLowUnit().hashCode();
        }
        if (getHigh() != null) {
            _hashCode += getHigh().hashCode();
        }
        if (getHighUnit() != null) {
            _hashCode += getHighUnit().hashCode();
        }
        if (getPhrase() != null) {
            _hashCode += getPhrase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastDayInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ForecastDayInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WeatherCondition"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LowUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TempUnit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "High"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HighUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TempUnit"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phrase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Phrase"));
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
