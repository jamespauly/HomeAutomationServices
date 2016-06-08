/**
 * SmartSceneConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartSceneConfiguration  implements java.io.Serializable {
    private int maximumSmartScenes;

    private int maximumDevicesPerScene;

    private int currentSmartSceneCount;

    public SmartSceneConfiguration() {
    }

    public SmartSceneConfiguration(
           int maximumSmartScenes,
           int maximumDevicesPerScene,
           int currentSmartSceneCount) {
           this.maximumSmartScenes = maximumSmartScenes;
           this.maximumDevicesPerScene = maximumDevicesPerScene;
           this.currentSmartSceneCount = currentSmartSceneCount;
    }


    /**
     * Gets the maximumSmartScenes value for this SmartSceneConfiguration.
     * 
     * @return maximumSmartScenes
     */
    public int getMaximumSmartScenes() {
        return maximumSmartScenes;
    }


    /**
     * Sets the maximumSmartScenes value for this SmartSceneConfiguration.
     * 
     * @param maximumSmartScenes
     */
    public void setMaximumSmartScenes(int maximumSmartScenes) {
        this.maximumSmartScenes = maximumSmartScenes;
    }


    /**
     * Gets the maximumDevicesPerScene value for this SmartSceneConfiguration.
     * 
     * @return maximumDevicesPerScene
     */
    public int getMaximumDevicesPerScene() {
        return maximumDevicesPerScene;
    }


    /**
     * Sets the maximumDevicesPerScene value for this SmartSceneConfiguration.
     * 
     * @param maximumDevicesPerScene
     */
    public void setMaximumDevicesPerScene(int maximumDevicesPerScene) {
        this.maximumDevicesPerScene = maximumDevicesPerScene;
    }


    /**
     * Gets the currentSmartSceneCount value for this SmartSceneConfiguration.
     * 
     * @return currentSmartSceneCount
     */
    public int getCurrentSmartSceneCount() {
        return currentSmartSceneCount;
    }


    /**
     * Sets the currentSmartSceneCount value for this SmartSceneConfiguration.
     * 
     * @param currentSmartSceneCount
     */
    public void setCurrentSmartSceneCount(int currentSmartSceneCount) {
        this.currentSmartSceneCount = currentSmartSceneCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartSceneConfiguration)) return false;
        SmartSceneConfiguration other = (SmartSceneConfiguration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maximumSmartScenes == other.getMaximumSmartScenes() &&
            this.maximumDevicesPerScene == other.getMaximumDevicesPerScene() &&
            this.currentSmartSceneCount == other.getCurrentSmartSceneCount();
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
        _hashCode += getMaximumSmartScenes();
        _hashCode += getMaximumDevicesPerScene();
        _hashCode += getCurrentSmartSceneCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartSceneConfiguration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneConfiguration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSmartScenes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaximumSmartScenes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumDevicesPerScene");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaximumDevicesPerScene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSmartSceneCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentSmartSceneCount"));
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
