/**
 * SmartAwayValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartAwayValues  implements java.io.Serializable {
    private boolean active;

    private TimeSpan timeOfDay;

    private double durationInHours;

    private org.apache.axis.types.UnsignedByte durationInDays;

    private AwayEndDateFormat lastUsedFormat;

    private DateTimeOffset endsIn;

    private java.math.BigDecimal endCoolSetPoint;

    private java.math.BigDecimal endHeatSetPoint;

    public SmartAwayValues() {
    }

    public SmartAwayValues(
           boolean active,
           TimeSpan timeOfDay,
           double durationInHours,
           org.apache.axis.types.UnsignedByte durationInDays,
           AwayEndDateFormat lastUsedFormat,
           DateTimeOffset endsIn,
           java.math.BigDecimal endCoolSetPoint,
           java.math.BigDecimal endHeatSetPoint) {
           this.active = active;
           this.timeOfDay = timeOfDay;
           this.durationInHours = durationInHours;
           this.durationInDays = durationInDays;
           this.lastUsedFormat = lastUsedFormat;
           this.endsIn = endsIn;
           this.endCoolSetPoint = endCoolSetPoint;
           this.endHeatSetPoint = endHeatSetPoint;
    }


    /**
     * Gets the active value for this SmartAwayValues.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this SmartAwayValues.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the timeOfDay value for this SmartAwayValues.
     * 
     * @return timeOfDay
     */
    public TimeSpan getTimeOfDay() {
        return timeOfDay;
    }


    /**
     * Sets the timeOfDay value for this SmartAwayValues.
     * 
     * @param timeOfDay
     */
    public void setTimeOfDay(TimeSpan timeOfDay) {
        this.timeOfDay = timeOfDay;
    }


    /**
     * Gets the durationInHours value for this SmartAwayValues.
     * 
     * @return durationInHours
     */
    public double getDurationInHours() {
        return durationInHours;
    }


    /**
     * Sets the durationInHours value for this SmartAwayValues.
     * 
     * @param durationInHours
     */
    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours;
    }


    /**
     * Gets the durationInDays value for this SmartAwayValues.
     * 
     * @return durationInDays
     */
    public org.apache.axis.types.UnsignedByte getDurationInDays() {
        return durationInDays;
    }


    /**
     * Sets the durationInDays value for this SmartAwayValues.
     * 
     * @param durationInDays
     */
    public void setDurationInDays(org.apache.axis.types.UnsignedByte durationInDays) {
        this.durationInDays = durationInDays;
    }


    /**
     * Gets the lastUsedFormat value for this SmartAwayValues.
     * 
     * @return lastUsedFormat
     */
    public AwayEndDateFormat getLastUsedFormat() {
        return lastUsedFormat;
    }


    /**
     * Sets the lastUsedFormat value for this SmartAwayValues.
     * 
     * @param lastUsedFormat
     */
    public void setLastUsedFormat(AwayEndDateFormat lastUsedFormat) {
        this.lastUsedFormat = lastUsedFormat;
    }


    /**
     * Gets the endsIn value for this SmartAwayValues.
     * 
     * @return endsIn
     */
    public DateTimeOffset getEndsIn() {
        return endsIn;
    }


    /**
     * Sets the endsIn value for this SmartAwayValues.
     * 
     * @param endsIn
     */
    public void setEndsIn(DateTimeOffset endsIn) {
        this.endsIn = endsIn;
    }


    /**
     * Gets the endCoolSetPoint value for this SmartAwayValues.
     * 
     * @return endCoolSetPoint
     */
    public java.math.BigDecimal getEndCoolSetPoint() {
        return endCoolSetPoint;
    }


    /**
     * Sets the endCoolSetPoint value for this SmartAwayValues.
     * 
     * @param endCoolSetPoint
     */
    public void setEndCoolSetPoint(java.math.BigDecimal endCoolSetPoint) {
        this.endCoolSetPoint = endCoolSetPoint;
    }


    /**
     * Gets the endHeatSetPoint value for this SmartAwayValues.
     * 
     * @return endHeatSetPoint
     */
    public java.math.BigDecimal getEndHeatSetPoint() {
        return endHeatSetPoint;
    }


    /**
     * Sets the endHeatSetPoint value for this SmartAwayValues.
     * 
     * @param endHeatSetPoint
     */
    public void setEndHeatSetPoint(java.math.BigDecimal endHeatSetPoint) {
        this.endHeatSetPoint = endHeatSetPoint;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartAwayValues)) return false;
        SmartAwayValues other = (SmartAwayValues) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.timeOfDay==null && other.getTimeOfDay()==null) || 
             (this.timeOfDay!=null &&
              this.timeOfDay.equals(other.getTimeOfDay()))) &&
            this.durationInHours == other.getDurationInHours() &&
            ((this.durationInDays==null && other.getDurationInDays()==null) || 
             (this.durationInDays!=null &&
              this.durationInDays.equals(other.getDurationInDays()))) &&
            ((this.lastUsedFormat==null && other.getLastUsedFormat()==null) || 
             (this.lastUsedFormat!=null &&
              this.lastUsedFormat.equals(other.getLastUsedFormat()))) &&
            ((this.endsIn==null && other.getEndsIn()==null) || 
             (this.endsIn!=null &&
              this.endsIn.equals(other.getEndsIn()))) &&
            ((this.endCoolSetPoint==null && other.getEndCoolSetPoint()==null) || 
             (this.endCoolSetPoint!=null &&
              this.endCoolSetPoint.equals(other.getEndCoolSetPoint()))) &&
            ((this.endHeatSetPoint==null && other.getEndHeatSetPoint()==null) || 
             (this.endHeatSetPoint!=null &&
              this.endHeatSetPoint.equals(other.getEndHeatSetPoint())));
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
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeOfDay() != null) {
            _hashCode += getTimeOfDay().hashCode();
        }
        _hashCode += new Double(getDurationInHours()).hashCode();
        if (getDurationInDays() != null) {
            _hashCode += getDurationInDays().hashCode();
        }
        if (getLastUsedFormat() != null) {
            _hashCode += getLastUsedFormat().hashCode();
        }
        if (getEndsIn() != null) {
            _hashCode += getEndsIn().hashCode();
        }
        if (getEndCoolSetPoint() != null) {
            _hashCode += getEndCoolSetPoint().hashCode();
        }
        if (getEndHeatSetPoint() != null) {
            _hashCode += getEndHeatSetPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartAwayValues.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAwayValues"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeOfDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeSpan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationInHours");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DurationInHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationInDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DurationInDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUsedFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AwayEndDateFormat"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endsIn");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EndsIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateTimeOffset"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endCoolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EndCoolSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endHeatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EndHeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
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
