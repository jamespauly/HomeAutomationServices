/**
 * TimeTriggeredAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TimeTriggeredAction  implements java.io.Serializable {
    private long deviceID;  // attribute

    private long sceneID;  // attribute

    private long eventItemID;  // attribute

    private String triggerTime;  // attribute

    private int selectedDayID;  // attribute

    private boolean isEnabled;  // attribute

    private int flashEventCardType;  // attribute

    public TimeTriggeredAction() {
    }

    public TimeTriggeredAction(
           long deviceID,
           long sceneID,
           long eventItemID,
           String triggerTime,
           int selectedDayID,
           boolean isEnabled,
           int flashEventCardType) {
           this.deviceID = deviceID;
           this.sceneID = sceneID;
           this.eventItemID = eventItemID;
           this.triggerTime = triggerTime;
           this.selectedDayID = selectedDayID;
           this.isEnabled = isEnabled;
           this.flashEventCardType = flashEventCardType;
    }


    /**
     * Gets the deviceID value for this TimeTriggeredAction.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this TimeTriggeredAction.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the sceneID value for this TimeTriggeredAction.
     * 
     * @return sceneID
     */
    public long getSceneID() {
        return sceneID;
    }


    /**
     * Sets the sceneID value for this TimeTriggeredAction.
     * 
     * @param sceneID
     */
    public void setSceneID(long sceneID) {
        this.sceneID = sceneID;
    }


    /**
     * Gets the eventItemID value for this TimeTriggeredAction.
     * 
     * @return eventItemID
     */
    public long getEventItemID() {
        return eventItemID;
    }


    /**
     * Sets the eventItemID value for this TimeTriggeredAction.
     * 
     * @param eventItemID
     */
    public void setEventItemID(long eventItemID) {
        this.eventItemID = eventItemID;
    }


    /**
     * Gets the triggerTime value for this TimeTriggeredAction.
     * 
     * @return triggerTime
     */
    public String getTriggerTime() {
        return triggerTime;
    }


    /**
     * Sets the triggerTime value for this TimeTriggeredAction.
     * 
     * @param triggerTime
     */
    public void setTriggerTime(String triggerTime) {
        this.triggerTime = triggerTime;
    }


    /**
     * Gets the selectedDayID value for this TimeTriggeredAction.
     * 
     * @return selectedDayID
     */
    public int getSelectedDayID() {
        return selectedDayID;
    }


    /**
     * Sets the selectedDayID value for this TimeTriggeredAction.
     * 
     * @param selectedDayID
     */
    public void setSelectedDayID(int selectedDayID) {
        this.selectedDayID = selectedDayID;
    }


    /**
     * Gets the isEnabled value for this TimeTriggeredAction.
     * 
     * @return isEnabled
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }


    /**
     * Sets the isEnabled value for this TimeTriggeredAction.
     * 
     * @param isEnabled
     */
    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }


    /**
     * Gets the flashEventCardType value for this TimeTriggeredAction.
     * 
     * @return flashEventCardType
     */
    public int getFlashEventCardType() {
        return flashEventCardType;
    }


    /**
     * Sets the flashEventCardType value for this TimeTriggeredAction.
     * 
     * @param flashEventCardType
     */
    public void setFlashEventCardType(int flashEventCardType) {
        this.flashEventCardType = flashEventCardType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeTriggeredAction)) return false;
        TimeTriggeredAction other = (TimeTriggeredAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            this.sceneID == other.getSceneID() &&
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
        _hashCode += new Long(getSceneID()).hashCode();
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
        new org.apache.axis.description.TypeDesc(TimeTriggeredAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("deviceID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DeviceID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sceneID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SceneID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("eventItemID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EventItemID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("triggerTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TriggerTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("selectedDayID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SelectedDayID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
