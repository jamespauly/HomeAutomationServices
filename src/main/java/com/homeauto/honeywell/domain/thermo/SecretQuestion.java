/**
 * SecretQuestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class SecretQuestion implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SecretQuestion(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _None = "None";
    public static final String _FirstEmployer = "FirstEmployer";
    public static final String _VacationHome = "VacationHome";
    public static final String _EldestChildBirth = "EldestChildBirth";
    public static final String _FavoriteRoommate = "FavoriteRoommate";
    public static final String _HometownHighway = "HometownHighway";
    public static final String _FirstCar = "FirstCar";
    public static final String _BestHighScoolFriend = "BestHighScoolFriend";
    public static final String _HighSchoolMascot = "HighSchoolMascot";
    public static final String _PaternalGrandfatherFirstName = "PaternalGrandfatherFirstName";
    public static final String _Promotion = "Promotion";
    public static final String _FatherMiddleName = "FatherMiddleName";
    public static final String _FatherEmployer = "FatherEmployer";
    public static final String _FavoriteCollegeSport = "FavoriteCollegeSport";
    public static final String _MotherBorn = "MotherBorn";
    public static final String _CityCollege = "CityCollege";
    public static final String _Phobia = "Phobia";
    public static final String _HairStylist = "HairStylist";
    public static final String _RetirePlace = "RetirePlace";
    public static final String _VacationPlace = "VacationPlace";
    public static final String _FirstSchool = "FirstSchool";
    public static final SecretQuestion None = new SecretQuestion(_None);
    public static final SecretQuestion FirstEmployer = new SecretQuestion(_FirstEmployer);
    public static final SecretQuestion VacationHome = new SecretQuestion(_VacationHome);
    public static final SecretQuestion EldestChildBirth = new SecretQuestion(_EldestChildBirth);
    public static final SecretQuestion FavoriteRoommate = new SecretQuestion(_FavoriteRoommate);
    public static final SecretQuestion HometownHighway = new SecretQuestion(_HometownHighway);
    public static final SecretQuestion FirstCar = new SecretQuestion(_FirstCar);
    public static final SecretQuestion BestHighScoolFriend = new SecretQuestion(_BestHighScoolFriend);
    public static final SecretQuestion HighSchoolMascot = new SecretQuestion(_HighSchoolMascot);
    public static final SecretQuestion PaternalGrandfatherFirstName = new SecretQuestion(_PaternalGrandfatherFirstName);
    public static final SecretQuestion Promotion = new SecretQuestion(_Promotion);
    public static final SecretQuestion FatherMiddleName = new SecretQuestion(_FatherMiddleName);
    public static final SecretQuestion FatherEmployer = new SecretQuestion(_FatherEmployer);
    public static final SecretQuestion FavoriteCollegeSport = new SecretQuestion(_FavoriteCollegeSport);
    public static final SecretQuestion MotherBorn = new SecretQuestion(_MotherBorn);
    public static final SecretQuestion CityCollege = new SecretQuestion(_CityCollege);
    public static final SecretQuestion Phobia = new SecretQuestion(_Phobia);
    public static final SecretQuestion HairStylist = new SecretQuestion(_HairStylist);
    public static final SecretQuestion RetirePlace = new SecretQuestion(_RetirePlace);
    public static final SecretQuestion VacationPlace = new SecretQuestion(_VacationPlace);
    public static final SecretQuestion FirstSchool = new SecretQuestion(_FirstSchool);
    public String getValue() { return _value_;}
    public static SecretQuestion fromValue(String value)
          throws IllegalArgumentException {
        SecretQuestion enumeration = (SecretQuestion)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SecretQuestion fromString(String value)
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
        new org.apache.axis.description.TypeDesc(SecretQuestion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
