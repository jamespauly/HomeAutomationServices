/**
 * InterfaceSchemaResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class InterfaceSchemaResults  extends WebMethodResults implements java.io.Serializable {
    private InterfaceSchemaInfo interfaceSchemaDetails;

    public InterfaceSchemaResults() {
    }

    public InterfaceSchemaResults(
           int resultCode,
           String resultData,
           InterfaceSchemaInfo interfaceSchemaDetails) {
        super(
            resultCode,
            resultData);
        this.interfaceSchemaDetails = interfaceSchemaDetails;
    }


    /**
     * Gets the interfaceSchemaDetails value for this InterfaceSchemaResults.
     * 
     * @return interfaceSchemaDetails
     */
    public InterfaceSchemaInfo getInterfaceSchemaDetails() {
        return interfaceSchemaDetails;
    }


    /**
     * Sets the interfaceSchemaDetails value for this InterfaceSchemaResults.
     * 
     * @param interfaceSchemaDetails
     */
    public void setInterfaceSchemaDetails(InterfaceSchemaInfo interfaceSchemaDetails) {
        this.interfaceSchemaDetails = interfaceSchemaDetails;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InterfaceSchemaResults)) return false;
        InterfaceSchemaResults other = (InterfaceSchemaResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.interfaceSchemaDetails==null && other.getInterfaceSchemaDetails()==null) || 
             (this.interfaceSchemaDetails!=null &&
              this.interfaceSchemaDetails.equals(other.getInterfaceSchemaDetails())));
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
        if (getInterfaceSchemaDetails() != null) {
            _hashCode += getInterfaceSchemaDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterfaceSchemaResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceSchemaDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaInfo"));
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
