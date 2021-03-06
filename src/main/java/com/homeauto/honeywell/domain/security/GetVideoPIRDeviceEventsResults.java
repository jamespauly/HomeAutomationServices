/**
 * GetVideoPIRDeviceEventsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetVideoPIRDeviceEventsResults  extends WebMethodResults implements java.io.Serializable {
    private VideoPIRDeviceEventInfo deviceEventInfo;

    public GetVideoPIRDeviceEventsResults() {
    }

    public GetVideoPIRDeviceEventsResults(
           int resultCode,
           String resultData,
           VideoPIRDeviceEventInfo deviceEventInfo) {
        super(
            resultCode,
            resultData);
        this.deviceEventInfo = deviceEventInfo;
    }


    /**
     * Gets the deviceEventInfo value for this GetVideoPIRDeviceEventsResults.
     * 
     * @return deviceEventInfo
     */
    public VideoPIRDeviceEventInfo getDeviceEventInfo() {
        return deviceEventInfo;
    }


    /**
     * Sets the deviceEventInfo value for this GetVideoPIRDeviceEventsResults.
     * 
     * @param deviceEventInfo
     */
    public void setDeviceEventInfo(VideoPIRDeviceEventInfo deviceEventInfo) {
        this.deviceEventInfo = deviceEventInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetVideoPIRDeviceEventsResults)) return false;
        GetVideoPIRDeviceEventsResults other = (GetVideoPIRDeviceEventsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deviceEventInfo==null && other.getDeviceEventInfo()==null) || 
             (this.deviceEventInfo!=null &&
              this.deviceEventInfo.equals(other.getDeviceEventInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDeviceEventInfo() != null) {
            _hashCode += getDeviceEventInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVideoPIRDeviceEventsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRDeviceEventsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceEventInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceEventInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRDeviceEventInfo"));
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
