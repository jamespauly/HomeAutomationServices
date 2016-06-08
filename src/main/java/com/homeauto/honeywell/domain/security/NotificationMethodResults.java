/**
 * NotificationMethodResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationMethodResults  extends WebMethodResults implements java.io.Serializable {
    private NotificationMethod[] notificationMethods;

    public NotificationMethodResults() {
    }

    public NotificationMethodResults(
           int resultCode,
           String resultData,
           NotificationMethod[] notificationMethods) {
        super(
            resultCode,
            resultData);
        this.notificationMethods = notificationMethods;
    }


    /**
     * Gets the notificationMethods value for this NotificationMethodResults.
     * 
     * @return notificationMethods
     */
    public NotificationMethod[] getNotificationMethods() {
        return notificationMethods;
    }


    /**
     * Sets the notificationMethods value for this NotificationMethodResults.
     * 
     * @param notificationMethods
     */
    public void setNotificationMethods(NotificationMethod[] notificationMethods) {
        this.notificationMethods = notificationMethods;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationMethodResults)) return false;
        NotificationMethodResults other = (NotificationMethodResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationMethods==null && other.getNotificationMethods()==null) || 
             (this.notificationMethods!=null &&
              java.util.Arrays.equals(this.notificationMethods, other.getNotificationMethods())));
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
        if (getNotificationMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationMethods());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotificationMethods(), i);
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
        new org.apache.axis.description.TypeDesc(NotificationMethodResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethodResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationMethod"));
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
