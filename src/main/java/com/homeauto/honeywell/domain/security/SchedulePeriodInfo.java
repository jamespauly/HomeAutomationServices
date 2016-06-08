/**
 * SchedulePeriodInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SchedulePeriodInfo  implements java.io.Serializable {
    private short scheduleDay;

    private short periodType;

    private String startTime;

    private boolean isScheduled;

    private int heatSetPoint;

    private int coolSetPoint;

    private int fanMode;

    public SchedulePeriodInfo() {
    }

    public SchedulePeriodInfo(
           short scheduleDay,
           short periodType,
           String startTime,
           boolean isScheduled,
           int heatSetPoint,
           int coolSetPoint,
           int fanMode) {
           this.scheduleDay = scheduleDay;
           this.periodType = periodType;
           this.startTime = startTime;
           this.isScheduled = isScheduled;
           this.heatSetPoint = heatSetPoint;
           this.coolSetPoint = coolSetPoint;
           this.fanMode = fanMode;
    }


    /**
     * Gets the scheduleDay value for this SchedulePeriodInfo.
     * 
     * @return scheduleDay
     */
    public short getScheduleDay() {
        return scheduleDay;
    }


    /**
     * Sets the scheduleDay value for this SchedulePeriodInfo.
     * 
     * @param scheduleDay
     */
    public void setScheduleDay(short scheduleDay) {
        this.scheduleDay = scheduleDay;
    }


    /**
     * Gets the periodType value for this SchedulePeriodInfo.
     * 
     * @return periodType
     */
    public short getPeriodType() {
        return periodType;
    }


    /**
     * Sets the periodType value for this SchedulePeriodInfo.
     * 
     * @param periodType
     */
    public void setPeriodType(short periodType) {
        this.periodType = periodType;
    }


    /**
     * Gets the startTime value for this SchedulePeriodInfo.
     * 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SchedulePeriodInfo.
     * 
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the isScheduled value for this SchedulePeriodInfo.
     * 
     * @return isScheduled
     */
    public boolean isIsScheduled() {
        return isScheduled;
    }


    /**
     * Sets the isScheduled value for this SchedulePeriodInfo.
     * 
     * @param isScheduled
     */
    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }


    /**
     * Gets the heatSetPoint value for this SchedulePeriodInfo.
     * 
     * @return heatSetPoint
     */
    public int getHeatSetPoint() {
        return heatSetPoint;
    }


    /**
     * Sets the heatSetPoint value for this SchedulePeriodInfo.
     * 
     * @param heatSetPoint
     */
    public void setHeatSetPoint(int heatSetPoint) {
        this.heatSetPoint = heatSetPoint;
    }


    /**
     * Gets the coolSetPoint value for this SchedulePeriodInfo.
     * 
     * @return coolSetPoint
     */
    public int getCoolSetPoint() {
        return coolSetPoint;
    }


    /**
     * Sets the coolSetPoint value for this SchedulePeriodInfo.
     * 
     * @param coolSetPoint
     */
    public void setCoolSetPoint(int coolSetPoint) {
        this.coolSetPoint = coolSetPoint;
    }


    /**
     * Gets the fanMode value for this SchedulePeriodInfo.
     * 
     * @return fanMode
     */
    public int getFanMode() {
        return fanMode;
    }


    /**
     * Sets the fanMode value for this SchedulePeriodInfo.
     * 
     * @param fanMode
     */
    public void setFanMode(int fanMode) {
        this.fanMode = fanMode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SchedulePeriodInfo)) return false;
        SchedulePeriodInfo other = (SchedulePeriodInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.scheduleDay == other.getScheduleDay() &&
            this.periodType == other.getPeriodType() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            this.isScheduled == other.isIsScheduled() &&
            this.heatSetPoint == other.getHeatSetPoint() &&
            this.coolSetPoint == other.getCoolSetPoint() &&
            this.fanMode == other.getFanMode();
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
        _hashCode += getScheduleDay();
        _hashCode += getPeriodType();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        _hashCode += (isIsScheduled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getHeatSetPoint();
        _hashCode += getCoolSetPoint();
        _hashCode += getFanMode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchedulePeriodInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isScheduled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsScheduled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fanMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FanMode"));
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
