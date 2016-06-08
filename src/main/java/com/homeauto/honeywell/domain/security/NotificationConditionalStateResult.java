/**
 * NotificationConditionalStateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class NotificationConditionalStateResult  extends WebMethodResults implements java.io.Serializable {
    private NotificationConditionalState[] notificationConditionalStates;

    public NotificationConditionalStateResult() {
    }

    public NotificationConditionalStateResult(
           int resultCode,
           String resultData,
           NotificationConditionalState[] notificationConditionalStates) {
        super(
            resultCode,
            resultData);
        this.notificationConditionalStates = notificationConditionalStates;
    }


    /**
     * Gets the notificationConditionalStates value for this NotificationConditionalStateResult.
     * 
     * @return notificationConditionalStates
     */
    public NotificationConditionalState[] getNotificationConditionalStates() {
        return notificationConditionalStates;
    }


    /**
     * Sets the notificationConditionalStates value for this NotificationConditionalStateResult.
     * 
     * @param notificationConditionalStates
     */
    public void setNotificationConditionalStates(NotificationConditionalState[] notificationConditionalStates) {
        this.notificationConditionalStates = notificationConditionalStates;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NotificationConditionalStateResult)) return false;
        NotificationConditionalStateResult other = (NotificationConditionalStateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationConditionalStates==null && other.getNotificationConditionalStates()==null) || 
             (this.notificationConditionalStates!=null &&
              java.util.Arrays.equals(this.notificationConditionalStates, other.getNotificationConditionalStates())));
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
        if (getNotificationConditionalStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationConditionalStates());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNotificationConditionalStates(), i);
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
        new org.apache.axis.description.TypeDesc(NotificationConditionalStateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalStateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationConditionalStates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NotificationConditionalState"));
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
