/**
 * VideoTrigger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoTrigger  extends NotificationInfoBase  implements java.io.Serializable {
    private long scheduleID;  // attribute

    private int securityPanelStateCondition;  // attribute

    private long cameraID;  // attribute

    public VideoTrigger() {
    }

    public VideoTrigger(
           long eventTypeID,
           long eventItemID,
           long eventModifierID,
           long deviceID,
           boolean isEnabled,
           int flashEventCardType,
           long scheduleID,
           int securityPanelStateCondition,
           long cameraID) {
        super(
            eventTypeID,
            eventItemID,
            eventModifierID,
            deviceID,
            isEnabled,
            flashEventCardType);
        this.scheduleID = scheduleID;
        this.securityPanelStateCondition = securityPanelStateCondition;
        this.cameraID = cameraID;
    }


    /**
     * Gets the scheduleID value for this VideoTrigger.
     * 
     * @return scheduleID
     */
    public long getScheduleID() {
        return scheduleID;
    }


    /**
     * Sets the scheduleID value for this VideoTrigger.
     * 
     * @param scheduleID
     */
    public void setScheduleID(long scheduleID) {
        this.scheduleID = scheduleID;
    }


    /**
     * Gets the securityPanelStateCondition value for this VideoTrigger.
     * 
     * @return securityPanelStateCondition
     */
    public int getSecurityPanelStateCondition() {
        return securityPanelStateCondition;
    }


    /**
     * Sets the securityPanelStateCondition value for this VideoTrigger.
     * 
     * @param securityPanelStateCondition
     */
    public void setSecurityPanelStateCondition(int securityPanelStateCondition) {
        this.securityPanelStateCondition = securityPanelStateCondition;
    }


    /**
     * Gets the cameraID value for this VideoTrigger.
     * 
     * @return cameraID
     */
    public long getCameraID() {
        return cameraID;
    }


    /**
     * Sets the cameraID value for this VideoTrigger.
     * 
     * @param cameraID
     */
    public void setCameraID(long cameraID) {
        this.cameraID = cameraID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoTrigger)) return false;
        VideoTrigger other = (VideoTrigger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.scheduleID == other.getScheduleID() &&
            this.securityPanelStateCondition == other.getSecurityPanelStateCondition() &&
            this.cameraID == other.getCameraID();
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
        _hashCode += new Long(getScheduleID()).hashCode();
        _hashCode += getSecurityPanelStateCondition();
        _hashCode += new Long(getCameraID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoTrigger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("scheduleID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ScheduleID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("securityPanelStateCondition");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SecurityPanelStateCondition"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cameraID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CameraID"));
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
