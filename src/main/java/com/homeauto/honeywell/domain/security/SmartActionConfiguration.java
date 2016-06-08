/**
 * SmartActionConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartActionConfiguration  implements java.io.Serializable {
    private int maximumSmartActions;

    private int maximumNameLength;

    private int maximumDevicesPerSmartAction;

    private int currentSmartActionCount;

    private boolean unicodeNameSupport;

    public SmartActionConfiguration() {
    }

    public SmartActionConfiguration(
           int maximumSmartActions,
           int maximumNameLength,
           int maximumDevicesPerSmartAction,
           int currentSmartActionCount,
           boolean unicodeNameSupport) {
           this.maximumSmartActions = maximumSmartActions;
           this.maximumNameLength = maximumNameLength;
           this.maximumDevicesPerSmartAction = maximumDevicesPerSmartAction;
           this.currentSmartActionCount = currentSmartActionCount;
           this.unicodeNameSupport = unicodeNameSupport;
    }


    /**
     * Gets the maximumSmartActions value for this SmartActionConfiguration.
     * 
     * @return maximumSmartActions
     */
    public int getMaximumSmartActions() {
        return maximumSmartActions;
    }


    /**
     * Sets the maximumSmartActions value for this SmartActionConfiguration.
     * 
     * @param maximumSmartActions
     */
    public void setMaximumSmartActions(int maximumSmartActions) {
        this.maximumSmartActions = maximumSmartActions;
    }


    /**
     * Gets the maximumNameLength value for this SmartActionConfiguration.
     * 
     * @return maximumNameLength
     */
    public int getMaximumNameLength() {
        return maximumNameLength;
    }


    /**
     * Sets the maximumNameLength value for this SmartActionConfiguration.
     * 
     * @param maximumNameLength
     */
    public void setMaximumNameLength(int maximumNameLength) {
        this.maximumNameLength = maximumNameLength;
    }


    /**
     * Gets the maximumDevicesPerSmartAction value for this SmartActionConfiguration.
     * 
     * @return maximumDevicesPerSmartAction
     */
    public int getMaximumDevicesPerSmartAction() {
        return maximumDevicesPerSmartAction;
    }


    /**
     * Sets the maximumDevicesPerSmartAction value for this SmartActionConfiguration.
     * 
     * @param maximumDevicesPerSmartAction
     */
    public void setMaximumDevicesPerSmartAction(int maximumDevicesPerSmartAction) {
        this.maximumDevicesPerSmartAction = maximumDevicesPerSmartAction;
    }


    /**
     * Gets the currentSmartActionCount value for this SmartActionConfiguration.
     * 
     * @return currentSmartActionCount
     */
    public int getCurrentSmartActionCount() {
        return currentSmartActionCount;
    }


    /**
     * Sets the currentSmartActionCount value for this SmartActionConfiguration.
     * 
     * @param currentSmartActionCount
     */
    public void setCurrentSmartActionCount(int currentSmartActionCount) {
        this.currentSmartActionCount = currentSmartActionCount;
    }


    /**
     * Gets the unicodeNameSupport value for this SmartActionConfiguration.
     * 
     * @return unicodeNameSupport
     */
    public boolean isUnicodeNameSupport() {
        return unicodeNameSupport;
    }


    /**
     * Sets the unicodeNameSupport value for this SmartActionConfiguration.
     * 
     * @param unicodeNameSupport
     */
    public void setUnicodeNameSupport(boolean unicodeNameSupport) {
        this.unicodeNameSupport = unicodeNameSupport;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartActionConfiguration)) return false;
        SmartActionConfiguration other = (SmartActionConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maximumSmartActions == other.getMaximumSmartActions() &&
            this.maximumNameLength == other.getMaximumNameLength() &&
            this.maximumDevicesPerSmartAction == other.getMaximumDevicesPerSmartAction() &&
            this.currentSmartActionCount == other.getCurrentSmartActionCount() &&
            this.unicodeNameSupport == other.isUnicodeNameSupport();
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
        _hashCode += getMaximumSmartActions();
        _hashCode += getMaximumNameLength();
        _hashCode += getMaximumDevicesPerSmartAction();
        _hashCode += getCurrentSmartActionCount();
        _hashCode += (isUnicodeNameSupport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartActionConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSmartActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaximumSmartActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumNameLength");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaximumNameLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumDevicesPerSmartAction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaximumDevicesPerSmartAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSmartActionCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentSmartActionCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unicodeNameSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UnicodeNameSupport"));
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
