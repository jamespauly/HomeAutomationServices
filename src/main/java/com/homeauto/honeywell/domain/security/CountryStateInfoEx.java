/**
 * CountryStateInfoEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CountryStateInfoEx  implements java.io.Serializable {
    private long stateID;

    private String stateName;

    private long countryID;

    private String countryName;

    public CountryStateInfoEx() {
    }

    public CountryStateInfoEx(
           long stateID,
           String stateName,
           long countryID,
           String countryName) {
           this.stateID = stateID;
           this.stateName = stateName;
           this.countryID = countryID;
           this.countryName = countryName;
    }


    /**
     * Gets the stateID value for this CountryStateInfoEx.
     * 
     * @return stateID
     */
    public long getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this CountryStateInfoEx.
     * 
     * @param stateID
     */
    public void setStateID(long stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the stateName value for this CountryStateInfoEx.
     * 
     * @return stateName
     */
    public String getStateName() {
        return stateName;
    }


    /**
     * Sets the stateName value for this CountryStateInfoEx.
     * 
     * @param stateName
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


    /**
     * Gets the countryID value for this CountryStateInfoEx.
     * 
     * @return countryID
     */
    public long getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this CountryStateInfoEx.
     * 
     * @param countryID
     */
    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the countryName value for this CountryStateInfoEx.
     * 
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }


    /**
     * Sets the countryName value for this CountryStateInfoEx.
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CountryStateInfoEx)) return false;
        CountryStateInfoEx other = (CountryStateInfoEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.stateID == other.getStateID() &&
            ((this.stateName==null && other.getStateName()==null) || 
             (this.stateName!=null &&
              this.stateName.equals(other.getStateName()))) &&
            this.countryID == other.getCountryID() &&
            ((this.countryName==null && other.getCountryName()==null) || 
             (this.countryName!=null &&
              this.countryName.equals(other.getCountryName())));
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
        _hashCode += new Long(getStateID()).hashCode();
        if (getStateName() != null) {
            _hashCode += getStateName().hashCode();
        }
        _hashCode += new Long(getCountryID()).hashCode();
        if (getCountryName() != null) {
            _hashCode += getCountryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountryStateInfoEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfoEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryName"));
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
