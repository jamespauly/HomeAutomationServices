/**
 * SceneLock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneLock  implements java.io.Serializable {
    private long lockID;

    private boolean sceneLockState;

    private String sceneAuthorizationCode;

    public SceneLock() {
    }

    public SceneLock(
           long lockID,
           boolean sceneLockState,
           String sceneAuthorizationCode) {
           this.lockID = lockID;
           this.sceneLockState = sceneLockState;
           this.sceneAuthorizationCode = sceneAuthorizationCode;
    }


    /**
     * Gets the lockID value for this SceneLock.
     * 
     * @return lockID
     */
    public long getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this SceneLock.
     * 
     * @param lockID
     */
    public void setLockID(long lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the sceneLockState value for this SceneLock.
     * 
     * @return sceneLockState
     */
    public boolean isSceneLockState() {
        return sceneLockState;
    }


    /**
     * Sets the sceneLockState value for this SceneLock.
     * 
     * @param sceneLockState
     */
    public void setSceneLockState(boolean sceneLockState) {
        this.sceneLockState = sceneLockState;
    }


    /**
     * Gets the sceneAuthorizationCode value for this SceneLock.
     * 
     * @return sceneAuthorizationCode
     */
    public String getSceneAuthorizationCode() {
        return sceneAuthorizationCode;
    }


    /**
     * Sets the sceneAuthorizationCode value for this SceneLock.
     * 
     * @param sceneAuthorizationCode
     */
    public void setSceneAuthorizationCode(String sceneAuthorizationCode) {
        this.sceneAuthorizationCode = sceneAuthorizationCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneLock)) return false;
        SceneLock other = (SceneLock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lockID == other.getLockID() &&
            this.sceneLockState == other.isSceneLockState() &&
            ((this.sceneAuthorizationCode==null && other.getSceneAuthorizationCode()==null) || 
             (this.sceneAuthorizationCode!=null &&
              this.sceneAuthorizationCode.equals(other.getSceneAuthorizationCode())));
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
        _hashCode += new Long(getLockID()).hashCode();
        _hashCode += (isSceneLockState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSceneAuthorizationCode() != null) {
            _hashCode += getSceneAuthorizationCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SceneLock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneLockState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneAuthorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneAuthorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
