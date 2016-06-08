/**
 * PartnerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PartnerInfo  implements java.io.Serializable {
    private int partnerID;

    private String partnerName;

    private String partnerDescription;

    private String clientID;

    private String clientSecret;

    private String partnerAPIKey;

    private String accessToken;

    private boolean tokenValidity;

    private int maxDeviceSupported;

    public PartnerInfo() {
    }

    public PartnerInfo(
           int partnerID,
           String partnerName,
           String partnerDescription,
           String clientID,
           String clientSecret,
           String partnerAPIKey,
           String accessToken,
           boolean tokenValidity,
           int maxDeviceSupported) {
           this.partnerID = partnerID;
           this.partnerName = partnerName;
           this.partnerDescription = partnerDescription;
           this.clientID = clientID;
           this.clientSecret = clientSecret;
           this.partnerAPIKey = partnerAPIKey;
           this.accessToken = accessToken;
           this.tokenValidity = tokenValidity;
           this.maxDeviceSupported = maxDeviceSupported;
    }


    /**
     * Gets the partnerID value for this PartnerInfo.
     * 
     * @return partnerID
     */
    public int getPartnerID() {
        return partnerID;
    }


    /**
     * Sets the partnerID value for this PartnerInfo.
     * 
     * @param partnerID
     */
    public void setPartnerID(int partnerID) {
        this.partnerID = partnerID;
    }


    /**
     * Gets the partnerName value for this PartnerInfo.
     * 
     * @return partnerName
     */
    public String getPartnerName() {
        return partnerName;
    }


    /**
     * Sets the partnerName value for this PartnerInfo.
     * 
     * @param partnerName
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }


    /**
     * Gets the partnerDescription value for this PartnerInfo.
     * 
     * @return partnerDescription
     */
    public String getPartnerDescription() {
        return partnerDescription;
    }


    /**
     * Sets the partnerDescription value for this PartnerInfo.
     * 
     * @param partnerDescription
     */
    public void setPartnerDescription(String partnerDescription) {
        this.partnerDescription = partnerDescription;
    }


    /**
     * Gets the clientID value for this PartnerInfo.
     * 
     * @return clientID
     */
    public String getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this PartnerInfo.
     * 
     * @param clientID
     */
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the clientSecret value for this PartnerInfo.
     * 
     * @return clientSecret
     */
    public String getClientSecret() {
        return clientSecret;
    }


    /**
     * Sets the clientSecret value for this PartnerInfo.
     * 
     * @param clientSecret
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }


    /**
     * Gets the partnerAPIKey value for this PartnerInfo.
     * 
     * @return partnerAPIKey
     */
    public String getPartnerAPIKey() {
        return partnerAPIKey;
    }


    /**
     * Sets the partnerAPIKey value for this PartnerInfo.
     * 
     * @param partnerAPIKey
     */
    public void setPartnerAPIKey(String partnerAPIKey) {
        this.partnerAPIKey = partnerAPIKey;
    }


    /**
     * Gets the accessToken value for this PartnerInfo.
     * 
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this PartnerInfo.
     * 
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     * Gets the tokenValidity value for this PartnerInfo.
     * 
     * @return tokenValidity
     */
    public boolean isTokenValidity() {
        return tokenValidity;
    }


    /**
     * Sets the tokenValidity value for this PartnerInfo.
     * 
     * @param tokenValidity
     */
    public void setTokenValidity(boolean tokenValidity) {
        this.tokenValidity = tokenValidity;
    }


    /**
     * Gets the maxDeviceSupported value for this PartnerInfo.
     * 
     * @return maxDeviceSupported
     */
    public int getMaxDeviceSupported() {
        return maxDeviceSupported;
    }


    /**
     * Sets the maxDeviceSupported value for this PartnerInfo.
     * 
     * @param maxDeviceSupported
     */
    public void setMaxDeviceSupported(int maxDeviceSupported) {
        this.maxDeviceSupported = maxDeviceSupported;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PartnerInfo)) return false;
        PartnerInfo other = (PartnerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.partnerID == other.getPartnerID() &&
            ((this.partnerName==null && other.getPartnerName()==null) || 
             (this.partnerName!=null &&
              this.partnerName.equals(other.getPartnerName()))) &&
            ((this.partnerDescription==null && other.getPartnerDescription()==null) || 
             (this.partnerDescription!=null &&
              this.partnerDescription.equals(other.getPartnerDescription()))) &&
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.clientSecret==null && other.getClientSecret()==null) || 
             (this.clientSecret!=null &&
              this.clientSecret.equals(other.getClientSecret()))) &&
            ((this.partnerAPIKey==null && other.getPartnerAPIKey()==null) || 
             (this.partnerAPIKey!=null &&
              this.partnerAPIKey.equals(other.getPartnerAPIKey()))) &&
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken()))) &&
            this.tokenValidity == other.isTokenValidity() &&
            this.maxDeviceSupported == other.getMaxDeviceSupported();
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
        _hashCode += getPartnerID();
        if (getPartnerName() != null) {
            _hashCode += getPartnerName().hashCode();
        }
        if (getPartnerDescription() != null) {
            _hashCode += getPartnerDescription().hashCode();
        }
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getClientSecret() != null) {
            _hashCode += getClientSecret().hashCode();
        }
        if (getPartnerAPIKey() != null) {
            _hashCode += getPartnerAPIKey().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        _hashCode += (isTokenValidity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMaxDeviceSupported();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartnerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ClientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ClientSecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerAPIKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerAPIKey"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenValidity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TokenValidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDeviceSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxDeviceSupported"));
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
