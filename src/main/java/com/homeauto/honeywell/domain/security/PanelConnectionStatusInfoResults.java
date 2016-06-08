/**
 * PanelConnectionStatusInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PanelConnectionStatusInfoResults  extends WebMethodResults implements java.io.Serializable {
    private PanelConnectionStatusInfo[] panelStatusInfo;

    public PanelConnectionStatusInfoResults() {
    }

    public PanelConnectionStatusInfoResults(
           int resultCode,
           String resultData,
           PanelConnectionStatusInfo[] panelStatusInfo) {
        super(
            resultCode,
            resultData);
        this.panelStatusInfo = panelStatusInfo;
    }


    /**
     * Gets the panelStatusInfo value for this PanelConnectionStatusInfoResults.
     * 
     * @return panelStatusInfo
     */
    public PanelConnectionStatusInfo[] getPanelStatusInfo() {
        return panelStatusInfo;
    }


    /**
     * Sets the panelStatusInfo value for this PanelConnectionStatusInfoResults.
     * 
     * @param panelStatusInfo
     */
    public void setPanelStatusInfo(PanelConnectionStatusInfo[] panelStatusInfo) {
        this.panelStatusInfo = panelStatusInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelConnectionStatusInfoResults)) return false;
        PanelConnectionStatusInfoResults other = (PanelConnectionStatusInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.panelStatusInfo==null && other.getPanelStatusInfo()==null) || 
             (this.panelStatusInfo!=null &&
              java.util.Arrays.equals(this.panelStatusInfo, other.getPanelStatusInfo())));
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
        if (getPanelStatusInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPanelStatusInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPanelStatusInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PanelConnectionStatusInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panelStatusInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelStatusInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfo"));
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
