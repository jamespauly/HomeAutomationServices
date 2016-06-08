/**
 * LockInfo_Transitional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class LockInfo_Transitional  implements java.io.Serializable {
    private long deviceID;

    private long lockID;

    private String lockName;

    private short lockIndex;

    private short lockState;

    private short batteryState;

    private org.apache.axis.types.UnsignedByte deviceStatusID;

    private long deviceTypeID;

    public LockInfo_Transitional() {
    }

    public LockInfo_Transitional(
           long deviceID,
           long lockID,
           String lockName,
           short lockIndex,
           short lockState,
           short batteryState,
           org.apache.axis.types.UnsignedByte deviceStatusID,
           long deviceTypeID) {
           this.deviceID = deviceID;
           this.lockID = lockID;
           this.lockName = lockName;
           this.lockIndex = lockIndex;
           this.lockState = lockState;
           this.batteryState = batteryState;
           this.deviceStatusID = deviceStatusID;
           this.deviceTypeID = deviceTypeID;
    }


    /**
     * Gets the deviceID value for this LockInfo_Transitional.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this LockInfo_Transitional.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the lockID value for this LockInfo_Transitional.
     * 
     * @return lockID
     */
    public long getLockID() {
        return lockID;
    }


    /**
     * Sets the lockID value for this LockInfo_Transitional.
     * 
     * @param lockID
     */
    public void setLockID(long lockID) {
        this.lockID = lockID;
    }


    /**
     * Gets the lockName value for this LockInfo_Transitional.
     * 
     * @return lockName
     */
    public String getLockName() {
        return lockName;
    }


    /**
     * Sets the lockName value for this LockInfo_Transitional.
     * 
     * @param lockName
     */
    public void setLockName(String lockName) {
        this.lockName = lockName;
    }


    /**
     * Gets the lockIndex value for this LockInfo_Transitional.
     * 
     * @return lockIndex
     */
    public short getLockIndex() {
        return lockIndex;
    }


    /**
     * Sets the lockIndex value for this LockInfo_Transitional.
     * 
     * @param lockIndex
     */
    public void setLockIndex(short lockIndex) {
        this.lockIndex = lockIndex;
    }


    /**
     * Gets the lockState value for this LockInfo_Transitional.
     * 
     * @return lockState
     */
    public short getLockState() {
        return lockState;
    }


    /**
     * Sets the lockState value for this LockInfo_Transitional.
     * 
     * @param lockState
     */
    public void setLockState(short lockState) {
        this.lockState = lockState;
    }


    /**
     * Gets the batteryState value for this LockInfo_Transitional.
     * 
     * @return batteryState
     */
    public short getBatteryState() {
        return batteryState;
    }


    /**
     * Sets the batteryState value for this LockInfo_Transitional.
     * 
     * @param batteryState
     */
    public void setBatteryState(short batteryState) {
        this.batteryState = batteryState;
    }


    /**
     * Gets the deviceStatusID value for this LockInfo_Transitional.
     * 
     * @return deviceStatusID
     */
    public org.apache.axis.types.UnsignedByte getDeviceStatusID() {
        return deviceStatusID;
    }


    /**
     * Sets the deviceStatusID value for this LockInfo_Transitional.
     * 
     * @param deviceStatusID
     */
    public void setDeviceStatusID(org.apache.axis.types.UnsignedByte deviceStatusID) {
        this.deviceStatusID = deviceStatusID;
    }


    /**
     * Gets the deviceTypeID value for this LockInfo_Transitional.
     * 
     * @return deviceTypeID
     */
    public long getDeviceTypeID() {
        return deviceTypeID;
    }


    /**
     * Sets the deviceTypeID value for this LockInfo_Transitional.
     * 
     * @param deviceTypeID
     */
    public void setDeviceTypeID(long deviceTypeID) {
        this.deviceTypeID = deviceTypeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LockInfo_Transitional)) return false;
        LockInfo_Transitional other = (LockInfo_Transitional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            this.lockID == other.getLockID() &&
            ((this.lockName==null && other.getLockName()==null) || 
             (this.lockName!=null &&
              this.lockName.equals(other.getLockName()))) &&
            this.lockIndex == other.getLockIndex() &&
            this.lockState == other.getLockState() &&
            this.batteryState == other.getBatteryState() &&
            ((this.deviceStatusID==null && other.getDeviceStatusID()==null) || 
             (this.deviceStatusID!=null &&
              this.deviceStatusID.equals(other.getDeviceStatusID()))) &&
            this.deviceTypeID == other.getDeviceTypeID();
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
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += new Long(getLockID()).hashCode();
        if (getLockName() != null) {
            _hashCode += getLockName().hashCode();
        }
        _hashCode += getLockIndex();
        _hashCode += getLockState();
        _hashCode += getBatteryState();
        if (getDeviceStatusID() != null) {
            _hashCode += getDeviceStatusID().hashCode();
        }
        _hashCode += new Long(getDeviceTypeID()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LockInfo_Transitional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
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
        elemField.setFieldName("lockName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BatteryState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
