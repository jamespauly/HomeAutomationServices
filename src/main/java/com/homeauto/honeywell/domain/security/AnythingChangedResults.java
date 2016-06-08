/**
 * AnythingChangedResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class AnythingChangedResults  extends WebMethodResults implements java.io.Serializable {
    private String[] methodCodes;

    public AnythingChangedResults() {
    }

    public AnythingChangedResults(
           int resultCode,
           String resultData,
           String[] methodCodes) {
        super(
            resultCode,
            resultData);
        this.methodCodes = methodCodes;
    }


    /**
     * Gets the methodCodes value for this AnythingChangedResults.
     * 
     * @return methodCodes
     */
    public String[] getMethodCodes() {
        return methodCodes;
    }


    /**
     * Sets the methodCodes value for this AnythingChangedResults.
     * 
     * @param methodCodes
     */
    public void setMethodCodes(String[] methodCodes) {
        this.methodCodes = methodCodes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AnythingChangedResults)) return false;
        AnythingChangedResults other = (AnythingChangedResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.methodCodes==null && other.getMethodCodes()==null) || 
             (this.methodCodes!=null &&
              java.util.Arrays.equals(this.methodCodes, other.getMethodCodes())));
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
        if (getMethodCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethodCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMethodCodes(), i);
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
        new org.apache.axis.description.TypeDesc(AnythingChangedResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AnythingChangedResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MethodCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "string"));
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
