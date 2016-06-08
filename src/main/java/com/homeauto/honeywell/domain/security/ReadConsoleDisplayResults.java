/**
 * ReadConsoleDisplayResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ReadConsoleDisplayResults  extends WebMethodResults implements java.io.Serializable {
    private ConsoleDisplayInfo consoleDisplay;

    public ReadConsoleDisplayResults() {
    }

    public ReadConsoleDisplayResults(
           int resultCode,
           String resultData,
           ConsoleDisplayInfo consoleDisplay) {
        super(
            resultCode,
            resultData);
        this.consoleDisplay = consoleDisplay;
    }


    /**
     * Gets the consoleDisplay value for this ReadConsoleDisplayResults.
     * 
     * @return consoleDisplay
     */
    public ConsoleDisplayInfo getConsoleDisplay() {
        return consoleDisplay;
    }


    /**
     * Sets the consoleDisplay value for this ReadConsoleDisplayResults.
     * 
     * @param consoleDisplay
     */
    public void setConsoleDisplay(ConsoleDisplayInfo consoleDisplay) {
        this.consoleDisplay = consoleDisplay;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadConsoleDisplayResults)) return false;
        ReadConsoleDisplayResults other = (ReadConsoleDisplayResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.consoleDisplay==null && other.getConsoleDisplay()==null) || 
             (this.consoleDisplay!=null &&
              this.consoleDisplay.equals(other.getConsoleDisplay())));
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
        if (getConsoleDisplay() != null) {
            _hashCode += getConsoleDisplay().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadConsoleDisplayResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReadConsoleDisplayResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConsoleDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConsoleDisplayInfo"));
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
