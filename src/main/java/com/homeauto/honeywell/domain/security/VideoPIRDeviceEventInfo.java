/**
 * VideoPIRDeviceEventInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIRDeviceEventInfo  implements java.io.Serializable {
    private String deviceName;

    private VideoPIREvent[] eventInfo;

    private int remainingImageCount;

    public VideoPIRDeviceEventInfo() {
    }

    public VideoPIRDeviceEventInfo(
           String deviceName,
           VideoPIREvent[] eventInfo,
           int remainingImageCount) {
           this.deviceName = deviceName;
           this.eventInfo = eventInfo;
           this.remainingImageCount = remainingImageCount;
    }


    /**
     * Gets the deviceName value for this VideoPIRDeviceEventInfo.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this VideoPIRDeviceEventInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the eventInfo value for this VideoPIRDeviceEventInfo.
     * 
     * @return eventInfo
     */
    public VideoPIREvent[] getEventInfo() {
        return eventInfo;
    }


    /**
     * Sets the eventInfo value for this VideoPIRDeviceEventInfo.
     * 
     * @param eventInfo
     */
    public void setEventInfo(VideoPIREvent[] eventInfo) {
        this.eventInfo = eventInfo;
    }


    /**
     * Gets the remainingImageCount value for this VideoPIRDeviceEventInfo.
     * 
     * @return remainingImageCount
     */
    public int getRemainingImageCount() {
        return remainingImageCount;
    }


    /**
     * Sets the remainingImageCount value for this VideoPIRDeviceEventInfo.
     * 
     * @param remainingImageCount
     */
    public void setRemainingImageCount(int remainingImageCount) {
        this.remainingImageCount = remainingImageCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIRDeviceEventInfo)) return false;
        VideoPIRDeviceEventInfo other = (VideoPIRDeviceEventInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.eventInfo==null && other.getEventInfo()==null) || 
             (this.eventInfo!=null &&
              java.util.Arrays.equals(this.eventInfo, other.getEventInfo()))) &&
            this.remainingImageCount == other.getRemainingImageCount();
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
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getEventInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRemainingImageCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPIRDeviceEventInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRDeviceEventInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingImageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemainingImageCount"));
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
