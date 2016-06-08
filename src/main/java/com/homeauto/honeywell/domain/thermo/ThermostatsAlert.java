/**
 * ThermostatsAlert.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ThermostatsAlert  implements java.io.Serializable {
    private int IDForDismiss;

    private AlertType type;

    private String alertMessageID;

    private String shortText;

    private String longText;

    public ThermostatsAlert() {
    }

    public ThermostatsAlert(
           int IDForDismiss,
           AlertType type,
           String alertMessageID,
           String shortText,
           String longText) {
           this.IDForDismiss = IDForDismiss;
           this.type = type;
           this.alertMessageID = alertMessageID;
           this.shortText = shortText;
           this.longText = longText;
    }


    /**
     * Gets the IDForDismiss value for this ThermostatsAlert.
     * 
     * @return IDForDismiss
     */
    public int getIDForDismiss() {
        return IDForDismiss;
    }


    /**
     * Sets the IDForDismiss value for this ThermostatsAlert.
     * 
     * @param IDForDismiss
     */
    public void setIDForDismiss(int IDForDismiss) {
        this.IDForDismiss = IDForDismiss;
    }


    /**
     * Gets the type value for this ThermostatsAlert.
     * 
     * @return type
     */
    public AlertType getType() {
        return type;
    }


    /**
     * Sets the type value for this ThermostatsAlert.
     * 
     * @param type
     */
    public void setType(AlertType type) {
        this.type = type;
    }


    /**
     * Gets the alertMessageID value for this ThermostatsAlert.
     * 
     * @return alertMessageID
     */
    public String getAlertMessageID() {
        return alertMessageID;
    }


    /**
     * Sets the alertMessageID value for this ThermostatsAlert.
     * 
     * @param alertMessageID
     */
    public void setAlertMessageID(String alertMessageID) {
        this.alertMessageID = alertMessageID;
    }


    /**
     * Gets the shortText value for this ThermostatsAlert.
     * 
     * @return shortText
     */
    public String getShortText() {
        return shortText;
    }


    /**
     * Sets the shortText value for this ThermostatsAlert.
     * 
     * @param shortText
     */
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }


    /**
     * Gets the longText value for this ThermostatsAlert.
     * 
     * @return longText
     */
    public String getLongText() {
        return longText;
    }


    /**
     * Sets the longText value for this ThermostatsAlert.
     * 
     * @param longText
     */
    public void setLongText(String longText) {
        this.longText = longText;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ThermostatsAlert)) return false;
        ThermostatsAlert other = (ThermostatsAlert) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.IDForDismiss == other.getIDForDismiss() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.alertMessageID==null && other.getAlertMessageID()==null) || 
             (this.alertMessageID!=null &&
              this.alertMessageID.equals(other.getAlertMessageID()))) &&
            ((this.shortText==null && other.getShortText()==null) || 
             (this.shortText!=null &&
              this.shortText.equals(other.getShortText()))) &&
            ((this.longText==null && other.getLongText()==null) || 
             (this.longText!=null &&
              this.longText.equals(other.getLongText())));
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
        _hashCode += getIDForDismiss();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAlertMessageID() != null) {
            _hashCode += getAlertMessageID().hashCode();
        }
        if (getShortText() != null) {
            _hashCode += getShortText().hashCode();
        }
        if (getLongText() != null) {
            _hashCode += getLongText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatsAlert.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlert"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDForDismiss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IDForDismiss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AlertType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertMessageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "AlertMessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ShortText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LongText"));
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
