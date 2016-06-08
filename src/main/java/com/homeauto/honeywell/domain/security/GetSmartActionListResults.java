/**
 * GetSmartActionListResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetSmartActionListResults  extends WebMethodResults implements java.io.Serializable {
    private SmartAction[] smartActions;

    public GetSmartActionListResults() {
    }

    public GetSmartActionListResults(
           int resultCode,
           String resultData,
           SmartAction[] smartActions) {
        super(
            resultCode,
            resultData);
        this.smartActions = smartActions;
    }


    /**
     * Gets the smartActions value for this GetSmartActionListResults.
     * 
     * @return smartActions
     */
    public SmartAction[] getSmartActions() {
        return smartActions;
    }


    /**
     * Sets the smartActions value for this GetSmartActionListResults.
     * 
     * @param smartActions
     */
    public void setSmartActions(SmartAction[] smartActions) {
        this.smartActions = smartActions;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetSmartActionListResults)) return false;
        GetSmartActionListResults other = (GetSmartActionListResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.smartActions==null && other.getSmartActions()==null) || 
             (this.smartActions!=null &&
              java.util.Arrays.equals(this.smartActions, other.getSmartActions())));
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
        if (getSmartActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSmartActions(), i);
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
        new org.apache.axis.description.TypeDesc(GetSmartActionListResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetSmartActionListResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction"));
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
