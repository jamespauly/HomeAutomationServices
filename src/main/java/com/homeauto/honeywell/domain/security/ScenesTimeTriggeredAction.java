/**
 * ScenesTimeTriggeredAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ScenesTimeTriggeredAction  implements java.io.Serializable {
    private long deviceID;

    private long eventItemID;

    private String triggerTime;

    private int selectedDayID;

    private boolean isEnabled;

    private int flashEventCardType;

    public ScenesTimeTriggeredAction() {
    }

    public ScenesTimeTriggeredAction(
           long deviceID,
           long eventItemID,
           String triggerTime,
           int selectedDayID,
           boolean isEnabled,
           int flashEventCardType) {
           this.deviceID = deviceID;
           this.eventItemID = eventItemID;
           this.triggerTime = triggerTime;
           this.selectedDayID = selectedDayID;
           this.isEnabled = isEnabled;
           this.flashEventCardType = flashEventCardType;
    }


    /**
     * Gets the deviceID value for this ScenesTimeTriggeredAction.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this ScenesTimeTriggeredAction.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the eventItemID value for this ScenesTimeTriggeredAction.
     * 
     * @return eventItemID
     */
    public long getEventItemID() {
        return eventItemID;
    }


    /**
     * Sets the eventItemID value for this ScenesTimeTriggeredAction.
     * 
     * @param eventItemID
     */
    public void setEventItemID(long eventItemID) {
        this.eventItemID = eventItemID;
    }


    /**
     * Gets the triggerTime value for this ScenesTimeTriggeredAction.
     * 
     * @return triggerTime
     */
    public String getTriggerTime() {
        return triggerTime;
    }


    /**
     * Sets the triggerTime value for this ScenesTimeTriggeredAction.
     * 
     * @param triggerTime
     */
    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }


    /**
     * Gets the selectedDayID value for this ScenesTimeTriggeredAction.
     * 
     * @return selectedDayID
     */
    public int getSelectedDayID() {
        return selectedDayID;
    }


    /**
     * Sets the selectedDayID value for this ScenesTimeTriggeredAction.
     * 
     * @param selectedDayID
     */
    public void setSelectedDayID(int selectedDayID) {
        this.selectedDayID = selectedDayID;
    }


    /**
     * Gets the isEnabled value for this ScenesTimeTriggeredAction.
     * 
     * @return isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this ScenesTimeTriggeredAction.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the flashEventCardType value for this ScenesTimeTriggeredAction.
     * 
     * @return flashEventCardType
     */
    public int getFlashEventCardType() {
        return flashEventCardType;
    }


    /**
     * Sets the flashEventCardType value for this ScenesTimeTriggeredAction.
     * 
     * @param flashEventCardType
     */
    public void setFlashEventCardType(int flashEventCardType) {
        this.flashEventCardType = flashEventCardType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ScenesTimeTriggeredAction)) return false;
        ScenesTimeTriggeredAction other = (ScenesTimeTriggeredAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            this.eventItemID == other.getEventItemID() &&
            ((this.triggerTime==null && other.getTriggerTime()==null) || 
             (this.triggerTime!=null &&
              this.triggerTime.equals(other.getTriggerTime()))) &&
            this.selectedDayID == other.getSelectedDayID() &&
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
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += new Long(getEventItemID()).hashCode();
        if (getTriggerTime() != null) {
            _hashCode += getTriggerTime().hashCode();
        }
        _hashCode += getSelectedDayID();
        _hashCode += (isIsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getFlashEventCardType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScenesTimeTriggeredAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScenesTimeTriggeredAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
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
        elemField.setFieldName("triggerTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedDayID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SelectedDayID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
