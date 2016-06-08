/**
 * MobileV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public interface MobileV2 extends javax.xml.rpc.Service {
    public String getMobileV2Soap12Address();

    public MobileV2Soap_PortType getMobileV2Soap12() throws javax.xml.rpc.ServiceException;

    public MobileV2Soap_PortType getMobileV2Soap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getMobileV2SoapAddress();

    public MobileV2Soap_PortType getMobileV2Soap() throws javax.xml.rpc.ServiceException;

    public MobileV2Soap_PortType getMobileV2Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
