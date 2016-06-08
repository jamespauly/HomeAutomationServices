/**
 * Results.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class Results implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Results(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Success = "Success";
    public static final String _AuthenticationFailed = "AuthenticationFailed";
    public static final String _AccountNotActivated = "AccountNotActivated";
    public static final String _InvalidSessionID = "InvalidSessionID";
    public static final String _InvalidApplicationOrVersion = "InvalidApplicationOrVersion";
    public static final String _DeviceNotFound = "DeviceNotFound";
    public static final String _PermissionDenied = "PermissionDenied";
    public static final String _DeviceAlreadyRegisteredToOtherAccount = "DeviceAlreadyRegisteredToOtherAccount";
    public static final String _CannotControlSchedule = "CannotControlSchedule";
    public static final String _WillSupportSchedule = "WillSupportSchedule";
    public static final String _LocationNotFoundOrDoesNotBelongToUser = "LocationNotFoundOrDoesNotBelongToUser";
    public static final String _UserNotFound = "UserNotFound";
    public static final String _TimeZoneNotDefined = "TimeZoneNotDefined";
    public static final String _TooManyAttempt = "TooManyAttempt";
    public static final String _AccountAlreadyActivated = "AccountAlreadyActivated";
    public static final String _InvalidCountryCode = "InvalidCountryCode";
    public static final String _InvalidMacIDCRC = "InvalidMacIDCRC";
    public static final String _EmailNotSent = "EmailNotSent";
    public static final String _EventNotFound = "EventNotFound";
    public static final String _UserLockedOut = "UserLockedOut";
    public static final Results Success = new Results(_Success);
    public static final Results AuthenticationFailed = new Results(_AuthenticationFailed);
    public static final Results AccountNotActivated = new Results(_AccountNotActivated);
    public static final Results InvalidSessionID = new Results(_InvalidSessionID);
    public static final Results InvalidApplicationOrVersion = new Results(_InvalidApplicationOrVersion);
    public static final Results DeviceNotFound = new Results(_DeviceNotFound);
    public static final Results PermissionDenied = new Results(_PermissionDenied);
    public static final Results DeviceAlreadyRegisteredToOtherAccount = new Results(_DeviceAlreadyRegisteredToOtherAccount);
    public static final Results CannotControlSchedule = new Results(_CannotControlSchedule);
    public static final Results WillSupportSchedule = new Results(_WillSupportSchedule);
    public static final Results LocationNotFoundOrDoesNotBelongToUser = new Results(_LocationNotFoundOrDoesNotBelongToUser);
    public static final Results UserNotFound = new Results(_UserNotFound);
    public static final Results TimeZoneNotDefined = new Results(_TimeZoneNotDefined);
    public static final Results TooManyAttempt = new Results(_TooManyAttempt);
    public static final Results AccountAlreadyActivated = new Results(_AccountAlreadyActivated);
    public static final Results InvalidCountryCode = new Results(_InvalidCountryCode);
    public static final Results InvalidMacIDCRC = new Results(_InvalidMacIDCRC);
    public static final Results EmailNotSent = new Results(_EmailNotSent);
    public static final Results EventNotFound = new Results(_EventNotFound);
    public static final Results UserLockedOut = new Results(_UserLockedOut);
    public String getValue() { return _value_;}
    public static Results fromValue(String value)
          throws IllegalArgumentException {
        Results enumeration = (Results)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static Results fromString(String value)
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
        new org.apache.axis.description.TypeDesc(Results.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Results"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
