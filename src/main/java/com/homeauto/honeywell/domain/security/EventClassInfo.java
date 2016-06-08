/**
 * EventClassInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventClassInfo  implements java.io.Serializable {
    private long eventClassID;

    private String eventClassDescription;

    private EventTypeInfo[] eventTypeCollection;

    public EventClassInfo() {
    }

    public EventClassInfo(
           long eventClassID,
           String eventClassDescription,
           EventTypeInfo[] eventTypeCollection) {
           this.eventClassID = eventClassID;
           this.eventClassDescription = eventClassDescription;
           this.eventTypeCollection = eventTypeCollection;
    }


    /**
     * Gets the eventClassID value for this EventClassInfo.
     * 
     * @return eventClassID
     */
    public long getEventClassID() {
        return eventClassID;
    }


    /**
     * Sets the eventClassID value for this EventClassInfo.
     * 
     * @param eventClassID
     */
    public void setEventClassID(long eventClassID) {
        this.eventClassID = eventClassID;
    }


    /**
     * Gets the eventClassDescription value for this EventClassInfo.
     * 
     * @return eventClassDescription
     */
    public String getEventClassDescription() {
        return eventClassDescription;
    }


    /**
     * Sets the eventClassDescription value for this EventClassInfo.
     * 
     * @param eventClassDescription
     */
    public void setEventClassDescription(String eventClassDescription) {
        this.eventClassDescription = eventClassDescription;
    }


    /**
     * Gets the eventTypeCollection value for this EventClassInfo.
     * 
     * @return eventTypeCollection
     */
    public EventTypeInfo[] getEventTypeCollection() {
        return eventTypeCollection;
    }


    /**
     * Sets the eventTypeCollection value for this EventClassInfo.
     * 
     * @param eventTypeCollection
     */
    public void setEventTypeCollection(EventTypeInfo[] eventTypeCollection) {
        this.eventTypeCollection = eventTypeCollection;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventClassInfo)) return false;
        EventClassInfo other = (EventClassInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventClassID == other.getEventClassID() &&
            ((this.eventClassDescription==null && other.getEventClassDescription()==null) || 
             (this.eventClassDescription!=null &&
              this.eventClassDescription.equals(other.getEventClassDescription()))) &&
            ((this.eventTypeCollection==null && other.getEventTypeCollection()==null) || 
             (this.eventTypeCollection!=null &&
              java.util.Arrays.equals(this.eventTypeCollection, other.getEventTypeCollection())));
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
        _hashCode += new Long(getEventClassID()).hashCode();
        if (getEventClassDescription() != null) {
            _hashCode += getEventClassDescription().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventClassInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventClassDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeInfo"));
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
