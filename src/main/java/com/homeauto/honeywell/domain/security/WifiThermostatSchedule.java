/**
 * WifiThermostatSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WifiThermostatSchedule  implements java.io.Serializable {
    private short maxNumberOfPeriodsInDay;

    private SchedulePeriodInfo[] schedulePeriodInfo;

    public WifiThermostatSchedule() {
    }

    public WifiThermostatSchedule(
           short maxNumberOfPeriodsInDay,
           SchedulePeriodInfo[] schedulePeriodInfo) {
           this.maxNumberOfPeriodsInDay = maxNumberOfPeriodsInDay;
           this.schedulePeriodInfo = schedulePeriodInfo;
    }


    /**
     * Gets the maxNumberOfPeriodsInDay value for this WifiThermostatSchedule.
     * 
     * @return maxNumberOfPeriodsInDay
     */
    public short getMaxNumberOfPeriodsInDay() {
        return maxNumberOfPeriodsInDay;
    }


    /**
     * Sets the maxNumberOfPeriodsInDay value for this WifiThermostatSchedule.
     * 
     * @param maxNumberOfPeriodsInDay
     */
    public void setMaxNumberOfPeriodsInDay(short maxNumberOfPeriodsInDay) {
        this.maxNumberOfPeriodsInDay = maxNumberOfPeriodsInDay;
    }


    /**
     * Gets the schedulePeriodInfo value for this WifiThermostatSchedule.
     * 
     * @return schedulePeriodInfo
     */
    public SchedulePeriodInfo[] getSchedulePeriodInfo() {
        return schedulePeriodInfo;
    }


    /**
     * Sets the schedulePeriodInfo value for this WifiThermostatSchedule.
     * 
     * @param schedulePeriodInfo
     */
    public void setSchedulePeriodInfo(SchedulePeriodInfo[] schedulePeriodInfo) {
        this.schedulePeriodInfo = schedulePeriodInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WifiThermostatSchedule)) return false;
        WifiThermostatSchedule other = (WifiThermostatSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxNumberOfPeriodsInDay == other.getMaxNumberOfPeriodsInDay() &&
            ((this.schedulePeriodInfo==null && other.getSchedulePeriodInfo()==null) || 
             (this.schedulePeriodInfo!=null &&
              java.util.Arrays.equals(this.schedulePeriodInfo, other.getSchedulePeriodInfo())));
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
        _hashCode += getMaxNumberOfPeriodsInDay();
        if (getSchedulePeriodInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedulePeriodInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchedulePeriodInfo(), i);
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
        new org.apache.axis.description.TypeDesc(WifiThermostatSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfPeriodsInDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxNumberOfPeriodsInDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulePeriodInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo"));
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
