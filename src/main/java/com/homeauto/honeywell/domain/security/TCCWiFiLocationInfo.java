/**
 * TCCWiFiLocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TCCWiFiLocationInfo  implements java.io.Serializable {
    private int TCCLocationID;

    private String locationName;

    private TCCWiFiDeviceInfo[] devices;

    public TCCWiFiLocationInfo() {
    }

    public TCCWiFiLocationInfo(
           int TCCLocationID,
           String locationName,
           TCCWiFiDeviceInfo[] devices) {
           this.TCCLocationID = TCCLocationID;
           this.locationName = locationName;
           this.devices = devices;
    }


    /**
     * Gets the TCCLocationID value for this TCCWiFiLocationInfo.
     * 
     * @return TCCLocationID
     */
    public int getTCCLocationID() {
        return TCCLocationID;
    }


    /**
     * Sets the TCCLocationID value for this TCCWiFiLocationInfo.
     * 
     * @param TCCLocationID
     */
    public void setTCCLocationID(int TCCLocationID) {
        this.TCCLocationID = TCCLocationID;
    }


    /**
     * Gets the locationName value for this TCCWiFiLocationInfo.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this TCCWiFiLocationInfo.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the devices value for this TCCWiFiLocationInfo.
     * 
     * @return devices
     */
    public TCCWiFiDeviceInfo[] getDevices() {
        return devices;
    }


    /**
     * Sets the devices value for this TCCWiFiLocationInfo.
     * 
     * @param devices
     */
    public void setDevices(TCCWiFiDeviceInfo[] devices) {
        this.devices = devices;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TCCWiFiLocationInfo)) return false;
        TCCWiFiLocationInfo other = (TCCWiFiLocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.TCCLocationID == other.getTCCLocationID() &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.devices==null && other.getDevices()==null) || 
             (this.devices!=null &&
              java.util.Arrays.equals(this.devices, other.getDevices())));
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
        _hashCode += getTCCLocationID();
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDevices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDevices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCCWiFiLocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiLocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCCLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devices");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Devices"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo"));
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
