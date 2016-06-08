/**
 * NotificationInfoBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationInfoBase  implements java.io.Serializable {
    private long eventTypeID;  // attribute

    private long eventItemID;  // attribute

    private long eventModifierID;  // attribute

    private long deviceID;  // attribute

    private boolean isEnabled;  // attribute

    private int flashEventCardType;  // attribute

    public NotificationInfoBase() {
    }

    public NotificationInfoBase(
           long eventTypeID,
           long eventItemID,
           long eventModifierID,
           long deviceID,
           boolean isEnabled,
           int flashEventCardType) {
           this.eventTypeID = eventTypeID;
           this.eventItemID = eventItemID;
           this.eventModifierID = eventModifierID;
           this.deviceID = deviceID;
           this.isEnabled = isEnabled;
           this.flashEventCardType = flashEventCardType;
    }


    /**
     * Gets the eventTypeID value for this NotificationInfoBase.
     * 
     * @return eventTypeID
     */
    public long getEventTypeID() {
        return eventTypeID;
    }


    /**
     * Sets the eventTypeID value for this NotificationInfoBase.
     * 
     * @param eventTypeID
     */
    public void setEventTypeID(long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }


    /**
     * Gets the eventItemID value for this NotificationInfoBase.
     * 
     * @return eventItemID
     */
    public long getEventItemID() {
        return eventItemID;
    }


    /**
     * Sets the eventItemID value for this NotificationInfoBase.
     * 
     * @param eventItemID
     */
    public void setEventItemID(long eventItemID) {
        this.eventItemID = eventItemID;
    }


    /**
     * Gets the eventModifierID value for this NotificationInfoBase.
     * 
     * @return eventModifierID
     */
    public long getEventModifierID() {
        return eventModifierID;
    }


    /**
     * Sets the eventModifierID value for this NotificationInfoBase.
     * 
     * @param eventModifierID
     */
    public void setEventModifierID(long eventModifierID) {
        this.eventModifierID = eventModifierID;
    }


    /**
     * Gets the deviceID value for this NotificationInfoBase.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this NotificationInfoBase.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the isEnabled value for this NotificationInfoBase.
     * 
     * @return isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this NotificationInfoBase.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the flashEventCardType value for this NotificationInfoBase.
     * 
     * @return flashEventCardType
     */
    public int getFlashEventCardType() {
        return flashEventCardType;
    }


    /**
     * Sets the flashEventCardType value for this NotificationInfoBase.
     * 
     * @param flashEventCardType
     */
    public void setFlashEventCardType(int flashEventCardType) {
        this.flashEventCardType = flashEventCardType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationInfoBase)) return false;
        NotificationInfoBase other = (NotificationInfoBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventTypeID == other.getEventTypeID() &&
            this.eventItemID == other.getEventItemID() &&
            this.eventModifierID == other.getEventModifierID() &&
            this.deviceID == other.getDeviceID() &&
            this.isEnabled == other.isIsEnabled() &&
            this.flashEventCardType == other.getFlashEventCardType();
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
        _hashCode += new Long(getEventItemID()).hashCode();
        _hashCode += new Long(getEventModifierID()).hashCode();
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += (isIsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getFlashEventCardType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationInfoBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationInfoBase"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventTypeID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventTypeID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventItemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventModifierID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventModifierID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deviceID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DeviceID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isEnabled");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsEnabled"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("flashEventCardType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FlashEventCardType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
