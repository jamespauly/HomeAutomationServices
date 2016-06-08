/**
 * FaultReasons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class FaultReasons implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FaultReasons(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _GatewayNotFound = "GatewayNotFound";
    public static final String _GatewayUnregistered = "GatewayUnregistered";
    public static final String _RegistrationResponseNotFound = "RegistrationResponseNotFound";
    public static final String _MessageNotFound = "MessageNotFound";
    public static final String _TenantCannotRegisterGateway = "TenantCannotRegisterGateway";
    public static final String _InvalidUserDefinedDeviceNameLength = "InvalidUserDefinedDeviceNameLength";
    public static final String _InvalidUserDefinedDeviceNameFormat = "InvalidUserDefinedDeviceNameFormat";
    public static final String _InvalidUserDefinedDeviceNameDbLength = "InvalidUserDefinedDeviceNameDbLength";
    public static final String _InvalidDeviceTypeReceived = "InvalidDeviceTypeReceived";
    public static final String _DeviceLoadFailed = "DeviceLoadFailed";
    public static final String _DeviceNotFound = "DeviceNotFound";
    public static final String _FirmwareDoesntExist = "FirmwareDoesntExist";
    public static final String _CannotChangeOTBs = "CannotChangeOTBs";
    public static final String _FilterValidationFailed = "FilterValidationFailed";
    public static final String _ReceivedInvalidResponseForQuery = "ReceivedInvalidResponseForQuery";
    public static final String _ParsingException = "ParsingException";
    public static final String _Cancelled = "Cancelled";
    public static final String _Unknown = "Unknown";
    public static final String _AsyncCommTaskTimeout = "AsyncCommTaskTimeout";
    public static final String _ResponseTimeOut = "ResponseTimeOut";
    public static final String _FailedSavingState = "FailedSavingState";
    public static final String _CommunicationLost = "CommunicationLost";
    public static final String _DeviceLost = "DeviceLost";
    public static final String _MessageProccessingException = "MessageProccessingException";
    public static final String _CancelledDuringShutdown = "CancelledDuringShutdown";
    public static final String _StartupException = "StartupException";
    public static final String _Timeout = "Timeout";
    public static final FaultReasons GatewayNotFound = new FaultReasons(_GatewayNotFound);
    public static final FaultReasons GatewayUnregistered = new FaultReasons(_GatewayUnregistered);
    public static final FaultReasons RegistrationResponseNotFound = new FaultReasons(_RegistrationResponseNotFound);
    public static final FaultReasons MessageNotFound = new FaultReasons(_MessageNotFound);
    public static final FaultReasons TenantCannotRegisterGateway = new FaultReasons(_TenantCannotRegisterGateway);
    public static final FaultReasons InvalidUserDefinedDeviceNameLength = new FaultReasons(_InvalidUserDefinedDeviceNameLength);
    public static final FaultReasons InvalidUserDefinedDeviceNameFormat = new FaultReasons(_InvalidUserDefinedDeviceNameFormat);
    public static final FaultReasons InvalidUserDefinedDeviceNameDbLength = new FaultReasons(_InvalidUserDefinedDeviceNameDbLength);
    public static final FaultReasons InvalidDeviceTypeReceived = new FaultReasons(_InvalidDeviceTypeReceived);
    public static final FaultReasons DeviceLoadFailed = new FaultReasons(_DeviceLoadFailed);
    public static final FaultReasons DeviceNotFound = new FaultReasons(_DeviceNotFound);
    public static final FaultReasons FirmwareDoesntExist = new FaultReasons(_FirmwareDoesntExist);
    public static final FaultReasons CannotChangeOTBs = new FaultReasons(_CannotChangeOTBs);
    public static final FaultReasons FilterValidationFailed = new FaultReasons(_FilterValidationFailed);
    public static final FaultReasons ReceivedInvalidResponseForQuery = new FaultReasons(_ReceivedInvalidResponseForQuery);
    public static final FaultReasons ParsingException = new FaultReasons(_ParsingException);
    public static final FaultReasons Cancelled = new FaultReasons(_Cancelled);
    public static final FaultReasons Unknown = new FaultReasons(_Unknown);
    public static final FaultReasons AsyncCommTaskTimeout = new FaultReasons(_AsyncCommTaskTimeout);
    public static final FaultReasons ResponseTimeOut = new FaultReasons(_ResponseTimeOut);
    public static final FaultReasons FailedSavingState = new FaultReasons(_FailedSavingState);
    public static final FaultReasons CommunicationLost = new FaultReasons(_CommunicationLost);
    public static final FaultReasons DeviceLost = new FaultReasons(_DeviceLost);
    public static final FaultReasons MessageProccessingException = new FaultReasons(_MessageProccessingException);
    public static final FaultReasons CancelledDuringShutdown = new FaultReasons(_CancelledDuringShutdown);
    public static final FaultReasons StartupException = new FaultReasons(_StartupException);
    public static final FaultReasons Timeout = new FaultReasons(_Timeout);
    public String getValue() { return _value_;}
    public static FaultReasons fromValue(String value)
          throws IllegalArgumentException {
        FaultReasons enumeration = (FaultReasons)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static FaultReasons fromString(String value)
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
        new org.apache.axis.description.TypeDesc(FaultReasons.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FaultReasons"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
