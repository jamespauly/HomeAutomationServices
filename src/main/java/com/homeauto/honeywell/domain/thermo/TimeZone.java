/**
 * TimeZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class TimeZone implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TimeZone(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Undefined = "Undefined";
    public static final String _NewFoundland = "NewFoundland";
    public static final String _Atlantic = "Atlantic";
    public static final String _Eastern = "Eastern";
    public static final String _Central = "Central";
    public static final String _Mountain = "Mountain";
    public static final String _Pacific = "Pacific";
    public static final String _Alaskan = "Alaskan";
    public static final String _Hawaiian = "Hawaiian";
    public static final TimeZone Undefined = new TimeZone(_Undefined);
    public static final TimeZone NewFoundland = new TimeZone(_NewFoundland);
    public static final TimeZone Atlantic = new TimeZone(_Atlantic);
    public static final TimeZone Eastern = new TimeZone(_Eastern);
    public static final TimeZone Central = new TimeZone(_Central);
    public static final TimeZone Mountain = new TimeZone(_Mountain);
    public static final TimeZone Pacific = new TimeZone(_Pacific);
    public static final TimeZone Alaskan = new TimeZone(_Alaskan);
    public static final TimeZone Hawaiian = new TimeZone(_Hawaiian);
    public String getValue() { return _value_;}
    public static TimeZone fromValue(String value)
          throws IllegalArgumentException {
        TimeZone enumeration = (TimeZone)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TimeZone fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TimeZone.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
