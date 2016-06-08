/**
 * SentToPanelEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SentToPanelEvents  extends NotificationInfoBase  implements java.io.Serializable {
    private String customNotificationMessage;  // attribute

    private int notificationTypeID;  // attribute

    public SentToPanelEvents() {
    }

    public SentToPanelEvents(
           long eventTypeID,
           long eventItemID,
           long eventModifierID,
           long deviceID,
           boolean isEnabled,
           int flashEventCardType,
           String customNotificationMessage,
           int notificationTypeID) {
        super(
            eventTypeID,
            eventItemID,
            eventModifierID,
            deviceID,
            isEnabled,
            flashEventCardType);
        this.customNotificationMessage = customNotificationMessage;
        this.notificationTypeID = notificationTypeID;
    }


    /**
     * Gets the customNotificationMessage value for this SentToPanelEvents.
     * 
     * @return customNotificationMessage
     */
    public String getCustomNotificationMessage() {
        return customNotificationMessage;
    }


    /**
     * Sets the customNotificationMessage value for this SentToPanelEvents.
     * 
     * @param customNotificationMessage
     */
    public void setCustomNotificationMessage(String customNotificationMessage) {
        this.customNotificationMessage = customNotificationMessage;
    }


    /**
     * Gets the notificationTypeID value for this SentToPanelEvents.
     * 
     * @return notificationTypeID
     */
    public int getNotificationTypeID() {
        return notificationTypeID;
    }


    /**
     * Sets the notificationTypeID value for this SentToPanelEvents.
     * 
     * @param notificationTypeID
     */
    public void setNotificationTypeID(int notificationTypeID) {
        this.notificationTypeID = notificationTypeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SentToPanelEvents)) return false;
        SentToPanelEvents other = (SentToPanelEvents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customNotificationMessage==null && other.getCustomNotificationMessage()==null) || 
             (this.customNotificationMessage!=null &&
              this.customNotificationMessage.equals(other.getCustomNotificationMessage()))) &&
            this.notificationTypeID == other.getNotificationTypeID();
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
        if (getCustomNotificationMessage() != null) {
            _hashCode += getCustomNotificationMessage().hashCode();
        }
        _hashCode += getNotificationTypeID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SentToPanelEvents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("customNotificationMessage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CustomNotificationMessage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notificationTypeID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotificationTypeID"));
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
