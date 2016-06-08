/**
 * AwayEndDateFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class AwayEndDateFormat implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AwayEndDateFormat(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _TimeOfDay = "TimeOfDay";
    public static final String _DurationInHours = "DurationInHours";
    public static final String _DurationInDays = "DurationInDays";
    public static final AwayEndDateFormat TimeOfDay = new AwayEndDateFormat(_TimeOfDay);
    public static final AwayEndDateFormat DurationInHours = new AwayEndDateFormat(_DurationInHours);
    public static final AwayEndDateFormat DurationInDays = new AwayEndDateFormat(_DurationInDays);
    public String getValue() { return _value_;}
    public static AwayEndDateFormat fromValue(String value)
          throws IllegalArgumentException {
        AwayEndDateFormat enumeration = (AwayEndDateFormat)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AwayEndDateFormat fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AwayEndDateFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AwayEndDateFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
