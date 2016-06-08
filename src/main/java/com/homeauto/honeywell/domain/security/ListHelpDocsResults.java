/**
 * ListHelpDocsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ListHelpDocsResults  extends WebMethodResults implements java.io.Serializable {
    private HelpDocs[] helpDocs;

    public ListHelpDocsResults() {
    }

    public ListHelpDocsResults(
           int resultCode,
           String resultData,
           HelpDocs[] helpDocs) {
        super(
            resultCode,
            resultData);
        this.helpDocs = helpDocs;
    }


    /**
     * Gets the helpDocs value for this ListHelpDocsResults.
     * 
     * @return helpDocs
     */
    public HelpDocs[] getHelpDocs() {
        return helpDocs;
    }


    /**
     * Sets the helpDocs value for this ListHelpDocsResults.
     * 
     * @param helpDocs
     */
    public void setHelpDocs(HelpDocs[] helpDocs) {
        this.helpDocs = helpDocs;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ListHelpDocsResults)) return false;
        ListHelpDocsResults other = (ListHelpDocsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.helpDocs==null && other.getHelpDocs()==null) || 
             (this.helpDocs!=null &&
              java.util.Arrays.equals(this.helpDocs, other.getHelpDocs())));
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
        if (getHelpDocs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHelpDocs());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getHelpDocs(), i);
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
        new org.apache.axis.description.TypeDesc(ListHelpDocsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ListHelpDocsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpDocs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HelpDocs"));
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
