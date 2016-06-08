/**
 * SynchronizeUserResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SynchronizeUserResults  extends WebMethodResults implements java.io.Serializable {
    private SyncStatus[] synchronizationStatus;

    public SynchronizeUserResults() {
    }

    public SynchronizeUserResults(
           int resultCode,
           String resultData,
           SyncStatus[] synchronizationStatus) {
        super(
            resultCode,
            resultData);
        this.synchronizationStatus = synchronizationStatus;
    }


    /**
     * Gets the synchronizationStatus value for this SynchronizeUserResults.
     * 
     * @return synchronizationStatus
     */
    public SyncStatus[] getSynchronizationStatus() {
        return synchronizationStatus;
    }


    /**
     * Sets the synchronizationStatus value for this SynchronizeUserResults.
     * 
     * @param synchronizationStatus
     */
    public void setSynchronizationStatus(SyncStatus[] synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SynchronizeUserResults)) return false;
        SynchronizeUserResults other = (SynchronizeUserResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.synchronizationStatus==null && other.getSynchronizationStatus()==null) || 
             (this.synchronizationStatus!=null &&
              java.util.Arrays.equals(this.synchronizationStatus, other.getSynchronizationStatus())));
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
        if (getSynchronizationStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSynchronizationStatus());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSynchronizationStatus(), i);
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
        new org.apache.axis.description.TypeDesc(SynchronizeUserResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizeUserResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronizationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SynchronizationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus"));
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
