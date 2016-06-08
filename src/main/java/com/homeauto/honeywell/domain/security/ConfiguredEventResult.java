/**
 * ConfiguredEventResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ConfiguredEventResult  extends WebMethodResults implements java.io.Serializable {
    private SentToPanelEvents[] sentToPanelEvents;

    private EventNotification[] eventNotifications;

    private SceneTrigger[] sceneTriggers;

    private VideoTrigger[] videoTriggers;

    private TimeTriggeredAction[] timeTriggeredActions;

    public ConfiguredEventResult() {
    }

    public ConfiguredEventResult(
           int resultCode,
           String resultData,
           SentToPanelEvents[] sentToPanelEvents,
           EventNotification[] eventNotifications,
           SceneTrigger[] sceneTriggers,
           VideoTrigger[] videoTriggers,
           TimeTriggeredAction[] timeTriggeredActions) {
        super(
            resultCode,
            resultData);
        this.sentToPanelEvents = sentToPanelEvents;
        this.eventNotifications = eventNotifications;
        this.sceneTriggers = sceneTriggers;
        this.videoTriggers = videoTriggers;
        this.timeTriggeredActions = timeTriggeredActions;
    }


    /**
     * Gets the sentToPanelEvents value for this ConfiguredEventResult.
     * 
     * @return sentToPanelEvents
     */
    public SentToPanelEvents[] getSentToPanelEvents() {
        return sentToPanelEvents;
    }


    /**
     * Sets the sentToPanelEvents value for this ConfiguredEventResult.
     * 
     * @param sentToPanelEvents
     */
    public void setSentToPanelEvents(SentToPanelEvents[] sentToPanelEvents) {
        this.sentToPanelEvents = sentToPanelEvents;
    }


    /**
     * Gets the eventNotifications value for this ConfiguredEventResult.
     * 
     * @return eventNotifications
     */
    public EventNotification[] getEventNotifications() {
        return eventNotifications;
    }


    /**
     * Sets the eventNotifications value for this ConfiguredEventResult.
     * 
     * @param eventNotifications
     */
    public void setEventNotifications(EventNotification[] eventNotifications) {
        this.eventNotifications = eventNotifications;
    }


    /**
     * Gets the sceneTriggers value for this ConfiguredEventResult.
     * 
     * @return sceneTriggers
     */
    public SceneTrigger[] getSceneTriggers() {
        return sceneTriggers;
    }


    /**
     * Sets the sceneTriggers value for this ConfiguredEventResult.
     * 
     * @param sceneTriggers
     */
    public void setSceneTriggers(SceneTrigger[] sceneTriggers) {
        this.sceneTriggers = sceneTriggers;
    }


    /**
     * Gets the videoTriggers value for this ConfiguredEventResult.
     * 
     * @return videoTriggers
     */
    public VideoTrigger[] getVideoTriggers() {
        return videoTriggers;
    }


    /**
     * Sets the videoTriggers value for this ConfiguredEventResult.
     * 
     * @param videoTriggers
     */
    public void setVideoTriggers(VideoTrigger[] videoTriggers) {
        this.videoTriggers = videoTriggers;
    }


    /**
     * Gets the timeTriggeredActions value for this ConfiguredEventResult.
     * 
     * @return timeTriggeredActions
     */
    public TimeTriggeredAction[] getTimeTriggeredActions() {
        return timeTriggeredActions;
    }


    /**
     * Sets the timeTriggeredActions value for this ConfiguredEventResult.
     * 
     * @param timeTriggeredActions
     */
    public void setTimeTriggeredActions(TimeTriggeredAction[] timeTriggeredActions) {
        this.timeTriggeredActions = timeTriggeredActions;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConfiguredEventResult)) return false;
        ConfiguredEventResult other = (ConfiguredEventResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sentToPanelEvents==null && other.getSentToPanelEvents()==null) || 
             (this.sentToPanelEvents!=null &&
              java.util.Arrays.equals(this.sentToPanelEvents, other.getSentToPanelEvents()))) &&
            ((this.eventNotifications==null && other.getEventNotifications()==null) || 
             (this.eventNotifications!=null &&
              java.util.Arrays.equals(this.eventNotifications, other.getEventNotifications()))) &&
            ((this.sceneTriggers==null && other.getSceneTriggers()==null) || 
             (this.sceneTriggers!=null &&
              java.util.Arrays.equals(this.sceneTriggers, other.getSceneTriggers()))) &&
            ((this.videoTriggers==null && other.getVideoTriggers()==null) || 
             (this.videoTriggers!=null &&
              java.util.Arrays.equals(this.videoTriggers, other.getVideoTriggers()))) &&
            ((this.timeTriggeredActions==null && other.getTimeTriggeredActions()==null) || 
             (this.timeTriggeredActions!=null &&
              java.util.Arrays.equals(this.timeTriggeredActions, other.getTimeTriggeredActions())));
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
        if (getSentToPanelEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSentToPanelEvents());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSentToPanelEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventNotifications());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSceneTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSceneTriggers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSceneTriggers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVideoTriggers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoTriggers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getVideoTriggers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeTriggeredActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeTriggeredActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTimeTriggeredActions(), i);
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
        new org.apache.axis.description.TypeDesc(ConfiguredEventResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfiguredEventResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sentToPanelEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventNotifications");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTrigger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTrigger"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoTriggers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTriggers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTriggeredActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction"));
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
