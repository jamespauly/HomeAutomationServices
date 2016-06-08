/**
 * InterfaceSchemaResultsEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class InterfaceSchemaResultsEx  extends WebMethodResults implements java.io.Serializable {
    private InterfaceSchemaInfoEx interfaceSchemaDetailsEx;

    public InterfaceSchemaResultsEx() {
    }

    public InterfaceSchemaResultsEx(
           int resultCode,
           String resultData,
           InterfaceSchemaInfoEx interfaceSchemaDetailsEx) {
        super(
            resultCode,
            resultData);
        this.interfaceSchemaDetailsEx = interfaceSchemaDetailsEx;
    }


    /**
     * Gets the interfaceSchemaDetailsEx value for this InterfaceSchemaResultsEx.
     * 
     * @return interfaceSchemaDetailsEx
     */
    public InterfaceSchemaInfoEx getInterfaceSchemaDetailsEx() {
        return interfaceSchemaDetailsEx;
    }


    /**
     * Sets the interfaceSchemaDetailsEx value for this InterfaceSchemaResultsEx.
     * 
     * @param interfaceSchemaDetailsEx
     */
    public void setInterfaceSchemaDetailsEx(InterfaceSchemaInfoEx interfaceSchemaDetailsEx) {
        this.interfaceSchemaDetailsEx = interfaceSchemaDetailsEx;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InterfaceSchemaResultsEx)) return false;
        InterfaceSchemaResultsEx other = (InterfaceSchemaResultsEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.interfaceSchemaDetailsEx==null && other.getInterfaceSchemaDetailsEx()==null) || 
             (this.interfaceSchemaDetailsEx!=null &&
              this.interfaceSchemaDetailsEx.equals(other.getInterfaceSchemaDetailsEx())));
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
        if (getInterfaceSchemaDetailsEx() != null) {
            _hashCode += getInterfaceSchemaDetailsEx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterfaceSchemaResultsEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaResultsEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceSchemaDetailsEx");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaDetailsEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaInfoEx"));
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
