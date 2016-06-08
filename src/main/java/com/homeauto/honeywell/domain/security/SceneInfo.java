/**
 * SceneInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneInfo  implements java.io.Serializable {
    private String sceneName;

    private boolean isSceneEnabled;

    private int sceneIconID;

    private long sceneID;

    private boolean inUse;

    public SceneInfo() {
    }

    public SceneInfo(
           String sceneName,
           boolean isSceneEnabled,
           int sceneIconID,
           long sceneID,
           boolean inUse) {
           this.sceneName = sceneName;
           this.isSceneEnabled = isSceneEnabled;
           this.sceneIconID = sceneIconID;
           this.sceneID = sceneID;
           this.inUse = inUse;
    }


    /**
     * Gets the sceneName value for this SceneInfo.
     * 
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }


    /**
     * Sets the sceneName value for this SceneInfo.
     * 
     * @param sceneName
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }


    /**
     * Gets the isSceneEnabled value for this SceneInfo.
     * 
     * @return isSceneEnabled
     */
    public boolean isIsSceneEnabled() {
        return isSceneEnabled;
    }


    /**
     * Sets the isSceneEnabled value for this SceneInfo.
     * 
     * @param isSceneEnabled
     */
    public void setIsSceneEnabled(boolean isSceneEnabled) {
        this.isSceneEnabled = isSceneEnabled;
    }


    /**
     * Gets the sceneIconID value for this SceneInfo.
     * 
     * @return sceneIconID
     */
    public int getSceneIconID() {
        return sceneIconID;
    }


    /**
     * Sets the sceneIconID value for this SceneInfo.
     * 
     * @param sceneIconID
     */
    public void setSceneIconID(int sceneIconID) {
        this.sceneIconID = sceneIconID;
    }


    /**
     * Gets the sceneID value for this SceneInfo.
     * 
     * @return sceneID
     */
    public long getSceneID() {
        return sceneID;
    }


    /**
     * Sets the sceneID value for this SceneInfo.
     * 
     * @param sceneID
     */
    public void setSceneID(long sceneID) {
        this.sceneID = sceneID;
    }


    /**
     * Gets the inUse value for this SceneInfo.
     * 
     * @return inUse
     */
    public boolean isInUse() {
        return inUse;
    }


    /**
     * Sets the inUse value for this SceneInfo.
     * 
     * @param inUse
     */
    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneInfo)) return false;
        SceneInfo other = (SceneInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sceneName==null && other.getSceneName()==null) || 
             (this.sceneName!=null &&
              this.sceneName.equals(other.getSceneName()))) &&
            this.isSceneEnabled == other.isIsSceneEnabled() &&
            this.sceneIconID == other.getSceneIconID() &&
            this.sceneID == other.getSceneID() &&
            this.inUse == other.isInUse();
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
        if (getSceneName() != null) {
            _hashCode += getSceneName().hashCode();
        }
        _hashCode += (isIsSceneEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSceneIconID();
        _hashCode += new Long(getSceneID()).hashCode();
        _hashCode += (isInUse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSceneEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsSceneEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneIconID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneIconID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inUse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InUse"));
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
