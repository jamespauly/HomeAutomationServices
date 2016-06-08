/**
 * NotificationListBaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationListBaseInfo  implements java.io.Serializable {
    private long notificationListID;

    private String notificationListName;

    private boolean isNotificationListEnabled;

    private boolean isInUse;

    private NotificationListUserInfo[] associatedUsers;

    public NotificationListBaseInfo() {
    }

    public NotificationListBaseInfo(
           long notificationListID,
           String notificationListName,
           boolean isNotificationListEnabled,
           boolean isInUse,
           NotificationListUserInfo[] associatedUsers) {
           this.notificationListID = notificationListID;
           this.notificationListName = notificationListName;
           this.isNotificationListEnabled = isNotificationListEnabled;
           this.isInUse = isInUse;
           this.associatedUsers = associatedUsers;
    }


    /**
     * Gets the notificationListID value for this NotificationListBaseInfo.
     * 
     * @return notificationListID
     */
    public long getNotificationListID() {
        return notificationListID;
    }


    /**
     * Sets the notificationListID value for this NotificationListBaseInfo.
     * 
     * @param notificationListID
     */
    public void setNotificationListID(long notificationListID) {
        this.notificationListID = notificationListID;
    }


    /**
     * Gets the notificationListName value for this NotificationListBaseInfo.
     * 
     * @return notificationListName
     */
    public String getNotificationListName() {
        return notificationListName;
    }


    /**
     * Sets the notificationListName value for this NotificationListBaseInfo.
     * 
     * @param notificationListName
     */
    public void setNotificationListName(String notificationListName) {
        this.notificationListName = notificationListName;
    }


    /**
     * Gets the isNotificationListEnabled value for this NotificationListBaseInfo.
     * 
     * @return isNotificationListEnabled
     */
    public boolean isIsNotificationListEnabled() {
        return isNotificationListEnabled;
    }


    /**
     * Sets the isNotificationListEnabled value for this NotificationListBaseInfo.
     * 
     * @param isNotificationListEnabled
     */
    public void setIsNotificationListEnabled(boolean isNotificationListEnabled) {
        this.isNotificationListEnabled = isNotificationListEnabled;
    }


    /**
     * Gets the isInUse value for this NotificationListBaseInfo.
     * 
     * @return isInUse
     */
    public boolean isIsInUse() {
        return isInUse;
    }


    /**
     * Sets the isInUse value for this NotificationListBaseInfo.
     * 
     * @param isInUse
     */
    public void setIsInUse(boolean isInUse) {
        this.isInUse = isInUse;
    }


    /**
     * Gets the associatedUsers value for this NotificationListBaseInfo.
     * 
     * @return associatedUsers
     */
    public NotificationListUserInfo[] getAssociatedUsers() {
        return associatedUsers;
    }


    /**
     * Sets the associatedUsers value for this NotificationListBaseInfo.
     * 
     * @param associatedUsers
     */
    public void setAssociatedUsers(NotificationListUserInfo[] associatedUsers) {
        this.associatedUsers = associatedUsers;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationListBaseInfo)) return false;
        NotificationListBaseInfo other = (NotificationListBaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notificationListID == other.getNotificationListID() &&
            ((this.notificationListName==null && other.getNotificationListName()==null) || 
             (this.notificationListName!=null &&
              this.notificationListName.equals(other.getNotificationListName()))) &&
            this.isNotificationListEnabled == other.isIsNotificationListEnabled() &&
            this.isInUse == other.isIsInUse() &&
            ((this.associatedUsers==null && other.getAssociatedUsers()==null) || 
             (this.associatedUsers!=null &&
              java.util.Arrays.equals(this.associatedUsers, other.getAssociatedUsers())));
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
        _hashCode += new Long(getNotificationListID()).hashCode();
        if (getNotificationListName() != null) {
            _hashCode += getNotificationListName().hashCode();
        }
        _hashCode += (isIsNotificationListEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsInUse() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAssociatedUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedUsers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAssociatedUsers(), i);
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
        new org.apache.axis.description.TypeDesc(NotificationListBaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationListID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationListName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNotificationListEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsNotificationListEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInUse");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsInUse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AssociatedUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListUserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListUserInfo"));
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
