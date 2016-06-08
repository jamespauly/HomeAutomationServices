/**
 * SmartActionTriggerEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartActionTriggerEvent  implements java.io.Serializable {
    private long smartActionTriggerEventID;

    private int securityTriggerEvent;

    private long securityTriggerDeviceID;

    private long deviceID;

    private long triggerZoneID;

    private int deviceState;

    public SmartActionTriggerEvent() {
    }

    public SmartActionTriggerEvent(
           long smartActionTriggerEventID,
           int securityTriggerEvent,
           long securityTriggerDeviceID,
           long deviceID,
           long triggerZoneID,
           int deviceState) {
           this.smartActionTriggerEventID = smartActionTriggerEventID;
           this.securityTriggerEvent = securityTriggerEvent;
           this.securityTriggerDeviceID = securityTriggerDeviceID;
           this.deviceID = deviceID;
           this.triggerZoneID = triggerZoneID;
           this.deviceState = deviceState;
    }


    /**
     * Gets the smartActionTriggerEventID value for this SmartActionTriggerEvent.
     * 
     * @return smartActionTriggerEventID
     */
    public long getSmartActionTriggerEventID() {
        return smartActionTriggerEventID;
    }


    /**
     * Sets the smartActionTriggerEventID value for this SmartActionTriggerEvent.
     * 
     * @param smartActionTriggerEventID
     */
    public void setSmartActionTriggerEventID(long smartActionTriggerEventID) {
        this.smartActionTriggerEventID = smartActionTriggerEventID;
    }


    /**
     * Gets the securityTriggerEvent value for this SmartActionTriggerEvent.
     * 
     * @return securityTriggerEvent
     */
    public int getSecurityTriggerEvent() {
        return securityTriggerEvent;
    }


    /**
     * Sets the securityTriggerEvent value for this SmartActionTriggerEvent.
     * 
     * @param securityTriggerEvent
     */
    public void setSecurityTriggerEvent(int securityTriggerEvent) {
        this.securityTriggerEvent = securityTriggerEvent;
    }


    /**
     * Gets the securityTriggerDeviceID value for this SmartActionTriggerEvent.
     * 
     * @return securityTriggerDeviceID
     */
    public long getSecurityTriggerDeviceID() {
        return securityTriggerDeviceID;
    }


    /**
     * Sets the securityTriggerDeviceID value for this SmartActionTriggerEvent.
     * 
     * @param securityTriggerDeviceID
     */
    public void setSecurityTriggerDeviceID(long securityTriggerDeviceID) {
        this.securityTriggerDeviceID = securityTriggerDeviceID;
    }


    /**
     * Gets the deviceID value for this SmartActionTriggerEvent.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this SmartActionTriggerEvent.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the triggerZoneID value for this SmartActionTriggerEvent.
     * 
     * @return triggerZoneID
     */
    public long getTriggerZoneID() {
        return triggerZoneID;
    }


    /**
     * Sets the triggerZoneID value for this SmartActionTriggerEvent.
     * 
     * @param triggerZoneID
     */
    public void setTriggerZoneID(long triggerZoneID) {
        this.triggerZoneID = triggerZoneID;
    }


    /**
     * Gets the deviceState value for this SmartActionTriggerEvent.
     * 
     * @return deviceState
     */
    public int getDeviceState() {
        return deviceState;
    }


    /**
     * Sets the deviceState value for this SmartActionTriggerEvent.
     * 
     * @param deviceState
     */
    public void setDeviceState(int deviceState) {
        this.deviceState = deviceState;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartActionTriggerEvent)) return false;
        SmartActionTriggerEvent other = (SmartActionTriggerEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.smartActionTriggerEventID == other.getSmartActionTriggerEventID() &&
            this.securityTriggerEvent == other.getSecurityTriggerEvent() &&
            this.securityTriggerDeviceID == other.getSecurityTriggerDeviceID() &&
            this.deviceID == other.getDeviceID() &&
            this.triggerZoneID == other.getTriggerZoneID() &&
            this.deviceState == other.getDeviceState();
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
        _hashCode += new Long(getSmartActionTriggerEventID()).hashCode();
        _hashCode += getSecurityTriggerEvent();
        _hashCode += new Long(getSecurityTriggerDeviceID()).hashCode();
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += new Long(getTriggerZoneID()).hashCode();
        _hashCode += getDeviceState();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartActionTriggerEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionTriggerEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartActionTriggerEventID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionTriggerEventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityTriggerEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecurityTriggerEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityTriggerDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecurityTriggerDeviceID"));
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
        elemField.setFieldName("triggerZoneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerZoneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceState"));
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
