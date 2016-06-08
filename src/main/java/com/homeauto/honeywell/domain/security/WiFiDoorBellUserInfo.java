/**
 * WiFiDoorBellUserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiDoorBellUserInfo  implements java.io.Serializable {
    private String partnerUserID;

    private String partnerUserName;

    private String accessToken;

    public WiFiDoorBellUserInfo() {
    }

    public WiFiDoorBellUserInfo(
           String partnerUserID,
           String partnerUserName,
           String accessToken) {
           this.partnerUserID = partnerUserID;
           this.partnerUserName = partnerUserName;
           this.accessToken = accessToken;
    }


    /**
     * Gets the partnerUserID value for this WiFiDoorBellUserInfo.
     * 
     * @return partnerUserID
     */
    public String getPartnerUserID() {
        return partnerUserID;
    }


    /**
     * Sets the partnerUserID value for this WiFiDoorBellUserInfo.
     * 
     * @param partnerUserID
     */
    public void setPartnerUserID(String partnerUserID) {
        this.partnerUserID = partnerUserID;
    }


    /**
     * Gets the partnerUserName value for this WiFiDoorBellUserInfo.
     * 
     * @return partnerUserName
     */
    public String getPartnerUserName() {
        return partnerUserName;
    }


    /**
     * Sets the partnerUserName value for this WiFiDoorBellUserInfo.
     * 
     * @param partnerUserName
     */
    public void setPartnerUserName(String partnerUserName) {
        this.partnerUserName = partnerUserName;
    }


    /**
     * Gets the accessToken value for this WiFiDoorBellUserInfo.
     * 
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this WiFiDoorBellUserInfo.
     * 
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiDoorBellUserInfo)) return false;
        WiFiDoorBellUserInfo other = (WiFiDoorBellUserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partnerUserID==null && other.getPartnerUserID()==null) || 
             (this.partnerUserID!=null &&
              this.partnerUserID.equals(other.getPartnerUserID()))) &&
            ((this.partnerUserName==null && other.getPartnerUserName()==null) || 
             (this.partnerUserName!=null &&
              this.partnerUserName.equals(other.getPartnerUserName()))) &&
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken())));
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
        if (getPartnerUserID() != null) {
            _hashCode += getPartnerUserID().hashCode();
        }
        if (getPartnerUserName() != null) {
            _hashCode += getPartnerUserName().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiDoorBellUserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellUserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AccessToken"));
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
