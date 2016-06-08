/**
 * ThermostatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ThermostatResponse  extends WebMethodResults implements java.io.Serializable {
    private ThermostatInfo thermostatInfo;

    public ThermostatResponse() {
    }

    public ThermostatResponse(
           int resultCode,
           String resultData,
           ThermostatInfo thermostatInfo) {
        super(
            resultCode,
            resultData);
        this.thermostatInfo = thermostatInfo;
    }


    /**
     * Gets the thermostatInfo value for this ThermostatResponse.
     * 
     * @return thermostatInfo
     */
    public ThermostatInfo getThermostatInfo() {
        return thermostatInfo;
    }


    /**
     * Sets the thermostatInfo value for this ThermostatResponse.
     * 
     * @param thermostatInfo
     */
    public void setThermostatInfo(ThermostatInfo thermostatInfo) {
        this.thermostatInfo = thermostatInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ThermostatResponse)) return false;
        ThermostatResponse other = (ThermostatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.thermostatInfo==null && other.getThermostatInfo()==null) || 
             (this.thermostatInfo!=null &&
              this.thermostatInfo.equals(other.getThermostatInfo())));
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
        if (getThermostatInfo() != null) {
            _hashCode += getThermostatInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo"));
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
