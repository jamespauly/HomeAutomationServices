/**
 * EventNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventNotification  extends NotificationInfoBase implements java.io.Serializable {
    private String customNotificationMessage;  // attribute

    private long notificationListID;  // attribute

    private long scheduleID;  // attribute

    private int securityPanelStateCondition;  // attribute

    private int notificationTypeID;  // attribute

    private int notificationDelay;  // attribute

    private String notificationDeadLine;  // attribute

    public EventNotification() {
    }

    public EventNotification(
           long eventTypeID,
           long eventItemID,
           long eventModifierID,
           long deviceID,
           boolean isEnabled,
           int flashEventCardType,
           String customNotificationMessage,
           long notificationListID,
           long scheduleID,
           int securityPanelStateCondition,
           int notificationTypeID,
           int notificationDelay,
           String notificationDeadLine) {
        super(
            eventTypeID,
            eventItemID,
            eventModifierID,
            deviceID,
            isEnabled,
            flashEventCardType);
        this.customNotificationMessage = customNotificationMessage;
        this.notificationListID = notificationListID;
        this.scheduleID = scheduleID;
        this.securityPanelStateCondition = securityPanelStateCondition;
        this.notificationTypeID = notificationTypeID;
        this.notificationDelay = notificationDelay;
        this.notificationDeadLine = notificationDeadLine;
    }


    /**
     * Gets the customNotificationMessage value for this EventNotification.
     * 
     * @return customNotificationMessage
     */
    public String getCustomNotificationMessage() {
        return customNotificationMessage;
    }


    /**
     * Sets the customNotificationMessage value for this EventNotification.
     * 
     * @param customNotificationMessage
     */
    public void setCustomNotificationMessage(String customNotificationMessage) {
        this.customNotificationMessage = customNotificationMessage;
    }


    /**
     * Gets the notificationListID value for this EventNotification.
     * 
     * @return notificationListID
     */
    public long getNotificationListID() {
        return notificationListID;
    }


    /**
     * Sets the notificationListID value for this EventNotification.
     * 
     * @param notificationListID
     */
    public void setNotificationListID(long notificationListID) {
        this.notificationListID = notificationListID;
    }


    /**
     * Gets the scheduleID value for this EventNotification.
     * 
     * @return scheduleID
     */
    public long getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this EventNotification.
     * 
     * @param scheduleID
     */
    public void setScheduleID(long scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the securityPanelStateCondition value for this EventNotification.
     * 
     * @return securityPanelStateCondition
     */
    public int getSecurityPanelStateCondition() {
        return securityPanelStateCondition;
    }


    /**
     * Sets the securityPanelStateCondition value for this EventNotification.
     * 
     * @param securityPanelStateCondition
     */
    public void setSecurityPanelStateCondition(int securityPanelStateCondition) {
        this.securityPanelStateCondition = securityPanelStateCondition;
    }


    /**
     * Gets the notificationTypeID value for this EventNotification.
     * 
     * @return notificationTypeID
     */
    public int getNotificationTypeID() {
        return notificationTypeID;
    }


    /**
     * Sets the notificationTypeID value for this EventNotification.
     * 
     * @param notificationTypeID
     */
    public void setNotificationTypeID(int notificationTypeID) {
        this.notificationTypeID = notificationTypeID;
    }


    /**
     * Gets the notificationDelay value for this EventNotification.
     * 
     * @return notificationDelay
     */
    public int getNotificationDelay() {
        return notificationDelay;
    }


    /**
     * Sets the notificationDelay value for this EventNotification.
     * 
     * @param notificationDelay
     */
    public void setNotificationDelay(int notificationDelay) {
        this.notificationDelay = notificationDelay;
    }


    /**
     * Gets the notificationDeadLine value for this EventNotification.
     * 
     * @return notificationDeadLine
     */
    public String getNotificationDeadLine() {
        return notificationDeadLine;
    }


    /**
     * Sets the notificationDeadLine value for this EventNotification.
     * 
     * @param notificationDeadLine
     */
    public void setNotificationDeadLine(String notificationDeadLine) {
        this.notificationDeadLine = notificationDeadLine;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventNotification)) return false;
        EventNotification other = (EventNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customNotificationMessage==null && other.getCustomNotificationMessage()==null) || 
             (this.customNotificationMessage!=null &&
              this.customNotificationMessage.equals(other.getCustomNotificationMessage()))) &&
            this.notificationListID == other.getNotificationListID() &&
            this.scheduleID == other.getScheduleID() &&
            this.securityPanelStateCondition == other.getSecurityPanelStateCondition() &&
            this.notificationTypeID == other.getNotificationTypeID() &&
            this.notificationDelay == other.getNotificationDelay() &&
            ((this.notificationDeadLine==null && other.getNotificationDeadLine()==null) || 
             (this.notificationDeadLine!=null &&
              this.notificationDeadLine.equals(other.getNotificationDeadLine())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustomNotificationMessage() != null) {
            _hashCode += getCustomNotificationMessage().hashCode();
        }
        _hashCode += new Long(getNotificationListID()).hashCode();
        _hashCode += new Long(getScheduleID()).hashCode();
        _hashCode += getSecurityPanelStateCondition();
        _hashCode += getNotificationTypeID();
        _hashCode += getNotificationDelay();
        if (getNotificationDeadLine() != null) {
            _hashCode += getNotificationDeadLine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("customNotificationMessage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CustomNotificationMessage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationListID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationListID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("scheduleID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ScheduleID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("securityPanelStateCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SecurityPanelStateCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationTypeID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationTypeID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationDelay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationDelay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationDeadLine");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationDeadLine"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
