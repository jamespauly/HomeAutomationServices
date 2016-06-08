/**
 * GetThermostatFanResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class GetThermostatFanResult  extends WebMethodResult implements java.io.Serializable {
    private FanInfo fan;

    public GetThermostatFanResult() {
    }

    public GetThermostatFanResult(
           Results result,
           FanInfo fan) {
        super(
            result);
        this.fan = fan;
    }


    /**
     * Gets the fan value for this GetThermostatFanResult.
     * 
     * @return fan
     */
    public FanInfo getFan() {
        return fan;
    }


    /**
     * Sets the fan value for this GetThermostatFanResult.
     * 
     * @param fan
     */
    public void setFan(FanInfo fan) {
        this.fan = fan;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetThermostatFanResult)) return false;
        GetThermostatFanResult other = (GetThermostatFanResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fan==null && other.getFan()==null) || 
             (this.fan!=null &&
              this.fan.equals(other.getFan())));
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
        if (getFan() != null) {
            _hashCode += getFan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetThermostatFanResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatFanResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Fan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanInfo"));
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
