/**
 * EventSummaryConfigured.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventSummaryConfigured  implements java.io.Serializable {
    private String eventTypeDescription;  // attribute

    private String eventGroupName;  // attribute

    private String eventClassDescription;  // attribute

    private String customNotificationMessage;  // attribute

    private boolean isEnabled;  // attribute

    private String notificationListName;  // attribute

    private String notificationScheduleName;  // attribute

    private String triggerType;  // attribute

    private String trigger;  // attribute

    private String notes;  // attribute

    public EventSummaryConfigured() {
    }

    public EventSummaryConfigured(
           String eventTypeDescription,
           String eventGroupName,
           String eventClassDescription,
           String customNotificationMessage,
           boolean isEnabled,
           String notificationListName,
           String notificationScheduleName,
           String triggerType,
           String trigger,
           String notes) {
           this.eventTypeDescription = eventTypeDescription;
           this.eventGroupName = eventGroupName;
           this.eventClassDescription = eventClassDescription;
           this.customNotificationMessage = customNotificationMessage;
           this.isEnabled = isEnabled;
           this.notificationListName = notificationListName;
           this.notificationScheduleName = notificationScheduleName;
           this.triggerType = triggerType;
           this.trigger = trigger;
           this.notes = notes;
    }


    /**
     * Gets the eventTypeDescription value for this EventSummaryConfigured.
     * 
     * @return eventTypeDescription
     */
    public String getEventTypeDescription() {
        return eventTypeDescription;
    }


    /**
     * Sets the eventTypeDescription value for this EventSummaryConfigured.
     * 
     * @param eventTypeDescription
     */
    public void setEventTypeDescription(String eventTypeDescription) {
        this.eventTypeDescription = eventTypeDescription;
    }


    /**
     * Gets the eventGroupName value for this EventSummaryConfigured.
     * 
     * @return eventGroupName
     */
    public String getEventGroupName() {
        return eventGroupName;
    }


    /**
     * Sets the eventGroupName value for this EventSummaryConfigured.
     * 
     * @param eventGroupName
     */
    public void setEventGroupName(String eventGroupName) {
        this.eventGroupName = eventGroupName;
    }


    /**
     * Gets the eventClassDescription value for this EventSummaryConfigured.
     * 
     * @return eventClassDescription
     */
    public String getEventClassDescription() {
        return eventClassDescription;
    }


    /**
     * Sets the eventClassDescription value for this EventSummaryConfigured.
     * 
     * @param eventClassDescription
     */
    public void setEventClassDescription(String eventClassDescription) {
        this.eventClassDescription = eventClassDescription;
    }


    /**
     * Gets the customNotificationMessage value for this EventSummaryConfigured.
     * 
     * @return customNotificationMessage
     */
    public String getCustomNotificationMessage() {
        return customNotificationMessage;
    }


    /**
     * Sets the customNotificationMessage value for this EventSummaryConfigured.
     * 
     * @param customNotificationMessage
     */
    public void setCustomNotificationMessage(String customNotificationMessage) {
        this.customNotificationMessage = customNotificationMessage;
    }


    /**
     * Gets the isEnabled value for this EventSummaryConfigured.
     * 
     * @return isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this EventSummaryConfigured.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the notificationListName value for this EventSummaryConfigured.
     * 
     * @return notificationListName
     */
    public String getNotificationListName() {
        return notificationListName;
    }


    /**
     * Sets the notificationListName value for this EventSummaryConfigured.
     * 
     * @param notificationListName
     */
    public void setNotificationListName(String notificationListName) {
        this.notificationListName = notificationListName;
    }


    /**
     * Gets the notificationScheduleName value for this EventSummaryConfigured.
     * 
     * @return notificationScheduleName
     */
    public String getNotificationScheduleName() {
        return notificationScheduleName;
    }


    /**
     * Sets the notificationScheduleName value for this EventSummaryConfigured.
     * 
     * @param notificationScheduleName
     */
    public void setNotificationScheduleName(String notificationScheduleName) {
        this.notificationScheduleName = notificationScheduleName;
    }


    /**
     * Gets the triggerType value for this EventSummaryConfigured.
     * 
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this EventSummaryConfigured.
     * 
     * @param triggerType
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }


    /**
     * Gets the trigger value for this EventSummaryConfigured.
     * 
     * @return trigger
     */
    public String getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this EventSummaryConfigured.
     * 
     * @param trigger
     */
    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the notes value for this EventSummaryConfigured.
     * 
     * @return notes
     */
    public String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this EventSummaryConfigured.
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventSummaryConfigured)) return false;
        EventSummaryConfigured other = (EventSummaryConfigured) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventTypeDescription==null && other.getEventTypeDescription()==null) || 
             (this.eventTypeDescription!=null &&
              this.eventTypeDescription.equals(other.getEventTypeDescription()))) &&
            ((this.eventGroupName==null && other.getEventGroupName()==null) || 
             (this.eventGroupName!=null &&
              this.eventGroupName.equals(other.getEventGroupName()))) &&
            ((this.eventClassDescription==null && other.getEventClassDescription()==null) || 
             (this.eventClassDescription!=null &&
              this.eventClassDescription.equals(other.getEventClassDescription()))) &&
            ((this.customNotificationMessage==null && other.getCustomNotificationMessage()==null) || 
             (this.customNotificationMessage!=null &&
              this.customNotificationMessage.equals(other.getCustomNotificationMessage()))) &&
            this.isEnabled == other.isIsEnabled() &&
            ((this.notificationListName==null && other.getNotificationListName()==null) || 
             (this.notificationListName!=null &&
              this.notificationListName.equals(other.getNotificationListName()))) &&
            ((this.notificationScheduleName==null && other.getNotificationScheduleName()==null) || 
             (this.notificationScheduleName!=null &&
              this.notificationScheduleName.equals(other.getNotificationScheduleName()))) &&
            ((this.triggerType==null && other.getTriggerType()==null) || 
             (this.triggerType!=null &&
              this.triggerType.equals(other.getTriggerType()))) &&
            ((this.trigger==null && other.getTrigger()==null) || 
             (this.trigger!=null &&
              this.trigger.equals(other.getTrigger()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes())));
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
        if (getEventTypeDescription() != null) {
            _hashCode += getEventTypeDescription().hashCode();
        }
        if (getEventGroupName() != null) {
            _hashCode += getEventGroupName().hashCode();
        }
        if (getEventClassDescription() != null) {
            _hashCode += getEventClassDescription().hashCode();
        }
        if (getCustomNotificationMessage() != null) {
            _hashCode += getCustomNotificationMessage().hashCode();
        }
        _hashCode += (isIsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNotificationListName() != null) {
            _hashCode += getNotificationListName().hashCode();
        }
        if (getNotificationScheduleName() != null) {
            _hashCode += getNotificationScheduleName().hashCode();
        }
        if (getTriggerType() != null) {
            _hashCode += getTriggerType().hashCode();
        }
        if (getTrigger() != null) {
            _hashCode += getTrigger().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventSummaryConfigured.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryConfigured"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventTypeDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventTypeDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventGroupName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventGroupName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventClassDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventClassDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("customNotificationMessage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CustomNotificationMessage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isEnabled");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsEnabled"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationListName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationListName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationScheduleName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationScheduleName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("triggerType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TriggerType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("trigger");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Trigger"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notes");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Notes"));
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
