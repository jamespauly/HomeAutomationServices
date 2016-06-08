/**
 * GetAllNotificationListsResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetAllNotificationListsResults  extends WebMethodResults implements java.io.Serializable {
    private NotificationListBaseInfo[] notificationListCollection;

    public GetAllNotificationListsResults() {
    }

    public GetAllNotificationListsResults(
           int resultCode,
           String resultData,
           NotificationListBaseInfo[] notificationListCollection) {
        super(
            resultCode,
            resultData);
        this.notificationListCollection = notificationListCollection;
    }


    /**
     * Gets the notificationListCollection value for this GetAllNotificationListsResults.
     * 
     * @return notificationListCollection
     */
    public NotificationListBaseInfo[] getNotificationListCollection() {
        return notificationListCollection;
    }


    /**
     * Sets the notificationListCollection value for this GetAllNotificationListsResults.
     * 
     * @param notificationListCollection
     */
    public void setNotificationListCollection(NotificationListBaseInfo[] notificationListCollection) {
        this.notificationListCollection = notificationListCollection;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAllNotificationListsResults)) return false;
        GetAllNotificationListsResults other = (GetAllNotificationListsResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationListCollection==null && other.getNotificationListCollection()==null) || 
             (this.notificationListCollection!=null &&
              java.util.Arrays.equals(this.notificationListCollection, other.getNotificationListCollection())));
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
        if (getNotificationListCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationListCollection());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotificationListCollection(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllNotificationListsResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetAllNotificationListsResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationListCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationListBaseInfo"));
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
