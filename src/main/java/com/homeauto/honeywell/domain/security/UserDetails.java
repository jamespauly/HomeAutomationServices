/**
 * UserDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class UserDetails  implements java.io.Serializable {
    private long userId;

    private String userName;

    private String passWord;

    private String firstName;

    private String lastName;

    private int localeID;

    private boolean enabled;

    private PhoneInfo[] phoneList;

    private EmailInfo[] emailList;

    private LocationUserAuthorization[] locationList;

    private UserFeatureCacheInfo[] featureInfo;

    private boolean imageChanged;

    private byte[] image;

    private long imageId;

    private String photoURL;

    private int adminAccess;

    private int userTypeID;

    private UserManagementOptions userManagementOptions;

    private boolean promptForUserCode;

    private int outOfSyncCount;

    public UserDetails() {
    }

    public UserDetails(
           long userId,
           String userName,
           String passWord,
           String firstName,
           String lastName,
           int localeID,
           boolean enabled,
           PhoneInfo[] phoneList,
           EmailInfo[] emailList,
           LocationUserAuthorization[] locationList,
           UserFeatureCacheInfo[] featureInfo,
           boolean imageChanged,
           byte[] image,
           long imageId,
           String photoURL,
           int adminAccess,
           int userTypeID,
           UserManagementOptions userManagementOptions,
           boolean promptForUserCode,
           int outOfSyncCount) {
           this.userId = userId;
           this.userName = userName;
           this.passWord = passWord;
           this.firstName = firstName;
           this.lastName = lastName;
           this.localeID = localeID;
           this.enabled = enabled;
           this.phoneList = phoneList;
           this.emailList = emailList;
           this.locationList = locationList;
           this.featureInfo = featureInfo;
           this.imageChanged = imageChanged;
           this.image = image;
           this.imageId = imageId;
           this.photoURL = photoURL;
           this.adminAccess = adminAccess;
           this.userTypeID = userTypeID;
           this.userManagementOptions = userManagementOptions;
           this.promptForUserCode = promptForUserCode;
           this.outOfSyncCount = outOfSyncCount;
    }


    /**
     * Gets the userId value for this UserDetails.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserDetails.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this UserDetails.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserDetails.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the passWord value for this UserDetails.
     * 
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }


    /**
     * Sets the passWord value for this UserDetails.
     * 
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    /**
     * Gets the firstName value for this UserDetails.
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this UserDetails.
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this UserDetails.
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this UserDetails.
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the localeID value for this UserDetails.
     * 
     * @return localeID
     */
    public int getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this UserDetails.
     * 
     * @param localeID
     */
    public void setLocaleID(int localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the enabled value for this UserDetails.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this UserDetails.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the phoneList value for this UserDetails.
     * 
     * @return phoneList
     */
    public PhoneInfo[] getPhoneList() {
        return phoneList;
    }


    /**
     * Sets the phoneList value for this UserDetails.
     * 
     * @param phoneList
     */
    public void setPhoneList(PhoneInfo[] phoneList) {
        this.phoneList = phoneList;
    }


    /**
     * Gets the emailList value for this UserDetails.
     * 
     * @return emailList
     */
    public EmailInfo[] getEmailList() {
        return emailList;
    }


    /**
     * Sets the emailList value for this UserDetails.
     * 
     * @param emailList
     */
    public void setEmailList(EmailInfo[] emailList) {
        this.emailList = emailList;
    }


    /**
     * Gets the locationList value for this UserDetails.
     * 
     * @return locationList
     */
    public LocationUserAuthorization[] getLocationList() {
        return locationList;
    }


    /**
     * Sets the locationList value for this UserDetails.
     * 
     * @param locationList
     */
    public void setLocationList(LocationUserAuthorization[] locationList) {
        this.locationList = locationList;
    }


    /**
     * Gets the featureInfo value for this UserDetails.
     * 
     * @return featureInfo
     */
    public UserFeatureCacheInfo[] getFeatureInfo() {
        return featureInfo;
    }


    /**
     * Sets the featureInfo value for this UserDetails.
     * 
     * @param featureInfo
     */
    public void setFeatureInfo(UserFeatureCacheInfo[] featureInfo) {
        this.featureInfo = featureInfo;
    }


    /**
     * Gets the imageChanged value for this UserDetails.
     * 
     * @return imageChanged
     */
    public boolean isImageChanged() {
        return imageChanged;
    }


    /**
     * Sets the imageChanged value for this UserDetails.
     * 
     * @param imageChanged
     */
    public void setImageChanged(boolean imageChanged) {
        this.imageChanged = imageChanged;
    }


    /**
     * Gets the image value for this UserDetails.
     * 
     * @return image
     */
    public byte[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this UserDetails.
     * 
     * @param image
     */
    public void setImage(byte[] image) {
        this.image = image;
    }


    /**
     * Gets the imageId value for this UserDetails.
     * 
     * @return imageId
     */
    public long getImageId() {
        return imageId;
    }


    /**
     * Sets the imageId value for this UserDetails.
     * 
     * @param imageId
     */
    public void setImageId(long imageId) {
        this.imageId = imageId;
    }


    /**
     * Gets the photoURL value for this UserDetails.
     * 
     * @return photoURL
     */
    public String getPhotoURL() {
        return photoURL;
    }


    /**
     * Sets the photoURL value for this UserDetails.
     * 
     * @param photoURL
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    /**
     * Gets the adminAccess value for this UserDetails.
     * 
     * @return adminAccess
     */
    public int getAdminAccess() {
        return adminAccess;
    }


    /**
     * Sets the adminAccess value for this UserDetails.
     * 
     * @param adminAccess
     */
    public void setAdminAccess(int adminAccess) {
        this.adminAccess = adminAccess;
    }


    /**
     * Gets the userTypeID value for this UserDetails.
     * 
     * @return userTypeID
     */
    public int getUserTypeID() {
        return userTypeID;
    }


    /**
     * Sets the userTypeID value for this UserDetails.
     * 
     * @param userTypeID
     */
    public void setUserTypeID(int userTypeID) {
        this.userTypeID = userTypeID;
    }


    /**
     * Gets the userManagementOptions value for this UserDetails.
     * 
     * @return userManagementOptions
     */
    public UserManagementOptions getUserManagementOptions() {
        return userManagementOptions;
    }


    /**
     * Sets the userManagementOptions value for this UserDetails.
     * 
     * @param userManagementOptions
     */
    public void setUserManagementOptions(UserManagementOptions userManagementOptions) {
        this.userManagementOptions = userManagementOptions;
    }


    /**
     * Gets the promptForUserCode value for this UserDetails.
     * 
     * @return promptForUserCode
     */
    public boolean isPromptForUserCode() {
        return promptForUserCode;
    }


    /**
     * Sets the promptForUserCode value for this UserDetails.
     * 
     * @param promptForUserCode
     */
    public void setPromptForUserCode(boolean promptForUserCode) {
        this.promptForUserCode = promptForUserCode;
    }


    /**
     * Gets the outOfSyncCount value for this UserDetails.
     * 
     * @return outOfSyncCount
     */
    public int getOutOfSyncCount() {
        return outOfSyncCount;
    }


    /**
     * Sets the outOfSyncCount value for this UserDetails.
     * 
     * @param outOfSyncCount
     */
    public void setOutOfSyncCount(int outOfSyncCount) {
        this.outOfSyncCount = outOfSyncCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserDetails)) return false;
        UserDetails other = (UserDetails) obj;
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
            ((this.passWord==null && other.getPassWord()==null) || 
             (this.passWord!=null &&
              this.passWord.equals(other.getPassWord()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            this.localeID == other.getLocaleID() &&
            this.enabled == other.isEnabled() &&
            ((this.phoneList==null && other.getPhoneList()==null) || 
             (this.phoneList!=null &&
              java.util.Arrays.equals(this.phoneList, other.getPhoneList()))) &&
            ((this.emailList==null && other.getEmailList()==null) || 
             (this.emailList!=null &&
              java.util.Arrays.equals(this.emailList, other.getEmailList()))) &&
            ((this.locationList==null && other.getLocationList()==null) || 
             (this.locationList!=null &&
              java.util.Arrays.equals(this.locationList, other.getLocationList()))) &&
            ((this.featureInfo==null && other.getFeatureInfo()==null) || 
             (this.featureInfo!=null &&
              java.util.Arrays.equals(this.featureInfo, other.getFeatureInfo()))) &&
            this.imageChanged == other.isImageChanged() &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            this.imageId == other.getImageId() &&
            ((this.photoURL==null && other.getPhotoURL()==null) || 
             (this.photoURL!=null &&
              this.photoURL.equals(other.getPhotoURL()))) &&
            this.adminAccess == other.getAdminAccess() &&
            this.userTypeID == other.getUserTypeID() &&
            ((this.userManagementOptions==null && other.getUserManagementOptions()==null) || 
             (this.userManagementOptions!=null &&
              this.userManagementOptions.equals(other.getUserManagementOptions()))) &&
            this.promptForUserCode == other.isPromptForUserCode() &&
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
        if (getPassWord() != null) {
            _hashCode += getPassWord().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        _hashCode += getLocaleID();
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPhoneList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPhoneList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEmailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLocationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        _hashCode += (isImageChanged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getImageId()).hashCode();
        if (getPhotoURL() != null) {
            _hashCode += getPhotoURL().hashCode();
        }
        _hashCode += getAdminAccess();
        _hashCode += getUserTypeID();
        if (getUserManagementOptions() != null) {
            _hashCode += getUserManagementOptions().hashCode();
        }
        _hashCode += (isPromptForUserCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOutOfSyncCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserDetails"));
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
        elemField.setFieldName("passWord");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PassWord"));
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
        elemField.setFieldName("localeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhoneInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EmailInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationUserAuthorization"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationUserAuthorization"));
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
        elemField.setFieldName("imageChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("adminAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdminAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userManagementOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserManagementOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserManagementOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptForUserCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PromptForUserCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
