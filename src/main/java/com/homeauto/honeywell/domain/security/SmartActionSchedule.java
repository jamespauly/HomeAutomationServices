/**
 * SmartActionSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartActionSchedule  implements java.io.Serializable {
    private long smartActionScheduleID;

    private int frequencyType;

    private String scheduleDate;

    private int[] dayOfWeek;

    private int[] dayOfMonth;

    private String startTime;

    private int sunrise;

    private int sunset;

    private int randomMinutesBefore;

    private int randomMinutesAfter;

    public SmartActionSchedule() {
    }

    public SmartActionSchedule(
           long smartActionScheduleID,
           int frequencyType,
           String scheduleDate,
           int[] dayOfWeek,
           int[] dayOfMonth,
           String startTime,
           int sunrise,
           int sunset,
           int randomMinutesBefore,
           int randomMinutesAfter) {
           this.smartActionScheduleID = smartActionScheduleID;
           this.frequencyType = frequencyType;
           this.scheduleDate = scheduleDate;
           this.dayOfWeek = dayOfWeek;
           this.dayOfMonth = dayOfMonth;
           this.startTime = startTime;
           this.sunrise = sunrise;
           this.sunset = sunset;
           this.randomMinutesBefore = randomMinutesBefore;
           this.randomMinutesAfter = randomMinutesAfter;
    }


    /**
     * Gets the smartActionScheduleID value for this SmartActionSchedule.
     * 
     * @return smartActionScheduleID
     */
    public long getSmartActionScheduleID() {
        return smartActionScheduleID;
    }


    /**
     * Sets the smartActionScheduleID value for this SmartActionSchedule.
     * 
     * @param smartActionScheduleID
     */
    public void setSmartActionScheduleID(long smartActionScheduleID) {
        this.smartActionScheduleID = smartActionScheduleID;
    }


    /**
     * Gets the frequencyType value for this SmartActionSchedule.
     * 
     * @return frequencyType
     */
    public int getFrequencyType() {
        return frequencyType;
    }


    /**
     * Sets the frequencyType value for this SmartActionSchedule.
     * 
     * @param frequencyType
     */
    public void setFrequencyType(int frequencyType) {
        this.frequencyType = frequencyType;
    }


    /**
     * Gets the scheduleDate value for this SmartActionSchedule.
     * 
     * @return scheduleDate
     */
    public String getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this SmartActionSchedule.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(String scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the dayOfWeek value for this SmartActionSchedule.
     * 
     * @return dayOfWeek
     */
    public int[] getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this SmartActionSchedule.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(int[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the dayOfMonth value for this SmartActionSchedule.
     * 
     * @return dayOfMonth
     */
    public int[] getDayOfMonth() {
        return dayOfMonth;
    }


    /**
     * Sets the dayOfMonth value for this SmartActionSchedule.
     * 
     * @param dayOfMonth
     */
    public void setDayOfMonth(int[] dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }


    /**
     * Gets the startTime value for this SmartActionSchedule.
     * 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SmartActionSchedule.
     * 
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the sunrise value for this SmartActionSchedule.
     * 
     * @return sunrise
     */
    public int getSunrise() {
        return sunrise;
    }


    /**
     * Sets the sunrise value for this SmartActionSchedule.
     * 
     * @param sunrise
     */
    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }


    /**
     * Gets the sunset value for this SmartActionSchedule.
     * 
     * @return sunset
     */
    public int getSunset() {
        return sunset;
    }


    /**
     * Sets the sunset value for this SmartActionSchedule.
     * 
     * @param sunset
     */
    public void setSunset(int sunset) {
        this.sunset = sunset;
    }


    /**
     * Gets the randomMinutesBefore value for this SmartActionSchedule.
     * 
     * @return randomMinutesBefore
     */
    public int getRandomMinutesBefore() {
        return randomMinutesBefore;
    }


    /**
     * Sets the randomMinutesBefore value for this SmartActionSchedule.
     * 
     * @param randomMinutesBefore
     */
    public void setRandomMinutesBefore(int randomMinutesBefore) {
        this.randomMinutesBefore = randomMinutesBefore;
    }


    /**
     * Gets the randomMinutesAfter value for this SmartActionSchedule.
     * 
     * @return randomMinutesAfter
     */
    public int getRandomMinutesAfter() {
        return randomMinutesAfter;
    }


    /**
     * Sets the randomMinutesAfter value for this SmartActionSchedule.
     * 
     * @param randomMinutesAfter
     */
    public void setRandomMinutesAfter(int randomMinutesAfter) {
        this.randomMinutesAfter = randomMinutesAfter;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartActionSchedule)) return false;
        SmartActionSchedule other = (SmartActionSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.smartActionScheduleID == other.getSmartActionScheduleID() &&
            this.frequencyType == other.getFrequencyType() &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              java.util.Arrays.equals(this.dayOfWeek, other.getDayOfWeek()))) &&
            ((this.dayOfMonth==null && other.getDayOfMonth()==null) || 
             (this.dayOfMonth!=null &&
              java.util.Arrays.equals(this.dayOfMonth, other.getDayOfMonth()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            this.sunrise == other.getSunrise() &&
            this.sunset == other.getSunset() &&
            this.randomMinutesBefore == other.getRandomMinutesBefore() &&
            this.randomMinutesAfter == other.getRandomMinutesAfter();
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
        _hashCode += new Long(getSmartActionScheduleID()).hashCode();
        _hashCode += getFrequencyType();
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getDayOfWeek() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayOfWeek());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDayOfWeek(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDayOfMonth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDayOfMonth());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDayOfMonth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        _hashCode += getSunrise();
        _hashCode += getSunset();
        _hashCode += getRandomMinutesBefore();
        _hashCode += getRandomMinutesAfter();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartActionSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartActionScheduleID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionScheduleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FrequencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DayOfMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunrise");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Sunrise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sunset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Sunset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("randomMinutesBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RandomMinutesBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("randomMinutesAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RandomMinutesAfter"));
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
