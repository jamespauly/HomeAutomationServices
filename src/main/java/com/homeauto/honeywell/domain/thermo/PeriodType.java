/**
 * PeriodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class PeriodType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PeriodType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _WakeOcc1 = "WakeOcc1";
    public static final String _LeaveUnocc1 = "LeaveUnocc1";
    public static final String _ReturnOcc2 = "ReturnOcc2";
    public static final String _SleepUnocc2 = "SleepUnocc2";
    public static final PeriodType WakeOcc1 = new PeriodType(_WakeOcc1);
    public static final PeriodType LeaveUnocc1 = new PeriodType(_LeaveUnocc1);
    public static final PeriodType ReturnOcc2 = new PeriodType(_ReturnOcc2);
    public static final PeriodType SleepUnocc2 = new PeriodType(_SleepUnocc2);
    public String getValue() { return _value_;}
    public static PeriodType fromValue(String value)
          throws IllegalArgumentException {
        PeriodType enumeration = (PeriodType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PeriodType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PeriodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PeriodType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
