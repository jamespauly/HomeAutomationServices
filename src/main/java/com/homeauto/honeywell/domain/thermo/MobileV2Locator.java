/**
 * MobileV2Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class MobileV2Locator extends org.apache.axis.client.Service implements MobileV2 {

    public MobileV2Locator() {
    }


    public MobileV2Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MobileV2Locator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MobileV2Soap12
    private String MobileV2Soap12_address = "https://tccna.honeywell.com/ws/MobileV2.asmx";

    public String getMobileV2Soap12Address() {
        return MobileV2Soap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String MobileV2Soap12WSDDServiceName = "MobileV2Soap12";

    public String getMobileV2Soap12WSDDServiceName() {
        return MobileV2Soap12WSDDServiceName;
    }

    public void setMobileV2Soap12WSDDServiceName(String name) {
        MobileV2Soap12WSDDServiceName = name;
    }

    public MobileV2Soap_PortType getMobileV2Soap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileV2Soap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileV2Soap12(endpoint);
    }

    public MobileV2Soap_PortType getMobileV2Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MobileV2Soap12Stub _stub = new MobileV2Soap12Stub(portAddress, this);
            _stub.setPortName(getMobileV2Soap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileV2Soap12EndpointAddress(String address) {
        MobileV2Soap12_address = address;
    }


    // Use to get a proxy class for MobileV2Soap
    private String MobileV2Soap_address = "https://tccna.honeywell.com/ws/MobileV2.asmx";

    public String getMobileV2SoapAddress() {
        return MobileV2Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private String MobileV2SoapWSDDServiceName = "MobileV2Soap";

    public String getMobileV2SoapWSDDServiceName() {
        return MobileV2SoapWSDDServiceName;
    }

    public void setMobileV2SoapWSDDServiceName(String name) {
        MobileV2SoapWSDDServiceName = name;
    }

    public MobileV2Soap_PortType getMobileV2Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MobileV2Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMobileV2Soap(endpoint);
    }

    public MobileV2Soap_PortType getMobileV2Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            MobileV2Soap_BindingStub _stub = new MobileV2Soap_BindingStub(portAddress, this);
            _stub.setPortName(getMobileV2SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMobileV2SoapEndpointAddress(String address) {
        MobileV2Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (MobileV2Soap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MobileV2Soap12Stub _stub = new MobileV2Soap12Stub(new java.net.URL(MobileV2Soap12_address), this);
                _stub.setPortName(getMobileV2Soap12WSDDServiceName());
                return _stub;
            }
            if (MobileV2Soap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                MobileV2Soap_BindingStub _stub = new MobileV2Soap_BindingStub(new java.net.URL(MobileV2Soap_address), this);
                _stub.setPortName(getMobileV2SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("MobileV2Soap12".equals(inputPortName)) {
            return getMobileV2Soap12();
        }
        else if ("MobileV2Soap".equals(inputPortName)) {
            return getMobileV2Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "MobileV2");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "MobileV2Soap12"));
            ports.add(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "MobileV2Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("MobileV2Soap12".equals(portName)) {
            setMobileV2Soap12EndpointAddress(address);
        }
        else 
if ("MobileV2Soap".equals(portName)) {
            setMobileV2SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
