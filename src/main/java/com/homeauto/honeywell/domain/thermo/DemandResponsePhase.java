/**
 * DemandResponsePhase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class DemandResponsePhase implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DemandResponsePhase(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NotStarted = "NotStarted";
    public static final String _Phase1 = "Phase1";
    public static final String _Phase2 = "Phase2";
    public static final String _Phase3 = "Phase3";
    public static final String _Completed = "Completed";
    public static final String _Aborted = "Aborted";
    public static final String _Undefined = "Undefined";
    public static final DemandResponsePhase NotStarted = new DemandResponsePhase(_NotStarted);
    public static final DemandResponsePhase Phase1 = new DemandResponsePhase(_Phase1);
    public static final DemandResponsePhase Phase2 = new DemandResponsePhase(_Phase2);
    public static final DemandResponsePhase Phase3 = new DemandResponsePhase(_Phase3);
    public static final DemandResponsePhase Completed = new DemandResponsePhase(_Completed);
    public static final DemandResponsePhase Aborted = new DemandResponsePhase(_Aborted);
    public static final DemandResponsePhase Undefined = new DemandResponsePhase(_Undefined);
    public String getValue() { return _value_;}
    public static DemandResponsePhase fromValue(String value)
          throws IllegalArgumentException {
        DemandResponsePhase enumeration = (DemandResponsePhase)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DemandResponsePhase fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DemandResponsePhase.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DemandResponsePhase"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
