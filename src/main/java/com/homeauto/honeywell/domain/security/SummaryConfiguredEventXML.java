/**
 * SummaryConfiguredEventXML.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SummaryConfiguredEventXML  extends WebMethodResults implements java.io.Serializable {
    private EventSummaryTitle eventSummaryTitle;

    private EventSummaryConfigured[] summaryEvents;

    private EventSummaryTimeTriggeredActions[] summaryTTEvents;

    public SummaryConfiguredEventXML() {
    }

    public SummaryConfiguredEventXML(
           int resultCode,
           String resultData,
           EventSummaryTitle eventSummaryTitle,
           EventSummaryConfigured[] summaryEvents,
           EventSummaryTimeTriggeredActions[] summaryTTEvents) {
        super(
            resultCode,
            resultData);
        this.eventSummaryTitle = eventSummaryTitle;
        this.summaryEvents = summaryEvents;
        this.summaryTTEvents = summaryTTEvents;
    }


    /**
     * Gets the eventSummaryTitle value for this SummaryConfiguredEventXML.
     * 
     * @return eventSummaryTitle
     */
    public EventSummaryTitle getEventSummaryTitle() {
        return eventSummaryTitle;
    }


    /**
     * Sets the eventSummaryTitle value for this SummaryConfiguredEventXML.
     * 
     * @param eventSummaryTitle
     */
    public void setEventSummaryTitle(EventSummaryTitle eventSummaryTitle) {
        this.eventSummaryTitle = eventSummaryTitle;
    }


    /**
     * Gets the summaryEvents value for this SummaryConfiguredEventXML.
     * 
     * @return summaryEvents
     */
    public EventSummaryConfigured[] getSummaryEvents() {
        return summaryEvents;
    }


    /**
     * Sets the summaryEvents value for this SummaryConfiguredEventXML.
     * 
     * @param summaryEvents
     */
    public void setSummaryEvents(EventSummaryConfigured[] summaryEvents) {
        this.summaryEvents = summaryEvents;
    }


    /**
     * Gets the summaryTTEvents value for this SummaryConfiguredEventXML.
     * 
     * @return summaryTTEvents
     */
    public EventSummaryTimeTriggeredActions[] getSummaryTTEvents() {
        return summaryTTEvents;
    }


    /**
     * Sets the summaryTTEvents value for this SummaryConfiguredEventXML.
     * 
     * @param summaryTTEvents
     */
    public void setSummaryTTEvents(EventSummaryTimeTriggeredActions[] summaryTTEvents) {
        this.summaryTTEvents = summaryTTEvents;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SummaryConfiguredEventXML)) return false;
        SummaryConfiguredEventXML other = (SummaryConfiguredEventXML) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventSummaryTitle==null && other.getEventSummaryTitle()==null) || 
             (this.eventSummaryTitle!=null &&
              this.eventSummaryTitle.equals(other.getEventSummaryTitle()))) &&
            ((this.summaryEvents==null && other.getSummaryEvents()==null) || 
             (this.summaryEvents!=null &&
              java.util.Arrays.equals(this.summaryEvents, other.getSummaryEvents()))) &&
            ((this.summaryTTEvents==null && other.getSummaryTTEvents()==null) || 
             (this.summaryTTEvents!=null &&
              java.util.Arrays.equals(this.summaryTTEvents, other.getSummaryTTEvents())));
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
        if (getEventSummaryTitle() != null) {
            _hashCode += getEventSummaryTitle().hashCode();
        }
        if (getSummaryEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryEvents());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSummaryEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSummaryTTEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSummaryTTEvents());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSummaryTTEvents(), i);
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
        new org.apache.axis.description.TypeDesc(SummaryConfiguredEventXML.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryConfiguredEventXML"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventSummaryTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTitle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryConfigured"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryConfigured"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryTTEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryTTEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTimeTriggeredActions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTimeTriggeredActions"));
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
