/**
 * GetScenesListResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetScenesListResults  extends WebMethodResults implements java.io.Serializable {
    private SmartScene[] smartScenes;

    private int currentSmartSceneCount;

    public GetScenesListResults() {
    }

    public GetScenesListResults(
           int resultCode,
           String resultData,
           SmartScene[] smartScenes,
           int currentSmartSceneCount) {
        super(
            resultCode,
            resultData);
        this.smartScenes = smartScenes;
        this.currentSmartSceneCount = currentSmartSceneCount;
    }


    /**
     * Gets the smartScenes value for this GetScenesListResults.
     * 
     * @return smartScenes
     */
    public SmartScene[] getSmartScenes() {
        return smartScenes;
    }


    /**
     * Sets the smartScenes value for this GetScenesListResults.
     * 
     * @param smartScenes
     */
    public void setSmartScenes(SmartScene[] smartScenes) {
        this.smartScenes = smartScenes;
    }


    /**
     * Gets the currentSmartSceneCount value for this GetScenesListResults.
     * 
     * @return currentSmartSceneCount
     */
    public int getCurrentSmartSceneCount() {
        return currentSmartSceneCount;
    }


    /**
     * Sets the currentSmartSceneCount value for this GetScenesListResults.
     * 
     * @param currentSmartSceneCount
     */
    public void setCurrentSmartSceneCount(int currentSmartSceneCount) {
        this.currentSmartSceneCount = currentSmartSceneCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetScenesListResults)) return false;
        GetScenesListResults other = (GetScenesListResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smartScenes==null && other.getSmartScenes()==null) || 
             (this.smartScenes!=null &&
              java.util.Arrays.equals(this.smartScenes, other.getSmartScenes()))) &&
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
        int _hashCode = super.hashCode();
        if (getSmartScenes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartScenes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSmartScenes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCurrentSmartSceneCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetScenesListResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetScenesListResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartScenes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScenes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene"));
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
