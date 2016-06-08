/**
 * GetDREventResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class GetDREventResult  extends WebMethodResult implements java.io.Serializable {
    private com.homeauto.honeywell.domain.thermo.DREvent DREvent;

    public GetDREventResult() {
    }

    public GetDREventResult(
           Results result,
           com.homeauto.honeywell.domain.thermo.DREvent DREvent) {
        super(
            result);
        this.DREvent = DREvent;
    }


    /**
     * Gets the DREvent value for this GetDREventResult.
     * 
     * @return DREvent
     */
    public com.homeauto.honeywell.domain.thermo.DREvent getDREvent() {
        return DREvent;
    }


    /**
     * Sets the DREvent value for this GetDREventResult.
     * 
     * @param DREvent
     */
    public void setDREvent(com.homeauto.honeywell.domain.thermo.DREvent DREvent) {
        this.DREvent = DREvent;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDREventResult)) return false;
        GetDREventResult other = (GetDREventResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.DREvent==null && other.getDREvent()==null) || 
             (this.DREvent!=null &&
              this.DREvent.equals(other.getDREvent())));
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
        if (getDREvent() != null) {
            _hashCode += getDREvent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDREventResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDREventResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DREvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREvent"));
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
