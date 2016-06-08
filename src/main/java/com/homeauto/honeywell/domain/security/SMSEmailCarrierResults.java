/**
 * SMSEmailCarrierResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SMSEmailCarrierResults  extends WebMethodResults implements java.io.Serializable {
    private MobileCarrier[] mobileCarriers;

    public SMSEmailCarrierResults() {
    }

    public SMSEmailCarrierResults(
           int resultCode,
           String resultData,
           MobileCarrier[] mobileCarriers) {
        super(
            resultCode,
            resultData);
        this.mobileCarriers = mobileCarriers;
    }


    /**
     * Gets the mobileCarriers value for this SMSEmailCarrierResults.
     * 
     * @return mobileCarriers
     */
    public MobileCarrier[] getMobileCarriers() {
        return mobileCarriers;
    }


    /**
     * Sets the mobileCarriers value for this SMSEmailCarrierResults.
     * 
     * @param mobileCarriers
     */
    public void setMobileCarriers(MobileCarrier[] mobileCarriers) {
        this.mobileCarriers = mobileCarriers;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SMSEmailCarrierResults)) return false;
        SMSEmailCarrierResults other = (SMSEmailCarrierResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.mobileCarriers==null && other.getMobileCarriers()==null) || 
             (this.mobileCarriers!=null &&
              java.util.Arrays.equals(this.mobileCarriers, other.getMobileCarriers())));
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
        if (getMobileCarriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobileCarriers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMobileCarriers(), i);
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
        new org.apache.axis.description.TypeDesc(SMSEmailCarrierResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SMSEmailCarrierResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarrier"));
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
