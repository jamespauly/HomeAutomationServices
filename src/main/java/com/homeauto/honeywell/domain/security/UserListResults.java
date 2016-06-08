/**
 * UserListResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class UserListResults  extends WebMethodResults implements java.io.Serializable {
    private UserManagementOptions userManagementOptions;

    private UserListDetail[] users;

    private int urgentSyncCount;

    public UserListResults() {
    }

    public UserListResults(
           int resultCode,
           String resultData,
           UserManagementOptions userManagementOptions,
           UserListDetail[] users,
           int urgentSyncCount) {
        super(
            resultCode,
            resultData);
        this.userManagementOptions = userManagementOptions;
        this.users = users;
        this.urgentSyncCount = urgentSyncCount;
    }


    /**
     * Gets the userManagementOptions value for this UserListResults.
     * 
     * @return userManagementOptions
     */
    public UserManagementOptions getUserManagementOptions() {
        return userManagementOptions;
    }


    /**
     * Sets the userManagementOptions value for this UserListResults.
     * 
     * @param userManagementOptions
     */
    public void setUserManagementOptions(UserManagementOptions userManagementOptions) {
        this.userManagementOptions = userManagementOptions;
    }


    /**
     * Gets the users value for this UserListResults.
     * 
     * @return users
     */
    public UserListDetail[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this UserListResults.
     * 
     * @param users
     */
    public void setUsers(UserListDetail[] users) {
        this.users = users;
    }


    /**
     * Gets the urgentSyncCount value for this UserListResults.
     * 
     * @return urgentSyncCount
     */
    public int getUrgentSyncCount() {
        return urgentSyncCount;
    }


    /**
     * Sets the urgentSyncCount value for this UserListResults.
     * 
     * @param urgentSyncCount
     */
    public void setUrgentSyncCount(int urgentSyncCount) {
        this.urgentSyncCount = urgentSyncCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserListResults)) return false;
        UserListResults other = (UserListResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userManagementOptions==null && other.getUserManagementOptions()==null) || 
             (this.userManagementOptions!=null &&
              this.userManagementOptions.equals(other.getUserManagementOptions()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              java.util.Arrays.equals(this.users, other.getUsers()))) &&
            this.urgentSyncCount == other.getUrgentSyncCount();
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
        if (getUserManagementOptions() != null) {
            _hashCode += getUserManagementOptions().hashCode();
        }
        if (getUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getUrgentSyncCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserListResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userManagementOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserManagementOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserManagementOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserListDetail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urgentSyncCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UrgentSyncCount"));
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
