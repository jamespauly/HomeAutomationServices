/**
 * SvcTC2APILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SvcTC2APILocator extends org.apache.axis.client.Service implements SvcTC2API {

    public SvcTC2APILocator() {
    }


    public SvcTC2APILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SvcTC2APILocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for svcTC2APISoap
    private String svcTC2APISoap_address = "https://rs.alarmnet.com/TC21api/tc2.asmx";

    public String getsvcTC2APISoapAddress() {
        return svcTC2APISoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String svcTC2APISoapWSDDServiceName = "svcTC2APISoap";

    public String getsvcTC2APISoapWSDDServiceName() {
        return svcTC2APISoapWSDDServiceName;
    }

    public void setsvcTC2APISoapWSDDServiceName(String name) {
        svcTC2APISoapWSDDServiceName = name;
    }

    public SvcTC2APISoap_PortType getsvcTC2APISoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(svcTC2APISoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsvcTC2APISoap(endpoint);
    }

    public SvcTC2APISoap_PortType getsvcTC2APISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SvcTC2APISoap_BindingStub _stub = new SvcTC2APISoap_BindingStub(portAddress, this);
            _stub.setPortName(getsvcTC2APISoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsvcTC2APISoapEndpointAddress(String address) {
        svcTC2APISoap_address = address;
    }


    // Use to get a proxy class for svcTC2APISoap12
    private String svcTC2APISoap12_address = "https://rs.alarmnet.com/TC21api/tc2.asmx";

    public String getsvcTC2APISoap12Address() {
        return svcTC2APISoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String svcTC2APISoap12WSDDServiceName = "svcTC2APISoap12";

    public String getsvcTC2APISoap12WSDDServiceName() {
        return svcTC2APISoap12WSDDServiceName;
    }

    public void setsvcTC2APISoap12WSDDServiceName(String name) {
        svcTC2APISoap12WSDDServiceName = name;
    }

    public SvcTC2APISoap_PortType getsvcTC2APISoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(svcTC2APISoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsvcTC2APISoap12(endpoint);
    }

    public SvcTC2APISoap_PortType getsvcTC2APISoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SvcTC2APISoap12Stub _stub = new SvcTC2APISoap12Stub(portAddress, this);
            _stub.setPortName(getsvcTC2APISoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsvcTC2APISoap12EndpointAddress(String address) {
        svcTC2APISoap12_address = address;
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
            if (SvcTC2APISoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SvcTC2APISoap_BindingStub _stub = new SvcTC2APISoap_BindingStub(new java.net.URL(svcTC2APISoap_address), this);
                _stub.setPortName(getsvcTC2APISoapWSDDServiceName());
                return _stub;
            }
            if (SvcTC2APISoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SvcTC2APISoap12Stub _stub = new SvcTC2APISoap12Stub(new java.net.URL(svcTC2APISoap12_address), this);
                _stub.setPortName(getsvcTC2APISoap12WSDDServiceName());
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
        if ("svcTC2APISoap".equals(inputPortName)) {
            return getsvcTC2APISoap();
        }
        else if ("svcTC2APISoap12".equals(inputPortName)) {
            return getsvcTC2APISoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "svcTC2API");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "svcTC2APISoap"));
            ports.add(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "svcTC2APISoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("svcTC2APISoap".equals(portName)) {
            setsvcTC2APISoapEndpointAddress(address);
        }
        else 
if ("svcTC2APISoap12".equals(portName)) {
            setsvcTC2APISoap12EndpointAddress(address);
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
