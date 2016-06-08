/**
 * NotificationConditionalState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationConditionalState  implements java.io.Serializable {
    private int conditionalStateID;

    private String conditionalStateName;

    public NotificationConditionalState() {
    }

    public NotificationConditionalState(
           int conditionalStateID,
           String conditionalStateName) {
           this.conditionalStateID = conditionalStateID;
           this.conditionalStateName = conditionalStateName;
    }


    /**
     * Gets the conditionalStateID value for this NotificationConditionalState.
     * 
     * @return conditionalStateID
     */
    public int getConditionalStateID() {
        return conditionalStateID;
    }


    /**
     * Sets the conditionalStateID value for this NotificationConditionalState.
     * 
     * @param conditionalStateID
     */
    public void setConditionalStateID(int conditionalStateID) {
        this.conditionalStateID = conditionalStateID;
    }


    /**
     * Gets the conditionalStateName value for this NotificationConditionalState.
     * 
     * @return conditionalStateName
     */
    public String getConditionalStateName() {
        return conditionalStateName;
    }


    /**
     * Sets the conditionalStateName value for this NotificationConditionalState.
     * 
     * @param conditionalStateName
     */
    public void setConditionalStateName(String conditionalStateName) {
        this.conditionalStateName = conditionalStateName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationConditionalState)) return false;
        NotificationConditionalState other = (NotificationConditionalState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.conditionalStateID == other.getConditionalStateID() &&
            ((this.conditionalStateName==null && other.getConditionalStateName()==null) || 
             (this.conditionalStateName!=null &&
              this.conditionalStateName.equals(other.getConditionalStateName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getConditionalStateID();
        if (getConditionalStateName() != null) {
            _hashCode += getConditionalStateName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationConditionalState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionalStateID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConditionalStateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionalStateName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConditionalStateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
