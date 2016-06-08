/**
 * MobileV2Soap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class MobileV2Soap_BindingStub extends org.apache.axis.client.Stub implements MobileV2Soap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[51];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "firstName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "lastName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "city"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "streetAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "zipCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "uiLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SupportedLanguage"), SupportedLanguage.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "agreedWithAgreement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "question1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion"), SecretQuestion.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "answer1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "question2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion"), SecretQuestion.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "answer2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "question3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion"), SecretQuestion.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "answer3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateAccountResult"));
        oper.setReturnClass(CreateAccountResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateAccountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "city"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "streetAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "zipCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "notificationEmails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "timeZone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"), TimeZone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "useDaylightSavingTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateLocationResult"));
        oper.setReturnClass(CreateLocationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EditLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "countryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "city"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "streetAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "zipCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "notificationEmails"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "timeZone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"), TimeZone.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "useDaylightSavingTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditLocationResult"));
        oper.setReturnClass(EditLocationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserAddressInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetUserAddressInfoResult"));
        oper.setReturnClass(GetUserAddressInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetUserAddressInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSystemGeoInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSystemGeoInfoResult"));
        oper.setReturnClass(GetSystemGeoInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSystemGeoInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RegisterGateway");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "mac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "crc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RegisterGatewayResult"));
        oper.setReturnClass(RegisterGatewayResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RegisterGatewayResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnregisterGateway");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "mac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "crc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RegisterGatewayResult"));
        oper.setReturnClass(RegisterGatewayResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UnregisterGatewayResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AuthenticateUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "uiLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SupportedLanguage"), SupportedLanguage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AuthenticateLoginResult"));
        oper.setReturnClass(AuthenticateLoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AuthenticateUserLoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResendAccountActivationEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "uiLanguage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SupportedLanguage"), SupportedLanguage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ResendAccountActivationEmailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("KeepAlive");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "KeepAliveResult"));
        oper.setReturnClass(KeepAliveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "KeepAliveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LogOff");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LogOffResult"));
        oper.setReturnClass(LogOffResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LogOffResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLocations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetLocationsResult"));
        oper.setReturnClass(GetLocationsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetLocationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetShortLocationInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetShortLocationInfoResult"));
        oper.setReturnClass(GetShortLocationInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetShortLocationInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVolatileThermostatData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetVolatileThermostatDataResult"));
        oper.setReturnClass(GetVolatileThermostatDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetVolatileThermostatDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThermostat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatResult"));
        oper.setReturnClass(GetThermostatResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThermostatUI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatUIResult"));
        oper.setReturnClass(GetThermostatUIResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatUIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDREvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDREventResult"));
        oper.setReturnClass(GetDREventResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDREventResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("HideDREvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "eventId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HideDREventResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OptOutDREvent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "eventId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeRequestResult"));
        oper.setReturnClass(ChangeRequestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "OptOutDREventResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThermostatFan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatFanResult"));
        oper.setReturnClass(GetThermostatFanResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatFanResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetThermostatHumidification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatHumidificationResult"));
        oper.setReturnClass(GetThermostatHumidificationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatHumidificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWeatherForecast");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetWeatherForecastResult"));
        oper.setReturnClass(GetWeatherForecastResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetWeatherForecastResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DismissSiteAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "alertID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DismissSiteAlertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DismissThermostatAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "alertID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DismissThermostatAlertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DismissCommunicationAlert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "alertID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DismissCommunicationAlertResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCommTaskState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "commTaskID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetCommTaskStateResult"));
        oper.setReturnClass(GetCommTaskStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetCommTaskStateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeThermostatUI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeSystemSwitch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "systemSwitch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeHeatSetpoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "heatSetpoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeCoolSetpoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "coolSetpoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"), java.math.BigDecimal.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeHeatNextPeriod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "heatNextPeriod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeCoolNextPeriod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "coolNextPeriod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeStatusHeat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "statusHeat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "changeStatusCool"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "statusCool"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeRequestResult"));
        oper.setReturnClass(ChangeRequestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatUIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeThermostatUIEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatUIData"), ThermostatUIData.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeRequestResult"));
        oper.setReturnClass(ChangeRequestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatUIExResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeThermostatFan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "fanSwitch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanSwitch"), FanSwitch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeRequestResult"));
        oper.setReturnClass(ChangeRequestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatFanResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeThermostatHumidification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "setHumidificationSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "humidificationSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "setHumidificationMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "humidificationMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationMode"), HumidificationMode.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "setDehumidificationSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "dehumidificationSetPoint"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), short.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "setDehumidificationMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "dehumidificationMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationMode"), HumidificationMode.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeRequestResult"));
        oper.setReturnClass(ChangeRequestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatHumidificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleResult"));
        oper.setReturnClass(ScheduleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeSchedule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "scheduleInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleInfo"), ScheduleInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleResult"));
        oper.setReturnClass(ScheduleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeScheduleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitScheduleChanges");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SubmitScheduleResult"));
        oper.setReturnClass(SubmitScheduleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SubmitScheduleChangesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CancelScheduleChanges");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostatID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleResult"));
        oper.setReturnClass(ScheduleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CancelScheduleChangesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPreferredDealers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContracotrsForLocationResult"));
        oper.setReturnClass(ContracotrsForLocationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetPreferredDealersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcceptInvitation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "contacts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfDealerInfoContact"), DealerInfoContact[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationsLevelAccess"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfLocationLevelOfAccess"), LocationLevelOfAccess[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationLevelOfAccess"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AcceptInvitationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeclineInvitation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DeclineInvitationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RequestDealerInvitation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "dealerPortalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "contacts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfDealerInfoContact"), DealerInfoContact[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RequestDealerInvitationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateLocationLevelOfAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "levelOfAccess"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LevelOfAccess"), LevelOfAccess.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UpdateLocationLevelOfAccessResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPendingInvitations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitationsResult"));
        oper.setReturnClass(PendingInvitationsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetPendingInvitationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDealerInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "locationId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoResult"));
        oper.setReturnClass(DealerInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDealerInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EditDealerInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfo"), DealerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditDealerInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EditPreferredDealerInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PreferredDealerInfo"), PreferredDealerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditPreferredDealerInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EmailDealer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "dealerEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "subject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "body"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EmailDealerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSecurityQuestions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSecurityQuestionsResult"));
        oper.setReturnClass(GetSecurityQuestionsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSecurityQuestionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "secretQuestion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "answer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ResetPasswordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WiringToolGetThermostats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolThermostatsResult"));
        oper.setReturnClass(WiringToolThermostatsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolGetThermostatsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WiringToolGetWireMapWithAnswer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "thermostat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfString"), String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "answer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "applicationVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolWireMapResult"));
        oper.setReturnClass(WiringToolWireMapResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolGetWireMapWithAnswerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEulaDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SupportedLanguage"), SupportedLanguage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EulaResult"));
        oper.setReturnClass(EulaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetEulaDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFutureEulaDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SupportedLanguage"), SupportedLanguage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EulaResult"));
        oper.setReturnClass(EulaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetFutureEulaDocumentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AcceptEula");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "sessionID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "eulaVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult"));
        oper.setReturnClass(WebMethodResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AcceptEulaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

    }

    public MobileV2Soap_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MobileV2Soap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MobileV2Soap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AlertType");
            cachedSerQNames.add(qName);
            cls = AlertType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfContractorInformation");
            cachedSerQNames.add(qName);
            cls = ContractorInformation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorInformation");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorInformation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfCountryInfo");
            cachedSerQNames.add(qName);
            cls = CountryInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CountryInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CountryInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfDealerInfoContact");
            cachedSerQNames.add(qName);
            cls = DealerInfoContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfDREventInterval");
            cachedSerQNames.add(qName);
            cls = DREventInterval[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventInterval");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventInterval");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfForecastDayInfo");
            cachedSerQNames.add(qName);
            cls = ForecastDayInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ForecastDayInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ForecastDayInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfLocationInfo");
            cachedSerQNames.add(qName);
            cls = LocationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfLocationLevelOfAccess");
            cachedSerQNames.add(qName);
            cls = LocationLevelOfAccess[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationLevelOfAccess");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationLevelOfAccess");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfPendingInvitation");
            cachedSerQNames.add(qName);
            cls = PendingInvitation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitation");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfScheduledPeriodInfo");
            cachedSerQNames.add(qName);
            cls = ScheduledPeriodInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriodInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriodInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfSecretQuestion");
            cachedSerQNames.add(qName);
            cls = SecretQuestion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfShortLocationInfo");
            cachedSerQNames.add(qName);
            cls = ShortLocationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ShortLocationInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ShortLocationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfSiteAlertMessage");
            cachedSerQNames.add(qName);
            cls = SiteAlertMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SiteAlertMessage");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SiteAlertMessage");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfStateInfo");
            cachedSerQNames.add(qName);
            cls = StateInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StateInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StateInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfThermostatInfo");
            cachedSerQNames.add(qName);
            cls = ThermostatInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatInfo");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ArrayOfThermostatsAlert");
            cachedSerQNames.add(qName);
            cls = ThermostatsAlert[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlert");
            qName2 = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlert");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AuthenticateLoginResult");
            cachedSerQNames.add(qName);
            cls = AuthenticateLoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeRequestResult");
            cachedSerQNames.add(qName);
            cls = ChangeRequestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSource");
            cachedSerQNames.add(qName);
            cls = ChangeSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContracotrsForLocationResult");
            cachedSerQNames.add(qName);
            cls = ContracotrsForLocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorContactType");
            cachedSerQNames.add(qName);
            cls = ContractorContactType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorInformation");
            cachedSerQNames.add(qName);
            cls = ContractorInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CountryInfo");
            cachedSerQNames.add(qName);
            cls = CountryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateAccountResult");
            cachedSerQNames.add(qName);
            cls = CreateAccountResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateLocationResult");
            cachedSerQNames.add(qName);
            cls = CreateLocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CurrentWeatherInfo");
            cachedSerQNames.add(qName);
            cls = CurrentWeatherInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Day");
            cachedSerQNames.add(qName);
            cls = Day.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfo");
            cachedSerQNames.add(qName);
            cls = DealerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact");
            cachedSerQNames.add(qName);
            cls = DealerInfoContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoResult");
            cachedSerQNames.add(qName);
            cls = DealerInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DemandResponsePhase");
            cachedSerQNames.add(qName);
            cls = DemandResponsePhase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREvent");
            cachedSerQNames.add(qName);
            cls = DREvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventInterval");
            cachedSerQNames.add(qName);
            cls = DREventInterval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditLocationResult");
            cachedSerQNames.add(qName);
            cls = EditLocationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EquipmentStatus");
            cachedSerQNames.add(qName);
            cls = EquipmentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EulaResult");
            cachedSerQNames.add(qName);
            cls = EulaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanInfo");
            cachedSerQNames.add(qName);
            cls = FanInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanSwitch");
            cachedSerQNames.add(qName);
            cls = FanSwitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FaultReasons");
            cachedSerQNames.add(qName);
            cls = FaultReasons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ForecastDayInfo");
            cachedSerQNames.add(qName);
            cls = ForecastDayInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetCommTaskStateResult");
            cachedSerQNames.add(qName);
            cls = GetCommTaskStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDREventResult");
            cachedSerQNames.add(qName);
            cls = GetDREventResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetLocationsResult");
            cachedSerQNames.add(qName);
            cls = GetLocationsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSecurityQuestionsResult");
            cachedSerQNames.add(qName);
            cls = GetSecurityQuestionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetShortLocationInfoResult");
            cachedSerQNames.add(qName);
            cls = GetShortLocationInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSystemGeoInfoResult");
            cachedSerQNames.add(qName);
            cls = GetSystemGeoInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatFanResult");
            cachedSerQNames.add(qName);
            cls = GetThermostatFanResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatHumidificationResult");
            cachedSerQNames.add(qName);
            cls = GetThermostatHumidificationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatResult");
            cachedSerQNames.add(qName);
            cls = GetThermostatResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatUIResult");
            cachedSerQNames.add(qName);
            cls = GetThermostatUIResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetUserAddressInfoResult");
            cachedSerQNames.add(qName);
            cls = GetUserAddressInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetVolatileThermostatDataResult");
            cachedSerQNames.add(qName);
            cls = GetVolatileThermostatDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetWeatherForecastResult");
            cachedSerQNames.add(qName);
            cls = GetWeatherForecastResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationInfo");
            cachedSerQNames.add(qName);
            cls = HumidificationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationMode");
            cachedSerQNames.add(qName);
            cls = HumidificationMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "InvitationType");
            cachedSerQNames.add(qName);
            cls = InvitationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "KeepAliveResult");
            cachedSerQNames.add(qName);
            cls = KeepAliveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LevelOfAccess");
            cachedSerQNames.add(qName);
            cls = LevelOfAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationInfo");
            cachedSerQNames.add(qName);
            cls = LocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationLevelOfAccess");
            cachedSerQNames.add(qName);
            cls = LocationLevelOfAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LogOffResult");
            cachedSerQNames.add(qName);
            cls = LogOffResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitation");
            cachedSerQNames.add(qName);
            cls = PendingInvitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitationsResult");
            cachedSerQNames.add(qName);
            cls = PendingInvitationsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PeriodType");
            cachedSerQNames.add(qName);
            cls = PeriodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PreferredDealerInfo");
            cachedSerQNames.add(qName);
            cls = PreferredDealerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RegisterGatewayResult");
            cachedSerQNames.add(qName);
            cls = RegisterGatewayResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Results");
            cachedSerQNames.add(qName);
            cls = Results.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduledPeriodInfo");
            cachedSerQNames.add(qName);
            cls = ScheduledPeriodInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleInfo");
            cachedSerQNames.add(qName);
            cls = ScheduleInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleResult");
            cachedSerQNames.add(qName);
            cls = ScheduleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SecretQuestion");
            cachedSerQNames.add(qName);
            cls = SecretQuestion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ShortLocationInfo");
            cachedSerQNames.add(qName);
            cls = ShortLocationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SiteAlertMessage");
            cachedSerQNames.add(qName);
            cls = SiteAlertMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StateInfo");
            cachedSerQNames.add(qName);
            cls = StateInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SubmitScheduleResult");
            cachedSerQNames.add(qName);
            cls = SubmitScheduleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SupportedLanguage");
            cachedSerQNames.add(qName);
            cls = SupportedLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TaskState");
            cachedSerQNames.add(qName);
            cls = TaskState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TempUnit");
            cachedSerQNames.add(qName);
            cls = TempUnit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatInfo");
            cachedSerQNames.add(qName);
            cls = ThermostatInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlert");
            cachedSerQNames.add(qName);
            cls = ThermostatsAlert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatUIData");
            cachedSerQNames.add(qName);
            cls = ThermostatUIData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone");
            cachedSerQNames.add(qName);
            cls = TimeZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UIInfo");
            cachedSerQNames.add(qName);
            cls = UIInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UserAddressInfo");
            cachedSerQNames.add(qName);
            cls = UserAddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UserCreateStatus");
            cachedSerQNames.add(qName);
            cls = UserCreateStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UserInfo");
            cachedSerQNames.add(qName);
            cls = UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WeatherCondition");
            cachedSerQNames.add(qName);
            cls = WeatherCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WebMethodResult");
            cachedSerQNames.add(qName);
            cls = WebMethodResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolThermostatsResult");
            cachedSerQNames.add(qName);
            cls = WiringToolThermostatsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolWireMapResult");
            cachedSerQNames.add(qName);
            cls = WiringToolWireMapResult.class;
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

    public CreateAccountResult createAccount(String email, String password, String firstName, String lastName, String countryCode, String state, String city, String streetAddress, String zipCode, SupportedLanguage uiLanguage, boolean agreedWithAgreement, SecretQuestion question1, String answer1, SecretQuestion question2, String answer2, SecretQuestion question3, String answer3, String applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/CreateAccount");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {email, password, firstName, lastName, countryCode, state, city, streetAddress, zipCode, uiLanguage, new Boolean(agreedWithAgreement), question1, answer1, question2, answer2, question3, answer3, applicationID, applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateAccountResult) _resp;
            } catch (Exception _exception) {
                return (CreateAccountResult) org.apache.axis.utils.JavaUtils.convert(_resp, CreateAccountResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public CreateLocationResult createLocation(String sessionID, String name, String type, String countryCode, String state, String city, String streetAddress, String zipCode, String notificationEmails, TimeZone timeZone, boolean useDaylightSavingTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/CreateLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, name, type, countryCode, state, city, streetAddress, zipCode, notificationEmails, timeZone, new Boolean(useDaylightSavingTime)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateLocationResult) _resp;
            } catch (Exception _exception) {
                return (CreateLocationResult) org.apache.axis.utils.JavaUtils.convert(_resp, CreateLocationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EditLocationResult editLocation(String sessionID, int locationID, String name, String type, String countryCode, String state, String city, String streetAddress, String zipCode, String notificationEmails, TimeZone timeZone, boolean useDaylightSavingTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/EditLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationID), name, type, countryCode, state, city, streetAddress, zipCode, notificationEmails, timeZone, new Boolean(useDaylightSavingTime)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EditLocationResult) _resp;
            } catch (Exception _exception) {
                return (EditLocationResult) org.apache.axis.utils.JavaUtils.convert(_resp, EditLocationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetUserAddressInfoResult getUserAddressInfo(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetUserAddressInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetUserAddressInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetUserAddressInfoResult) _resp;
            } catch (Exception _exception) {
                return (GetUserAddressInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetUserAddressInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetSystemGeoInfoResult getSystemGeoInfo(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetSystemGeoInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSystemGeoInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetSystemGeoInfoResult) _resp;
            } catch (Exception _exception) {
                return (GetSystemGeoInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetSystemGeoInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RegisterGatewayResult registerGateway(String sessionID, int locationID, String mac, String crc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/RegisterGateway");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RegisterGateway"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationID), mac, crc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RegisterGatewayResult) _resp;
            } catch (Exception _exception) {
                return (RegisterGatewayResult) org.apache.axis.utils.JavaUtils.convert(_resp, RegisterGatewayResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public RegisterGatewayResult unregisterGateway(String sessionID, String mac, String crc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/UnregisterGateway");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UnregisterGateway"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, mac, crc});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RegisterGatewayResult) _resp;
            } catch (Exception _exception) {
                return (RegisterGatewayResult) org.apache.axis.utils.JavaUtils.convert(_resp, RegisterGatewayResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public AuthenticateLoginResult authenticateUserLogin(String username, String password, String applicationID, String applicationVersion, SupportedLanguage uiLanguage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/AuthenticateUserLogin");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AuthenticateUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {username, password, applicationID, applicationVersion, uiLanguage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AuthenticateLoginResult) _resp;
            } catch (Exception _exception) {
                return (AuthenticateLoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, AuthenticateLoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult resendAccountActivationEmail(String username, String password, String applicationID, String applicationVersion, SupportedLanguage uiLanguage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ResendAccountActivationEmail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ResendAccountActivationEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {username, password, applicationID, applicationVersion, uiLanguage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public KeepAliveResult keepAlive(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/KeepAlive");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "KeepAlive"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (KeepAliveResult) _resp;
            } catch (Exception _exception) {
                return (KeepAliveResult) org.apache.axis.utils.JavaUtils.convert(_resp, KeepAliveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public LogOffResult logOff(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/LogOff");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LogOff"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (LogOffResult) _resp;
            } catch (Exception _exception) {
                return (LogOffResult) org.apache.axis.utils.JavaUtils.convert(_resp, LogOffResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetLocationsResult getLocations(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetLocations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetLocations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetLocationsResult) _resp;
            } catch (Exception _exception) {
                return (GetLocationsResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetLocationsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetShortLocationInfoResult getShortLocationInfo(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetShortLocationInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetShortLocationInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetShortLocationInfoResult) _resp;
            } catch (Exception _exception) {
                return (GetShortLocationInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetShortLocationInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetVolatileThermostatDataResult getVolatileThermostatData(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetVolatileThermostatData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetVolatileThermostatData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetVolatileThermostatDataResult) _resp;
            } catch (Exception _exception) {
                return (GetVolatileThermostatDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetVolatileThermostatDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetThermostatResult getThermostat(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetThermostat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetThermostatResult) _resp;
            } catch (Exception _exception) {
                return (GetThermostatResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetThermostatResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetThermostatUIResult getThermostatUI(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetThermostatUI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatUI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetThermostatUIResult) _resp;
            } catch (Exception _exception) {
                return (GetThermostatUIResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetThermostatUIResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetDREventResult getDREvent(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetDREvent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDREvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetDREventResult) _resp;
            } catch (Exception _exception) {
                return (GetDREventResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetDREventResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult hideDREvent(String sessionID, int thermostatID, int eventId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/HideDREvent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HideDREvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID), new Integer(eventId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ChangeRequestResult optOutDREvent(String sessionID, int thermostatID, int eventId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/OptOutDREvent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "OptOutDREvent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID), new Integer(eventId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ChangeRequestResult) _resp;
            } catch (Exception _exception) {
                return (ChangeRequestResult) org.apache.axis.utils.JavaUtils.convert(_resp, ChangeRequestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetThermostatFanResult getThermostatFan(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetThermostatFan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatFan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetThermostatFanResult) _resp;
            } catch (Exception _exception) {
                return (GetThermostatFanResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetThermostatFanResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetThermostatHumidificationResult getThermostatHumidification(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetThermostatHumidification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetThermostatHumidification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetThermostatHumidificationResult) _resp;
            } catch (Exception _exception) {
                return (GetThermostatHumidificationResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetThermostatHumidificationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetWeatherForecastResult getWeatherForecast(String sessionID, int locationID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetWeatherForecast");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetWeatherForecast"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetWeatherForecastResult) _resp;
            } catch (Exception _exception) {
                return (GetWeatherForecastResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetWeatherForecastResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult dismissSiteAlert(String sessionID, int alertID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/DismissSiteAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DismissSiteAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(alertID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult dismissThermostatAlert(String sessionID, int alertID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/DismissThermostatAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DismissThermostatAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(alertID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult dismissCommunicationAlert(String sessionID, int alertID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/DismissCommunicationAlert");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DismissCommunicationAlert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(alertID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetCommTaskStateResult getCommTaskState(String sessionID, int commTaskID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetCommTaskState");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetCommTaskState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(commTaskID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetCommTaskStateResult) _resp;
            } catch (Exception _exception) {
                return (GetCommTaskStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetCommTaskStateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ChangeRequestResult changeThermostatUI(String sessionID, int thermostatID, boolean changeSystemSwitch, int systemSwitch, boolean changeHeatSetpoint, java.math.BigDecimal heatSetpoint, boolean changeCoolSetpoint, java.math.BigDecimal coolSetpoint, boolean changeHeatNextPeriod, int heatNextPeriod, boolean changeCoolNextPeriod, int coolNextPeriod, boolean changeStatusHeat, int statusHeat, boolean changeStatusCool, int statusCool) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ChangeThermostatUI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatUI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID), new Boolean(changeSystemSwitch), new Integer(systemSwitch), new Boolean(changeHeatSetpoint), heatSetpoint, new Boolean(changeCoolSetpoint), coolSetpoint, new Boolean(changeHeatNextPeriod), new Integer(heatNextPeriod), new Boolean(changeCoolNextPeriod), new Integer(coolNextPeriod), new Boolean(changeStatusHeat), new Integer(statusHeat), new Boolean(changeStatusCool), new Integer(statusCool)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ChangeRequestResult) _resp;
            } catch (Exception _exception) {
                return (ChangeRequestResult) org.apache.axis.utils.JavaUtils.convert(_resp, ChangeRequestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ChangeRequestResult changeThermostatUIEx(String sessionID, ThermostatUIData request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ChangeThermostatUIEx");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatUIEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ChangeRequestResult) _resp;
            } catch (Exception _exception) {
                return (ChangeRequestResult) org.apache.axis.utils.JavaUtils.convert(_resp, ChangeRequestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ChangeRequestResult changeThermostatFan(String sessionID, int thermostatID, FanSwitch fanSwitch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ChangeThermostatFan");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatFan"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID), fanSwitch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ChangeRequestResult) _resp;
            } catch (Exception _exception) {
                return (ChangeRequestResult) org.apache.axis.utils.JavaUtils.convert(_resp, ChangeRequestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ChangeRequestResult changeThermostatHumidification(String sessionID, int thermostatID, boolean setHumidificationSetPoint, short humidificationSetPoint, boolean setHumidificationMode, HumidificationMode humidificationMode, boolean setDehumidificationSetPoint, short dehumidificationSetPoint, boolean setDehumidificationMode, HumidificationMode dehumidificationMode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ChangeThermostatHumidification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeThermostatHumidification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID), new Boolean(setHumidificationSetPoint), new Short(humidificationSetPoint), new Boolean(setHumidificationMode), humidificationMode, new Boolean(setDehumidificationSetPoint), new Short(dehumidificationSetPoint), new Boolean(setDehumidificationMode), dehumidificationMode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ChangeRequestResult) _resp;
            } catch (Exception _exception) {
                return (ChangeRequestResult) org.apache.axis.utils.JavaUtils.convert(_resp, ChangeRequestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ScheduleResult getSchedule(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ScheduleResult) _resp;
            } catch (Exception _exception) {
                return (ScheduleResult) org.apache.axis.utils.JavaUtils.convert(_resp, ScheduleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ScheduleResult changeSchedule(String sessionID, int thermostatID, ScheduleInfo scheduleInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ChangeSchedule");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSchedule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID), scheduleInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ScheduleResult) _resp;
            } catch (Exception _exception) {
                return (ScheduleResult) org.apache.axis.utils.JavaUtils.convert(_resp, ScheduleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public SubmitScheduleResult submitScheduleChanges(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/SubmitScheduleChanges");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SubmitScheduleChanges"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SubmitScheduleResult) _resp;
            } catch (Exception _exception) {
                return (SubmitScheduleResult) org.apache.axis.utils.JavaUtils.convert(_resp, SubmitScheduleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ScheduleResult cancelScheduleChanges(String sessionID, int thermostatID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/CancelScheduleChanges");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CancelScheduleChanges"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(thermostatID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ScheduleResult) _resp;
            } catch (Exception _exception) {
                return (ScheduleResult) org.apache.axis.utils.JavaUtils.convert(_resp, ScheduleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public ContracotrsForLocationResult getPreferredDealers(String sessionID, int locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetPreferredDealers");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetPreferredDealers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ContracotrsForLocationResult) _resp;
            } catch (Exception _exception) {
                return (ContracotrsForLocationResult) org.apache.axis.utils.JavaUtils.convert(_resp, ContracotrsForLocationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult acceptInvitation(String sessionID, String token, DealerInfoContact[] contacts, LocationLevelOfAccess[] locationsLevelAccess) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/AcceptInvitation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AcceptInvitation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, token, contacts, locationsLevelAccess});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult declineInvitation(String sessionID, String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/DeclineInvitation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DeclineInvitation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult requestDealerInvitation(String sessionID, String dealerPortalId, int locationId, DealerInfoContact[] contacts) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/RequestDealerInvitation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "RequestDealerInvitation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, dealerPortalId, new Integer(locationId), contacts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult updateLocationLevelOfAccess(String sessionID, int locationId, LevelOfAccess levelOfAccess) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/UpdateLocationLevelOfAccess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UpdateLocationLevelOfAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationId), levelOfAccess});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public PendingInvitationsResult getPendingInvitations(String sessionID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetPendingInvitations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetPendingInvitations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (PendingInvitationsResult) _resp;
            } catch (Exception _exception) {
                return (PendingInvitationsResult) org.apache.axis.utils.JavaUtils.convert(_resp, PendingInvitationsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public DealerInfoResult getDealerInformation(String sessionID, int locationId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetDealerInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetDealerInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(locationId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (DealerInfoResult) _resp;
            } catch (Exception _exception) {
                return (DealerInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, DealerInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult editDealerInformation(String sessionID, DealerInfo info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/EditDealerInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditDealerInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult editPreferredDealerInformation(String sessionID, PreferredDealerInfo info) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/EditPreferredDealerInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EditPreferredDealerInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, info});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult emailDealer(String sessionID, String dealerEmail, String subject, String body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/EmailDealer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EmailDealer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, dealerEmail, subject, body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public GetSecurityQuestionsResult getSecurityQuestions(String email, String applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetSecurityQuestions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetSecurityQuestions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {email, applicationID, applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (GetSecurityQuestionsResult) _resp;
            } catch (Exception _exception) {
                return (GetSecurityQuestionsResult) org.apache.axis.utils.JavaUtils.convert(_resp, GetSecurityQuestionsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult resetPassword(String email, String secretQuestion, String answer, String applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/ResetPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ResetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {email, secretQuestion, answer, applicationID, applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WiringToolThermostatsResult wiringToolGetThermostats(String applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/WiringToolGetThermostats");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolGetThermostats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {applicationID, applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WiringToolThermostatsResult) _resp;
            } catch (Exception _exception) {
                return (WiringToolThermostatsResult) org.apache.axis.utils.JavaUtils.convert(_resp, WiringToolThermostatsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WiringToolWireMapResult wiringToolGetWireMapWithAnswer(String thermostat, String[] input, String answer, String applicationID, String applicationVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/WiringToolGetWireMapWithAnswer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolGetWireMapWithAnswer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {thermostat, input, answer, applicationID, applicationVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WiringToolWireMapResult) _resp;
            } catch (Exception _exception) {
                return (WiringToolWireMapResult) org.apache.axis.utils.JavaUtils.convert(_resp, WiringToolWireMapResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EulaResult getEulaDocument(SupportedLanguage language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetEulaDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetEulaDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {language});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EulaResult) _resp;
            } catch (Exception _exception) {
                return (EulaResult) org.apache.axis.utils.JavaUtils.convert(_resp, EulaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public EulaResult getFutureEulaDocument(SupportedLanguage language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/GetFutureEulaDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetFutureEulaDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {language});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (EulaResult) _resp;
            } catch (Exception _exception) {
                return (EulaResult) org.apache.axis.utils.JavaUtils.convert(_resp, EulaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public WebMethodResult acceptEula(String sessionID, int eulaVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://services.alarmnet.com/Services/MobileV2/AcceptEula");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AcceptEula"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {sessionID, new Integer(eulaVersion)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WebMethodResult) _resp;
            } catch (Exception _exception) {
                return (WebMethodResult) org.apache.axis.utils.JavaUtils.convert(_resp, WebMethodResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
