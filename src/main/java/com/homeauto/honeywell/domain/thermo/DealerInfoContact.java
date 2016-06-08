/**
 * DealerInfoContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class DealerInfoContact  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedByte contactPriority;

    private ContractorContactType contactType;

    private String contactName;

    private String contactValue;

    public DealerInfoContact() {
    }

    public DealerInfoContact(
           org.apache.axis.types.UnsignedByte contactPriority,
           ContractorContactType contactType,
           String contactName,
           String contactValue) {
           this.contactPriority = contactPriority;
           this.contactType = contactType;
           this.contactName = contactName;
           this.contactValue = contactValue;
    }


    /**
     * Gets the contactPriority value for this DealerInfoContact.
     * 
     * @return contactPriority
     */
    public org.apache.axis.types.UnsignedByte getContactPriority() {
        return contactPriority;
    }


    /**
     * Sets the contactPriority value for this DealerInfoContact.
     * 
     * @param contactPriority
     */
    public void setContactPriority(org.apache.axis.types.UnsignedByte contactPriority) {
        this.contactPriority = contactPriority;
    }


    /**
     * Gets the contactType value for this DealerInfoContact.
     * 
     * @return contactType
     */
    public ContractorContactType getContactType() {
        return contactType;
    }


    /**
     * Sets the contactType value for this DealerInfoContact.
     * 
     * @param contactType
     */
    public void setContactType(ContractorContactType contactType) {
        this.contactType = contactType;
    }


    /**
     * Gets the contactName value for this DealerInfoContact.
     * 
     * @return contactName
     */
    public String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this DealerInfoContact.
     * 
     * @param contactName
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the contactValue value for this DealerInfoContact.
     * 
     * @return contactValue
     */
    public String getContactValue() {
        return contactValue;
    }


    /**
     * Sets the contactValue value for this DealerInfoContact.
     * 
     * @param contactValue
     */
    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DealerInfoContact)) return false;
        DealerInfoContact other = (DealerInfoContact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contactPriority==null && other.getContactPriority()==null) || 
             (this.contactPriority!=null &&
              this.contactPriority.equals(other.getContactPriority()))) &&
            ((this.contactType==null && other.getContactType()==null) || 
             (this.contactType!=null &&
              this.contactType.equals(other.getContactType()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.contactValue==null && other.getContactValue()==null) || 
             (this.contactValue!=null &&
              this.contactValue.equals(other.getContactValue())));
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
        if (getContactPriority() != null) {
            _hashCode += getContactPriority().hashCode();
        }
        if (getContactType() != null) {
            _hashCode += getContactType().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getContactValue() != null) {
            _hashCode += getContactValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DealerInfoContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContactPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContactType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorContactType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContactValue"));
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
