/**
 * Day.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class Day implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Day(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Monday = "Monday";
    public static final String _Tuesday = "Tuesday";
    public static final String _Wednesday = "Wednesday";
    public static final String _Thursday = "Thursday";
    public static final String _Friday = "Friday";
    public static final String _Saturday = "Saturday";
    public static final String _Sunday = "Sunday";
    public static final Day Monday = new Day(_Monday);
    public static final Day Tuesday = new Day(_Tuesday);
    public static final Day Wednesday = new Day(_Wednesday);
    public static final Day Thursday = new Day(_Thursday);
    public static final Day Friday = new Day(_Friday);
    public static final Day Saturday = new Day(_Saturday);
    public static final Day Sunday = new Day(_Sunday);
    public String getValue() { return _value_;}
    public static Day fromValue(String value)
          throws IllegalArgumentException {
        Day enumeration = (Day)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static Day fromString(String value)
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
        new org.apache.axis.description.TypeDesc(Day.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Day"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
