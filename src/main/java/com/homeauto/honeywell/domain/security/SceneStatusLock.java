/**
 * SceneStatusLock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneStatusLock  implements java.io.Serializable {
    private LockInfo sceneLockInfo;

    private SceneLock sceneLock;

    public SceneStatusLock() {
    }

    public SceneStatusLock(
           LockInfo sceneLockInfo,
           SceneLock sceneLock) {
           this.sceneLockInfo = sceneLockInfo;
           this.sceneLock = sceneLock;
    }


    /**
     * Gets the sceneLockInfo value for this SceneStatusLock.
     * 
     * @return sceneLockInfo
     */
    public LockInfo getSceneLockInfo() {
        return sceneLockInfo;
    }


    /**
     * Sets the sceneLockInfo value for this SceneStatusLock.
     * 
     * @param sceneLockInfo
     */
    public void setSceneLockInfo(LockInfo sceneLockInfo) {
        this.sceneLockInfo = sceneLockInfo;
    }


    /**
     * Gets the sceneLock value for this SceneStatusLock.
     * 
     * @return sceneLock
     */
    public SceneLock getSceneLock() {
        return sceneLock;
    }


    /**
     * Sets the sceneLock value for this SceneStatusLock.
     * 
     * @param sceneLock
     */
    public void setSceneLock(SceneLock sceneLock) {
        this.sceneLock = sceneLock;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneStatusLock)) return false;
        SceneStatusLock other = (SceneStatusLock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sceneLockInfo==null && other.getSceneLockInfo()==null) || 
             (this.sceneLockInfo!=null &&
              this.sceneLockInfo.equals(other.getSceneLockInfo()))) &&
            ((this.sceneLock==null && other.getSceneLock()==null) || 
             (this.sceneLock!=null &&
              this.sceneLock.equals(other.getSceneLock())));
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
        if (getSceneLockInfo() != null) {
            _hashCode += getSceneLockInfo().hashCode();
        }
        if (getSceneLock() != null) {
            _hashCode += getSceneLock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneStatusLock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusLock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneLockInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneLock");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock"));
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
