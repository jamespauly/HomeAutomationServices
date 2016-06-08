/**
 * LockSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class LockSubAction  implements java.io.Serializable {
    private long subActionID;

    private long lockID;

    private int state;

    private int authorizationCode;

    public LockSubAction() {
    }

    public LockSubAction(
           long subActionID,
           long lockID,
           int state,
           int authorizationCode) {
           this.subActionID = subActionID;
           this.lockID = lockID;
           this.state = state;
           this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the subActionID value for this LockSubAction.
     * 
     * @return subActionID
     */
    public long getSubActionID() {
        return subActionID;
    }


    /**
     * Sets the subActionID value for this LockSubAction.
     * 
     * @param subActionID
     */
    public void setSubActionID(long subActionID) {
        this.subActionID = subActionID;
    }


    /**
     * Gets the lockID value for this LockSubAction.
     * 
     * @return lockID
     */
    public long getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this LockSubAction.
     * 
     * @param lockID
     */
    public void setLockID(long lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the state value for this LockSubAction.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this LockSubAction.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the authorizationCode value for this LockSubAction.
     * 
     * @return authorizationCode
     */
    public int getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this LockSubAction.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(int authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LockSubAction)) return false;
        LockSubAction other = (LockSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subActionID == other.getSubActionID() &&
            this.lockID == other.getLockID() &&
            this.state == other.getState() &&
            this.authorizationCode == other.getAuthorizationCode();
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
        _hashCode += new Long(getSubActionID()).hashCode();
        _hashCode += new Long(getLockID()).hashCode();
        _hashCode += getState();
        _hashCode += getAuthorizationCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subActionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SubActionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthorizationCode"));
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
