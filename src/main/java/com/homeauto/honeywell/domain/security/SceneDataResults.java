/**
 * SceneDataResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneDataResults  extends WebMethodResults implements java.io.Serializable {
    private SceneAutomationInfo sceneAutomationData;

    public SceneDataResults() {
    }

    public SceneDataResults(
           int resultCode,
           String resultData,
           SceneAutomationInfo sceneAutomationData) {
        super(
            resultCode,
            resultData);
        this.sceneAutomationData = sceneAutomationData;
    }


    /**
     * Gets the sceneAutomationData value for this SceneDataResults.
     * 
     * @return sceneAutomationData
     */
    public SceneAutomationInfo getSceneAutomationData() {
        return sceneAutomationData;
    }


    /**
     * Sets the sceneAutomationData value for this SceneDataResults.
     * 
     * @param sceneAutomationData
     */
    public void setSceneAutomationData(SceneAutomationInfo sceneAutomationData) {
        this.sceneAutomationData = sceneAutomationData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneDataResults)) return false;
        SceneDataResults other = (SceneDataResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sceneAutomationData==null && other.getSceneAutomationData()==null) || 
             (this.sceneAutomationData!=null &&
              this.sceneAutomationData.equals(other.getSceneAutomationData())));
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
        if (getSceneAutomationData() != null) {
            _hashCode += getSceneAutomationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneDataResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneDataResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneAutomationData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneAutomationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneAutomationInfo"));
        elemField.setMinOccurs(0);
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
