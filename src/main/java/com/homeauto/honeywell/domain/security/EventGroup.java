/**
 * EventGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventGroup  implements java.io.Serializable {
    private long eventGroupID;  // attribute

    private String eventGroupName;  // attribute

    public EventGroup() {
    }

    public EventGroup(
           long eventGroupID,
           String eventGroupName) {
           this.eventGroupID = eventGroupID;
           this.eventGroupName = eventGroupName;
    }


    /**
     * Gets the eventGroupID value for this EventGroup.
     * 
     * @return eventGroupID
     */
    public long getEventGroupID() {
        return eventGroupID;
    }


    /**
     * Sets the eventGroupID value for this EventGroup.
     * 
     * @param eventGroupID
     */
    public void setEventGroupID(long eventGroupID) {
        this.eventGroupID = eventGroupID;
    }


    /**
     * Gets the eventGroupName value for this EventGroup.
     * 
     * @return eventGroupName
     */
    public String getEventGroupName() {
        return eventGroupName;
    }


    /**
     * Sets the eventGroupName value for this EventGroup.
     * 
     * @param eventGroupName
     */
    public void setEventGroupName(String eventGroupName) {
        this.eventGroupName = eventGroupName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventGroup)) return false;
        EventGroup other = (EventGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventGroupID == other.getEventGroupID() &&
            ((this.eventGroupName==null && other.getEventGroupName()==null) || 
             (this.eventGroupName!=null &&
              this.eventGroupName.equals(other.getEventGroupName())));
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
        _hashCode += new Long(getEventGroupID()).hashCode();
        if (getEventGroupName() != null) {
            _hashCode += getEventGroupName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroup"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventGroupID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventGroupID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventGroupName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventGroupName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
