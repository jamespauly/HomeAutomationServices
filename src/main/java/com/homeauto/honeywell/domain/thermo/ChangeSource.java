/**
 * ChangeSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ChangeSource  implements java.io.Serializable {
    private String changeTag;

    private String partnerName;

    public ChangeSource() {
    }

    public ChangeSource(
           String changeTag,
           String partnerName) {
           this.changeTag = changeTag;
           this.partnerName = partnerName;
    }


    /**
     * Gets the changeTag value for this ChangeSource.
     * 
     * @return changeTag
     */
    public String getChangeTag() {
        return changeTag;
    }


    /**
     * Sets the changeTag value for this ChangeSource.
     * 
     * @param changeTag
     */
    public void setChangeTag(String changeTag) {
        this.changeTag = changeTag;
    }


    /**
     * Gets the partnerName value for this ChangeSource.
     * 
     * @return partnerName
     */
    public String getPartnerName() {
        return partnerName;
    }


    /**
     * Sets the partnerName value for this ChangeSource.
     * 
     * @param partnerName
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeSource)) return false;
        ChangeSource other = (ChangeSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changeTag==null && other.getChangeTag()==null) || 
             (this.changeTag!=null &&
              this.changeTag.equals(other.getChangeTag()))) &&
            ((this.partnerName==null && other.getPartnerName()==null) || 
             (this.partnerName!=null &&
              this.partnerName.equals(other.getPartnerName())));
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
        if (getChangeTag() != null) {
            _hashCode += getChangeTag().hashCode();
        }
        if (getPartnerName() != null) {
            _hashCode += getPartnerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PartnerName"));
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
