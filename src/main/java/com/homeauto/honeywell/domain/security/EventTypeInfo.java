/**
 * EventTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventTypeInfo  implements java.io.Serializable {
    private long eventTypeID;

    private String eventTypeDescription;

    private EventModifierInfo[] eventModifierCollection;

    public EventTypeInfo() {
    }

    public EventTypeInfo(
           long eventTypeID,
           String eventTypeDescription,
           EventModifierInfo[] eventModifierCollection) {
           this.eventTypeID = eventTypeID;
           this.eventTypeDescription = eventTypeDescription;
           this.eventModifierCollection = eventModifierCollection;
    }


    /**
     * Gets the eventTypeID value for this EventTypeInfo.
     * 
     * @return eventTypeID
     */
    public long getEventTypeID() {
        return eventTypeID;
    }


    /**
     * Sets the eventTypeID value for this EventTypeInfo.
     * 
     * @param eventTypeID
     */
    public void setEventTypeID(long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }


    /**
     * Gets the eventTypeDescription value for this EventTypeInfo.
     * 
     * @return eventTypeDescription
     */
    public String getEventTypeDescription() {
        return eventTypeDescription;
    }


    /**
     * Sets the eventTypeDescription value for this EventTypeInfo.
     * 
     * @param eventTypeDescription
     */
    public void setEventTypeDescription(String eventTypeDescription) {
        this.eventTypeDescription = eventTypeDescription;
    }


    /**
     * Gets the eventModifierCollection value for this EventTypeInfo.
     * 
     * @return eventModifierCollection
     */
    public EventModifierInfo[] getEventModifierCollection() {
        return eventModifierCollection;
    }


    /**
     * Sets the eventModifierCollection value for this EventTypeInfo.
     * 
     * @param eventModifierCollection
     */
    public void setEventModifierCollection(EventModifierInfo[] eventModifierCollection) {
        this.eventModifierCollection = eventModifierCollection;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventTypeInfo)) return false;
        EventTypeInfo other = (EventTypeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventTypeID == other.getEventTypeID() &&
            ((this.eventTypeDescription==null && other.getEventTypeDescription()==null) || 
             (this.eventTypeDescription!=null &&
              this.eventTypeDescription.equals(other.getEventTypeDescription()))) &&
            ((this.eventModifierCollection==null && other.getEventModifierCollection()==null) || 
             (this.eventModifierCollection!=null &&
              java.util.Arrays.equals(this.eventModifierCollection, other.getEventModifierCollection())));
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
        _hashCode += new Long(getEventTypeID()).hashCode();
        if (getEventTypeDescription() != null) {
            _hashCode += getEventTypeDescription().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventTypeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
