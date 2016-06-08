/**
 * WiFiLockConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiLockConfigInfo  implements java.io.Serializable {
    private long lockID;

    private int lockConfigState;

    public WiFiLockConfigInfo() {
    }

    public WiFiLockConfigInfo(
           long lockID,
           int lockConfigState) {
           this.lockID = lockID;
           this.lockConfigState = lockConfigState;
    }


    /**
     * Gets the lockID value for this WiFiLockConfigInfo.
     * 
     * @return lockID
     */
    public long getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this WiFiLockConfigInfo.
     * 
     * @param lockID
     */
    public void setLockID(long lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the lockConfigState value for this WiFiLockConfigInfo.
     * 
     * @return lockConfigState
     */
    public int getLockConfigState() {
        return lockConfigState;
    }


    /**
     * Sets the lockConfigState value for this WiFiLockConfigInfo.
     * 
     * @param lockConfigState
     */
    public void setLockConfigState(int lockConfigState) {
        this.lockConfigState = lockConfigState;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiLockConfigInfo)) return false;
        WiFiLockConfigInfo other = (WiFiLockConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lockID == other.getLockID() &&
            this.lockConfigState == other.getLockConfigState();
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
        _hashCode += getLockConfigState();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiLockConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockConfigState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockConfigState"));
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
