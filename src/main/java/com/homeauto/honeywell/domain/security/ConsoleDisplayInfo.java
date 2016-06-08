/**
 * ConsoleDisplayInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ConsoleDisplayInfo  implements java.io.Serializable {
    private String line1;

    private String line2;

    private int ledStatus;

    public ConsoleDisplayInfo() {
    }

    public ConsoleDisplayInfo(
           String line1,
           String line2,
           int ledStatus) {
           this.line1 = line1;
           this.line2 = line2;
           this.ledStatus = ledStatus;
    }


    /**
     * Gets the line1 value for this ConsoleDisplayInfo.
     * 
     * @return line1
     */
    public String getLine1() {
        return line1;
    }


    /**
     * Sets the line1 value for this ConsoleDisplayInfo.
     * 
     * @param line1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }


    /**
     * Gets the line2 value for this ConsoleDisplayInfo.
     * 
     * @return line2
     */
    public String getLine2() {
        return line2;
    }


    /**
     * Sets the line2 value for this ConsoleDisplayInfo.
     * 
     * @param line2
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }


    /**
     * Gets the ledStatus value for this ConsoleDisplayInfo.
     * 
     * @return ledStatus
     */
    public int getLedStatus() {
        return ledStatus;
    }


    /**
     * Sets the ledStatus value for this ConsoleDisplayInfo.
     * 
     * @param ledStatus
     */
    public void setLedStatus(int ledStatus) {
        this.ledStatus = ledStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsoleDisplayInfo)) return false;
        ConsoleDisplayInfo other = (ConsoleDisplayInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.line1==null && other.getLine1()==null) || 
             (this.line1!=null &&
              this.line1.equals(other.getLine1()))) &&
            ((this.line2==null && other.getLine2()==null) || 
             (this.line2!=null &&
              this.line2.equals(other.getLine2()))) &&
            this.ledStatus == other.getLedStatus();
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
        if (getLine1() != null) {
            _hashCode += getLine1().hashCode();
        }
        if (getLine2() != null) {
            _hashCode += getLine2().hashCode();
        }
        _hashCode += getLedStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsoleDisplayInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConsoleDisplayInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line1");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Line1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line2");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Line2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ledStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
