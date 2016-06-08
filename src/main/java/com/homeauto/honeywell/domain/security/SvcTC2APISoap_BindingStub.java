/**
 * SvcTC2APISoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SvcTC2APISoap_BindingStub extends org.apache.axis.client.Stub implements SvcTC2APISoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[204];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
        _initOperationDesc21();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckSecurityPanelLastCommandState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CommandCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CheckSecurityPanelLastCommandStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelConnectionStatusInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfoResults"));
        oper.setReturnClass(PanelConnectionStatusInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelConnectionStatusInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetIndividualZoneDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "zoneIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "partitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZoneInfoResults"));
        oper.setReturnClass(GetZoneInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetIndividualZoneDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserConfigurationResults"));
        oper.setReturnClass(UserConfigurationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUsersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserInfoResults"));
        oper.setReturnClass(DeleteUserInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisableEnableUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StateToSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUserResults"));
        oper.setReturnClass(DisableEnableUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateEula");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Eula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEulaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfoResults"));
        oper.setReturnClass(UserInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUserInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserResults"));
        oper.setReturnClass(DeleteUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisableEnableUserEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StateToSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUserResults"));
        oper.setReturnClass(DisableEnableUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUserExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ManageUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailResults"));
        oper.setReturnClass(UserDetailResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUserDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllUserDetailsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ManageUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailsExResults"));
        oper.setReturnClass(UserDetailsExResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllUserDetailsExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserDetailsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ManageUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailsExResults"));
        oper.setReturnClass(UserDetailsExResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUserDetailsExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetails"), UserDetails.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserResults"));
        oper.setReturnClass(SaveUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailsEx"), UserDetailsEx.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserResults"));
        oper.setReturnClass(SaveUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveMasterUserCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ManageUserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelUserCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserResults"));
        oper.setReturnClass(SaveUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveMasterUserCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUsersEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListResults"));
        oper.setReturnClass(UserListResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUsersExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynchronizePanelUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDeviceAuthorizingCode"), DeviceAuthorizingCode[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAuthorizingCode"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StatusOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizeUserResults"));
        oper.setReturnClass(SynchronizeUserResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizePanelUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSMSEmailCarriers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SMSEmailCarrierResults"));
        oper.setReturnClass(SMSEmailCarrierResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSMSEmailCarriersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNotificationMethods");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethodResults"));
        oper.setReturnClass(NotificationMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetNotificationMethodsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsUserNameValid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserNameInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserNameInfo"), UserNameInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsUserNameValidResults"));
        oper.setReturnClass(IsUserNameValidResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsUserNameValidResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveCreateUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfo"), UserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveCreateUserInfoResults"));
        oper.setReturnClass(SaveCreateUserInfoResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveCreateUserInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveUserClientPreferences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PreferencesString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserClientPreferencesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetHelpDocuments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ListHelpDocsResults"));
        oper.setReturnClass(ListHelpDocsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetHelpDocumentsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUserLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocaleCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateUserLanguageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoteAuthenticateUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoteApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoteAuthenticateLoginResults"));
        oper.setReturnClass(RemoteAuthenticateLoginResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoteAuthenticateUserLoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateLoginResults"));
        oper.setReturnClass(AuthenticateLoginResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateUserLoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateUserLoginEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocaleCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateLoginResults"));
        oper.setReturnClass(AuthenticateLoginResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateUserLoginExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateGUIDLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateLoginResults"));
        oper.setReturnClass(AuthenticateLoginResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateGUIDLoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateGUIDLoginEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GUID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocaleCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateLoginResults"));
        oper.setReturnClass(AuthenticateLoginResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateGUIDLoginExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSessionDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionDetailResults"));
        oper.setReturnClass(SessionDetailResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSessionDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoginAndGetSessionDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ApplicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocaleCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionDetailResults"));
        oper.setReturnClass(SessionDetailResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LoginAndGetSessionDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("KeepAlive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "KeepAliveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LogoutResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AnythingChanged");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Modules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfModule"), Module[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Module"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AnythingChangedResults"));
        oper.setReturnClass(AnythingChangedResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AnythingChangedResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInterfaceSchemaDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaResults"));
        oper.setReturnClass(InterfaceSchemaResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetInterfaceSchemaDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInterfaceSchemaDetailsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaResultsEx"));
        oper.setReturnClass(InterfaceSchemaResultsEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetInterfaceSchemaDetailsExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WiFiWeatherFromDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResponse"));
        oper.setReturnClass(WiFiWeatherResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherFromDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThermostat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatResponse"));
        oper.setReturnClass(ThermostatResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetThermostatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetImageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLogoImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLogoImageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetContentImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetContentImageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationResult"));
        oper.setReturnClass(LocationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLocationSimple");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationSimpleResult"));
        oper.setReturnClass(LocationSimpleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLocationSimpleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfo"), LocationInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Image"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "dataChanged"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "imageChanged"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationResult"));
        oper.setReturnClass(LocationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveLocationSimple");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoSimple"), LocationInfoSimple.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Image"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "dataChanged"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "imageChanged"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationSimpleResult"));
        oper.setReturnClass(LocationSimpleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveLocationSimpleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCountryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryListResult"));
        oper.setReturnClass(CountryListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCountryListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCountryStateList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateListResult"));
        oper.setReturnClass(CountryStateListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCountryStateListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllCountryStateList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateListResultEx"));
        oper.setReturnClass(CountryStateListResultEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllCountryStateListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAssociatedPartners");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerListResult"));
        oper.setReturnClass(PartnerListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAssociatedPartnersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTimeZones");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZonesResult"));
        oper.setReturnClass(TimeZonesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetTimeZonesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTimeZonesForCamera");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZonesResult"));
        oper.setReturnClass(TimeZonesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetTimeZonesForCameraResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ServiceVersion");
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ServiceVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVideoFileURLs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoFileURLResult"));
        oper.setReturnClass(VideoFileURLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoFileURLsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotesResult"));
        oper.setReturnClass(NotesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventNotesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ShowHidden"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StartDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EndDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SortOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastEventIdReceived"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventsResult"));
        oper.setReturnClass(EventsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ShowHidden"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StartDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EndDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SortOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastEventIdReceived"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventsResult"));
        oper.setReturnClass(EventsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventsEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfInt"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ShowHidden"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ShowLocked"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StartDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EndDateTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SortOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastEventIdReceived"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventsResult"));
        oper.setReturnClass(EventsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventsExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventTypeFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterResult"));
        oper.setReturnClass(EventTypeFilterResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventTypeFilterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllEventTypeFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterResult"));
        oper.setReturnClass(EventTypeFilterResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllEventTypeFilterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLiveEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastEventIdReceived"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventsResult"));
        oper.setReturnClass(EventsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLiveEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllLiveEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastEventIdReceived"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventsResult"));
        oper.setReturnClass(EventsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllLiveEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateEventNotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Note"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEventNotesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateEventRecordHideState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsHidden"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEventRecordHideStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateEventRecordLockState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsLocked"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEventRecordLockStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsCameraAvailable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsCameraAvailableResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCameraState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraStateResult"));
        oper.setReturnClass(CameraStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCameraIOState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraIOStateResult"));
        oper.setReturnClass(CameraIOStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraIOStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCameraPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraPositionResult"));
        oper.setReturnClass(CameraPositionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraPositionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GotoPreset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PresetSlot"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GotoPresetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StorePreset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PresetSlot"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StorePresetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MoveCamera");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Direction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Degrees"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanSpeed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TiltSpeed"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MoveCameraResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DirectPanTilt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "X"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DirectPanTiltResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WLLED_Control");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WLLED_ControlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Output_Control");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "OutputNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Output_ControlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TriggerVideoCapture");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerVideoCaptureResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConfigStreamMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeSelector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FramesPerSecond"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "QualityType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Quality"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BitRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfigStreamModeResult"));
        oper.setReturnClass(ConfigStreamModeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfigStreamModeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLocationCameraList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraListResult"));
        oper.setReturnClass(CameraListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLocationCameraListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMediaServerConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MediaServerConfigurationResults"));
        oper.setReturnClass(MediaServerConfigurationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetMediaServerConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCameraConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraConfigurationResults"));
        oper.setReturnClass(CameraConfigurationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCameraConfiguration2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraConfigurationResults2"));
        oper.setReturnClass(CameraConfigurationResults2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraConfiguration2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCameraConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SYSTEM_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VIDEO_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MOTION_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IO_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EVENT_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PTZ_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateCameraConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetDefaultCamera");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetDefaultCameraResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpgradeCameraFirmware");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareVersionNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpgradeCameraFirmwareResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirmwareList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareListResult"));
        oper.setReturnClass(CameraFirmwareListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetFirmwareListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWirelessStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SearchType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrengthResults"));
        oper.setReturnClass(CameraSignalStrengthResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWirelessStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCameraInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SearchType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInformationResults"));
        oper.setReturnClass(CameraInformationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWAPClientsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WAPClientsListResults"));
        oper.setReturnClass(WAPClientsListResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWAPClientsInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBatteryStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraBatteryStatusResult"));
        oper.setReturnClass(CameraBatteryStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetBatteryStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventMetaDataEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventMetaDataExResult"));
        oper.setReturnClass(EventMetaDataExResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventMetaDataExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetConfiguredEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfiguredEventResult"));
        oper.setReturnClass(ConfiguredEventResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetConfiguredEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventSummaryXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryConfiguredEventXML"));
        oper.setReturnClass(SummaryConfiguredEventXML.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventSummaryXMLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventSummary");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryConfiguredEventString"));
        oper.setReturnClass(SummaryConfiguredEventString.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventSummaryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransactNotificationListEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSentToPanelEvents"), SentToPanelEvents[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotifications"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventNotification"), EventNotification[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTriggers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneTrigger"), SceneTrigger[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTrigger"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTriggers"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfVideoTrigger"), VideoTrigger[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTimeTriggeredAction"), TimeTriggeredAction[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationListEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllNotificationConditionalStates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalStateResult"));
        oper.setReturnClass(NotificationConditionalStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationConditionalStatesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllNotificationSchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationScheduleResult"));
        oper.setReturnClass(NotificationScheduleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationSchedulesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransactNotificationSchedules");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationSchedules"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationSchedule"), NotificationSchedule[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationSchedule"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationSchedulesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllNotificationLists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationListsResults"));
        oper.setReturnClass(GetAllNotificationListsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationListsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransactNotificationLists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListCollection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationListBaseInfo"), NotificationListBaseInfo[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationListResults"));
        oper.setReturnClass(TransactNotificationListResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationListsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendTestNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendTestNotificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NotificationPause");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "mode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationPauseResult"));
        oper.setReturnClass(NotificationPauseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationPauseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEventMetaData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventMetaDataResults"));
        oper.setReturnClass(EventMetaDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventMetaDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelMetaDataAndFullStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusResults"));
        oper.setReturnClass(PanelMetadataAndStatusResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelMetaDataAndFullStatusEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusResultsEx"));
        oper.setReturnClass(PanelMetadataAndStatusResultsEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelFullStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResults"));
        oper.setReturnClass(PanelStatusResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelFullStatusByDeviceID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResults"));
        oper.setReturnClass(PanelStatusResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusByDeviceIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelFullStatusEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResultsEx"));
        oper.setReturnClass(PanelStatusResultsEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelFullStatusByDeviceIDEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResultsEx"));
        oper.setReturnClass(PanelStatusResultsEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusByDeviceIDExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetZonesListInState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ListIdentifierID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateResult"));
        oper.setReturnClass(GetZonesListInStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetZonesListInStateEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ListIdentifierID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateExResult"));
        oper.setReturnClass(GetZonesListInStateExResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelMetaDataAndFullStatusByDeviceID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusResults"));
        oper.setReturnClass(PanelMetadataAndStatusResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusByDeviceIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPanelMetaDataAndFullStatusByDeviceIDEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastSequenceNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastUpdatedTimestampTicks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusResultsEx"));
        oper.setReturnClass(PanelMetadataAndStatusResultsEx.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusByDeviceIDExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Bypass");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Zone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneBypassResults"));
        oper.setReturnClass(ZoneBypassResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BypassResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ArmSecuritySystem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmSecuritySystemResults"));
        oper.setReturnClass(ArmSecuritySystemResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmSecuritySystemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomArmSecuritySystem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSettings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmInfo"), CustomArmInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSecuritySystemResults"));
        oper.setReturnClass(CustomArmSecuritySystemResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSecuritySystemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomArmSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSettingsResult"));
        oper.setReturnClass(CustomArmSettingsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCustomArmSettingsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisarmSecuritySystem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisarmSecuritySystemResults"));
        oper.setReturnClass(DisarmSecuritySystemResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisarmSecuritySystemResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReadConsoleDisplay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReadConsoleDisplayResults"));
        oper.setReturnClass(ReadConsoleDisplayResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReadConsoleDisplayResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ConnectToPanel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConnectToPanelResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "KeyChar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendKeyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OverrideSecurityPanelSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "OverrideSecurityPanelSessionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDeviceInviteToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInviteTokenResults"));
        oper.setReturnClass(DeviceInviteTokenResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetDeviceInviteTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateDoorBellDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "wiFiDoorBellInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfo"), WiFiDoorBellInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "wiFiDoorBellUserInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellUserInfo"), WiFiDoorBellUserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateDoorbellDetailResult"));
        oper.setReturnClass(UpdateDoorbellDetailResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateDoorBellDetailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveDoorbellDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoveDoorbellDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWiFiDoorBellDeviceDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfoResult"));
        oper.setReturnClass(WiFiDoorBellInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiDoorBellDeviceDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertUserMobileDeviceToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ClientApplicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileDeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InsertUserMobileDeviceTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePushSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PushNotificationStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdatePushSubscriptionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveUserMobileDeviceToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileDeviceTokenID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoveUserMobileDeviceTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PauseAllNotifications");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Pause"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PauseAllNotificationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWiFiLockLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "accessToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationsResults"));
        oper.setReturnClass(WiFiLockLocationsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiLockLocationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveWiFiLockDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "wifiLockLocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "wifiLockDevices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWiFiLockInfo"), WiFiLockInfo[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveWiFiLockDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWiFiThermostatLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiLocationsResults"));
        oper.setReturnClass(TCCWiFiLocationsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiThermostatLocationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddDeleteWiFiThermostats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCLocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTCCWiFiDeviceInfo"), TCCWiFiDeviceInfo[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddDeleteWiFiThermostatsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWifiThermostatSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatScheduleResults"));
        oper.setReturnClass(WifiThermostatScheduleResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWifiThermostatScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateWifiThermostatSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSchedulePeriodInfo"), SchedulePeriodInfo[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateWifiThermostatScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestEmergencyAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AccountId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AcKrequired"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TestEmergencyAlertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateSwitchIcon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchIconID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateSwitchIconResults"));
        oper.setReturnClass(UpdateSwitchIconResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateSwitchIconResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateThermostatSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSchedule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSchedule"), ThermostatSchedule.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateThermostatScheduleResults"));
        oper.setReturnClass(UpdateThermostatScheduleResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateThermostatScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThermostatSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatScheduleResults"));
        oper.setReturnClass(ThermostatScheduleResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetThermostatScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteAScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ExecuteASceneResults"));
        oper.setReturnClass(ExecuteASceneResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ExecuteASceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateEditAScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneIconID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsSceneEnabled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Automation_Switch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneSwitch"), SceneSwitch[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitch"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Automation_Thermostat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneThermostat"), SceneThermostat[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Automation_Lock"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneLock"), SceneLock[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CreateEditASceneResults"));
        oper.setReturnClass(CreateEditASceneResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CreateEditASceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteAScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneDeletionResults"));
        oper.setReturnClass(SceneDeletionResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteASceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneDataResults"));
        oper.setReturnClass(SceneDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetASceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSceneList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneListInfo"));
        oper.setReturnClass(SceneListInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSceneListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAutomationDeviceStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationDataResults"));
        oper.setReturnClass(AutomationDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAutomationDeviceStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllAutomationDeviceStatusEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationDataResults_Transitional"));
        oper.setReturnClass(AutomationDataResults_Transitional.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllAutomationDeviceStatusExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAutomationDeviceStatusEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationDataResults_Transitional"));
        oper.setReturnClass(AutomationDataResults_Transitional.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAutomationDeviceStatusExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAutomationLocks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationLockDataResult"));
        oper.setReturnClass(AutomationLockDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAutomationLocksResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ControlALock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockDesiredState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthorizingCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockControlDataResults"));
        oper.setReturnClass(LockControlDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlALockResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ControlAThermostat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentOpModeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatThreshold"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolThreshold"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatModeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatFanModeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatControlDataResults"));
        oper.setReturnClass(ThermostatControlDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlAThermostatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ControlAThermostatEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentOpModeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatThreshold"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolThreshold"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatModeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatFanModeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TempHoldTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatControlDataResults"));
        oper.setReturnClass(ThermostatControlDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlAThermostatExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ControlASwitch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchControlDataResults"));
        oper.setReturnClass(SwitchControlDataResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlASwitchResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SynchronizeSecurityPanel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InstallerCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForceImport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationSyncResults"));
        oper.setReturnClass(AutomationSyncResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizeSecurityPanelResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSyncJobStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "JobID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncJobResult"));
        oper.setReturnClass(SyncJobResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSyncJobStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DisconnectPanel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisconnectPanelResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDoorBellClientID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetDoorBellClientIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetContentConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationResult"));
        oper.setReturnClass(ContentConfigurationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetContentConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveContentConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfiguration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationInfo"), ContentConfigurationInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveContentConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSlideShowPhotos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SlideShowPhotoResult"));
        oper.setReturnClass(SlideShowPhotoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSlideShowPhotosResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSlideShowPhoto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Image"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddSlideShowPhotoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSlideShowPhoto");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSlideShowPhotoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrentWeather");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherResult"));
        oper.setReturnClass(CurrentWeatherResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCurrentWeatherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetForecastWeather");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherResult"));
        oper.setReturnClass(ForecastWeatherResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetForecastWeatherResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDealerMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageResult"));
        oper.setReturnClass(DealerMessageResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetDealerMessagesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateDealerMessageReadState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MessageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateDealerMessageReadStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateEmailAddressInSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValidationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailValidationResult"));
        oper.setReturnClass(EmailValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValidateEmailAddressInSessionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateEmailAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValidationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailValidationResult"));
        oper.setReturnClass(EmailValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValidateEmailAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendEmailValidationDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailValidationResult"));
        oper.setReturnClass(EmailValidationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendEmailValidationDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGPSDevices");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDevicesResult"));
        oper.setReturnClass(GPSDevicesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetGPSDevicesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGPSDeviceLocationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSLocationResult"));
        oper.setReturnClass(GPSLocationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetGPSDeviceLocationDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGPSDeviceGeoFence");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceGeoFenceResult"));
        oper.setReturnClass(GPSDeviceGeoFenceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetGPSDeviceGeoFenceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEnteredGPSGeofences");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceListResult"));
        oper.setReturnClass(GeofenceListResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEnteredGPSGeofencesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendGPSLocateNowMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendGPSLocateNowMessageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SavePhotoForGPSDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Image"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoURLResult"));
        oper.setReturnClass(PhotoURLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SavePhotoForGPSDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveGPSDeviceData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo"), GPSInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveGPSDeviceDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestTWMSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSPopupURLResult"));
        oper.setReturnClass(GPSPopupURLResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RequestTWMSessionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddEditSmartScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartScene"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene"), SmartScene.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddEditSmartSceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSmartSceneList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLong"), long[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "long"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetScenesListResults"));
        oper.setReturnClass(GetScenesListResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartSceneListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSmartScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSmartSceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RunSmartScene");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RunSmartSceneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSmartSceneConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartSceneConfigurationResults"));
        oper.setReturnClass(GetSmartSceneConfigurationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartSceneConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEulaInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsPostLoginEula"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULAResults"));
        oper.setReturnClass(EULAResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEulaInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEulaText");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EulaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULATextResults"));
        oper.setReturnClass(EULATextResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEulaTextResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("signEULA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EulaId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "signEULAResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPreLoginEulaInfo");
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULAResults"));
        oper.setReturnClass(EULAResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPreLoginEulaInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPreLoginEulaText");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EulaID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULATextResults"));
        oper.setReturnClass(EULATextResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPreLoginEulaTextResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddEditSmartAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction"), SmartAction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddEditSmartActionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSmartActionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartActionIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLong"), long[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "long"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "getState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionListResults"));
        oper.setReturnClass(GetSmartActionListResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSmartAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartActionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSmartActionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSmartActionList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartActionIDs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLong"), long[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "long"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSmartActionListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetSmartActionState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartActionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetSmartActionStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[190] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RunSmartAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "smartActionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "userCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RunSmartActionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[191] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSmartActionConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionConfigurationResults"));
        oper.setReturnClass(GetSmartActionConfigurationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[192] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVideoPIRConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRConfigurationResults"));
        oper.setReturnClass(VideoPIRConfigurationResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[193] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVideoPIRLocationDeviceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRListResults"));
        oper.setReturnClass(VideoPIRListResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRLocationDeviceListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[194] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVideoPIRCaptureTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceClassID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRCaptureTypesResults"));
        oper.setReturnClass(VideoPIRCaptureTypesResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRCaptureTypesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[195] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateVideoPIRConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SYSTEM_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VIDEO_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MOTION_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EVENT_Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateVideoPIRConfigurationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[196] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVideoPIREventRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIREventRecordResults"));
        oper.setReturnClass(GetVideoPIREventRecordResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIREventRecordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[197] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TakeVideoPIRSnapshots");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TakeVideoPIRSnapshotsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[198] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVideoPIRDeviceEvents");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateStamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CaptureFilterTypeID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ShowHidden"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdditionalInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRDeviceEventsResults"));
        oper.setReturnClass(GetVideoPIRDeviceEventsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRDeviceEventsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[199] = oper;

    }

    private static void _initOperationDesc21(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWiFiLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationsResults"));
        oper.setReturnClass(WiFiLocationsResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiLocationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[200] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ActivateWiFiDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricUsername"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "lyricLocationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "lyricDevice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLyricDevice"), LyricDevice[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricDevice"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ActivateWiFiDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[201] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WiFiSmartAway");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "active"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "hours"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiSmartAwayResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[202] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveWiFiDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "deviceID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults"));
        oper.setReturnClass(WebMethodResults.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoveWiFiDeviceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[203] = oper;

    }

    public SvcTC2APISoap_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SvcTC2APISoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SvcTC2APISoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AnythingChangedResults");
            cachedSerQNames.add(qName);
            cls = AnythingChangedResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmSecuritySystemResults");
            cachedSerQNames.add(qName);
            cls = ArmSecuritySystemResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCameraFirmwareInfo");
            cachedSerQNames.add(qName);
            cls = CameraFirmwareInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCameraInfo");
            cachedSerQNames.add(qName);
            cls = CameraInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCameraSignalStrength");
            cachedSerQNames.add(qName);
            cls = CameraSignalStrength[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCameraSimple");
            cachedSerQNames.add(qName);
            cls = CameraSimple[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSimple");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSimple");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCameraSubAction");
            cachedSerQNames.add(qName);
            cls = CameraSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfContentPhotoInfo");
            cachedSerQNames.add(qName);
            cls = ContentPhotoInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentPhotoInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentPhotoInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfContentSettingsInfo");
            cachedSerQNames.add(qName);
            cls = ContentSettingsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentSettingsInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentSettingsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCountryInfo");
            cachedSerQNames.add(qName);
            cls = CountryInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCountryStateInfo");
            cachedSerQNames.add(qName);
            cls = CountryStateInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfCountryStateInfoEx");
            cachedSerQNames.add(qName);
            cls = CountryStateInfoEx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfoEx");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfoEx");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDealerMessageInfo");
            cachedSerQNames.add(qName);
            cls = DealerMessageInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDeviceAttribute");
            cachedSerQNames.add(qName);
            cls = DeviceAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAttribute");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDeviceAuthorizingCode");
            cachedSerQNames.add(qName);
            cls = DeviceAuthorizingCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAuthorizingCode");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAuthorizingCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDeviceInfoBasic");
            cachedSerQNames.add(qName);
            cls = DeviceInfoBasic[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDeviceInfoBasic_UserEnabled");
            cachedSerQNames.add(qName);
            cls = DeviceInfoBasic_UserEnabled[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic_UserEnabled");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic_UserEnabled");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfDeviceUserAuthorization");
            cachedSerQNames.add(qName);
            cls = DeviceUserAuthorization[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceUserAuthorization");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceUserAuthorization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEmailInfo");
            cachedSerQNames.add(qName);
            cls = EmailInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEULA");
            cachedSerQNames.add(qName);
            cls = EULA[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULA");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULA");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventClass");
            cachedSerQNames.add(qName);
            cls = EventClass[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventClassInfo");
            cachedSerQNames.add(qName);
            cls = EventClassInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventGroup");
            cachedSerQNames.add(qName);
            cls = EventGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroup");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventModifierInfo");
            cachedSerQNames.add(qName);
            cls = EventModifierInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventNotification");
            cachedSerQNames.add(qName);
            cls = EventNotification[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventRecord");
            cachedSerQNames.add(qName);
            cls = EventRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecord");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventSummaryConfigured");
            cachedSerQNames.add(qName);
            cls = EventSummaryConfigured[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryConfigured");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryConfigured");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventSummaryTimeTriggeredActions");
            cachedSerQNames.add(qName);
            cls = EventSummaryTimeTriggeredActions[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTimeTriggeredActions");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTimeTriggeredActions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventType");
            cachedSerQNames.add(qName);
            cls = EventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfEventTypeInfo");
            cachedSerQNames.add(qName);
            cls = EventTypeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfFilterEventType");
            cachedSerQNames.add(qName);
            cls = FilterEventType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterEventType");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterEventType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfForecastWeatherRecord");
            cachedSerQNames.add(qName);
            cls = ForecastWeatherRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherRecord");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfGeofenceInfo");
            cachedSerQNames.add(qName);
            cls = GeofenceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfGPSInfo");
            cachedSerQNames.add(qName);
            cls = GPSInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfHelpDocs");
            cachedSerQNames.add(qName);
            cls = HelpDocs[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLanguage");
            cachedSerQNames.add(qName);
            cls = Language[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLocationInfoBasic");
            cachedSerQNames.add(qName);
            cls = LocationInfoBasic[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLocationInfoBasic_UserEnabled");
            cachedSerQNames.add(qName);
            cls = LocationInfoBasic_UserEnabled[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic_UserEnabled");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic_UserEnabled");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLocationUserAuthorization");
            cachedSerQNames.add(qName);
            cls = LocationUserAuthorization[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationUserAuthorization");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationUserAuthorization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLockInfo");
            cachedSerQNames.add(qName);
            cls = LockInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLockInfo_Transitional");
            cachedSerQNames.add(qName);
            cls = LockInfo_Transitional[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLockSubAction");
            cachedSerQNames.add(qName);
            cls = LockSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLong");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "long");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfLyricDevice");
            cachedSerQNames.add(qName);
            cls = LyricDevice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricDevice");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricDevice");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfMobileCarrier");
            cachedSerQNames.add(qName);
            cls = MobileCarrier[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarrier");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarrier");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfModeInfo");
            cachedSerQNames.add(qName);
            cls = ModeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfModule");
            cachedSerQNames.add(qName);
            cls = Module[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Module");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Module");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNewsRegionsInfo");
            cachedSerQNames.add(qName);
            cls = NewsRegionsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewsRegionsInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewsRegionsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationConditionalState");
            cachedSerQNames.add(qName);
            cls = NotificationConditionalState[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalState");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationListBaseInfo");
            cachedSerQNames.add(qName);
            cls = NotificationListBaseInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationListUserInfo");
            cachedSerQNames.add(qName);
            cls = NotificationListUserInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListUserInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListUserInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationMethod");
            cachedSerQNames.add(qName);
            cls = NotificationMethod[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethod");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethod");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfNotificationSchedule");
            cachedSerQNames.add(qName);
            cls = NotificationSchedule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationSchedule");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationSchedule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfPanelConnectionStatusInfo");
            cachedSerQNames.add(qName);
            cls = PanelConnectionStatusInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfParameter");
            cachedSerQNames.add(qName);
            cls = Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Parameter");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfPartitionInfo");
            cachedSerQNames.add(qName);
            cls = PartitionInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfPartnerInfo");
            cachedSerQNames.add(qName);
            cls = PartnerInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfPhoneInfo");
            cachedSerQNames.add(qName);
            cls = PhoneInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneInfo");
            cachedSerQNames.add(qName);
            cls = SceneInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneLock");
            cachedSerQNames.add(qName);
            cls = SceneLock[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneLockSubAction");
            cachedSerQNames.add(qName);
            cls = SceneLockSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneStatusLock");
            cachedSerQNames.add(qName);
            cls = SceneStatusLock[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusLock");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusLock");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneStatusSwitch");
            cachedSerQNames.add(qName);
            cls = SceneStatusSwitch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusSwitch");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusSwitch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneStatusThermostat");
            cachedSerQNames.add(qName);
            cls = SceneStatusThermostat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusThermostat");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusThermostat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneSwitch");
            cachedSerQNames.add(qName);
            cls = SceneSwitch[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitch");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitch");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneSwitchSubAction");
            cachedSerQNames.add(qName);
            cls = SceneSwitchSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneThermostat");
            cachedSerQNames.add(qName);
            cls = SceneThermostat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneThermostatSubAction");
            cachedSerQNames.add(qName);
            cls = SceneThermostatSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSceneTrigger");
            cachedSerQNames.add(qName);
            cls = SceneTrigger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTrigger");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTrigger");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfScheduleInfo");
            cachedSerQNames.add(qName);
            cls = ScheduleInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSchedulePeriodInfo");
            cachedSerQNames.add(qName);
            cls = SchedulePeriodInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSecuritySubAction");
            cachedSerQNames.add(qName);
            cls = SecuritySubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSentToPanelEvents");
            cachedSerQNames.add(qName);
            cls = SentToPanelEvents[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSmartAction");
            cachedSerQNames.add(qName);
            cls = SmartAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSmartScene");
            cachedSerQNames.add(qName);
            cls = SmartScene[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSwitchInfo");
            cachedSerQNames.add(qName);
            cls = SwitchInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSwitchSubAction");
            cachedSerQNames.add(qName);
            cls = SwitchSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfSyncStatus");
            cachedSerQNames.add(qName);
            cls = SyncStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTCCWiFiDeviceInfo");
            cachedSerQNames.add(qName);
            cls = TCCWiFiDeviceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTCCWiFiLocationInfo");
            cachedSerQNames.add(qName);
            cls = TCCWiFiLocationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiLocationInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiLocationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfThermostatInfo");
            cachedSerQNames.add(qName);
            cls = ThermostatInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfThermostatSubAction");
            cachedSerQNames.add(qName);
            cls = ThermostatSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTimePeriodInfo");
            cachedSerQNames.add(qName);
            cls = TimePeriodInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriodInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriodInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTimeTriggeredAction");
            cachedSerQNames.add(qName);
            cls = TimeTriggeredAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfTimeZoneData");
            cachedSerQNames.add(qName);
            cls = TimeZoneData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneData");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfUserFeatureCacheInfo");
            cachedSerQNames.add(qName);
            cls = UserFeatureCacheInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureCacheInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureCacheInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfUserListDetail");
            cachedSerQNames.add(qName);
            cls = UserListDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListDetail");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListDetail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfUsers");
            cachedSerQNames.add(qName);
            cls = Users[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Users");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Users");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfVideoPIREvent");
            cachedSerQNames.add(qName);
            cls = VideoPIREvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfVideoPIREventCaptureType");
            cachedSerQNames.add(qName);
            cls = VideoPIREventCaptureType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventCaptureType");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventCaptureType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfVideoPIRInfo");
            cachedSerQNames.add(qName);
            cls = VideoPIRInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfVideoTrigger");
            cachedSerQNames.add(qName);
            cls = VideoTrigger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfVideoURL");
            cachedSerQNames.add(qName);
            cls = VideoURL[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoURL");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoURL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWiFiDeviceResponse");
            cachedSerQNames.add(qName);
            cls = WiFiDeviceResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDeviceResponse");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDeviceResponse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWiFiLocationInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLocationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWiFiLockInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLockInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWiFiLockLocationInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLockLocationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWifiThermostatSubAction");
            cachedSerQNames.add(qName);
            cls = WifiThermostatSubAction[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSubAction");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSubAction");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfWiFiWeatherResult");
            cachedSerQNames.add(qName);
            cls = WiFiWeatherResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResult");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfZoneInfo");
            cachedSerQNames.add(qName);
            cls = ZoneInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfZoneStatusInfo");
            cachedSerQNames.add(qName);
            cls = ZoneStatusInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfZoneStatusInfoEx");
            cachedSerQNames.add(qName);
            cls = ZoneStatusInfoEx[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfoEx");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfoEx");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArrayOfZoneWithBypassInfo");
            cachedSerQNames.add(qName);
            cls = ZoneWithBypassInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneWithBypassInfo");
            qName2 = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneWithBypassInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateLoginResults");
            cachedSerQNames.add(qName);
            cls = AuthenticateLoginResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationDataResults");
            cachedSerQNames.add(qName);
            cls = AutomationDataResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationDataResults_Transitional");
            cachedSerQNames.add(qName);
            cls = AutomationDataResults_Transitional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationInfo");
            cachedSerQNames.add(qName);
            cls = AutomationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationInfo_Transitional");
            cachedSerQNames.add(qName);
            cls = AutomationInfo_Transitional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationLockDataResult");
            cachedSerQNames.add(qName);
            cls = AutomationLockDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationSyncResults");
            cachedSerQNames.add(qName);
            cls = AutomationSyncResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AwayEndDateFormat");
            cachedSerQNames.add(qName);
            cls = AwayEndDateFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraBatteryStatusResult");
            cachedSerQNames.add(qName);
            cls = CameraBatteryStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraConfigurationResults");
            cachedSerQNames.add(qName);
            cls = CameraConfigurationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraConfigurationResults2");
            cachedSerQNames.add(qName);
            cls = CameraConfigurationResults2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareInfo");
            cachedSerQNames.add(qName);
            cls = CameraFirmwareInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareList");
            cachedSerQNames.add(qName);
            cls = CameraFirmwareList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareListResult");
            cachedSerQNames.add(qName);
            cls = CameraFirmwareListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInfo");
            cachedSerQNames.add(qName);
            cls = CameraInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraInformationResults");
            cachedSerQNames.add(qName);
            cls = CameraInformationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraIOStateResult");
            cachedSerQNames.add(qName);
            cls = CameraIOStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraList");
            cachedSerQNames.add(qName);
            cls = CameraList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraListResult");
            cachedSerQNames.add(qName);
            cls = CameraListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraPositionResult");
            cachedSerQNames.add(qName);
            cls = CameraPositionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength");
            cachedSerQNames.add(qName);
            cls = CameraSignalStrength.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrengthResults");
            cachedSerQNames.add(qName);
            cls = CameraSignalStrengthResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSimple");
            cachedSerQNames.add(qName);
            cls = CameraSimple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraStateResult");
            cachedSerQNames.add(qName);
            cls = CameraStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubAction");
            cachedSerQNames.add(qName);
            cls = CameraSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfigStreamModeResult");
            cachedSerQNames.add(qName);
            cls = ConfigStreamModeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfiguredEventResult");
            cachedSerQNames.add(qName);
            cls = ConfiguredEventResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConsoleDisplayInfo");
            cachedSerQNames.add(qName);
            cls = ConsoleDisplayInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationInfo");
            cachedSerQNames.add(qName);
            cls = ContentConfigurationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationResult");
            cachedSerQNames.add(qName);
            cls = ContentConfigurationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentPhotoInfo");
            cachedSerQNames.add(qName);
            cls = ContentPhotoInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentSettingsInfo");
            cachedSerQNames.add(qName);
            cls = ContentSettingsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryInfo");
            cachedSerQNames.add(qName);
            cls = CountryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryListResult");
            cachedSerQNames.add(qName);
            cls = CountryListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfo");
            cachedSerQNames.add(qName);
            cls = CountryStateInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateInfoEx");
            cachedSerQNames.add(qName);
            cls = CountryStateInfoEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateListResult");
            cachedSerQNames.add(qName);
            cls = CountryStateListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryStateListResultEx");
            cachedSerQNames.add(qName);
            cls = CountryStateListResultEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CreateEditASceneResults");
            cachedSerQNames.add(qName);
            cls = CreateEditASceneResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherInfo");
            cachedSerQNames.add(qName);
            cls = CurrentWeatherInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherRecord");
            cachedSerQNames.add(qName);
            cls = CurrentWeatherRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentWeatherResult");
            cachedSerQNames.add(qName);
            cls = CurrentWeatherResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmInfo");
            cachedSerQNames.add(qName);
            cls = CustomArmInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSecuritySystemResults");
            cachedSerQNames.add(qName);
            cls = CustomArmSecuritySystemResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSettingsResult");
            cachedSerQNames.add(qName);
            cls = CustomArmSettingsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateTimeOffset");
            cachedSerQNames.add(qName);
            cls = DateTimeOffset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageInfo");
            cachedSerQNames.add(qName);
            cls = DealerMessageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageResult");
            cachedSerQNames.add(qName);
            cls = DealerMessageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserInfoResults");
            cachedSerQNames.add(qName);
            cls = DeleteUserInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserResults");
            cachedSerQNames.add(qName);
            cls = DeleteUserResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAttribute");
            cachedSerQNames.add(qName);
            cls = DeviceAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceAuthorizingCode");
            cachedSerQNames.add(qName);
            cls = DeviceAuthorizingCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfo");
            cachedSerQNames.add(qName);
            cls = DeviceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic");
            cachedSerQNames.add(qName);
            cls = DeviceInfoBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic_UserEnabled");
            cachedSerQNames.add(qName);
            cls = DeviceInfoBasic_UserEnabled.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInviteTokenResults");
            cachedSerQNames.add(qName);
            cls = DeviceInviteTokenResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceUserAuthorization");
            cachedSerQNames.add(qName);
            cls = DeviceUserAuthorization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUserResults");
            cachedSerQNames.add(qName);
            cls = DisableEnableUserResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisarmSecuritySystemResults");
            cachedSerQNames.add(qName);
            cls = DisarmSecuritySystemResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailInfo");
            cachedSerQNames.add(qName);
            cls = EmailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailValidationResult");
            cachedSerQNames.add(qName);
            cls = EmailValidationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULA");
            cachedSerQNames.add(qName);
            cls = EULA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULAResults");
            cachedSerQNames.add(qName);
            cls = EULAResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULAText");
            cachedSerQNames.add(qName);
            cls = EULAText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EULATextResults");
            cachedSerQNames.add(qName);
            cls = EULATextResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass");
            cachedSerQNames.add(qName);
            cls = EventClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassInfo");
            cachedSerQNames.add(qName);
            cls = EventClassInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventGroup");
            cachedSerQNames.add(qName);
            cls = EventGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventMetaDataExResult");
            cachedSerQNames.add(qName);
            cls = EventMetaDataExResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventMetaDataResults");
            cachedSerQNames.add(qName);
            cls = EventMetaDataResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventModifierInfo");
            cachedSerQNames.add(qName);
            cls = EventModifierInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventNotification");
            cachedSerQNames.add(qName);
            cls = EventNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecord");
            cachedSerQNames.add(qName);
            cls = EventRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventsResult");
            cachedSerQNames.add(qName);
            cls = EventsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryConfigured");
            cachedSerQNames.add(qName);
            cls = EventSummaryConfigured.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTimeTriggeredActions");
            cachedSerQNames.add(qName);
            cls = EventSummaryTimeTriggeredActions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventSummaryTitle");
            cachedSerQNames.add(qName);
            cls = EventSummaryTitle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType");
            cachedSerQNames.add(qName);
            cls = EventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeFilterResult");
            cachedSerQNames.add(qName);
            cls = EventTypeFilterResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeInfo");
            cachedSerQNames.add(qName);
            cls = EventTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ExecuteASceneResults");
            cachedSerQNames.add(qName);
            cls = ExecuteASceneResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterEventType");
            cachedSerQNames.add(qName);
            cls = FilterEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherInfo");
            cachedSerQNames.add(qName);
            cls = ForecastWeatherInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherRecord");
            cachedSerQNames.add(qName);
            cls = ForecastWeatherRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ForecastWeatherResult");
            cachedSerQNames.add(qName);
            cls = ForecastWeatherResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceInfo");
            cachedSerQNames.add(qName);
            cls = GeofenceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceListResult");
            cachedSerQNames.add(qName);
            cls = GeofenceListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationListsResults");
            cachedSerQNames.add(qName);
            cls = GetAllNotificationListsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetScenesListResults");
            cachedSerQNames.add(qName);
            cls = GetScenesListResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionConfigurationResults");
            cachedSerQNames.add(qName);
            cls = GetSmartActionConfigurationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionListResults");
            cachedSerQNames.add(qName);
            cls = GetSmartActionListResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartSceneConfigurationResults");
            cachedSerQNames.add(qName);
            cls = GetSmartSceneConfigurationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRDeviceEventsResults");
            cachedSerQNames.add(qName);
            cls = GetVideoPIRDeviceEventsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIREventRecordResults");
            cachedSerQNames.add(qName);
            cls = GetVideoPIREventRecordResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZoneInfoResults");
            cachedSerQNames.add(qName);
            cls = GetZoneInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateExResult");
            cachedSerQNames.add(qName);
            cls = GetZonesListInStateExResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateResult");
            cachedSerQNames.add(qName);
            cls = GetZonesListInStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceGeoFenceData");
            cachedSerQNames.add(qName);
            cls = GPSDeviceGeoFenceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceGeoFenceResult");
            cachedSerQNames.add(qName);
            cls = GPSDeviceGeoFenceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDevicesResult");
            cachedSerQNames.add(qName);
            cls = GPSDevicesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo");
            cachedSerQNames.add(qName);
            cls = GPSInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSLocationInfo");
            cachedSerQNames.add(qName);
            cls = GPSLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSLocationResult");
            cachedSerQNames.add(qName);
            cls = GPSLocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSPopupURLResult");
            cachedSerQNames.add(qName);
            cls = GPSPopupURLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs");
            cachedSerQNames.add(qName);
            cls = HelpDocs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaConfigInfo");
            cachedSerQNames.add(qName);
            cls = InterfaceSchemaConfigInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaInfo");
            cachedSerQNames.add(qName);
            cls = InterfaceSchemaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaInfoEx");
            cachedSerQNames.add(qName);
            cls = InterfaceSchemaInfoEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaResults");
            cachedSerQNames.add(qName);
            cls = InterfaceSchemaResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaResultsEx");
            cachedSerQNames.add(qName);
            cls = InterfaceSchemaResultsEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsUserNameValidResults");
            cachedSerQNames.add(qName);
            cls = IsUserNameValidResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language");
            cachedSerQNames.add(qName);
            cls = Language.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ListHelpDocsResults");
            cachedSerQNames.add(qName);
            cls = ListHelpDocsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfo");
            cachedSerQNames.add(qName);
            cls = LocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic");
            cachedSerQNames.add(qName);
            cls = LocationInfoBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic_UserEnabled");
            cachedSerQNames.add(qName);
            cls = LocationInfoBasic_UserEnabled.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoSimple");
            cachedSerQNames.add(qName);
            cls = LocationInfoSimple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationResult");
            cachedSerQNames.add(qName);
            cls = LocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationSimpleResult");
            cachedSerQNames.add(qName);
            cls = LocationSimpleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationUserAuthorization");
            cachedSerQNames.add(qName);
            cls = LocationUserAuthorization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockControlDataResults");
            cachedSerQNames.add(qName);
            cls = LockControlDataResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo");
            cachedSerQNames.add(qName);
            cls = LockInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional");
            cachedSerQNames.add(qName);
            cls = LockInfo_Transitional.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubAction");
            cachedSerQNames.add(qName);
            cls = LockSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricDevice");
            cachedSerQNames.add(qName);
            cls = LyricDevice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MediaServerConfigurationResults");
            cachedSerQNames.add(qName);
            cls = MediaServerConfigurationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MethodResults");
            cachedSerQNames.add(qName);
            cls = MethodResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MobileCarrier");
            cachedSerQNames.add(qName);
            cls = MobileCarrier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo");
            cachedSerQNames.add(qName);
            cls = ModeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Module");
            cachedSerQNames.add(qName);
            cls = Module.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewsRegionsInfo");
            cachedSerQNames.add(qName);
            cls = NewsRegionsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotesResult");
            cachedSerQNames.add(qName);
            cls = NotesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalState");
            cachedSerQNames.add(qName);
            cls = NotificationConditionalState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalStateResult");
            cachedSerQNames.add(qName);
            cls = NotificationConditionalStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationInfoBase");
            cachedSerQNames.add(qName);
            cls = NotificationInfoBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo");
            cachedSerQNames.add(qName);
            cls = NotificationListBaseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListUserInfo");
            cachedSerQNames.add(qName);
            cls = NotificationListUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethod");
            cachedSerQNames.add(qName);
            cls = NotificationMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethodResults");
            cachedSerQNames.add(qName);
            cls = NotificationMethodResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationPauseResult");
            cachedSerQNames.add(qName);
            cls = NotificationPauseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationSchedule");
            cachedSerQNames.add(qName);
            cls = NotificationSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationScheduleResult");
            cachedSerQNames.add(qName);
            cls = NotificationScheduleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelBaseInfo");
            cachedSerQNames.add(qName);
            cls = PanelBaseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelBaseInfoEx");
            cachedSerQNames.add(qName);
            cls = PanelBaseInfoEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfo");
            cachedSerQNames.add(qName);
            cls = PanelConnectionStatusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfoResults");
            cachedSerQNames.add(qName);
            cls = PanelConnectionStatusInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusInfo");
            cachedSerQNames.add(qName);
            cls = PanelMetadataAndStatusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusInfoEx");
            cachedSerQNames.add(qName);
            cls = PanelMetadataAndStatusInfoEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusResults");
            cachedSerQNames.add(qName);
            cls = PanelMetadataAndStatusResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelMetadataAndStatusResultsEx");
            cachedSerQNames.add(qName);
            cls = PanelMetadataAndStatusResultsEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusInfo");
            cachedSerQNames.add(qName);
            cls = PanelStatusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusInfoEx");
            cachedSerQNames.add(qName);
            cls = PanelStatusInfoEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResults");
            cachedSerQNames.add(qName);
            cls = PanelStatusResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResultsEx");
            cachedSerQNames.add(qName);
            cls = PanelStatusResultsEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Parameter");
            cachedSerQNames.add(qName);
            cls = Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionInfo");
            cachedSerQNames.add(qName);
            cls = PartitionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerInfo");
            cachedSerQNames.add(qName);
            cls = PartnerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerListResult");
            cachedSerQNames.add(qName);
            cls = PartnerListResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneInfo");
            cachedSerQNames.add(qName);
            cls = PhoneInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoURLResult");
            cachedSerQNames.add(qName);
            cls = PhotoURLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReadConsoleDisplayResults");
            cachedSerQNames.add(qName);
            cls = ReadConsoleDisplayResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoteAuthenticateLoginResults");
            cachedSerQNames.add(qName);
            cls = RemoteAuthenticateLoginResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveCreateUserInfoResults");
            cachedSerQNames.add(qName);
            cls = SaveCreateUserInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserResults");
            cachedSerQNames.add(qName);
            cls = SaveUserResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneAutomationInfo");
            cachedSerQNames.add(qName);
            cls = SceneAutomationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneDataResults");
            cachedSerQNames.add(qName);
            cls = SceneDataResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneDeletionResults");
            cachedSerQNames.add(qName);
            cls = SceneDeletionResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneInfo");
            cachedSerQNames.add(qName);
            cls = SceneInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneListInfo");
            cachedSerQNames.add(qName);
            cls = SceneListInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLock");
            cachedSerQNames.add(qName);
            cls = SceneLock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockSubAction");
            cachedSerQNames.add(qName);
            cls = SceneLockSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusLock");
            cachedSerQNames.add(qName);
            cls = SceneStatusLock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusSwitch");
            cachedSerQNames.add(qName);
            cls = SceneStatusSwitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusThermostat");
            cachedSerQNames.add(qName);
            cls = SceneStatusThermostat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScenesTimeTriggeredAction");
            cachedSerQNames.add(qName);
            cls = ScenesTimeTriggeredAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScenesTriggerEvent");
            cachedSerQNames.add(qName);
            cls = ScenesTriggerEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitch");
            cachedSerQNames.add(qName);
            cls = SceneSwitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubAction");
            cachedSerQNames.add(qName);
            cls = SceneSwitchSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostat");
            cachedSerQNames.add(qName);
            cls = SceneThermostat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubAction");
            cachedSerQNames.add(qName);
            cls = SceneThermostatSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneTrigger");
            cachedSerQNames.add(qName);
            cls = SceneTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleInfo");
            cachedSerQNames.add(qName);
            cls = ScheduleInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SchedulePeriodInfo");
            cachedSerQNames.add(qName);
            cls = SchedulePeriodInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubAction");
            cachedSerQNames.add(qName);
            cls = SecuritySubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SentToPanelEvents");
            cachedSerQNames.add(qName);
            cls = SentToPanelEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionDetailResults");
            cachedSerQNames.add(qName);
            cls = SessionDetailResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SlideShowConfigInfo");
            cachedSerQNames.add(qName);
            cls = SlideShowConfigInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SlideShowPhotoResult");
            cachedSerQNames.add(qName);
            cls = SlideShowPhotoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction");
            cachedSerQNames.add(qName);
            cls = SmartAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionConfiguration");
            cachedSerQNames.add(qName);
            cls = SmartActionConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionSchedule");
            cachedSerQNames.add(qName);
            cls = SmartActionSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionSubAction");
            cachedSerQNames.add(qName);
            cls = SmartActionSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionTriggerEvent");
            cachedSerQNames.add(qName);
            cls = SmartActionTriggerEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAwayValues");
            cachedSerQNames.add(qName);
            cls = SmartAwayValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene");
            cachedSerQNames.add(qName);
            cls = SmartScene.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneConfiguration");
            cachedSerQNames.add(qName);
            cls = SmartSceneConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneSubAction");
            cachedSerQNames.add(qName);
            cls = SmartSceneSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SMSEmailCarrierResults");
            cachedSerQNames.add(qName);
            cls = SMSEmailCarrierResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryConfiguredEventString");
            cachedSerQNames.add(qName);
            cls = SummaryConfiguredEventString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SummaryConfiguredEventXML");
            cachedSerQNames.add(qName);
            cls = SummaryConfiguredEventXML.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchControlDataResults");
            cachedSerQNames.add(qName);
            cls = SwitchControlDataResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo");
            cachedSerQNames.add(qName);
            cls = SwitchInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubAction");
            cachedSerQNames.add(qName);
            cls = SwitchSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizeUserResults");
            cachedSerQNames.add(qName);
            cls = SynchronizeUserResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncJobResult");
            cachedSerQNames.add(qName);
            cls = SyncJobResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus");
            cachedSerQNames.add(qName);
            cls = SyncStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCThermostatdata");
            cachedSerQNames.add(qName);
            cls = TCCThermostatdata.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiDeviceInfo");
            cachedSerQNames.add(qName);
            cls = TCCWiFiDeviceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiLocationInfo");
            cachedSerQNames.add(qName);
            cls = TCCWiFiLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCWiFiLocationsResults");
            cachedSerQNames.add(qName);
            cls = TCCWiFiLocationsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatControlDataResults");
            cachedSerQNames.add(qName);
            cls = ThermostatControlDataResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo");
            cachedSerQNames.add(qName);
            cls = ThermostatInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatPartnerRefData");
            cachedSerQNames.add(qName);
            cls = ThermostatPartnerRefData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatResponse");
            cachedSerQNames.add(qName);
            cls = ThermostatResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSchedule");
            cachedSerQNames.add(qName);
            cls = ThermostatSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatScheduleResults");
            cachedSerQNames.add(qName);
            cls = ThermostatScheduleResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubAction");
            cachedSerQNames.add(qName);
            cls = ThermostatSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriodInfo");
            cachedSerQNames.add(qName);
            cls = TimePeriodInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeSpan");
            cachedSerQNames.add(qName);
            cls = TimeSpan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction");
            cachedSerQNames.add(qName);
            cls = TimeTriggeredAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneData");
            cachedSerQNames.add(qName);
            cls = TimeZoneData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZonesResult");
            cachedSerQNames.add(qName);
            cls = TimeZonesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationListResults");
            cachedSerQNames.add(qName);
            cls = TransactNotificationListResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateDoorbellDetailResult");
            cachedSerQNames.add(qName);
            cls = UpdateDoorbellDetailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateSwitchIconResults");
            cachedSerQNames.add(qName);
            cls = UpdateSwitchIconResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateThermostatScheduleResults");
            cachedSerQNames.add(qName);
            cls = UpdateThermostatScheduleResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserConfigurationResults");
            cachedSerQNames.add(qName);
            cls = UserConfigurationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailResults");
            cachedSerQNames.add(qName);
            cls = UserDetailResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetails");
            cachedSerQNames.add(qName);
            cls = UserDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailsEx");
            cachedSerQNames.add(qName);
            cls = UserDetailsEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetailsExResults");
            cachedSerQNames.add(qName);
            cls = UserDetailsExResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureCacheInfo");
            cachedSerQNames.add(qName);
            cls = UserFeatureCacheInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfo");
            cachedSerQNames.add(qName);
            cls = UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfoBasic");
            cachedSerQNames.add(qName);
            cls = UserInfoBasic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfoResults");
            cachedSerQNames.add(qName);
            cls = UserInfoResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListDetail");
            cachedSerQNames.add(qName);
            cls = UserListDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListResults");
            cachedSerQNames.add(qName);
            cls = UserListResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserManagementOptions");
            cachedSerQNames.add(qName);
            cls = UserManagementOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserNameInfo");
            cachedSerQNames.add(qName);
            cls = UserNameInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Users");
            cachedSerQNames.add(qName);
            cls = Users.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValueUnitType");
            cachedSerQNames.add(qName);
            cls = ValueUnitType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoFileURLResult");
            cachedSerQNames.add(qName);
            cls = VideoFileURLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRCaptureTypesResults");
            cachedSerQNames.add(qName);
            cls = VideoPIRCaptureTypesResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRConfigurationResults");
            cachedSerQNames.add(qName);
            cls = VideoPIRConfigurationResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRDeviceEventInfo");
            cachedSerQNames.add(qName);
            cls = VideoPIRDeviceEventInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent");
            cachedSerQNames.add(qName);
            cls = VideoPIREvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventCaptureType");
            cachedSerQNames.add(qName);
            cls = VideoPIREventCaptureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRInfo");
            cachedSerQNames.add(qName);
            cls = VideoPIRInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRListResults");
            cachedSerQNames.add(qName);
            cls = VideoPIRListResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoTrigger");
            cachedSerQNames.add(qName);
            cls = VideoTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoURL");
            cachedSerQNames.add(qName);
            cls = VideoURL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WAPClientsListResults");
            cachedSerQNames.add(qName);
            cls = WAPClientsListResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WebMethodResults");
            cachedSerQNames.add(qName);
            cls = WebMethodResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDeviceResponse");
            cachedSerQNames.add(qName);
            cls = WiFiDeviceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfo");
            cachedSerQNames.add(qName);
            cls = WiFiDoorBellInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfoResult");
            cachedSerQNames.add(qName);
            cls = WiFiDoorBellInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellUserInfo");
            cachedSerQNames.add(qName);
            cls = WiFiDoorBellUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLocationsResults");
            cachedSerQNames.add(qName);
            cls = WiFiLocationsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockConfigInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLockConfigInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLockInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationInfo");
            cachedSerQNames.add(qName);
            cls = WiFiLockLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationsResults");
            cachedSerQNames.add(qName);
            cls = WiFiLockLocationsResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiThermostatConfigInfo");
            cachedSerQNames.add(qName);
            cls = WiFiThermostatConfigInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSchedule");
            cachedSerQNames.add(qName);
            cls = WifiThermostatSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatScheduleResults");
            cachedSerQNames.add(qName);
            cls = WifiThermostatScheduleResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSubAction");
            cachedSerQNames.add(qName);
            cls = WifiThermostatSubAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResponse");
            cachedSerQNames.add(qName);
            cls = WiFiWeatherResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherResult");
            cachedSerQNames.add(qName);
            cls = WiFiWeatherResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneBypassResults");
            cachedSerQNames.add(qName);
            cls = ZoneBypassResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo");
            cachedSerQNames.add(qName);
            cls = ZoneInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfo");
            cachedSerQNames.add(qName);
            cls = ZoneStatusInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusInfoEx");
            cachedSerQNames.add(qName);
            cls = ZoneStatusInfoEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusList");
            cachedSerQNames.add(qName);
            cls = ZoneStatusList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusListEx");
            cachedSerQNames.add(qName);
            cls = ZoneStatusListEx.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneWithBypassInfo");
            cachedSerQNames.add(qName);
            cls = ZoneWithBypassInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public WebMethodResults checkSecurityPanelLastCommandState(String sessionID, long locationID, long deviceID, int commandCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/CheckSecurityPanelLastCommandState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CheckSecurityPanelLastCommandState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID), new Integer(commandCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelConnectionStatusInfoResults getPanelConnectionStatusInfo(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelConnectionStatusInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelConnectionStatusInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelConnectionStatusInfoResults) _resp;
            } catch (Exception _exception) {
                return (PanelConnectionStatusInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, PanelConnectionStatusInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetZoneInfoResults getIndividualZoneDetails(String sessionID, long locationID, int[] zoneIDs, long deviceID, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetIndividualZoneDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetIndividualZoneDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), zoneIDs, new Long(deviceID), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetZoneInfoResults) _resp;
            } catch (Exception _exception) {
                return (GetZoneInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetZoneInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserConfigurationResults getUsers(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetUsers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserConfigurationResults) _resp;
            } catch (Exception _exception) {
                return (UserConfigurationResults) org.apache.axis.utils.JavaUtils.convert(_resp, UserConfigurationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeleteUserInfoResults deleteUserInfo(String sessionID, long userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteUserInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeleteUserInfoResults) _resp;
            } catch (Exception _exception) {
                return (DeleteUserInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, DeleteUserInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DisableEnableUserResults disableEnableUser(String sessionID, long userId, boolean stateToSet) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DisableEnableUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userId), new Boolean(stateToSet)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DisableEnableUserResults) _resp;
            } catch (Exception _exception) {
                return (DisableEnableUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, DisableEnableUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateEula(String sessionID, long userId, int eula) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateEula");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEula"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userId), new Integer(eula)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserInfoResults getUserInfo(String sessionID, long userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetUserInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserInfoResults) _resp;
            } catch (Exception _exception) {
                return (UserInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, UserInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeleteUserResults deleteUser(String sessionID, long userId, int userTypeID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userId), new Integer(userTypeID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeleteUserResults) _resp;
            } catch (Exception _exception) {
                return (DeleteUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, DeleteUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DisableEnableUserResults disableEnableUserEx(String sessionID, long userId, int userTypeId, boolean stateToSet, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DisableEnableUserEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisableEnableUserEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userId), new Integer(userTypeId), new Boolean(stateToSet), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DisableEnableUserResults) _resp;
            } catch (Exception _exception) {
                return (DisableEnableUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, DisableEnableUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserDetailResults getUserDetails(String sessionID, long manageUserId, int userTypeId, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetUserDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUserDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(manageUserId), new Integer(userTypeId), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserDetailResults) _resp;
            } catch (Exception _exception) {
                return (UserDetailResults) org.apache.axis.utils.JavaUtils.convert(_resp, UserDetailResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserDetailsExResults getAllUserDetailsEx(String sessionID, long manageUserId, int userTypeId, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllUserDetailsEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllUserDetailsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(manageUserId), new Integer(userTypeId), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserDetailsExResults) _resp;
            } catch (Exception _exception) {
                return (UserDetailsExResults) org.apache.axis.utils.JavaUtils.convert(_resp, UserDetailsExResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserDetailsExResults getUserDetailsEx(String sessionID, long manageUserId, int userTypeId, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetUserDetailsEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUserDetailsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(manageUserId), new Integer(userTypeId), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserDetailsExResults) _resp;
            } catch (Exception _exception) {
                return (UserDetailsExResults) org.apache.axis.utils.JavaUtils.convert(_resp, UserDetailsExResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SaveUserResults saveUser(String sessionID, UserDetails userDetails, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, userDetails, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SaveUserResults) _resp;
            } catch (Exception _exception) {
                return (SaveUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, SaveUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SaveUserResults saveUserEx(String sessionID, UserDetailsEx userDetails, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveUserEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, userDetails, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SaveUserResults) _resp;
            } catch (Exception _exception) {
                return (SaveUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, SaveUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SaveUserResults saveMasterUserCode(String sessionID, long manageUserID, long deviceID, String panelUserCode, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveMasterUserCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveMasterUserCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(manageUserID), new Long(deviceID), panelUserCode, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SaveUserResults) _resp;
            } catch (Exception _exception) {
                return (SaveUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, SaveUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UserListResults getUsersEx(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetUsersEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetUsersEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UserListResults) _resp;
            } catch (Exception _exception) {
                return (UserListResults) org.apache.axis.utils.JavaUtils.convert(_resp, UserListResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SynchronizeUserResults synchronizePanelUser(String sessionID, DeviceAuthorizingCode[] deviceList, boolean statusOnly, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SynchronizePanelUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizePanelUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, deviceList, new Boolean(statusOnly), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SynchronizeUserResults) _resp;
            } catch (Exception _exception) {
                return (SynchronizeUserResults) org.apache.axis.utils.JavaUtils.convert(_resp, SynchronizeUserResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SMSEmailCarrierResults getSMSEmailCarriers(String sessionID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSMSEmailCarriers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSMSEmailCarriers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SMSEmailCarrierResults) _resp;
            } catch (Exception _exception) {
                return (SMSEmailCarrierResults) org.apache.axis.utils.JavaUtils.convert(_resp, SMSEmailCarrierResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public NotificationMethodResults getNotificationMethods(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetNotificationMethods");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetNotificationMethods"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NotificationMethodResults) _resp;
            } catch (Exception _exception) {
                return (NotificationMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, NotificationMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public IsUserNameValidResults isUserNameValid(String sessionID, UserNameInfo userNameInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/IsUserNameValid");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsUserNameValid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, userNameInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (IsUserNameValidResults) _resp;
            } catch (Exception _exception) {
                return (IsUserNameValidResults) org.apache.axis.utils.JavaUtils.convert(_resp, IsUserNameValidResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SaveCreateUserInfoResults saveCreateUserInfo(String sessionID, UserInfo userInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveCreateUserInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveCreateUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, userInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SaveCreateUserInfoResults) _resp;
            } catch (Exception _exception) {
                return (SaveCreateUserInfoResults) org.apache.axis.utils.JavaUtils.convert(_resp, SaveCreateUserInfoResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults saveUserClientPreferences(String sessionID, String preferencesString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveUserClientPreferences");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveUserClientPreferences"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, preferencesString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ListHelpDocsResults getHelpDocuments(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetHelpDocuments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetHelpDocuments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ListHelpDocsResults) _resp;
            } catch (Exception _exception) {
                return (ListHelpDocsResults) org.apache.axis.utils.JavaUtils.convert(_resp, ListHelpDocsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateUserLanguage(String sessionID, String localeCode, long languageID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateUserLanguage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateUserLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, localeCode, new Long(languageID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RemoteAuthenticateLoginResults remoteAuthenticateUserLogin(String userName, String password, int remoteApplicationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RemoteAuthenticateUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoteAuthenticateUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userName, password, new Integer(remoteApplicationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RemoteAuthenticateLoginResults) _resp;
            } catch (Exception _exception) {
                return (RemoteAuthenticateLoginResults) org.apache.axis.utils.JavaUtils.convert(_resp, RemoteAuthenticateLoginResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AuthenticateLoginResults authenticateUserLogin(String userName, String password, int applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AuthenticateUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userName, password, new Integer(applicationID), applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AuthenticateLoginResults) _resp;
            } catch (Exception _exception) {
                return (AuthenticateLoginResults) org.apache.axis.utils.JavaUtils.convert(_resp, AuthenticateLoginResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AuthenticateLoginResults authenticateUserLoginEx(String userName, String password, int applicationID, String applicationVersion, String localeCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AuthenticateUserLoginEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateUserLoginEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userName, password, new Integer(applicationID), applicationVersion, localeCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AuthenticateLoginResults) _resp;
            } catch (Exception _exception) {
                return (AuthenticateLoginResults) org.apache.axis.utils.JavaUtils.convert(_resp, AuthenticateLoginResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AuthenticateLoginResults authenticateGUIDLogin(String GUID, int applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AuthenticateGUIDLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateGUIDLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {GUID, new Integer(applicationID), applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AuthenticateLoginResults) _resp;
            } catch (Exception _exception) {
                return (AuthenticateLoginResults) org.apache.axis.utils.JavaUtils.convert(_resp, AuthenticateLoginResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AuthenticateLoginResults authenticateGUIDLoginEx(String GUID, int applicationID, String applicationVersion, String localeCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AuthenticateGUIDLoginEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AuthenticateGUIDLoginEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {GUID, new Integer(applicationID), applicationVersion, localeCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AuthenticateLoginResults) _resp;
            } catch (Exception _exception) {
                return (AuthenticateLoginResults) org.apache.axis.utils.JavaUtils.convert(_resp, AuthenticateLoginResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SessionDetailResults getSessionDetails(String sessionID, int applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSessionDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSessionDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(applicationID), applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SessionDetailResults) _resp;
            } catch (Exception _exception) {
                return (SessionDetailResults) org.apache.axis.utils.JavaUtils.convert(_resp, SessionDetailResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SessionDetailResults loginAndGetSessionDetails(String userName, String password, int applicationID, String applicationVersion, String localeCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/LoginAndGetSessionDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LoginAndGetSessionDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userName, password, new Integer(applicationID), applicationVersion, localeCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SessionDetailResults) _resp;
            } catch (Exception _exception) {
                return (SessionDetailResults) org.apache.axis.utils.JavaUtils.convert(_resp, SessionDetailResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults keepAlive(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/KeepAlive");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "KeepAlive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults logout(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/Logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AnythingChangedResults anythingChanged(String sessionID, long locationID, Module[] modules) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AnythingChanged");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AnythingChanged"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), modules});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AnythingChangedResults) _resp;
            } catch (Exception _exception) {
                return (AnythingChangedResults) org.apache.axis.utils.JavaUtils.convert(_resp, AnythingChangedResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public InterfaceSchemaResults getInterfaceSchemaDetails(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetInterfaceSchemaDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetInterfaceSchemaDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (InterfaceSchemaResults) _resp;
            } catch (Exception _exception) {
                return (InterfaceSchemaResults) org.apache.axis.utils.JavaUtils.convert(_resp, InterfaceSchemaResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public InterfaceSchemaResultsEx getInterfaceSchemaDetailsEx(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetInterfaceSchemaDetailsEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetInterfaceSchemaDetailsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (InterfaceSchemaResultsEx) _resp;
            } catch (Exception _exception) {
                return (InterfaceSchemaResultsEx) org.apache.axis.utils.JavaUtils.convert(_resp, InterfaceSchemaResultsEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WiFiWeatherResponse wiFiWeatherFromDevice(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/WiFiWeatherFromDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiWeatherFromDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WiFiWeatherResponse) _resp;
            } catch (Exception _exception) {
                return (WiFiWeatherResponse) org.apache.axis.utils.JavaUtils.convert(_resp, WiFiWeatherResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ThermostatResponse getThermostat(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetThermostat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetThermostat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ThermostatResponse) _resp;
            } catch (Exception _exception) {
                return (ThermostatResponse) org.apache.axis.utils.JavaUtils.convert(_resp, ThermostatResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getImage(String sessionId, long imageId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetImage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(imageId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getLogoImage(long imageId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetLogoImage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLogoImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Long(imageId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public byte[] getContentImage(String sessionId, long locationId, long imageId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetContentImage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetContentImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), new Long(imageId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LocationResult getLocation(String sessionId, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LocationResult) _resp;
            } catch (Exception _exception) {
                return (LocationResult) org.apache.axis.utils.JavaUtils.convert(_resp, LocationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LocationSimpleResult getLocationSimple(String sessionId, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetLocationSimple");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLocationSimple"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LocationSimpleResult) _resp;
            } catch (Exception _exception) {
                return (LocationSimpleResult) org.apache.axis.utils.JavaUtils.convert(_resp, LocationSimpleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LocationResult saveLocation(String sessionId, LocationInfo locale, byte[] image, boolean dataChanged, boolean imageChanged, String alias) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, locale, image, new Boolean(dataChanged), new Boolean(imageChanged), alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LocationResult) _resp;
            } catch (Exception _exception) {
                return (LocationResult) org.apache.axis.utils.JavaUtils.convert(_resp, LocationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LocationSimpleResult saveLocationSimple(String sessionId, LocationInfoSimple locale, byte[] image, boolean dataChanged, boolean imageChanged, String alias) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveLocationSimple");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveLocationSimple"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, locale, image, new Boolean(dataChanged), new Boolean(imageChanged), alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LocationSimpleResult) _resp;
            } catch (Exception _exception) {
                return (LocationSimpleResult) org.apache.axis.utils.JavaUtils.convert(_resp, LocationSimpleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CountryListResult getCountryList(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCountryList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCountryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CountryListResult) _resp;
            } catch (Exception _exception) {
                return (CountryListResult) org.apache.axis.utils.JavaUtils.convert(_resp, CountryListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CountryStateListResult getCountryStateList(String sessionID, long countryID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCountryStateList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCountryStateList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(countryID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CountryStateListResult) _resp;
            } catch (Exception _exception) {
                return (CountryStateListResult) org.apache.axis.utils.JavaUtils.convert(_resp, CountryStateListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CountryStateListResultEx getAllCountryStateList(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllCountryStateList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllCountryStateList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CountryStateListResultEx) _resp;
            } catch (Exception _exception) {
                return (CountryStateListResultEx) org.apache.axis.utils.JavaUtils.convert(_resp, CountryStateListResultEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PartnerListResult getAssociatedPartners(String sessionId, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAssociatedPartners");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAssociatedPartners"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PartnerListResult) _resp;
            } catch (Exception _exception) {
                return (PartnerListResult) org.apache.axis.utils.JavaUtils.convert(_resp, PartnerListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public TimeZonesResult getTimeZones(String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetTimeZones");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetTimeZones"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TimeZonesResult) _resp;
            } catch (Exception _exception) {
                return (TimeZonesResult) org.apache.axis.utils.JavaUtils.convert(_resp, TimeZonesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public TimeZonesResult getTimeZonesForCamera(String sessionId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetTimeZonesForCamera");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetTimeZonesForCamera"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TimeZonesResult) _resp;
            } catch (Exception _exception) {
                return (TimeZonesResult) org.apache.axis.utils.JavaUtils.convert(_resp, TimeZonesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults serviceVersion() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ServiceVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ServiceVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public VideoFileURLResult getVideoFileURLs(String sessionId, long locationId, short filterClass, long eventRecordId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetVideoFileURLs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoFileURLs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), new Short(filterClass), new Long(eventRecordId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (VideoFileURLResult) _resp;
            } catch (Exception _exception) {
                return (VideoFileURLResult) org.apache.axis.utils.JavaUtils.convert(_resp, VideoFileURLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public NotesResult getEventNotes(String sessionId, short filterClass, long eventRecordId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventNotes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(eventRecordId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NotesResult) _resp;
            } catch (Exception _exception) {
                return (NotesResult) org.apache.axis.utils.JavaUtils.convert(_resp, NotesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventsResult getEvents(String sessionId, short filterClass, long locationId, long deviceId, short maxRecords, long eventTypeFilter, boolean showHidden, String startDateTime, String endDateTime, short dateFormat, short timeFormat, int sortOrder, long lastEventIdReceived) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(locationId), new Long(deviceId), new Short(maxRecords), new Long(eventTypeFilter), new Boolean(showHidden), startDateTime, endDateTime, new Short(dateFormat), new Short(timeFormat), new Integer(sortOrder), new Long(lastEventIdReceived)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventsResult) _resp;
            } catch (Exception _exception) {
                return (EventsResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventsResult getAllEvents(String sessionId, short filterClass, long locationId, long deviceId, short maxRecords, long eventTypeFilter, boolean showHidden, String startDateTime, String endDateTime, short dateFormat, short timeFormat, int sortOrder, long lastEventIdReceived) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(locationId), new Long(deviceId), new Short(maxRecords), new Long(eventTypeFilter), new Boolean(showHidden), startDateTime, endDateTime, new Short(dateFormat), new Short(timeFormat), new Integer(sortOrder), new Long(lastEventIdReceived)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventsResult) _resp;
            } catch (Exception _exception) {
                return (EventsResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventsResult getEventsEx(String sessionId, short filterClass, long locationId, long deviceId, short maxRecords, int[] eventTypeFilterList, boolean showHidden, boolean showLocked, String startDateTime, String endDateTime, short dateFormat, short timeFormat, int sortOrder, long lastEventIdReceived) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventsEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventsEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(locationId), new Long(deviceId), new Short(maxRecords), eventTypeFilterList, new Boolean(showHidden), new Boolean(showLocked), startDateTime, endDateTime, new Short(dateFormat), new Short(timeFormat), new Integer(sortOrder), new Long(lastEventIdReceived)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventsResult) _resp;
            } catch (Exception _exception) {
                return (EventsResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventTypeFilterResult getEventTypeFilter(String sessionId, short filterClass, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventTypeFilter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventTypeFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventTypeFilterResult) _resp;
            } catch (Exception _exception) {
                return (EventTypeFilterResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventTypeFilterResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventTypeFilterResult getAllEventTypeFilter(String sessionId, short filterClass, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllEventTypeFilter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllEventTypeFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventTypeFilterResult) _resp;
            } catch (Exception _exception) {
                return (EventTypeFilterResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventTypeFilterResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventsResult getLiveEvents(String sessionId, long locationId, long lastEventIdReceived, short maxRecords, short dateFormat, short timeFormat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetLiveEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLiveEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), new Long(lastEventIdReceived), new Short(maxRecords), new Short(dateFormat), new Short(timeFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventsResult) _resp;
            } catch (Exception _exception) {
                return (EventsResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventsResult getAllLiveEvents(String sessionId, long locationId, long lastEventIdReceived, short maxRecords, short dateFormat, short timeFormat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllLiveEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllLiveEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), new Long(lastEventIdReceived), new Short(maxRecords), new Short(dateFormat), new Short(timeFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventsResult) _resp;
            } catch (Exception _exception) {
                return (EventsResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateEventNotes(String sessionId, short filterClass, long eventRecordId, String note) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateEventNotes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEventNotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(eventRecordId), note});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateEventRecordHideState(String sessionId, short filterClass, long eventRecordId, boolean isHidden) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateEventRecordHideState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEventRecordHideState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(eventRecordId), new Boolean(isHidden)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateEventRecordLockState(String sessionId, short filterClass, long eventRecordId, boolean isLocked) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateEventRecordLockState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateEventRecordLockState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Short(filterClass), new Long(eventRecordId), new Boolean(isLocked)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults isCameraAvailable(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/IsCameraAvailable");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsCameraAvailable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraStateResult getCameraState(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCameraState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraStateResult) _resp;
            } catch (Exception _exception) {
                return (CameraStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, CameraStateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraIOStateResult getCameraIOState(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCameraIOState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraIOState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraIOStateResult) _resp;
            } catch (Exception _exception) {
                return (CameraIOStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, CameraIOStateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraPositionResult getCameraPosition(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCameraPosition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraPositionResult) _resp;
            } catch (Exception _exception) {
                return (CameraPositionResult) org.apache.axis.utils.JavaUtils.convert(_resp, CameraPositionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults gotoPreset(String MAC, String sessionID, int presetSlot) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GotoPreset");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GotoPreset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(presetSlot)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults storePreset(String MAC, String sessionID, int presetSlot) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/StorePreset");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StorePreset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(presetSlot)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults moveCamera(String MAC, String sessionID, int direction, int degrees, int panSpeed, int tiltSpeed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/MoveCamera");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MoveCamera"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(direction), new Integer(degrees), new Integer(panSpeed), new Integer(tiltSpeed)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults directPanTilt(String MAC, String sessionID, int x, int y) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DirectPanTilt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DirectPanTilt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(x), new Integer(y)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults WLLED_Control(String MAC, String sessionID, int newState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/WLLED_Control");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WLLED_Control"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(newState)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults output_Control(String MAC, String sessionID, int outputNumber, int newState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/Output_Control");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Output_Control"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(outputNumber), new Integer(newState)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults triggerVideoCapture(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/TriggerVideoCapture");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerVideoCapture"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ConfigStreamModeResult configStreamMode(String MAC, String sessionID, int modeSelector, int size, int framesPerSecond, int qualityType, int quality, int bitRate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ConfigStreamMode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConfigStreamMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(modeSelector), new Integer(size), new Integer(framesPerSecond), new Integer(qualityType), new Integer(quality), new Integer(bitRate)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ConfigStreamModeResult) _resp;
            } catch (Exception _exception) {
                return (ConfigStreamModeResult) org.apache.axis.utils.JavaUtils.convert(_resp, ConfigStreamModeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraListResult getLocationCameraList(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetLocationCameraList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetLocationCameraList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraListResult) _resp;
            } catch (Exception _exception) {
                return (CameraListResult) org.apache.axis.utils.JavaUtils.convert(_resp, CameraListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public MediaServerConfigurationResults getMediaServerConfiguration(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetMediaServerConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetMediaServerConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (MediaServerConfigurationResults) _resp;
            } catch (Exception _exception) {
                return (MediaServerConfigurationResults) org.apache.axis.utils.JavaUtils.convert(_resp, MediaServerConfigurationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraConfigurationResults getCameraConfiguration(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCameraConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraConfigurationResults) _resp;
            } catch (Exception _exception) {
                return (CameraConfigurationResults) org.apache.axis.utils.JavaUtils.convert(_resp, CameraConfigurationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraConfigurationResults2 getCameraConfiguration2(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCameraConfiguration2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraConfiguration2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraConfigurationResults2) _resp;
            } catch (Exception _exception) {
                return (CameraConfigurationResults2) org.apache.axis.utils.JavaUtils.convert(_resp, CameraConfigurationResults2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateCameraConfiguration(String MAC, String sessionID, String cameraName, String SYSTEM_Data, String VIDEO_Data, String MOTION_Data, String IO_Data, String EVENT_Data, String PTZ_Data) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateCameraConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateCameraConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, cameraName, SYSTEM_Data, VIDEO_Data, MOTION_Data, IO_Data, EVENT_Data, PTZ_Data});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults setDefaultCamera(String sessionID, String MAC, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SetDefaultCamera");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetDefaultCamera"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, MAC, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults upgradeCameraFirmware(String MAC, String sessionID, int firmwareVersionNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpgradeCameraFirmware");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpgradeCameraFirmware"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID, new Integer(firmwareVersionNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraFirmwareListResult getFirmwareList(String MAC, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetFirmwareList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetFirmwareList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {MAC, sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraFirmwareListResult) _resp;
            } catch (Exception _exception) {
                return (CameraFirmwareListResult) org.apache.axis.utils.JavaUtils.convert(_resp, CameraFirmwareListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraSignalStrengthResults getWirelessStatus(String sessionID, String MAC, int searchType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWirelessStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWirelessStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, MAC, new Integer(searchType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraSignalStrengthResults) _resp;
            } catch (Exception _exception) {
                return (CameraSignalStrengthResults) org.apache.axis.utils.JavaUtils.convert(_resp, CameraSignalStrengthResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraInformationResults getCameraInformation(String sessionID, String MAC, int searchType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCameraInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCameraInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, MAC, new Integer(searchType)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraInformationResults) _resp;
            } catch (Exception _exception) {
                return (CameraInformationResults) org.apache.axis.utils.JavaUtils.convert(_resp, CameraInformationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WAPClientsListResults getWAPClientsInfo(String sessionID, String MAC) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWAPClientsInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWAPClientsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, MAC});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WAPClientsListResults) _resp;
            } catch (Exception _exception) {
                return (WAPClientsListResults) org.apache.axis.utils.JavaUtils.convert(_resp, WAPClientsListResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CameraBatteryStatusResult getBatteryStatus(String sessionID, String MAC, int type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetBatteryStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetBatteryStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, MAC, new Integer(type)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CameraBatteryStatusResult) _resp;
            } catch (Exception _exception) {
                return (CameraBatteryStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, CameraBatteryStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventMetaDataExResult getEventMetaDataEx(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventMetaDataEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventMetaDataEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventMetaDataExResult) _resp;
            } catch (Exception _exception) {
                return (EventMetaDataExResult) org.apache.axis.utils.JavaUtils.convert(_resp, EventMetaDataExResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ConfiguredEventResult getConfiguredEvents(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetConfiguredEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetConfiguredEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ConfiguredEventResult) _resp;
            } catch (Exception _exception) {
                return (ConfiguredEventResult) org.apache.axis.utils.JavaUtils.convert(_resp, ConfiguredEventResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SummaryConfiguredEventXML getEventSummaryXML(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventSummaryXML");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventSummaryXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SummaryConfiguredEventXML) _resp;
            } catch (Exception _exception) {
                return (SummaryConfiguredEventXML) org.apache.axis.utils.JavaUtils.convert(_resp, SummaryConfiguredEventXML.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SummaryConfiguredEventString getEventSummary(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventSummary");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventSummary"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SummaryConfiguredEventString) _resp;
            } catch (Exception _exception) {
                return (SummaryConfiguredEventString) org.apache.axis.utils.JavaUtils.convert(_resp, SummaryConfiguredEventString.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults transactNotificationListEvents(String sessionID, long locationID, SentToPanelEvents[] sentToPanelEvents, EventNotification[] eventNotifications, SceneTrigger[] sceneTriggers, VideoTrigger[] videoTriggers, TimeTriggeredAction[] timeTriggeredActions, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/TransactNotificationListEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationListEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), sentToPanelEvents, eventNotifications, sceneTriggers, videoTriggers, timeTriggeredActions, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public NotificationConditionalStateResult getAllNotificationConditionalStates(String sessionID, long locationID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllNotificationConditionalStates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationConditionalStates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NotificationConditionalStateResult) _resp;
            } catch (Exception _exception) {
                return (NotificationConditionalStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, NotificationConditionalStateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public NotificationScheduleResult getAllNotificationSchedules(String sessionID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllNotificationSchedules");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationSchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NotificationScheduleResult) _resp;
            } catch (Exception _exception) {
                return (NotificationScheduleResult) org.apache.axis.utils.JavaUtils.convert(_resp, NotificationScheduleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults transactNotificationSchedules(String sessionID, NotificationSchedule[] notificationSchedules, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/TransactNotificationSchedules");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationSchedules"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, notificationSchedules, additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetAllNotificationListsResults getAllNotificationLists(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllNotificationLists");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationLists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetAllNotificationListsResults) _resp;
            } catch (Exception _exception) {
                return (GetAllNotificationListsResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetAllNotificationListsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public TransactNotificationListResults transactNotificationLists(String sessionID, NotificationListBaseInfo[] notificationListCollection) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/TransactNotificationLists");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TransactNotificationLists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, notificationListCollection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TransactNotificationListResults) _resp;
            } catch (Exception _exception) {
                return (TransactNotificationListResults) org.apache.axis.utils.JavaUtils.convert(_resp, TransactNotificationListResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults sendTestNotification(String sessionID, long locationID, long notificationListID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SendTestNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendTestNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(notificationListID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public NotificationPauseResult notificationPause(String sessionID, int mode, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/NotificationPause");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationPause"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(mode), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (NotificationPauseResult) _resp;
            } catch (Exception _exception) {
                return (NotificationPauseResult) org.apache.axis.utils.JavaUtils.convert(_resp, NotificationPauseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EventMetaDataResults getEventMetaData(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEventMetaData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEventMetaData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EventMetaDataResults) _resp;
            } catch (Exception _exception) {
                return (EventMetaDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, EventMetaDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelMetadataAndStatusResults getPanelMetaDataAndFullStatus(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelMetaDataAndFullStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelMetadataAndStatusResults) _resp;
            } catch (Exception _exception) {
                return (PanelMetadataAndStatusResults) org.apache.axis.utils.JavaUtils.convert(_resp, PanelMetadataAndStatusResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelMetadataAndStatusResultsEx getPanelMetaDataAndFullStatusEx(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelMetaDataAndFullStatusEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelMetadataAndStatusResultsEx) _resp;
            } catch (Exception _exception) {
                return (PanelMetadataAndStatusResultsEx) org.apache.axis.utils.JavaUtils.convert(_resp, PanelMetadataAndStatusResultsEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelStatusResults getPanelFullStatus(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelFullStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelStatusResults) _resp;
            } catch (Exception _exception) {
                return (PanelStatusResults) org.apache.axis.utils.JavaUtils.convert(_resp, PanelStatusResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelStatusResults getPanelFullStatusByDeviceID(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelFullStatusByDeviceID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusByDeviceID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelStatusResults) _resp;
            } catch (Exception _exception) {
                return (PanelStatusResults) org.apache.axis.utils.JavaUtils.convert(_resp, PanelStatusResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelStatusResultsEx getPanelFullStatusEx(String sessionID, long locationID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelFullStatusEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelStatusResultsEx) _resp;
            } catch (Exception _exception) {
                return (PanelStatusResultsEx) org.apache.axis.utils.JavaUtils.convert(_resp, PanelStatusResultsEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelStatusResultsEx getPanelFullStatusByDeviceIDEx(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelFullStatusByDeviceIDEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelFullStatusByDeviceIDEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelStatusResultsEx) _resp;
            } catch (Exception _exception) {
                return (PanelStatusResultsEx) org.apache.axis.utils.JavaUtils.convert(_resp, PanelStatusResultsEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetZonesListInStateResult getZonesListInState(String sessionID, long locationID, int partitionID, int listIdentifierID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetZonesListInState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(partitionID), new Integer(listIdentifierID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetZonesListInStateResult) _resp;
            } catch (Exception _exception) {
                return (GetZonesListInStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetZonesListInStateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetZonesListInStateExResult getZonesListInStateEx(String sessionID, long locationID, int partitionID, int listIdentifierID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetZonesListInStateEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(partitionID), new Integer(listIdentifierID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetZonesListInStateExResult) _resp;
            } catch (Exception _exception) {
                return (GetZonesListInStateExResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetZonesListInStateExResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelMetadataAndStatusResults getPanelMetaDataAndFullStatusByDeviceID(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelMetaDataAndFullStatusByDeviceID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusByDeviceID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelMetadataAndStatusResults) _resp;
            } catch (Exception _exception) {
                return (PanelMetadataAndStatusResults) org.apache.axis.utils.JavaUtils.convert(_resp, PanelMetadataAndStatusResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PanelMetadataAndStatusResultsEx getPanelMetaDataAndFullStatusByDeviceIDEx(String sessionID, long deviceID, int lastSequenceNumber, long lastUpdatedTimestampTicks, int partitionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPanelMetaDataAndFullStatusByDeviceIDEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPanelMetaDataAndFullStatusByDeviceIDEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Integer(lastSequenceNumber), new Long(lastUpdatedTimestampTicks), new Integer(partitionID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PanelMetadataAndStatusResultsEx) _resp;
            } catch (Exception _exception) {
                return (PanelMetadataAndStatusResultsEx) org.apache.axis.utils.JavaUtils.convert(_resp, PanelMetadataAndStatusResultsEx.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ZoneBypassResults bypass(String sessionID, long locationID, long deviceID, int zone, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/Bypass");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Bypass"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID), new Integer(zone), new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ZoneBypassResults) _resp;
            } catch (Exception _exception) {
                return (ZoneBypassResults) org.apache.axis.utils.JavaUtils.convert(_resp, ZoneBypassResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ArmSecuritySystemResults armSecuritySystem(String sessionID, long locationID, long deviceID, int armType, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ArmSecuritySystem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ArmSecuritySystem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID), new Integer(armType), new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ArmSecuritySystemResults) _resp;
            } catch (Exception _exception) {
                return (ArmSecuritySystemResults) org.apache.axis.utils.JavaUtils.convert(_resp, ArmSecuritySystemResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CustomArmSecuritySystemResults customArmSecuritySystem(String sessionID, long locationID, long deviceID, int armType, int userCode, CustomArmInfo customArmSettings) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/CustomArmSecuritySystem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CustomArmSecuritySystem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID), new Integer(armType), new Integer(userCode), customArmSettings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CustomArmSecuritySystemResults) _resp;
            } catch (Exception _exception) {
                return (CustomArmSecuritySystemResults) org.apache.axis.utils.JavaUtils.convert(_resp, CustomArmSecuritySystemResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CustomArmSettingsResult getCustomArmSettings(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCustomArmSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCustomArmSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CustomArmSettingsResult) _resp;
            } catch (Exception _exception) {
                return (CustomArmSettingsResult) org.apache.axis.utils.JavaUtils.convert(_resp, CustomArmSettingsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DisarmSecuritySystemResults disarmSecuritySystem(String sessionID, long locationID, long deviceID, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DisarmSecuritySystem");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisarmSecuritySystem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID), new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DisarmSecuritySystemResults) _resp;
            } catch (Exception _exception) {
                return (DisarmSecuritySystemResults) org.apache.axis.utils.JavaUtils.convert(_resp, DisarmSecuritySystemResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ReadConsoleDisplayResults readConsoleDisplay(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ReadConsoleDisplay");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReadConsoleDisplay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ReadConsoleDisplayResults) _resp;
            } catch (Exception _exception) {
                return (ReadConsoleDisplayResults) org.apache.axis.utils.JavaUtils.convert(_resp, ReadConsoleDisplayResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults connectToPanel(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ConnectToPanel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConnectToPanel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults sendKey(String sessionID, long locationID, long deviceID, String keyChar) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SendKey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID), keyChar});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults overrideSecurityPanelSession(String sessionID, long locationID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/OverrideSecurityPanelSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "OverrideSecurityPanelSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DeviceInviteTokenResults getDeviceInviteToken(String sessionId, long locationId, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetDeviceInviteToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetDeviceInviteToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DeviceInviteTokenResults) _resp;
            } catch (Exception _exception) {
                return (DeviceInviteTokenResults) org.apache.axis.utils.JavaUtils.convert(_resp, DeviceInviteTokenResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UpdateDoorbellDetailResult updateDoorBellDetail(String sessionId, long locationId, WiFiDoorBellInfo wiFiDoorBellInfo, WiFiDoorBellUserInfo wiFiDoorBellUserInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateDoorBellDetail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateDoorBellDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), wiFiDoorBellInfo, wiFiDoorBellUserInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UpdateDoorbellDetailResult) _resp;
            } catch (Exception _exception) {
                return (UpdateDoorbellDetailResult) org.apache.axis.utils.JavaUtils.convert(_resp, UpdateDoorbellDetailResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults removeDoorbellDevice(String sessionId, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RemoveDoorbellDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoveDoorbellDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WiFiDoorBellInfoResult getWiFiDoorBellDeviceDetails(String sessionId, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWiFiDoorBellDeviceDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiDoorBellDeviceDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WiFiDoorBellInfoResult) _resp;
            } catch (Exception _exception) {
                return (WiFiDoorBellInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, WiFiDoorBellInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults insertUserMobileDeviceToken(String sessionID, long userID, int clientApplicationID, String mobileDeviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/InsertUserMobileDeviceToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InsertUserMobileDeviceToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userID), new Integer(clientApplicationID), mobileDeviceID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updatePushSubscription(String sessionID, long userID, short pushNotificationStatus) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdatePushSubscription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdatePushSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userID), new Short(pushNotificationStatus)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults removeUserMobileDeviceToken(String sessionID, long userID, String mobileDeviceTokenID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RemoveUserMobileDeviceToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoveUserMobileDeviceToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(userID), mobileDeviceTokenID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults pauseAllNotifications(String sessionID, boolean pause) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/PauseAllNotifications");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PauseAllNotifications"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Boolean(pause)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WiFiLockLocationsResults getWiFiLockLocations(String sessionId, long locationId, String accessToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWiFiLockLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiLockLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), accessToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WiFiLockLocationsResults) _resp;
            } catch (Exception _exception) {
                return (WiFiLockLocationsResults) org.apache.axis.utils.JavaUtils.convert(_resp, WiFiLockLocationsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults saveWiFiLockDevice(String sessionId, long locationId, String wifiLockLocationID, WiFiLockInfo[] wifiLockDevices) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveWiFiLockDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveWiFiLockDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId), wifiLockLocationID, wifiLockDevices});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public TCCWiFiLocationsResults getWiFiThermostatLocations(String sessionID, long locationID, String TCCUsername, String TCCPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWiFiThermostatLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiThermostatLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), TCCUsername, TCCPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (TCCWiFiLocationsResults) _resp;
            } catch (Exception _exception) {
                return (TCCWiFiLocationsResults) org.apache.axis.utils.JavaUtils.convert(_resp, TCCWiFiLocationsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults addDeleteWiFiThermostats(String sessionID, long locationID, int TCCLocationID, TCCWiFiDeviceInfo[] TCCWiFiDeviceInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AddDeleteWiFiThermostats");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddDeleteWiFiThermostats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Integer(TCCLocationID), TCCWiFiDeviceInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WifiThermostatScheduleResults getWifiThermostatSchedule(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWifiThermostatSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWifiThermostatSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WifiThermostatScheduleResults) _resp;
            } catch (Exception _exception) {
                return (WifiThermostatScheduleResults) org.apache.axis.utils.JavaUtils.convert(_resp, WifiThermostatScheduleResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateWifiThermostatSchedule(String sessionID, long deviceID, long thermostatID, SchedulePeriodInfo[] schedulePeriodInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateWifiThermostatSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateWifiThermostatSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID), schedulePeriodInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults testEmergencyAlert(long accountId, long locationId, String sessionId, String message, int acKrequired) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/TestEmergencyAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TestEmergencyAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Long(accountId), new Long(locationId), sessionId, message, new Integer(acKrequired)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UpdateSwitchIconResults updateSwitchIcon(String sessionID, long deviceID, long switchID, org.apache.axis.types.UnsignedByte switchIconID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateSwitchIcon");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateSwitchIcon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(switchID), switchIconID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UpdateSwitchIconResults) _resp;
            } catch (Exception _exception) {
                return (UpdateSwitchIconResults) org.apache.axis.utils.JavaUtils.convert(_resp, UpdateSwitchIconResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UpdateThermostatScheduleResults updateThermostatSchedule(String sessionID, long deviceID, ThermostatSchedule thermostatSchedule) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateThermostatSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateThermostatSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), thermostatSchedule});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UpdateThermostatScheduleResults) _resp;
            } catch (Exception _exception) {
                return (UpdateThermostatScheduleResults) org.apache.axis.utils.JavaUtils.convert(_resp, UpdateThermostatScheduleResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ThermostatScheduleResults getThermostatSchedule(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetThermostatSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetThermostatSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ThermostatScheduleResults) _resp;
            } catch (Exception _exception) {
                return (ThermostatScheduleResults) org.apache.axis.utils.JavaUtils.convert(_resp, ThermostatScheduleResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ExecuteASceneResults executeAScene(String sessionID, long deviceID, long sceneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ExecuteAScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ExecuteAScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(sceneID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ExecuteASceneResults) _resp;
            } catch (Exception _exception) {
                return (ExecuteASceneResults) org.apache.axis.utils.JavaUtils.convert(_resp, ExecuteASceneResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CreateEditASceneResults createEditAScene(String sessionID, long deviceID, long sceneID, String sceneName, short sceneIconID, boolean isSceneEnabled, SceneSwitch[] automation_Switch, SceneThermostat[] automation_Thermostat, SceneLock[] automation_Lock) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/CreateEditAScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CreateEditAScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(sceneID), sceneName, new Short(sceneIconID), new Boolean(isSceneEnabled), automation_Switch, automation_Thermostat, automation_Lock});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateEditASceneResults) _resp;
            } catch (Exception _exception) {
                return (CreateEditASceneResults) org.apache.axis.utils.JavaUtils.convert(_resp, CreateEditASceneResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SceneDeletionResults deleteAScene(String sessionID, long deviceID, long sceneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteAScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteAScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(sceneID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SceneDeletionResults) _resp;
            } catch (Exception _exception) {
                return (SceneDeletionResults) org.apache.axis.utils.JavaUtils.convert(_resp, SceneDeletionResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SceneDataResults getAScene(String sessionID, long deviceID, long sceneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(sceneID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SceneDataResults) _resp;
            } catch (Exception _exception) {
                return (SceneDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, SceneDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SceneListInfo getSceneList(String sessionID, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSceneList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSceneList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SceneListInfo) _resp;
            } catch (Exception _exception) {
                return (SceneListInfo) org.apache.axis.utils.JavaUtils.convert(_resp, SceneListInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AutomationDataResults getAutomationDeviceStatus(String sessionID, long deviceID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAutomationDeviceStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAutomationDeviceStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AutomationDataResults) _resp;
            } catch (Exception _exception) {
                return (AutomationDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, AutomationDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AutomationDataResults_Transitional getAllAutomationDeviceStatusEx(String sessionID, long deviceID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAllAutomationDeviceStatusEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllAutomationDeviceStatusEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AutomationDataResults_Transitional) _resp;
            } catch (Exception _exception) {
                return (AutomationDataResults_Transitional) org.apache.axis.utils.JavaUtils.convert(_resp, AutomationDataResults_Transitional.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AutomationDataResults_Transitional getAutomationDeviceStatusEx(String sessionID, long deviceID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAutomationDeviceStatusEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAutomationDeviceStatusEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AutomationDataResults_Transitional) _resp;
            } catch (Exception _exception) {
                return (AutomationDataResults_Transitional) org.apache.axis.utils.JavaUtils.convert(_resp, AutomationDataResults_Transitional.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AutomationLockDataResult getAutomationLocks(String sessionId, long deviceId, long lockID, String additionalInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetAutomationLocks");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAutomationLocks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(deviceId), new Long(lockID), additionalInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AutomationLockDataResult) _resp;
            } catch (Exception _exception) {
                return (AutomationLockDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, AutomationLockDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LockControlDataResults controlALock(String sessionID, long deviceID, long lockID, int lockDesiredState, String authorizingCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ControlALock");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlALock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(lockID), new Integer(lockDesiredState), authorizingCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LockControlDataResults) _resp;
            } catch (Exception _exception) {
                return (LockControlDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, LockControlDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ThermostatControlDataResults controlAThermostat(String sessionID, long deviceID, long thermostatID, int currentOpModeID, int heatThreshold, int coolThreshold, int thermostatModeID, int heatSetPoint, int coolSetPoint, int thermostatFanModeID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ControlAThermostat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlAThermostat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID), new Integer(currentOpModeID), new Integer(heatThreshold), new Integer(coolThreshold), new Integer(thermostatModeID), new Integer(heatSetPoint), new Integer(coolSetPoint), new Integer(thermostatFanModeID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ThermostatControlDataResults) _resp;
            } catch (Exception _exception) {
                return (ThermostatControlDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, ThermostatControlDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ThermostatControlDataResults controlAThermostatEx(String sessionID, long deviceID, long thermostatID, int currentOpModeID, int heatThreshold, int coolThreshold, int thermostatModeID, int heatSetPoint, int coolSetPoint, int thermostatFanModeID, String tempHoldTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ControlAThermostatEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlAThermostatEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID), new Integer(currentOpModeID), new Integer(heatThreshold), new Integer(coolThreshold), new Integer(thermostatModeID), new Integer(heatSetPoint), new Integer(coolSetPoint), new Integer(thermostatFanModeID), tempHoldTime});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ThermostatControlDataResults) _resp;
            } catch (Exception _exception) {
                return (ThermostatControlDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, ThermostatControlDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SwitchControlDataResults controlASwitch(String sessionID, long deviceID, long switchID, int switchAction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ControlASwitch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ControlASwitch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(switchID), new Integer(switchAction)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SwitchControlDataResults) _resp;
            } catch (Exception _exception) {
                return (SwitchControlDataResults) org.apache.axis.utils.JavaUtils.convert(_resp, SwitchControlDataResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AutomationSyncResults synchronizeSecurityPanel(String sessionID, String installerCode, String userCode, long locationID, boolean forceImport) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SynchronizeSecurityPanel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizeSecurityPanel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, installerCode, userCode, new Long(locationID), new Boolean(forceImport)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AutomationSyncResults) _resp;
            } catch (Exception _exception) {
                return (AutomationSyncResults) org.apache.axis.utils.JavaUtils.convert(_resp, AutomationSyncResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SyncJobResult getSyncJobStatus(String sessionID, String jobID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSyncJobStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSyncJobStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, jobID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SyncJobResult) _resp;
            } catch (Exception _exception) {
                return (SyncJobResult) org.apache.axis.utils.JavaUtils.convert(_resp, SyncJobResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults disconnectPanel(String sessionID, long deviceID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DisconnectPanel");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisconnectPanel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults getDoorBellClientID(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetDoorBellClientID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetDoorBellClientID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ContentConfigurationResult getContentConfiguration(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetContentConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetContentConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ContentConfigurationResult) _resp;
            } catch (Exception _exception) {
                return (ContentConfigurationResult) org.apache.axis.utils.JavaUtils.convert(_resp, ContentConfigurationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults saveContentConfiguration(String sessionID, long locationID, ContentConfigurationInfo contentConfiguration) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveContentConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveContentConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), contentConfiguration});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SlideShowPhotoResult getSlideShowPhotos(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSlideShowPhotos");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSlideShowPhotos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SlideShowPhotoResult) _resp;
            } catch (Exception _exception) {
                return (SlideShowPhotoResult) org.apache.axis.utils.JavaUtils.convert(_resp, SlideShowPhotoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults addSlideShowPhoto(String sessionID, long locationID, byte[] image) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AddSlideShowPhoto");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddSlideShowPhoto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), image});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults deleteSlideShowPhoto(String sessionID, long locationID, long photoID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteSlideShowPhoto");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSlideShowPhoto"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(photoID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CurrentWeatherResult getCurrentWeather(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetCurrentWeather");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetCurrentWeather"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CurrentWeatherResult) _resp;
            } catch (Exception _exception) {
                return (CurrentWeatherResult) org.apache.axis.utils.JavaUtils.convert(_resp, CurrentWeatherResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ForecastWeatherResult getForecastWeather(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetForecastWeather");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetForecastWeather"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ForecastWeatherResult) _resp;
            } catch (Exception _exception) {
                return (ForecastWeatherResult) org.apache.axis.utils.JavaUtils.convert(_resp, ForecastWeatherResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DealerMessageResult getDealerMessages(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetDealerMessages");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetDealerMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DealerMessageResult) _resp;
            } catch (Exception _exception) {
                return (DealerMessageResult) org.apache.axis.utils.JavaUtils.convert(_resp, DealerMessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateDealerMessageReadState(String sessionID, long locationID, long messageID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateDealerMessageReadState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateDealerMessageReadState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(messageID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EmailValidationResult validateEmailAddressInSession(String sessionId, String emailAddress, String validationKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ValidateEmailAddressInSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValidateEmailAddressInSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, emailAddress, validationKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EmailValidationResult) _resp;
            } catch (Exception _exception) {
                return (EmailValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, EmailValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EmailValidationResult validateEmailAddress(String userName, String validationKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ValidateEmailAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ValidateEmailAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {userName, validationKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EmailValidationResult) _resp;
            } catch (Exception _exception) {
                return (EmailValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, EmailValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EmailValidationResult sendEmailValidationDetails(String sessionId, String emailAddress) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SendEmailValidationDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendEmailValidationDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, emailAddress});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EmailValidationResult) _resp;
            } catch (Exception _exception) {
                return (EmailValidationResult) org.apache.axis.utils.JavaUtils.convert(_resp, EmailValidationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GPSDevicesResult getGPSDevices(String sessionId, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetGPSDevices");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetGPSDevices"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GPSDevicesResult) _resp;
            } catch (Exception _exception) {
                return (GPSDevicesResult) org.apache.axis.utils.JavaUtils.convert(_resp, GPSDevicesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GPSLocationResult getGPSDeviceLocationData(String sessionId, long deviceID, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetGPSDeviceLocationData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetGPSDeviceLocationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(deviceID), new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GPSLocationResult) _resp;
            } catch (Exception _exception) {
                return (GPSLocationResult) org.apache.axis.utils.JavaUtils.convert(_resp, GPSLocationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GPSDeviceGeoFenceResult getGPSDeviceGeoFence(String sessionId, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetGPSDeviceGeoFence");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetGPSDeviceGeoFence"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GPSDeviceGeoFenceResult) _resp;
            } catch (Exception _exception) {
                return (GPSDeviceGeoFenceResult) org.apache.axis.utils.JavaUtils.convert(_resp, GPSDeviceGeoFenceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GeofenceListResult getEnteredGPSGeofences(String sessionId, long deviceID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEnteredGPSGeofences");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEnteredGPSGeofences"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(deviceID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GeofenceListResult) _resp;
            } catch (Exception _exception) {
                return (GeofenceListResult) org.apache.axis.utils.JavaUtils.convert(_resp, GeofenceListResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults sendGPSLocateNowMessage(String sessionId, long deviceID, long locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SendGPSLocateNowMessage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SendGPSLocateNowMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(deviceID), new Long(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PhotoURLResult savePhotoForGPSDevice(String sessionId, long deviceID, byte[] image) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SavePhotoForGPSDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SavePhotoForGPSDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(deviceID), image});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PhotoURLResult) _resp;
            } catch (Exception _exception) {
                return (PhotoURLResult) org.apache.axis.utils.JavaUtils.convert(_resp, PhotoURLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults saveGPSDeviceData(String sessionId, GPSInfo GPSData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SaveGPSDeviceData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SaveGPSDeviceData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, GPSData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GPSPopupURLResult requestTWMSession(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RequestTWMSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RequestTWMSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GPSPopupURLResult) _resp;
            } catch (Exception _exception) {
                return (GPSPopupURLResult) org.apache.axis.utils.JavaUtils.convert(_resp, GPSPopupURLResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults addEditSmartScene(String sessionID, long locationID, SmartScene smartScene) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AddEditSmartScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddEditSmartScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), smartScene});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetScenesListResults getSmartSceneList(String sessionID, long locationID, long[] smartSceneIDs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSmartSceneList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartSceneList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), smartSceneIDs});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetScenesListResults) _resp;
            } catch (Exception _exception) {
                return (GetScenesListResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetScenesListResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults deleteSmartScene(String sessionID, long locationID, long smartSceneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteSmartScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSmartScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(smartSceneID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults runSmartScene(String sessionID, long locationID, long smartSceneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RunSmartScene");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RunSmartScene"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(smartSceneID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetSmartSceneConfigurationResults getSmartSceneConfiguration(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSmartSceneConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartSceneConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetSmartSceneConfigurationResults) _resp;
            } catch (Exception _exception) {
                return (GetSmartSceneConfigurationResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetSmartSceneConfigurationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EULAResults getEulaInfo(String sessionID, boolean isPostLoginEula) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEulaInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEulaInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Boolean(isPostLoginEula)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EULAResults) _resp;
            } catch (Exception _exception) {
                return (EULAResults) org.apache.axis.utils.JavaUtils.convert(_resp, EULAResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EULATextResults getEulaText(long eulaID, long languageID, String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetEulaText");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetEulaText"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Long(eulaID), new Long(languageID), sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EULATextResults) _resp;
            } catch (Exception _exception) {
                return (EULATextResults) org.apache.axis.utils.JavaUtils.convert(_resp, EULATextResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults signEULA(String sessionID, long eulaId, long languageId, long countryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/signEULA");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "signEULA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(eulaId), new Long(languageId), new Long(countryId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EULAResults getPreLoginEulaInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPreLoginEulaInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPreLoginEulaInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EULAResults) _resp;
            } catch (Exception _exception) {
                return (EULAResults) org.apache.axis.utils.JavaUtils.convert(_resp, EULAResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EULATextResults getPreLoginEulaText(long eulaID, long languageID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetPreLoginEulaText");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetPreLoginEulaText"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Long(eulaID), new Long(languageID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EULATextResults) _resp;
            } catch (Exception _exception) {
                return (EULATextResults) org.apache.axis.utils.JavaUtils.convert(_resp, EULATextResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults addEditSmartAction(String sessionID, long locationID, SmartAction smartAction, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/AddEditSmartAction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AddEditSmartAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), smartAction, new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetSmartActionListResults getSmartActionList(String sessionID, long locationID, long[] smartActionIDs, boolean getState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSmartActionList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), smartActionIDs, new Boolean(getState)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetSmartActionListResults) _resp;
            } catch (Exception _exception) {
                return (GetSmartActionListResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetSmartActionListResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults deleteSmartAction(String sessionID, long locationID, long smartActionID, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteSmartAction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSmartAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(smartActionID), new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults deleteSmartActionList(String sessionID, long locationID, long[] smartActionIDs, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/DeleteSmartActionList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeleteSmartActionList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), smartActionIDs, new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults setSmartActionState(String sessionID, long locationID, long smartActionID, int state, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/SetSmartActionState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetSmartActionState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(smartActionID), new Integer(state), new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults runSmartAction(String sessionID, long locationID, long smartActionID, int userCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[191]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RunSmartAction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RunSmartAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), new Long(smartActionID), new Integer(userCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetSmartActionConfigurationResults getSmartActionConfiguration(String sessionID, long locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[192]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetSmartActionConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetSmartActionConfigurationResults) _resp;
            } catch (Exception _exception) {
                return (GetSmartActionConfigurationResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetSmartActionConfigurationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public VideoPIRConfigurationResults getVideoPIRConfiguration(String sessionID, long deviceID, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[193]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetVideoPIRConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (VideoPIRConfigurationResults) _resp;
            } catch (Exception _exception) {
                return (VideoPIRConfigurationResults) org.apache.axis.utils.JavaUtils.convert(_resp, VideoPIRConfigurationResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public VideoPIRListResults getVideoPIRLocationDeviceList(String sessionID, long locationID, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[194]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetVideoPIRLocationDeviceList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRLocationDeviceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(locationID), additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (VideoPIRListResults) _resp;
            } catch (Exception _exception) {
                return (VideoPIRListResults) org.apache.axis.utils.JavaUtils.convert(_resp, VideoPIRListResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public VideoPIRCaptureTypesResults getVideoPIRCaptureTypes(String sessionID, int deviceClassID, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[195]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetVideoPIRCaptureTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRCaptureTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(deviceClassID), additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (VideoPIRCaptureTypesResults) _resp;
            } catch (Exception _exception) {
                return (VideoPIRCaptureTypesResults) org.apache.axis.utils.JavaUtils.convert(_resp, VideoPIRCaptureTypesResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults updateVideoPIRConfiguration(String sessionID, long deviceID, String deviceName, String SYSTEM_Data, String VIDEO_Data, String MOTION_Data, String EVENT_Data, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[196]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/UpdateVideoPIRConfiguration");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UpdateVideoPIRConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), deviceName, SYSTEM_Data, VIDEO_Data, MOTION_Data, EVENT_Data, additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetVideoPIREventRecordResults getVideoPIREventRecord(String sessionId, long eventRecordId, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[197]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetVideoPIREventRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIREventRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionId, new Long(eventRecordId), additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetVideoPIREventRecordResults) _resp;
            } catch (Exception _exception) {
                return (GetVideoPIREventRecordResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetVideoPIREventRecordResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults takeVideoPIRSnapshots(String sessionID, long deviceID, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[198]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/TakeVideoPIRSnapshots");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TakeVideoPIRSnapshots"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetVideoPIRDeviceEventsResults getVideoPIRDeviceEvents(String sessionID, long deviceID, long eventID, long dateStamp, int captureFilterTypeID, int showHidden, String additionalInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[199]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetVideoPIRDeviceEvents");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIRDeviceEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(eventID), new Long(dateStamp), new Integer(captureFilterTypeID), new Integer(showHidden), additionalInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetVideoPIRDeviceEventsResults) _resp;
            } catch (Exception _exception) {
                return (GetVideoPIRDeviceEventsResults) org.apache.axis.utils.JavaUtils.convert(_resp, GetVideoPIRDeviceEventsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WiFiLocationsResults getWiFiLocations(String sessionID, String lyricUsername, String lyricPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[200]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/GetWiFiLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetWiFiLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, lyricUsername, lyricPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WiFiLocationsResults) _resp;
            } catch (Exception _exception) {
                return (WiFiLocationsResults) org.apache.axis.utils.JavaUtils.convert(_resp, WiFiLocationsResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults activateWiFiDevice(String sessionID, int locationID, String lyricUsername, String lyricPassword, int lyricLocationID, LyricDevice[] lyricDevice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[201]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/ActivateWiFiDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ActivateWiFiDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationID), lyricUsername, lyricPassword, new Integer(lyricLocationID), lyricDevice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults wiFiSmartAway(String sessionID, long deviceID, long thermostatID, int active, int hours) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[202]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/WiFiSmartAway");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiSmartAway"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID), new Integer(active), new Integer(hours)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResults removeWiFiDevice(String sessionID, long deviceID, long thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[203]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://services.alarmnet.com/TC2/RemoveWiFiDevice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RemoveWiFiDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Long(deviceID), new Long(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResults) _resp;
            } catch (Exception _exception) {
                return (WebMethodResults) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResults.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
