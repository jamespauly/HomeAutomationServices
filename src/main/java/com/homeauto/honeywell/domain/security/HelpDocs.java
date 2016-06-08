/**
 * HelpDocs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class HelpDocs  implements java.io.Serializable {
    private int helpID;

    private String helpDescription;

    private String helpURL;

    public HelpDocs() {
    }

    public HelpDocs(
           int helpID,
           String helpDescription,
           String helpURL) {
           this.helpID = helpID;
           this.helpDescription = helpDescription;
           this.helpURL = helpURL;
    }


    /**
     * Gets the helpID value for this HelpDocs.
     * 
     * @return helpID
     */
    public int getHelpID() {
        return helpID;
    }


    /**
     * Sets the helpID value for this HelpDocs.
     * 
     * @param helpID
     */
    public void setHelpID(int helpID) {
        this.helpID = helpID;
    }


    /**
     * Gets the helpDescription value for this HelpDocs.
     * 
     * @return helpDescription
     */
    public String getHelpDescription() {
        return helpDescription;
    }


    /**
     * Sets the helpDescription value for this HelpDocs.
     * 
     * @param helpDescription
     */
    public void setHelpDescription(String helpDescription) {
        this.helpDescription = helpDescription;
    }


    /**
     * Gets the helpURL value for this HelpDocs.
     * 
     * @return helpURL
     */
    public String getHelpURL() {
        return helpURL;
    }


    /**
     * Sets the helpURL value for this HelpDocs.
     * 
     * @param helpURL
     */
    public void setHelpURL(String helpURL) {
        this.helpURL = helpURL;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HelpDocs)) return false;
        HelpDocs other = (HelpDocs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.helpID == other.getHelpID() &&
            ((this.helpDescription==null && other.getHelpDescription()==null) || 
             (this.helpDescription!=null &&
              this.helpDescription.equals(other.getHelpDescription()))) &&
            ((this.helpURL==null && other.getHelpURL()==null) || 
             (this.helpURL!=null &&
              this.helpURL.equals(other.getHelpURL())));
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
        _hashCode += getHelpID();
        if (getHelpDescription() != null) {
            _hashCode += getHelpDescription().hashCode();
        }
        if (getHelpURL() != null) {
            _hashCode += getHelpURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HelpDocs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpURL"));
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
