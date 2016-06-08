/**
 * EventTypeFilterResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventTypeFilterResult  extends WebMethodResults implements java.io.Serializable {
    private FilterEventType[] eventTypeFilters;

    public EventTypeFilterResult() {
    }

    public EventTypeFilterResult(
           int resultCode,
           String resultData,
           FilterEventType[] eventTypeFilters) {
        super(
            resultCode,
            resultData);
        this.eventTypeFilters = eventTypeFilters;
    }


    /**
     * Gets the eventTypeFilters value for this EventTypeFilterResult.
     * 
     * @return eventTypeFilters
     */
    public FilterEventType[] getEventTypeFilters() {
        return eventTypeFilters;
    }


    /**
     * Sets the eventTypeFilters value for this EventTypeFilterResult.
     * 
     * @param eventTypeFilters
     */
    public void setEventTypeFilters(FilterEventType[] eventTypeFilters) {
        this.eventTypeFilters = eventTypeFilters;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventTypeFilterResult)) return false;
        EventTypeFilterResult other = (EventTypeFilterResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventTypeFilters==null && other.getEventTypeFilters()==null) || 
             (this.eventTypeFilters!=null &&
              java.util.Arrays.equals(this.eventTypeFilters, other.getEventTypeFilters())));
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
        if (getEventTypeFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventTypeFilters());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventTypeFilters(), i);
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
        new org.apache.axis.description.TypeDesc(EventTypeFilterResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeFilters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilters"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterEventType"));
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
