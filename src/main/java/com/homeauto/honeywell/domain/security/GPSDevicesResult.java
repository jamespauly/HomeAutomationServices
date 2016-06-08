/**
 * GPSDevicesResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GPSDevicesResult  extends WebMethodResults implements java.io.Serializable {
    private GPSInfo[] GPSDevices;

    public GPSDevicesResult() {
    }

    public GPSDevicesResult(
           int resultCode,
           String resultData,
           GPSInfo[] GPSDevices) {
        super(
            resultCode,
            resultData);
        this.GPSDevices = GPSDevices;
    }


    /**
     * Gets the GPSDevices value for this GPSDevicesResult.
     * 
     * @return GPSDevices
     */
    public GPSInfo[] getGPSDevices() {
        return GPSDevices;
    }


    /**
     * Sets the GPSDevices value for this GPSDevicesResult.
     * 
     * @param GPSDevices
     */
    public void setGPSDevices(GPSInfo[] GPSDevices) {
        this.GPSDevices = GPSDevices;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GPSDevicesResult)) return false;
        GPSDevicesResult other = (GPSDevicesResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.GPSDevices==null && other.getGPSDevices()==null) || 
             (this.GPSDevices!=null &&
              java.util.Arrays.equals(this.GPSDevices, other.getGPSDevices())));
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
        if (getGPSDevices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGPSDevices());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGPSDevices(), i);
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
        new org.apache.axis.description.TypeDesc(GPSDevicesResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDevicesResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSDevices");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDevices"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo"));
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
