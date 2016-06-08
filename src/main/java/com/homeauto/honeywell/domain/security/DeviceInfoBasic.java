/**
 * DeviceInfoBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DeviceInfoBasic  implements java.io.Serializable {
    private long deviceID;

    private String deviceName;

    private int deviceClassID;

    private String deviceSerialNumber;

    private String deviceFlags;

    public DeviceInfoBasic() {
    }

    public DeviceInfoBasic(
           long deviceID,
           String deviceName,
           int deviceClassID,
           String deviceSerialNumber,
           String deviceFlags) {
           this.deviceID = deviceID;
           this.deviceName = deviceName;
           this.deviceClassID = deviceClassID;
           this.deviceSerialNumber = deviceSerialNumber;
           this.deviceFlags = deviceFlags;
    }


    /**
     * Gets the deviceID value for this DeviceInfoBasic.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this DeviceInfoBasic.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceName value for this DeviceInfoBasic.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this DeviceInfoBasic.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the deviceClassID value for this DeviceInfoBasic.
     * 
     * @return deviceClassID
     */
    public int getDeviceClassID() {
        return deviceClassID;
    }


    /**
     * Sets the deviceClassID value for this DeviceInfoBasic.
     * 
     * @param deviceClassID
     */
    public void setDeviceClassID(int deviceClassID) {
        this.deviceClassID = deviceClassID;
    }


    /**
     * Gets the deviceSerialNumber value for this DeviceInfoBasic.
     * 
     * @return deviceSerialNumber
     */
    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this DeviceInfoBasic.
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the deviceFlags value for this DeviceInfoBasic.
     * 
     * @return deviceFlags
     */
    public String getDeviceFlags() {
        return deviceFlags;
    }


    /**
     * Sets the deviceFlags value for this DeviceInfoBasic.
     * 
     * @param deviceFlags
     */
    public void setDeviceFlags(String deviceFlags) {
        this.deviceFlags = deviceFlags;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DeviceInfoBasic)) return false;
        DeviceInfoBasic other = (DeviceInfoBasic) obj;
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
            ((this.deviceFlags==null && other.getDeviceFlags()==null) || 
             (this.deviceFlags!=null &&
              this.deviceFlags.equals(other.getDeviceFlags())));
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
        if (getDeviceFlags() != null) {
            _hashCode += getDeviceFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceInfoBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic"));
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
        elemField.setFieldName("deviceFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceFlags"));
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
