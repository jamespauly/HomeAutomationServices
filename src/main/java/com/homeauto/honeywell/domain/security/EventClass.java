/**
 * EventClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventClass  implements java.io.Serializable {
    private EventGroup[] eventGroupList;

    private EventType[] eventTypeCollection;

    private long eventClassID;  // attribute

    private String eventClassDescription;  // attribute

    public EventClass() {
    }

    public EventClass(
           EventGroup[] eventGroupList,
           EventType[] eventTypeCollection,
           long eventClassID,
           String eventClassDescription) {
           this.eventGroupList = eventGroupList;
           this.eventTypeCollection = eventTypeCollection;
           this.eventClassID = eventClassID;
           this.eventClassDescription = eventClassDescription;
    }


    /**
     * Gets the eventGroupList value for this EventClass.
     * 
     * @return eventGroupList
     */
    public EventGroup[] getEventGroupList() {
        return eventGroupList;
    }


    /**
     * Sets the eventGroupList value for this EventClass.
     * 
     * @param eventGroupList
     */
    public void setEventGroupList(EventGroup[] eventGroupList) {
        this.eventGroupList = eventGroupList;
    }


    /**
     * Gets the eventTypeCollection value for this EventClass.
     * 
     * @return eventTypeCollection
     */
    public EventType[] getEventTypeCollection() {
        return eventTypeCollection;
    }


    /**
     * Sets the eventTypeCollection value for this EventClass.
     * 
     * @param eventTypeCollection
     */
    public void setEventTypeCollection(EventType[] eventTypeCollection) {
        this.eventTypeCollection = eventTypeCollection;
    }


    /**
     * Gets the eventClassID value for this EventClass.
     * 
     * @return eventClassID
     */
    public long getEventClassID() {
        return eventClassID;
    }


    /**
     * Sets the eventClassID value for this EventClass.
     * 
     * @param eventClassID
     */
    public void setEventClassID(long eventClassID) {
        this.eventClassID = eventClassID;
    }


    /**
     * Gets the eventClassDescription value for this EventClass.
     * 
     * @return eventClassDescription
     */
    public String getEventClassDescription() {
        return eventClassDescription;
    }


    /**
     * Sets the eventClassDescription value for this EventClass.
     * 
     * @param eventClassDescription
     */
    public void setEventClassDescription(String eventClassDescription) {
        this.eventClassDescription = eventClassDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventClass)) return false;
        EventClass other = (EventClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventGroupList==null && other.getEventGroupList()==null) || 
             (this.eventGroupList!=null &&
              java.util.Arrays.equals(this.eventGroupList, other.getEventGroupList()))) &&
            ((this.eventTypeCollection==null && other.getEventTypeCollection()==null) || 
             (this.eventTypeCollection!=null &&
              java.util.Arrays.equals(this.eventTypeCollection, other.getEventTypeCollection()))) &&
            this.eventClassID == other.getEventClassID() &&
            ((this.eventClassDescription==null && other.getEventClassDescription()==null) || 
             (this.eventClassDescription!=null &&
              this.eventClassDescription.equals(other.getEventClassDescription())));
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
        if (getEventGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventGroupList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventTypeCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventTypeCollection());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventTypeCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getEventClassID()).hashCode();
        if (getEventClassDescription() != null) {
            _hashCode += getEventClassDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventClassID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventClassID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventClassDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventClassDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType"));
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
