/**
 * EventSummaryTimeTriggeredActions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventSummaryTimeTriggeredActions  implements java.io.Serializable {
    private String notes;

    private String eventGroupName;  // attribute

    private String eventTypeDescription;  // attribute

    private String sceneName;  // attribute

    private String triggerType;  // attribute

    public EventSummaryTimeTriggeredActions() {
    }

    public EventSummaryTimeTriggeredActions(
           String notes,
           String eventGroupName,
           String eventTypeDescription,
           String sceneName,
           String triggerType) {
           this.notes = notes;
           this.eventGroupName = eventGroupName;
           this.eventTypeDescription = eventTypeDescription;
           this.sceneName = sceneName;
           this.triggerType = triggerType;
    }


    /**
     * Gets the notes value for this EventSummaryTimeTriggeredActions.
     * 
     * @return notes
     */
    public String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this EventSummaryTimeTriggeredActions.
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }


    /**
     * Gets the eventGroupName value for this EventSummaryTimeTriggeredActions.
     * 
     * @return eventGroupName
     */
    public String getEventGroupName() {
        return eventGroupName;
    }


    /**
     * Sets the eventGroupName value for this EventSummaryTimeTriggeredActions.
     * 
     * @param eventGroupName
     */
    public void setEventGroupName(String eventGroupName) {
        this.eventGroupName = eventGroupName;
    }


    /**
     * Gets the eventTypeDescription value for this EventSummaryTimeTriggeredActions.
     * 
     * @return eventTypeDescription
     */
    public String getEventTypeDescription() {
        return eventTypeDescription;
    }


    /**
     * Sets the eventTypeDescription value for this EventSummaryTimeTriggeredActions.
     * 
     * @param eventTypeDescription
     */
    public void setEventTypeDescription(String eventTypeDescription) {
        this.eventTypeDescription = eventTypeDescription;
    }


    /**
     * Gets the sceneName value for this EventSummaryTimeTriggeredActions.
     * 
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }


    /**
     * Sets the sceneName value for this EventSummaryTimeTriggeredActions.
     * 
     * @param sceneName
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }


    /**
     * Gets the triggerType value for this EventSummaryTimeTriggeredActions.
     * 
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this EventSummaryTimeTriggeredActions.
     * 
     * @param triggerType
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventSummaryTimeTriggeredActions)) return false;
        EventSummaryTimeTriggeredActions other = (EventSummaryTimeTriggeredActions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.eventGroupName==null && other.getEventGroupName()==null) || 
             (this.eventGroupName!=null &&
              this.eventGroupName.equals(other.getEventGroupName()))) &&
            ((this.eventTypeDescription==null && other.getEventTypeDescription()==null) || 
             (this.eventTypeDescription!=null &&
              this.eventTypeDescription.equals(other.getEventTypeDescription()))) &&
            ((this.sceneName==null && other.getSceneName()==null) || 
             (this.sceneName!=null &&
              this.sceneName.equals(other.getSceneName()))) &&
            ((this.triggerType==null && other.getTriggerType()==null) || 
             (this.triggerType!=null &&
              this.triggerType.equals(other.getTriggerType())));
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
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getEventGroupName() != null) {
            _hashCode += getEventGroupName().hashCode();
        }
        if (getEventTypeDescription() != null) {
            _hashCode += getEventTypeDescription().hashCode();
        }
        if (getSceneName() != null) {
            _hashCode += getSceneName().hashCode();
        }
        if (getTriggerType() != null) {
            _hashCode += getTriggerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventSummaryTimeTriggeredActions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTimeTriggeredActions"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventGroupName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventGroupName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventTypeDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventTypeDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sceneName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SceneName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("triggerType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TriggerType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Notes"));
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
