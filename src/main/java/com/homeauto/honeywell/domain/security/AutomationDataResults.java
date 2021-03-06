/**
 * AutomationDataResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class AutomationDataResults  extends WebMethodResults implements java.io.Serializable {
    private AutomationInfo automationData;

    public AutomationDataResults() {
    }

    public AutomationDataResults(
           int resultCode,
           String resultData,
           AutomationInfo automationData) {
        super(
            resultCode,
            resultData);
        this.automationData = automationData;
    }


    /**
     * Gets the automationData value for this AutomationDataResults.
     * 
     * @return automationData
     */
    public AutomationInfo getAutomationData() {
        return automationData;
    }


    /**
     * Sets the automationData value for this AutomationDataResults.
     * 
     * @param automationData
     */
    public void setAutomationData(AutomationInfo automationData) {
        this.automationData = automationData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AutomationDataResults)) return false;
        AutomationDataResults other = (AutomationDataResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.automationData==null && other.getAutomationData()==null) || 
             (this.automationData!=null &&
              this.automationData.equals(other.getAutomationData())));
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
        if (getAutomationData() != null) {
            _hashCode += getAutomationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutomationDataResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationDataResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationInfo"));
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
