/**
 * UserCreateStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class UserCreateStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserCreateStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Success = "Success";
    public static final String _InvalidUserName = "InvalidUserName";
    public static final String _InvalidPassword = "InvalidPassword";
    public static final String _InvalidQuestion = "InvalidQuestion";
    public static final String _InvalidAnswer = "InvalidAnswer";
    public static final String _InvalidEmail = "InvalidEmail";
    public static final String _DuplicateUserName = "DuplicateUserName";
    public static final String _DuplicateEmail = "DuplicateEmail";
    public static final String _UserRejected = "UserRejected";
    public static final String _InvalidProviderUserKey = "InvalidProviderUserKey";
    public static final String _DuplicateProviderUserKey = "DuplicateProviderUserKey";
    public static final String _ProviderError = "ProviderError";
    public static final String _InvalidCountryCode = "InvalidCountryCode";
    public static final UserCreateStatus Success = new UserCreateStatus(_Success);
    public static final UserCreateStatus InvalidUserName = new UserCreateStatus(_InvalidUserName);
    public static final UserCreateStatus InvalidPassword = new UserCreateStatus(_InvalidPassword);
    public static final UserCreateStatus InvalidQuestion = new UserCreateStatus(_InvalidQuestion);
    public static final UserCreateStatus InvalidAnswer = new UserCreateStatus(_InvalidAnswer);
    public static final UserCreateStatus InvalidEmail = new UserCreateStatus(_InvalidEmail);
    public static final UserCreateStatus DuplicateUserName = new UserCreateStatus(_DuplicateUserName);
    public static final UserCreateStatus DuplicateEmail = new UserCreateStatus(_DuplicateEmail);
    public static final UserCreateStatus UserRejected = new UserCreateStatus(_UserRejected);
    public static final UserCreateStatus InvalidProviderUserKey = new UserCreateStatus(_InvalidProviderUserKey);
    public static final UserCreateStatus DuplicateProviderUserKey = new UserCreateStatus(_DuplicateProviderUserKey);
    public static final UserCreateStatus ProviderError = new UserCreateStatus(_ProviderError);
    public static final UserCreateStatus InvalidCountryCode = new UserCreateStatus(_InvalidCountryCode);
    public String getValue() { return _value_;}
    public static UserCreateStatus fromValue(String value)
          throws IllegalArgumentException {
        UserCreateStatus enumeration = (UserCreateStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static UserCreateStatus fromString(String value)
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
        new org.apache.axis.description.TypeDesc(UserCreateStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UserCreateStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
