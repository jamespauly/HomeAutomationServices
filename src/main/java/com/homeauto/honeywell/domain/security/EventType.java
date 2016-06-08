/**
 * EventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventType  implements java.io.Serializable {
    private EventModifierInfo[] eventModifierCollection;

    private long eventTypeID;  // attribute

    private long eventGroupID;  // attribute

    private String eventTypeDescription;  // attribute

    private long eventTypeCapabilities;  // attribute

    public EventType() {
    }

    public EventType(
           EventModifierInfo[] eventModifierCollection,
           long eventTypeID,
           long eventGroupID,
           String eventTypeDescription,
           long eventTypeCapabilities) {
           this.eventModifierCollection = eventModifierCollection;
           this.eventTypeID = eventTypeID;
           this.eventGroupID = eventGroupID;
           this.eventTypeDescription = eventTypeDescription;
           this.eventTypeCapabilities = eventTypeCapabilities;
    }


    /**
     * Gets the eventModifierCollection value for this EventType.
     * 
     * @return eventModifierCollection
     */
    public EventModifierInfo[] getEventModifierCollection() {
        return eventModifierCollection;
    }


    /**
     * Sets the eventModifierCollection value for this EventType.
     * 
     * @param eventModifierCollection
     */
    public void setEventModifierCollection(EventModifierInfo[] eventModifierCollection) {
        this.eventModifierCollection = eventModifierCollection;
    }


    /**
     * Gets the eventTypeID value for this EventType.
     * 
     * @return eventTypeID
     */
    public long getEventTypeID() {
        return eventTypeID;
    }


    /**
     * Sets the eventTypeID value for this EventType.
     * 
     * @param eventTypeID
     */
    public void setEventTypeID(long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }


    /**
     * Gets the eventGroupID value for this EventType.
     * 
     * @return eventGroupID
     */
    public long getEventGroupID() {
        return eventGroupID;
    }


    /**
     * Sets the eventGroupID value for this EventType.
     * 
     * @param eventGroupID
     */
    public void setEventGroupID(long eventGroupID) {
        this.eventGroupID = eventGroupID;
    }


    /**
     * Gets the eventTypeDescription value for this EventType.
     * 
     * @return eventTypeDescription
     */
    public String getEventTypeDescription() {
        return eventTypeDescription;
    }


    /**
     * Sets the eventTypeDescription value for this EventType.
     * 
     * @param eventTypeDescription
     */
    public void setEventTypeDescription(String eventTypeDescription) {
        this.eventTypeDescription = eventTypeDescription;
    }


    /**
     * Gets the eventTypeCapabilities value for this EventType.
     * 
     * @return eventTypeCapabilities
     */
    public long getEventTypeCapabilities() {
        return eventTypeCapabilities;
    }


    /**
     * Sets the eventTypeCapabilities value for this EventType.
     * 
     * @param eventTypeCapabilities
     */
    public void setEventTypeCapabilities(long eventTypeCapabilities) {
        this.eventTypeCapabilities = eventTypeCapabilities;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventType)) return false;
        EventType other = (EventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventModifierCollection==null && other.getEventModifierCollection()==null) || 
             (this.eventModifierCollection!=null &&
              java.util.Arrays.equals(this.eventModifierCollection, other.getEventModifierCollection()))) &&
            this.eventTypeID == other.getEventTypeID() &&
            this.eventGroupID == other.getEventGroupID() &&
            ((this.eventTypeDescription==null && other.getEventTypeDescription()==null) || 
             (this.eventTypeDescription!=null &&
              this.eventTypeDescription.equals(other.getEventTypeDescription()))) &&
            this.eventTypeCapabilities == other.getEventTypeCapabilities();
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
        if (getEventModifierCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventModifierCollection());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventModifierCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getEventTypeID()).hashCode();
        _hashCode += new Long(getEventGroupID()).hashCode();
        if (getEventTypeDescription() != null) {
            _hashCode += getEventTypeDescription().hashCode();
        }
        _hashCode += new Long(getEventTypeCapabilities()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventTypeID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventTypeID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventGroupID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventGroupID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventTypeDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventTypeDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventTypeCapabilities");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventTypeCapabilities"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventModifierCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierInfo"));
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
