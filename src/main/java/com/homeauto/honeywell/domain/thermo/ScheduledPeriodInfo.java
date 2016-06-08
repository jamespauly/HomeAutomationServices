/**
 * ScheduledPeriodInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ScheduledPeriodInfo  implements java.io.Serializable {
    private Day day;

    private PeriodType periodType;

    private boolean isModified;

    private int startTime;

    private boolean isCancelled;

    private java.math.BigDecimal heatSetpoint;

    private java.math.BigDecimal coolSetpoint;

    private FanSwitch fanSwitch;

    public ScheduledPeriodInfo() {
    }

    public ScheduledPeriodInfo(
           Day day,
           PeriodType periodType,
           boolean isModified,
           int startTime,
           boolean isCancelled,
           java.math.BigDecimal heatSetpoint,
           java.math.BigDecimal coolSetpoint,
           FanSwitch fanSwitch) {
           this.day = day;
           this.periodType = periodType;
           this.isModified = isModified;
           this.startTime = startTime;
           this.isCancelled = isCancelled;
           this.heatSetpoint = heatSetpoint;
           this.coolSetpoint = coolSetpoint;
           this.fanSwitch = fanSwitch;
    }


    /**
     * Gets the day value for this ScheduledPeriodInfo.
     * 
     * @return day
     */
    public Day getDay() {
        return day;
    }


    /**
     * Sets the day value for this ScheduledPeriodInfo.
     * 
     * @param day
     */
    public void setDay(Day day) {
        this.day = day;
    }


    /**
     * Gets the periodType value for this ScheduledPeriodInfo.
     * 
     * @return periodType
     */
    public PeriodType getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this ScheduledPeriodInfo.
     * 
     * @param periodType
     */
    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the isModified value for this ScheduledPeriodInfo.
     * 
     * @return isModified
     */
    public boolean isIsModified() {
        return isModified;
    }


    /**
     * Sets the isModified value for this ScheduledPeriodInfo.
     * 
     * @param isModified
     */
    public void setIsModified(boolean isModified) {
        this.isModified = isModified;
    }


    /**
     * Gets the startTime value for this ScheduledPeriodInfo.
     * 
     * @return startTime
     */
    public int getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ScheduledPeriodInfo.
     * 
     * @param startTime
     */
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the isCancelled value for this ScheduledPeriodInfo.
     * 
     * @return isCancelled
     */
    public boolean isIsCancelled() {
        return isCancelled;
    }


    /**
     * Sets the isCancelled value for this ScheduledPeriodInfo.
     * 
     * @param isCancelled
     */
    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }


    /**
     * Gets the heatSetpoint value for this ScheduledPeriodInfo.
     * 
     * @return heatSetpoint
     */
    public java.math.BigDecimal getHeatSetpoint() {
        return heatSetpoint;
    }


    /**
     * Sets the heatSetpoint value for this ScheduledPeriodInfo.
     * 
     * @param heatSetpoint
     */
    public void setHeatSetpoint(java.math.BigDecimal heatSetpoint) {
        this.heatSetpoint = heatSetpoint;
    }


    /**
     * Gets the coolSetpoint value for this ScheduledPeriodInfo.
     * 
     * @return coolSetpoint
     */
    public java.math.BigDecimal getCoolSetpoint() {
        return coolSetpoint;
    }


    /**
     * Sets the coolSetpoint value for this ScheduledPeriodInfo.
     * 
     * @param coolSetpoint
     */
    public void setCoolSetpoint(java.math.BigDecimal coolSetpoint) {
        this.coolSetpoint = coolSetpoint;
    }


    /**
     * Gets the fanSwitch value for this ScheduledPeriodInfo.
     * 
     * @return fanSwitch
     */
    public FanSwitch getFanSwitch() {
        return fanSwitch;
    }


    /**
     * Sets the fanSwitch value for this ScheduledPeriodInfo.
     * 
     * @param fanSwitch
     */
    public void setFanSwitch(FanSwitch fanSwitch) {
        this.fanSwitch = fanSwitch;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ScheduledPeriodInfo)) return false;
        ScheduledPeriodInfo other = (ScheduledPeriodInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.periodType==null && other.getPeriodType()==null) || 
             (this.periodType!=null &&
              this.periodType.equals(other.getPeriodType()))) &&
            this.isModified == other.isIsModified() &&
            this.startTime == other.getStartTime() &&
            this.isCancelled == other.isIsCancelled() &&
            ((this.heatSetpoint==null && other.getHeatSetpoint()==null) || 
             (this.heatSetpoint!=null &&
              this.heatSetpoint.equals(other.getHeatSetpoint()))) &&
            ((this.coolSetpoint==null && other.getCoolSetpoint()==null) || 
             (this.coolSetpoint!=null &&
              this.coolSetpoint.equals(other.getCoolSetpoint()))) &&
            ((this.fanSwitch==null && other.getFanSwitch()==null) || 
             (this.fanSwitch!=null &&
              this.fanSwitch.equals(other.getFanSwitch())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getPeriodType() != null) {
            _hashCode += getPeriodType().hashCode();
        }
        _hashCode += (isIsModified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStartTime();
        _hashCode += (isIsCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHeatSetpoint() != null) {
            _hashCode += getHeatSetpoint().hashCode();
        }
        if (getCoolSetpoint() != null) {
            _hashCode += getCoolSetpoint().hashCode();
        }
        if (getFanSwitch() != null) {
            _hashCode += getFanSwitch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledPeriodInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriodInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Day"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PeriodType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isModified");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IsModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IsCancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatSetpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolSetpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fanSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanSwitch"));
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
