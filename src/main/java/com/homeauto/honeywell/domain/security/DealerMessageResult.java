/**
 * DealerMessageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DealerMessageResult  extends WebMethodResults implements java.io.Serializable {
    private DealerMessageInfo[] dealerMessageList;

    public DealerMessageResult() {
    }

    public DealerMessageResult(
           int resultCode,
           String resultData,
           DealerMessageInfo[] dealerMessageList) {
        super(
            resultCode,
            resultData);
        this.dealerMessageList = dealerMessageList;
    }


    /**
     * Gets the dealerMessageList value for this DealerMessageResult.
     * 
     * @return dealerMessageList
     */
    public DealerMessageInfo[] getDealerMessageList() {
        return dealerMessageList;
    }


    /**
     * Sets the dealerMessageList value for this DealerMessageResult.
     * 
     * @param dealerMessageList
     */
    public void setDealerMessageList(DealerMessageInfo[] dealerMessageList) {
        this.dealerMessageList = dealerMessageList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DealerMessageResult)) return false;
        DealerMessageResult other = (DealerMessageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dealerMessageList==null && other.getDealerMessageList()==null) || 
             (this.dealerMessageList!=null &&
              java.util.Arrays.equals(this.dealerMessageList, other.getDealerMessageList())));
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
        if (getDealerMessageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDealerMessageList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDealerMessageList(), i);
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
        new org.apache.axis.description.TypeDesc(DealerMessageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerMessageList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageInfo"));
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
