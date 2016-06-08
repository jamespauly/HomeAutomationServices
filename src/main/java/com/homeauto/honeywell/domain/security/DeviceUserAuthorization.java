/**
 * DeviceUserAuthorization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DeviceUserAuthorization  implements java.io.Serializable {
    private long deviceID;

    private String deviceName;

    private int deviceClassID;

    private String deviceSerialNumber;

    private boolean isAccessGranted;

    private String sync;

    private DeviceAttribute[] deviceAuthorizationAttributes;

    private long prerequisiteDeviceID;

    private int prerequisiteDeviceClassID;

    private int deviceTypeID;

    public DeviceUserAuthorization() {
    }

    public DeviceUserAuthorization(
           long deviceID,
           String deviceName,
           int deviceClassID,
           String deviceSerialNumber,
           boolean isAccessGranted,
           String sync,
           DeviceAttribute[] deviceAuthorizationAttributes,
           long prerequisiteDeviceID,
           int prerequisiteDeviceClassID,
           int deviceTypeID) {
           this.deviceID = deviceID;
           this.deviceName = deviceName;
           this.deviceClassID = deviceClassID;
           this.deviceSerialNumber = deviceSerialNumber;
           this.isAccessGranted = isAccessGranted;
           this.sync = sync;
           this.deviceAuthorizationAttributes = deviceAuthorizationAttributes;
           this.prerequisiteDeviceID = prerequisiteDeviceID;
           this.prerequisiteDeviceClassID = prerequisiteDeviceClassID;
           this.deviceTypeID = deviceTypeID;
    }


    /**
     * Gets the deviceID value for this DeviceUserAuthorization.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this DeviceUserAuthorization.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceName value for this DeviceUserAuthorization.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceUserAuthorization.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceClassID value for this DeviceUserAuthorization.
     * 
     * @return deviceClassID
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }


    /**
     * Sets the deviceClassID value for this DeviceUserAuthorization.
     * 
     * @param deviceClassID
     */
    public void setDeviceClassID(int deviceClassID) {
        this.deviceClassID = deviceClassID;
    }


    /**
     * Gets the deviceSerialNumber value for this DeviceUserAuthorization.
     * 
     * @return deviceSerialNumber
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this DeviceUserAuthorization.
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the isAccessGranted value for this DeviceUserAuthorization.
     * 
     * @return isAccessGranted
     */
    public boolean isIsAccessGranted() {
        return isAccessGranted;
    }


    /**
     * Sets the isAccessGranted value for this DeviceUserAuthorization.
     * 
     * @param isAccessGranted
     */
    public void setIsAccessGranted(boolean isAccessGranted) {
        this.isAccessGranted = isAccessGranted;
    }


    /**
     * Gets the sync value for this DeviceUserAuthorization.
     * 
     * @return sync
     */
    public String getSync() {
        return sync;
    }


    /**
     * Sets the sync value for this DeviceUserAuthorization.
     * 
     * @param sync
     */
    public void setSync(String sync) {
        this.sync = sync;
    }


    /**
     * Gets the deviceAuthorizationAttributes value for this DeviceUserAuthorization.
     * 
     * @return deviceAuthorizationAttributes
     */
    public DeviceAttribute[] getDeviceAuthorizationAttributes() {
        return deviceAuthorizationAttributes;
    }


    /**
     * Sets the deviceAuthorizationAttributes value for this DeviceUserAuthorization.
     * 
     * @param deviceAuthorizationAttributes
     */
    public void setDeviceAuthorizationAttributes(DeviceAttribute[] deviceAuthorizationAttributes) {
        this.deviceAuthorizationAttributes = deviceAuthorizationAttributes;
    }


    /**
     * Gets the prerequisiteDeviceID value for this DeviceUserAuthorization.
     * 
     * @return prerequisiteDeviceID
     */
    public long getPrerequisiteDeviceID() {
        return prerequisiteDeviceID;
    }


    /**
     * Sets the prerequisiteDeviceID value for this DeviceUserAuthorization.
     * 
     * @param prerequisiteDeviceID
     */
    public void setPrerequisiteDeviceID(long prerequisiteDeviceID) {
        this.prerequisiteDeviceID = prerequisiteDeviceID;
    }


    /**
     * Gets the prerequisiteDeviceClassID value for this DeviceUserAuthorization.
     * 
     * @return prerequisiteDeviceClassID
     */
    public int getPrerequisiteDeviceClassID() {
        return prerequisiteDeviceClassID;
    }


    /**
     * Sets the prerequisiteDeviceClassID value for this DeviceUserAuthorization.
     * 
     * @param prerequisiteDeviceClassID
     */
    public void setPrerequisiteDeviceClassID(int prerequisiteDeviceClassID) {
        this.prerequisiteDeviceClassID = prerequisiteDeviceClassID;
    }


    /**
     * Gets the deviceTypeID value for this DeviceUserAuthorization.
     * 
     * @return deviceTypeID
     */
    public int getDeviceTypeID() {
        return deviceTypeID;
    }


    /**
     * Sets the deviceTypeID value for this DeviceUserAuthorization.
     * 
     * @param deviceTypeID
     */
    public void setDeviceTypeID(int deviceTypeID) {
        this.deviceTypeID = deviceTypeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeviceUserAuthorization)) return false;
        DeviceUserAuthorization other = (DeviceUserAuthorization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            this.deviceClassID == other.getDeviceClassID() &&
            ((this.deviceSerialNumber==null && other.getDeviceSerialNumber()==null) || 
             (this.deviceSerialNumber!=null &&
              this.deviceSerialNumber.equals(other.getDeviceSerialNumber()))) &&
            this.isAccessGranted == other.isIsAccessGranted() &&
            ((this.sync==null && other.getSync()==null) || 
             (this.sync!=null &&
              this.sync.equals(other.getSync()))) &&
            ((this.deviceAuthorizationAttributes==null && other.getDeviceAuthorizationAttributes()==null) || 
             (this.deviceAuthorizationAttributes!=null &&
              java.util.Arrays.equals(this.deviceAuthorizationAttributes, other.getDeviceAuthorizationAttributes()))) &&
            this.prerequisiteDeviceID == other.getPrerequisiteDeviceID() &&
            this.prerequisiteDeviceClassID == other.getPrerequisiteDeviceClassID() &&
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        _hashCode += getDeviceClassID();
        if (getDeviceSerialNumber() != null) {
            _hashCode += getDeviceSerialNumber().hashCode();
        }
        _hashCode += (isIsAccessGranted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSync() != null) {
            _hashCode += getSync().hashCode();
        }
        if (getDeviceAuthorizationAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceAuthorizationAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeviceAuthorizationAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getPrerequisiteDeviceID()).hashCode();
        _hashCode += getPrerequisiteDeviceClassID();
        _hashCode += getDeviceTypeID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceUserAuthorization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceUserAuthorization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAccessGranted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsAccessGranted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sync");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Sync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceAuthorizationAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAuthorizationAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAttribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prerequisiteDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PrerequisiteDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prerequisiteDeviceClassID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PrerequisiteDeviceClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceTypeID"));
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
