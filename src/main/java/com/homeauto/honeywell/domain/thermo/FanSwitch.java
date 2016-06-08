/**
 * FanSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class FanSwitch implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FanSwitch(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Auto = "Auto";
    public static final String _On = "On";
    public static final String _Circulate = "Circulate";
    public static final String _FollowSchedule = "FollowSchedule";
    public static final String _Unknown = "Unknown";
    public static final FanSwitch Auto = new FanSwitch(_Auto);
    public static final FanSwitch On = new FanSwitch(_On);
    public static final FanSwitch Circulate = new FanSwitch(_Circulate);
    public static final FanSwitch FollowSchedule = new FanSwitch(_FollowSchedule);
    public static final FanSwitch Unknown = new FanSwitch(_Unknown);
    public String getValue() { return _value_;}
    public static FanSwitch fromValue(String value)
          throws IllegalArgumentException {
        FanSwitch enumeration = (FanSwitch)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static FanSwitch fromString(String value)
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
        new org.apache.axis.description.TypeDesc(FanSwitch.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanSwitch"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
