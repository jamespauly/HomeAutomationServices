/**
 * FilterEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class FilterEventType  implements java.io.Serializable {
    private long eventTypeFilterId;

    private String eventTypeFilterName;

    private long eventClass;

    public FilterEventType() {
    }

    public FilterEventType(
           long eventTypeFilterId,
           String eventTypeFilterName,
           long eventClass) {
           this.eventTypeFilterId = eventTypeFilterId;
           this.eventTypeFilterName = eventTypeFilterName;
           this.eventClass = eventClass;
    }


    /**
     * Gets the eventTypeFilterId value for this FilterEventType.
     * 
     * @return eventTypeFilterId
     */
    public long getEventTypeFilterId() {
        return eventTypeFilterId;
    }


    /**
     * Sets the eventTypeFilterId value for this FilterEventType.
     * 
     * @param eventTypeFilterId
     */
    public void setEventTypeFilterId(long eventTypeFilterId) {
        this.eventTypeFilterId = eventTypeFilterId;
    }


    /**
     * Gets the eventTypeFilterName value for this FilterEventType.
     * 
     * @return eventTypeFilterName
     */
    public String getEventTypeFilterName() {
        return eventTypeFilterName;
    }


    /**
     * Sets the eventTypeFilterName value for this FilterEventType.
     * 
     * @param eventTypeFilterName
     */
    public void setEventTypeFilterName(String eventTypeFilterName) {
        this.eventTypeFilterName = eventTypeFilterName;
    }


    /**
     * Gets the eventClass value for this FilterEventType.
     * 
     * @return eventClass
     */
    public long getEventClass() {
        return eventClass;
    }


    /**
     * Sets the eventClass value for this FilterEventType.
     * 
     * @param eventClass
     */
    public void setEventClass(long eventClass) {
        this.eventClass = eventClass;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterEventType)) return false;
        FilterEventType other = (FilterEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventTypeFilterId == other.getEventTypeFilterId() &&
            ((this.eventTypeFilterName==null && other.getEventTypeFilterName()==null) || 
             (this.eventTypeFilterName!=null &&
              this.eventTypeFilterName.equals(other.getEventTypeFilterName()))) &&
            this.eventClass == other.getEventClass();
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
        _hashCode += new Long(getEventTypeFilterId()).hashCode();
        if (getEventTypeFilterName() != null) {
            _hashCode += getEventTypeFilterName().hashCode();
        }
        _hashCode += new Long(getEventClass()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeFilterId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeFilterName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventClass");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
