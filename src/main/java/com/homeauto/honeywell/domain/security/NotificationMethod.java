/**
 * NotificationMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationMethod  implements java.io.Serializable {
    private int notificationMethodID;

    private String notificationMethodName;

    public NotificationMethod() {
    }

    public NotificationMethod(
           int notificationMethodID,
           String notificationMethodName) {
           this.notificationMethodID = notificationMethodID;
           this.notificationMethodName = notificationMethodName;
    }


    /**
     * Gets the notificationMethodID value for this NotificationMethod.
     * 
     * @return notificationMethodID
     */
    public int getNotificationMethodID() {
        return notificationMethodID;
    }


    /**
     * Sets the notificationMethodID value for this NotificationMethod.
     * 
     * @param notificationMethodID
     */
    public void setNotificationMethodID(int notificationMethodID) {
        this.notificationMethodID = notificationMethodID;
    }


    /**
     * Gets the notificationMethodName value for this NotificationMethod.
     * 
     * @return notificationMethodName
     */
    public String getNotificationMethodName() {
        return notificationMethodName;
    }


    /**
     * Sets the notificationMethodName value for this NotificationMethod.
     * 
     * @param notificationMethodName
     */
    public void setNotificationMethodName(String notificationMethodName) {
        this.notificationMethodName = notificationMethodName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationMethod)) return false;
        NotificationMethod other = (NotificationMethod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.notificationMethodID == other.getNotificationMethodID() &&
            ((this.notificationMethodName==null && other.getNotificationMethodName()==null) || 
             (this.notificationMethodName!=null &&
              this.notificationMethodName.equals(other.getNotificationMethodName())));
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
        _hashCode += getNotificationMethodID();
        if (getNotificationMethodName() != null) {
            _hashCode += getNotificationMethodName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificationMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMethodID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethodID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMethodName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethodName"));
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
