/**
 * WiFiLockInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiLockInfo  implements java.io.Serializable {
    private String lockID;

    private String lockName;

    private String lockStatus;

    private WiFiLockConfigInfo lockConfiguration;

    public WiFiLockInfo() {
    }

    public WiFiLockInfo(
           String lockID,
           String lockName,
           String lockStatus,
           WiFiLockConfigInfo lockConfiguration) {
           this.lockID = lockID;
           this.lockName = lockName;
           this.lockStatus = lockStatus;
           this.lockConfiguration = lockConfiguration;
    }


    /**
     * Gets the lockID value for this WiFiLockInfo.
     * 
     * @return lockID
     */
    public String getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this WiFiLockInfo.
     * 
     * @param lockID
     */
    public void setLockID(String lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the lockName value for this WiFiLockInfo.
     * 
     * @return lockName
     */
    public String getLockName() {
        return lockName;
    }


    /**
     * Sets the lockName value for this WiFiLockInfo.
     * 
     * @param lockName
     */
    public void setLockName(String lockName) {
        this.lockName = lockName;
    }


    /**
     * Gets the lockStatus value for this WiFiLockInfo.
     * 
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }


    /**
     * Sets the lockStatus value for this WiFiLockInfo.
     * 
     * @param lockStatus
     */
    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }


    /**
     * Gets the lockConfiguration value for this WiFiLockInfo.
     * 
     * @return lockConfiguration
     */
    public WiFiLockConfigInfo getLockConfiguration() {
        return lockConfiguration;
    }


    /**
     * Sets the lockConfiguration value for this WiFiLockInfo.
     * 
     * @param lockConfiguration
     */
    public void setLockConfiguration(WiFiLockConfigInfo lockConfiguration) {
        this.lockConfiguration = lockConfiguration;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiLockInfo)) return false;
        WiFiLockInfo other = (WiFiLockInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lockID==null && other.getLockID()==null) || 
             (this.lockID!=null &&
              this.lockID.equals(other.getLockID()))) &&
            ((this.lockName==null && other.getLockName()==null) || 
             (this.lockName!=null &&
              this.lockName.equals(other.getLockName()))) &&
            ((this.lockStatus==null && other.getLockStatus()==null) || 
             (this.lockStatus!=null &&
              this.lockStatus.equals(other.getLockStatus()))) &&
            ((this.lockConfiguration==null && other.getLockConfiguration()==null) || 
             (this.lockConfiguration!=null &&
              this.lockConfiguration.equals(other.getLockConfiguration())));
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
        if (getLockID() != null) {
            _hashCode += getLockID().hashCode();
        }
        if (getLockName() != null) {
            _hashCode += getLockName().hashCode();
        }
        if (getLockStatus() != null) {
            _hashCode += getLockStatus().hashCode();
        }
        if (getLockConfiguration() != null) {
            _hashCode += getLockConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiLockInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockConfigInfo"));
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
