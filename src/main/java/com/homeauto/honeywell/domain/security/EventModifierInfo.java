/**
 * EventModifierInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventModifierInfo  implements java.io.Serializable {
    private long eventModifierID;  // attribute

    private String eventModifierDescription;  // attribute

    private long deviceID;  // attribute

    public EventModifierInfo() {
    }

    public EventModifierInfo(
           long eventModifierID,
           String eventModifierDescription,
           long deviceID) {
           this.eventModifierID = eventModifierID;
           this.eventModifierDescription = eventModifierDescription;
           this.deviceID = deviceID;
    }


    /**
     * Gets the eventModifierID value for this EventModifierInfo.
     * 
     * @return eventModifierID
     */
    public long getEventModifierID() {
        return eventModifierID;
    }


    /**
     * Sets the eventModifierID value for this EventModifierInfo.
     * 
     * @param eventModifierID
     */
    public void setEventModifierID(long eventModifierID) {
        this.eventModifierID = eventModifierID;
    }


    /**
     * Gets the eventModifierDescription value for this EventModifierInfo.
     * 
     * @return eventModifierDescription
     */
    public String getEventModifierDescription() {
        return eventModifierDescription;
    }


    /**
     * Sets the eventModifierDescription value for this EventModifierInfo.
     * 
     * @param eventModifierDescription
     */
    public void setEventModifierDescription(String eventModifierDescription) {
        this.eventModifierDescription = eventModifierDescription;
    }


    /**
     * Gets the deviceID value for this EventModifierInfo.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this EventModifierInfo.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventModifierInfo)) return false;
        EventModifierInfo other = (EventModifierInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventModifierID == other.getEventModifierID() &&
            ((this.eventModifierDescription==null && other.getEventModifierDescription()==null) || 
             (this.eventModifierDescription!=null &&
              this.eventModifierDescription.equals(other.getEventModifierDescription()))) &&
            this.deviceID == other.getDeviceID();
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
        _hashCode += new Long(getEventModifierID()).hashCode();
        if (getEventModifierDescription() != null) {
            _hashCode += getEventModifierDescription().hashCode();
        }
        _hashCode += new Long(getDeviceID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventModifierInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierInfo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventModifierID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventModifierID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventModifierDescription");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventModifierDescription"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deviceID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DeviceID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
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
