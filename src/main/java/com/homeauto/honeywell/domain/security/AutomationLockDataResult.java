/**
 * AutomationLockDataResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class AutomationLockDataResult  extends WebMethodResults implements java.io.Serializable {
    private LockInfo_Transitional[] lockInfo;

    public AutomationLockDataResult() {
    }

    public AutomationLockDataResult(
           int resultCode,
           String resultData,
           LockInfo_Transitional[] lockInfo) {
        super(
            resultCode,
            resultData);
        this.lockInfo = lockInfo;
    }


    /**
     * Gets the lockInfo value for this AutomationLockDataResult.
     * 
     * @return lockInfo
     */
    public LockInfo_Transitional[] getLockInfo() {
        return lockInfo;
    }


    /**
     * Sets the lockInfo value for this AutomationLockDataResult.
     * 
     * @param lockInfo
     */
    public void setLockInfo(LockInfo_Transitional[] lockInfo) {
        this.lockInfo = lockInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AutomationLockDataResult)) return false;
        AutomationLockDataResult other = (AutomationLockDataResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.lockInfo==null && other.getLockInfo()==null) || 
             (this.lockInfo!=null &&
              java.util.Arrays.equals(this.lockInfo, other.getLockInfo())));
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
        if (getLockInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLockInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLockInfo(), i);
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
        new org.apache.axis.description.TypeDesc(AutomationLockDataResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationLockDataResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "lockInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional"));
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
