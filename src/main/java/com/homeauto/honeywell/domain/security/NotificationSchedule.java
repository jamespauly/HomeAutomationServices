/**
 * NotificationSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationSchedule  implements java.io.Serializable {
    private long notificationScheduleID;  // attribute

    private String notificationScheduleName;  // attribute

    private int dayID;  // attribute

    private String startTime;  // attribute

    private String endTime;  // attribute

    private boolean isInUse;  // attribute

    public NotificationSchedule() {
    }

    public NotificationSchedule(
           long notificationScheduleID,
           String notificationScheduleName,
           int dayID,
           String startTime,
           String endTime,
           boolean isInUse) {
           this.notificationScheduleID = notificationScheduleID;
           this.notificationScheduleName = notificationScheduleName;
           this.dayID = dayID;
           this.startTime = startTime;
           this.endTime = endTime;
           this.isInUse = isInUse;
    }


    /**
     * Gets the notificationScheduleID value for this NotificationSchedule.
     * 
     * @return notificationScheduleID
     */
    public long getNotificationScheduleID() {
        return notificationScheduleID;
    }


    /**
     * Sets the notificationScheduleID value for this NotificationSchedule.
     * 
     * @param notificationScheduleID
     */
    public void setNotificationScheduleID(long notificationScheduleID) {
        this.notificationScheduleID = notificationScheduleID;
    }


    /**
     * Gets the notificationScheduleName value for this NotificationSchedule.
     * 
     * @return notificationScheduleName
     */
    public String getNotificationScheduleName() {
        return notificationScheduleName;
    }


    /**
     * Sets the notificationScheduleName value for this NotificationSchedule.
     * 
     * @param notificationScheduleName
     */
    public void setNotificationScheduleName(String notificationScheduleName) {
        this.notificationScheduleName = notificationScheduleName;
    }


    /**
     * Gets the dayID value for this NotificationSchedule.
     * 
     * @return dayID
     */
    public int getDayID() {
        return dayID;
    }


    /**
     * Sets the dayID value for this NotificationSchedule.
     * 
     * @param dayID
     */
    public void setDayID(int dayID) {
        this.dayID = dayID;
    }


    /**
     * Gets the startTime value for this NotificationSchedule.
     * 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this NotificationSchedule.
     * 
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this NotificationSchedule.
     * 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this NotificationSchedule.
     * 
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the isInUse value for this NotificationSchedule.
     * 
     * @return isInUse
     */
    public boolean isIsInUse() {
        return isInUse;
    }


    /**
     * Sets the isInUse value for this NotificationSchedule.
     * 
     * @param isInUse
     */
    public void setIsInUse(boolean isInUse) {
        this.isInUse = isInUse;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationSchedule)) return false;
        NotificationSchedule other = (NotificationSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notificationScheduleID == other.getNotificationScheduleID() &&
            ((this.notificationScheduleName==null && other.getNotificationScheduleName()==null) || 
             (this.notificationScheduleName!=null &&
              this.notificationScheduleName.equals(other.getNotificationScheduleName()))) &&
            this.dayID == other.getDayID() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.isInUse == other.isIsInUse();
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
        _hashCode += new Long(getNotificationScheduleID()).hashCode();
        if (getNotificationScheduleName() != null) {
            _hashCode += getNotificationScheduleName().hashCode();
        }
        _hashCode += getDayID();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += (isIsInUse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationSchedule"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationScheduleID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationScheduleID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationScheduleName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationScheduleName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dayID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DayID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("endTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isInUse");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsInUse"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
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
