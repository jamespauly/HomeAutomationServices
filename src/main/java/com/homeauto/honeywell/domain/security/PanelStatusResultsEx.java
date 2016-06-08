/**
 * PanelStatusResultsEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PanelStatusResultsEx  extends WebMethodResults implements java.io.Serializable {
    private PanelStatusInfoEx panelStatus;

    public PanelStatusResultsEx() {
    }

    public PanelStatusResultsEx(
           int resultCode,
           String resultData,
           PanelStatusInfoEx panelStatus) {
        super(
            resultCode,
            resultData);
        this.panelStatus = panelStatus;
    }


    /**
     * Gets the panelStatus value for this PanelStatusResultsEx.
     * 
     * @return panelStatus
     */
    public PanelStatusInfoEx getPanelStatus() {
        return panelStatus;
    }


    /**
     * Sets the panelStatus value for this PanelStatusResultsEx.
     * 
     * @param panelStatus
     */
    public void setPanelStatus(PanelStatusInfoEx panelStatus) {
        this.panelStatus = panelStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelStatusResultsEx)) return false;
        PanelStatusResultsEx other = (PanelStatusResultsEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.panelStatus==null && other.getPanelStatus()==null) || 
             (this.panelStatus!=null &&
              this.panelStatus.equals(other.getPanelStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPanelStatus() != null) {
            _hashCode += getPanelStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PanelStatusResultsEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusResultsEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panelStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusInfoEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
