/**
 * UserInfoBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class UserInfoBasic  implements java.io.Serializable {
    private long userID;

    private String username;

    private String fullname;

    private long language;

    private long localeID;

    private String userFeatureList;

    private String clientPreferences;

    private boolean isEulaAccepted;

    private boolean isSMSEulaAccepted;

    private int dateFormatID;

    private int timeFormatID;

    private short pushNotificationStatus;

    public UserInfoBasic() {
    }

    public UserInfoBasic(
           long userID,
           String username,
           String fullname,
           long language,
           long localeID,
           String userFeatureList,
           String clientPreferences,
           boolean isEulaAccepted,
           boolean isSMSEulaAccepted,
           int dateFormatID,
           int timeFormatID,
           short pushNotificationStatus) {
           this.userID = userID;
           this.username = username;
           this.fullname = fullname;
           this.language = language;
           this.localeID = localeID;
           this.userFeatureList = userFeatureList;
           this.clientPreferences = clientPreferences;
           this.isEulaAccepted = isEulaAccepted;
           this.isSMSEulaAccepted = isSMSEulaAccepted;
           this.dateFormatID = dateFormatID;
           this.timeFormatID = timeFormatID;
           this.pushNotificationStatus = pushNotificationStatus;
    }


    /**
     * Gets the userID value for this UserInfoBasic.
     * 
     * @return userID
     */
    public long getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this UserInfoBasic.
     * 
     * @param userID
     */
    public void setUserID(long userID) {
        this.userID = userID;
    }


    /**
     * Gets the username value for this UserInfoBasic.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserInfoBasic.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the fullname value for this UserInfoBasic.
     * 
     * @return fullname
     */
    public String getFullname() {
        return fullname;
    }


    /**
     * Sets the fullname value for this UserInfoBasic.
     * 
     * @param fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    /**
     * Gets the language value for this UserInfoBasic.
     * 
     * @return language
     */
    public long getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this UserInfoBasic.
     * 
     * @param language
     */
    public void setLanguage(long language) {
        this.language = language;
    }


    /**
     * Gets the localeID value for this UserInfoBasic.
     * 
     * @return localeID
     */
    public long getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this UserInfoBasic.
     * 
     * @param localeID
     */
    public void setLocaleID(long localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the userFeatureList value for this UserInfoBasic.
     * 
     * @return userFeatureList
     */
    public String getUserFeatureList() {
        return userFeatureList;
    }


    /**
     * Sets the userFeatureList value for this UserInfoBasic.
     * 
     * @param userFeatureList
     */
    public void setUserFeatureList(String userFeatureList) {
        this.userFeatureList = userFeatureList;
    }


    /**
     * Gets the clientPreferences value for this UserInfoBasic.
     * 
     * @return clientPreferences
     */
    public String getClientPreferences() {
        return clientPreferences;
    }


    /**
     * Sets the clientPreferences value for this UserInfoBasic.
     * 
     * @param clientPreferences
     */
    public void setClientPreferences(String clientPreferences) {
        this.clientPreferences = clientPreferences;
    }


    /**
     * Gets the isEulaAccepted value for this UserInfoBasic.
     * 
     * @return isEulaAccepted
     */
    public boolean isIsEulaAccepted() {
        return isEulaAccepted;
    }


    /**
     * Sets the isEulaAccepted value for this UserInfoBasic.
     * 
     * @param isEulaAccepted
     */
    public void setIsEulaAccepted(boolean isEulaAccepted) {
        this.isEulaAccepted = isEulaAccepted;
    }


    /**
     * Gets the isSMSEulaAccepted value for this UserInfoBasic.
     * 
     * @return isSMSEulaAccepted
     */
    public boolean isIsSMSEulaAccepted() {
        return isSMSEulaAccepted;
    }


    /**
     * Sets the isSMSEulaAccepted value for this UserInfoBasic.
     * 
     * @param isSMSEulaAccepted
     */
    public void setIsSMSEulaAccepted(boolean isSMSEulaAccepted) {
        this.isSMSEulaAccepted = isSMSEulaAccepted;
    }


    /**
     * Gets the dateFormatID value for this UserInfoBasic.
     * 
     * @return dateFormatID
     */
    public int getDateFormatID() {
        return dateFormatID;
    }


    /**
     * Sets the dateFormatID value for this UserInfoBasic.
     * 
     * @param dateFormatID
     */
    public void setDateFormatID(int dateFormatID) {
        this.dateFormatID = dateFormatID;
    }


    /**
     * Gets the timeFormatID value for this UserInfoBasic.
     * 
     * @return timeFormatID
     */
    public int getTimeFormatID() {
        return timeFormatID;
    }


    /**
     * Sets the timeFormatID value for this UserInfoBasic.
     * 
     * @param timeFormatID
     */
    public void setTimeFormatID(int timeFormatID) {
        this.timeFormatID = timeFormatID;
    }


    /**
     * Gets the pushNotificationStatus value for this UserInfoBasic.
     * 
     * @return pushNotificationStatus
     */
    public short getPushNotificationStatus() {
        return pushNotificationStatus;
    }


    /**
     * Sets the pushNotificationStatus value for this UserInfoBasic.
     * 
     * @param pushNotificationStatus
     */
    public void setPushNotificationStatus(short pushNotificationStatus) {
        this.pushNotificationStatus = pushNotificationStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserInfoBasic)) return false;
        UserInfoBasic other = (UserInfoBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userID == other.getUserID() &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.fullname==null && other.getFullname()==null) || 
             (this.fullname!=null &&
              this.fullname.equals(other.getFullname()))) &&
            this.language == other.getLanguage() &&
            this.localeID == other.getLocaleID() &&
            ((this.userFeatureList==null && other.getUserFeatureList()==null) || 
             (this.userFeatureList!=null &&
              this.userFeatureList.equals(other.getUserFeatureList()))) &&
            ((this.clientPreferences==null && other.getClientPreferences()==null) || 
             (this.clientPreferences!=null &&
              this.clientPreferences.equals(other.getClientPreferences()))) &&
            this.isEulaAccepted == other.isIsEulaAccepted() &&
            this.isSMSEulaAccepted == other.isIsSMSEulaAccepted() &&
            this.dateFormatID == other.getDateFormatID() &&
            this.timeFormatID == other.getTimeFormatID() &&
            this.pushNotificationStatus == other.getPushNotificationStatus();
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
        _hashCode += new Long(getUserID()).hashCode();
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getFullname() != null) {
            _hashCode += getFullname().hashCode();
        }
        _hashCode += new Long(getLanguage()).hashCode();
        _hashCode += new Long(getLocaleID()).hashCode();
        if (getUserFeatureList() != null) {
            _hashCode += getUserFeatureList().hashCode();
        }
        if (getClientPreferences() != null) {
            _hashCode += getClientPreferences().hashCode();
        }
        _hashCode += (isIsEulaAccepted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsSMSEulaAccepted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDateFormatID();
        _hashCode += getTimeFormatID();
        _hashCode += getPushNotificationStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfoBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfoBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Fullname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFeatureList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ClientPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEulaAccepted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsEulaAccepted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSMSEulaAccepted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsSMSEulaAccepted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DateFormatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFormatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeFormatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushNotificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PushNotificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
