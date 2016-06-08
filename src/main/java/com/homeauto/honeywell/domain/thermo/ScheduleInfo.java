/**
 * ScheduleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ScheduleInfo  implements java.io.Serializable {
    private ScheduledPeriodInfo[] scheduledPeriods;

    private org.apache.axis.types.UnsignedByte maxNumberOfPeriodsInDay;

    private String displayedUnits;

    public ScheduleInfo() {
    }

    public ScheduleInfo(
           ScheduledPeriodInfo[] scheduledPeriods,
           org.apache.axis.types.UnsignedByte maxNumberOfPeriodsInDay,
           String displayedUnits) {
           this.scheduledPeriods = scheduledPeriods;
           this.maxNumberOfPeriodsInDay = maxNumberOfPeriodsInDay;
           this.displayedUnits = displayedUnits;
    }


    /**
     * Gets the scheduledPeriods value for this ScheduleInfo.
     * 
     * @return scheduledPeriods
     */
    public ScheduledPeriodInfo[] getScheduledPeriods() {
        return scheduledPeriods;
    }


    /**
     * Sets the scheduledPeriods value for this ScheduleInfo.
     * 
     * @param scheduledPeriods
     */
    public void setScheduledPeriods(ScheduledPeriodInfo[] scheduledPeriods) {
        this.scheduledPeriods = scheduledPeriods;
    }


    /**
     * Gets the maxNumberOfPeriodsInDay value for this ScheduleInfo.
     * 
     * @return maxNumberOfPeriodsInDay
     */
    public org.apache.axis.types.UnsignedByte getMaxNumberOfPeriodsInDay() {
        return maxNumberOfPeriodsInDay;
    }


    /**
     * Sets the maxNumberOfPeriodsInDay value for this ScheduleInfo.
     * 
     * @param maxNumberOfPeriodsInDay
     */
    public void setMaxNumberOfPeriodsInDay(org.apache.axis.types.UnsignedByte maxNumberOfPeriodsInDay) {
        this.maxNumberOfPeriodsInDay = maxNumberOfPeriodsInDay;
    }


    /**
     * Gets the displayedUnits value for this ScheduleInfo.
     * 
     * @return displayedUnits
     */
    public String getDisplayedUnits() {
        return displayedUnits;
    }


    /**
     * Sets the displayedUnits value for this ScheduleInfo.
     * 
     * @param displayedUnits
     */
    public void setDisplayedUnits(String displayedUnits) {
        this.displayedUnits = displayedUnits;
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
            ((this.scheduledPeriods==null && other.getScheduledPeriods()==null) || 
             (this.scheduledPeriods!=null &&
              java.util.Arrays.equals(this.scheduledPeriods, other.getScheduledPeriods()))) &&
            ((this.maxNumberOfPeriodsInDay==null && other.getMaxNumberOfPeriodsInDay()==null) || 
             (this.maxNumberOfPeriodsInDay!=null &&
              this.maxNumberOfPeriodsInDay.equals(other.getMaxNumberOfPeriodsInDay()))) &&
            ((this.displayedUnits==null && other.getDisplayedUnits()==null) || 
             (this.displayedUnits!=null &&
              this.displayedUnits.equals(other.getDisplayedUnits())));
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
        if (getScheduledPeriods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledPeriods());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getScheduledPeriods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxNumberOfPeriodsInDay() != null) {
            _hashCode += getMaxNumberOfPeriodsInDay().hashCode();
        }
        if (getDisplayedUnits() != null) {
            _hashCode += getDisplayedUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledPeriods");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriodInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriodInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxNumberOfPeriodsInDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "MaxNumberOfPeriodsInDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DisplayedUnits"));
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
