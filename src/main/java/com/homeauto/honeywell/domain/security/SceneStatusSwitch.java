/**
 * SceneStatusSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneStatusSwitch  implements java.io.Serializable {
    private SwitchInfo sceneSwitchInfo;

    private SceneSwitch sceneSwitch;

    public SceneStatusSwitch() {
    }

    public SceneStatusSwitch(
           SwitchInfo sceneSwitchInfo,
           SceneSwitch sceneSwitch) {
           this.sceneSwitchInfo = sceneSwitchInfo;
           this.sceneSwitch = sceneSwitch;
    }


    /**
     * Gets the sceneSwitchInfo value for this SceneStatusSwitch.
     * 
     * @return sceneSwitchInfo
     */
    public SwitchInfo getSceneSwitchInfo() {
        return sceneSwitchInfo;
    }


    /**
     * Sets the sceneSwitchInfo value for this SceneStatusSwitch.
     * 
     * @param sceneSwitchInfo
     */
    public void setSceneSwitchInfo(SwitchInfo sceneSwitchInfo) {
        this.sceneSwitchInfo = sceneSwitchInfo;
    }


    /**
     * Gets the sceneSwitch value for this SceneStatusSwitch.
     * 
     * @return sceneSwitch
     */
    public SceneSwitch getSceneSwitch() {
        return sceneSwitch;
    }


    /**
     * Sets the sceneSwitch value for this SceneStatusSwitch.
     * 
     * @param sceneSwitch
     */
    public void setSceneSwitch(SceneSwitch sceneSwitch) {
        this.sceneSwitch = sceneSwitch;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneStatusSwitch)) return false;
        SceneStatusSwitch other = (SceneStatusSwitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sceneSwitchInfo==null && other.getSceneSwitchInfo()==null) || 
             (this.sceneSwitchInfo!=null &&
              this.sceneSwitchInfo.equals(other.getSceneSwitchInfo()))) &&
            ((this.sceneSwitch==null && other.getSceneSwitch()==null) || 
             (this.sceneSwitch!=null &&
              this.sceneSwitch.equals(other.getSceneSwitch())));
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
        if (getSceneSwitchInfo() != null) {
            _hashCode += getSceneSwitchInfo().hashCode();
        }
        if (getSceneSwitch() != null) {
            _hashCode += getSceneSwitch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneStatusSwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusSwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneSwitchInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitch"));
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
