/**
 * MobileCarrier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class MobileCarrier  implements java.io.Serializable {
    private int carrierID;

    private String carrierName;

    private String carrierEmailSuffix;

    public MobileCarrier() {
    }

    public MobileCarrier(
           int carrierID,
           String carrierName,
           String carrierEmailSuffix) {
           this.carrierID = carrierID;
           this.carrierName = carrierName;
           this.carrierEmailSuffix = carrierEmailSuffix;
    }


    /**
     * Gets the carrierID value for this MobileCarrier.
     * 
     * @return carrierID
     */
    public int getCarrierID() {
        return carrierID;
    }


    /**
     * Sets the carrierID value for this MobileCarrier.
     * 
     * @param carrierID
     */
    public void setCarrierID(int carrierID) {
        this.carrierID = carrierID;
    }


    /**
     * Gets the carrierName value for this MobileCarrier.
     * 
     * @return carrierName
     */
    public String getCarrierName() {
        return carrierName;
    }


    /**
     * Sets the carrierName value for this MobileCarrier.
     * 
     * @param carrierName
     */
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }


    /**
     * Gets the carrierEmailSuffix value for this MobileCarrier.
     * 
     * @return carrierEmailSuffix
     */
    public String getCarrierEmailSuffix() {
        return carrierEmailSuffix;
    }


    /**
     * Sets the carrierEmailSuffix value for this MobileCarrier.
     * 
     * @param carrierEmailSuffix
     */
    public void setCarrierEmailSuffix(String carrierEmailSuffix) {
        this.carrierEmailSuffix = carrierEmailSuffix;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MobileCarrier)) return false;
        MobileCarrier other = (MobileCarrier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.carrierID == other.getCarrierID() &&
            ((this.carrierName==null && other.getCarrierName()==null) || 
             (this.carrierName!=null &&
              this.carrierName.equals(other.getCarrierName()))) &&
            ((this.carrierEmailSuffix==null && other.getCarrierEmailSuffix()==null) || 
             (this.carrierEmailSuffix!=null &&
              this.carrierEmailSuffix.equals(other.getCarrierEmailSuffix())));
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
        _hashCode += getCarrierID();
        if (getCarrierName() != null) {
            _hashCode += getCarrierName().hashCode();
        }
        if (getCarrierEmailSuffix() != null) {
            _hashCode += getCarrierEmailSuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileCarrier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarrier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CarrierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CarrierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierEmailSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CarrierEmailSuffix"));
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
