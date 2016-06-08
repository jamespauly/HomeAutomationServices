/**
 * UserListDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class UserListDetail  implements java.io.Serializable {
    private long userId;

    private String userName;

    private String firstName;

    private String lastName;

    private boolean enabled;

    private boolean isValidated;

    private UserFeatureCacheInfo[] featureInfo;

    private java.util.Calendar timeStampUpdate;

    private long imageId;

    private String photoURL;

    private int userTypeID;

    private int outOfSyncCount;

    public UserListDetail() {
    }

    public UserListDetail(
           long userId,
           String userName,
           String firstName,
           String lastName,
           boolean enabled,
           boolean isValidated,
           UserFeatureCacheInfo[] featureInfo,
           java.util.Calendar timeStampUpdate,
           long imageId,
           String photoURL,
           int userTypeID,
           int outOfSyncCount) {
           this.userId = userId;
           this.userName = userName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.enabled = enabled;
           this.isValidated = isValidated;
           this.featureInfo = featureInfo;
           this.timeStampUpdate = timeStampUpdate;
           this.imageId = imageId;
           this.photoURL = photoURL;
           this.userTypeID = userTypeID;
           this.outOfSyncCount = outOfSyncCount;
    }


    /**
     * Gets the userId value for this UserListDetail.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserListDetail.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this UserListDetail.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserListDetail.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the firstName value for this UserListDetail.
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UserListDetail.
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this UserListDetail.
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserListDetail.
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the enabled value for this UserListDetail.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this UserListDetail.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the isValidated value for this UserListDetail.
     * 
     * @return isValidated
     */
    public boolean isIsValidated() {
        return isValidated;
    }


    /**
     * Sets the isValidated value for this UserListDetail.
     * 
     * @param isValidated
     */
    public void setIsValidated(boolean isValidated) {
        this.isValidated = isValidated;
    }


    /**
     * Gets the featureInfo value for this UserListDetail.
     * 
     * @return featureInfo
     */
    public UserFeatureCacheInfo[] getFeatureInfo() {
        return featureInfo;
    }


    /**
     * Sets the featureInfo value for this UserListDetail.
     * 
     * @param featureInfo
     */
    public void setFeatureInfo(UserFeatureCacheInfo[] featureInfo) {
        this.featureInfo = featureInfo;
    }


    /**
     * Gets the timeStampUpdate value for this UserListDetail.
     * 
     * @return timeStampUpdate
     */
    public java.util.Calendar getTimeStampUpdate() {
        return timeStampUpdate;
    }


    /**
     * Sets the timeStampUpdate value for this UserListDetail.
     * 
     * @param timeStampUpdate
     */
    public void setTimeStampUpdate(java.util.Calendar timeStampUpdate) {
        this.timeStampUpdate = timeStampUpdate;
    }


    /**
     * Gets the imageId value for this UserListDetail.
     * 
     * @return imageId
     */
    public long getImageId() {
        return imageId;
    }


    /**
     * Sets the imageId value for this UserListDetail.
     * 
     * @param imageId
     */
    public void setImageId(long imageId) {
        this.imageId = imageId;
    }


    /**
     * Gets the photoURL value for this UserListDetail.
     * 
     * @return photoURL
     */
    public String getPhotoURL() {
        return photoURL;
    }


    /**
     * Sets the photoURL value for this UserListDetail.
     * 
     * @param photoURL
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    /**
     * Gets the userTypeID value for this UserListDetail.
     * 
     * @return userTypeID
     */
    public int getUserTypeID() {
        return userTypeID;
    }


    /**
     * Sets the userTypeID value for this UserListDetail.
     * 
     * @param userTypeID
     */
    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }


    /**
     * Gets the outOfSyncCount value for this UserListDetail.
     * 
     * @return outOfSyncCount
     */
    public int getOutOfSyncCount() {
        return outOfSyncCount;
    }


    /**
     * Sets the outOfSyncCount value for this UserListDetail.
     * 
     * @param outOfSyncCount
     */
    public void setOutOfSyncCount(int outOfSyncCount) {
        this.outOfSyncCount = outOfSyncCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserListDetail)) return false;
        UserListDetail other = (UserListDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            this.enabled == other.isEnabled() &&
            this.isValidated == other.isIsValidated() &&
            ((this.featureInfo==null && other.getFeatureInfo()==null) || 
             (this.featureInfo!=null &&
              java.util.Arrays.equals(this.featureInfo, other.getFeatureInfo()))) &&
            ((this.timeStampUpdate==null && other.getTimeStampUpdate()==null) || 
             (this.timeStampUpdate!=null &&
              this.timeStampUpdate.equals(other.getTimeStampUpdate()))) &&
            this.imageId == other.getImageId() &&
            ((this.photoURL==null && other.getPhotoURL()==null) || 
             (this.photoURL!=null &&
              this.photoURL.equals(other.getPhotoURL()))) &&
            this.userTypeID == other.getUserTypeID() &&
            this.outOfSyncCount == other.getOutOfSyncCount();
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
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsValidated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFeatureInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeatureInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFeatureInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeStampUpdate() != null) {
            _hashCode += getTimeStampUpdate().hashCode();
        }
        _hashCode += new Long(getImageId()).hashCode();
        if (getPhotoURL() != null) {
            _hashCode += getPhotoURL().hashCode();
        }
        _hashCode += getUserTypeID();
        _hashCode += getOutOfSyncCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserListDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValidated");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsValidated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureCacheInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserFeatureCacheInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStampUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeStampUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfSyncCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "OutOfSyncCount"));
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
