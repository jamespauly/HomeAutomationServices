/**
 * CameraFirmwareListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraFirmwareListResult  extends WebMethodResults implements java.io.Serializable {
    private CameraFirmwareList firmwareList;

    public CameraFirmwareListResult() {
    }

    public CameraFirmwareListResult(
           int resultCode,
           String resultData,
           CameraFirmwareList firmwareList) {
        super(
            resultCode,
            resultData);
        this.firmwareList = firmwareList;
    }


    /**
     * Gets the firmwareList value for this CameraFirmwareListResult.
     * 
     * @return firmwareList
     */
    public CameraFirmwareList getFirmwareList() {
        return firmwareList;
    }


    /**
     * Sets the firmwareList value for this CameraFirmwareListResult.
     * 
     * @param firmwareList
     */
    public void setFirmwareList(CameraFirmwareList firmwareList) {
        this.firmwareList = firmwareList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraFirmwareListResult)) return false;
        CameraFirmwareListResult other = (CameraFirmwareListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firmwareList==null && other.getFirmwareList()==null) || 
             (this.firmwareList!=null &&
              this.firmwareList.equals(other.getFirmwareList())));
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
        if (getFirmwareList() != null) {
            _hashCode += getFirmwareList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraFirmwareListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareList"));
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
