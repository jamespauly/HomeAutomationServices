/**
 * ScenesTriggerEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ScenesTriggerEvent  implements java.io.Serializable {
    private long eventTypeID;

    private long eventItemID;

    private long eventModifierID;

    private long deviceID;

    private boolean isEnabled;

    private int flashEventCardType;

    public ScenesTriggerEvent() {
    }

    public ScenesTriggerEvent(
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
     * Gets the eventTypeID value for this ScenesTriggerEvent.
     * 
     * @return eventTypeID
     */
    public long getEventTypeID() {
        return eventTypeID;
    }


    /**
     * Sets the eventTypeID value for this ScenesTriggerEvent.
     * 
     * @param eventTypeID
     */
    public void setEventTypeID(long eventTypeID) {
        this.eventTypeID = eventTypeID;
    }


    /**
     * Gets the eventItemID value for this ScenesTriggerEvent.
     * 
     * @return eventItemID
     */
    public long getEventItemID() {
        return eventItemID;
    }


    /**
     * Sets the eventItemID value for this ScenesTriggerEvent.
     * 
     * @param eventItemID
     */
    public void setEventItemID(long eventItemID) {
        this.eventItemID = eventItemID;
    }


    /**
     * Gets the eventModifierID value for this ScenesTriggerEvent.
     * 
     * @return eventModifierID
     */
    public long getEventModifierID() {
        return eventModifierID;
    }


    /**
     * Sets the eventModifierID value for this ScenesTriggerEvent.
     * 
     * @param eventModifierID
     */
    public void setEventModifierID(long eventModifierID) {
        this.eventModifierID = eventModifierID;
    }


    /**
     * Gets the deviceID value for this ScenesTriggerEvent.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this ScenesTriggerEvent.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the isEnabled value for this ScenesTriggerEvent.
     * 
     * @return isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this ScenesTriggerEvent.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the flashEventCardType value for this ScenesTriggerEvent.
     * 
     * @return flashEventCardType
     */
    public int getFlashEventCardType() {
        return flashEventCardType;
    }


    /**
     * Sets the flashEventCardType value for this ScenesTriggerEvent.
     * 
     * @param flashEventCardType
     */
    public void setFlashEventCardType(int flashEventCardType) {
        this.flashEventCardType = flashEventCardType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ScenesTriggerEvent)) return false;
        ScenesTriggerEvent other = (ScenesTriggerEvent) obj;
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
        new org.apache.axis.description.TypeDesc(ScenesTriggerEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScenesTriggerEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventModifierID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashEventCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FlashEventCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
