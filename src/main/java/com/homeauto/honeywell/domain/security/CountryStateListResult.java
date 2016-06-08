/**
 * CountryStateListResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CountryStateListResult  extends WebMethodResults implements java.io.Serializable {
    private CountryStateInfo[] countryStateList;

    public CountryStateListResult() {
    }

    public CountryStateListResult(
           int resultCode,
           String resultData,
           CountryStateInfo[] countryStateList) {
        super(
            resultCode,
            resultData);
        this.countryStateList = countryStateList;
    }


    /**
     * Gets the countryStateList value for this CountryStateListResult.
     * 
     * @return countryStateList
     */
    public CountryStateInfo[] getCountryStateList() {
        return countryStateList;
    }


    /**
     * Sets the countryStateList value for this CountryStateListResult.
     * 
     * @param countryStateList
     */
    public void setCountryStateList(CountryStateInfo[] countryStateList) {
        this.countryStateList = countryStateList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CountryStateListResult)) return false;
        CountryStateListResult other = (CountryStateListResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.countryStateList==null && other.getCountryStateList()==null) || 
             (this.countryStateList!=null &&
              java.util.Arrays.equals(this.countryStateList, other.getCountryStateList())));
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
        if (getCountryStateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryStateList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCountryStateList(), i);
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
        new org.apache.axis.description.TypeDesc(CountryStateListResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateListResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryStateList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfo"));
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
