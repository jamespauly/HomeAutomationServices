/**
 * ScheduleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ScheduleInfo  implements java.io.Serializable {
    private long scheduleID;

    private short scheduleDay;

    private TimePeriodInfo[] timePeriods;

    public ScheduleInfo() {
    }

    public ScheduleInfo(
           long scheduleID,
           short scheduleDay,
           TimePeriodInfo[] timePeriods) {
           this.scheduleID = scheduleID;
           this.scheduleDay = scheduleDay;
           this.timePeriods = timePeriods;
    }


    /**
     * Gets the scheduleID value for this ScheduleInfo.
     * 
     * @return scheduleID
     */
    public long getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this ScheduleInfo.
     * 
     * @param scheduleID
     */
    public void setScheduleID(long scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the scheduleDay value for this ScheduleInfo.
     * 
     * @return scheduleDay
     */
    public short getScheduleDay() {
        return scheduleDay;
    }


    /**
     * Sets the scheduleDay value for this ScheduleInfo.
     * 
     * @param scheduleDay
     */
    public void setScheduleDay(short scheduleDay) {
        this.scheduleDay = scheduleDay;
    }


    /**
     * Gets the timePeriods value for this ScheduleInfo.
     * 
     * @return timePeriods
     */
    public TimePeriodInfo[] getTimePeriods() {
        return timePeriods;
    }


    /**
     * Sets the timePeriods value for this ScheduleInfo.
     * 
     * @param timePeriods
     */
    public void setTimePeriods(TimePeriodInfo[] timePeriods) {
        this.timePeriods = timePeriods;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ScheduleInfo)) return false;
        ScheduleInfo other = (ScheduleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.scheduleID == other.getScheduleID() &&
            this.scheduleDay == other.getScheduleDay() &&
            ((this.timePeriods==null && other.getTimePeriods()==null) || 
             (this.timePeriods!=null &&
              java.util.Arrays.equals(this.timePeriods, other.getTimePeriods())));
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
        _hashCode += new Long(getScheduleID()).hashCode();
        _hashCode += getScheduleDay();
        if (getTimePeriods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimePeriods());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTimePeriods(), i);
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
        new org.apache.axis.description.TypeDesc(ScheduleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriodInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriodInfo"));
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
