/**
 * EventMetaDataResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventMetaDataResults  extends WebMethodResults implements java.io.Serializable {
    private EventClassInfo[] eventClassCollection;

    private boolean isSecurityUpdateRequired;

    public EventMetaDataResults() {
    }

    public EventMetaDataResults(
           int resultCode,
           String resultData,
           EventClassInfo[] eventClassCollection,
           boolean isSecurityUpdateRequired) {
        super(
            resultCode,
            resultData);
        this.eventClassCollection = eventClassCollection;
        this.isSecurityUpdateRequired = isSecurityUpdateRequired;
    }


    /**
     * Gets the eventClassCollection value for this EventMetaDataResults.
     * 
     * @return eventClassCollection
     */
    public EventClassInfo[] getEventClassCollection() {
        return eventClassCollection;
    }


    /**
     * Sets the eventClassCollection value for this EventMetaDataResults.
     * 
     * @param eventClassCollection
     */
    public void setEventClassCollection(EventClassInfo[] eventClassCollection) {
        this.eventClassCollection = eventClassCollection;
    }


    /**
     * Gets the isSecurityUpdateRequired value for this EventMetaDataResults.
     * 
     * @return isSecurityUpdateRequired
     */
    public boolean isIsSecurityUpdateRequired() {
        return isSecurityUpdateRequired;
    }


    /**
     * Sets the isSecurityUpdateRequired value for this EventMetaDataResults.
     * 
     * @param isSecurityUpdateRequired
     */
    public void setIsSecurityUpdateRequired(boolean isSecurityUpdateRequired) {
        this.isSecurityUpdateRequired = isSecurityUpdateRequired;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventMetaDataResults)) return false;
        EventMetaDataResults other = (EventMetaDataResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventClassCollection==null && other.getEventClassCollection()==null) || 
             (this.eventClassCollection!=null &&
              java.util.Arrays.equals(this.eventClassCollection, other.getEventClassCollection()))) &&
            this.isSecurityUpdateRequired == other.isIsSecurityUpdateRequired();
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
        if (getEventClassCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventClassCollection());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventClassCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIsSecurityUpdateRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventMetaDataResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventMetaDataResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventClassCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSecurityUpdateRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsSecurityUpdateRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
