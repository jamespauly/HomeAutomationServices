/**
 * GetZoneInfoResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetZoneInfoResults  extends WebMethodResults implements java.io.Serializable {
    private ZoneInfo[] zoneInfoList;

    public GetZoneInfoResults() {
    }

    public GetZoneInfoResults(
           int resultCode,
           String resultData,
           ZoneInfo[] zoneInfoList) {
        super(
            resultCode,
            resultData);
        this.zoneInfoList = zoneInfoList;
    }


    /**
     * Gets the zoneInfoList value for this GetZoneInfoResults.
     * 
     * @return zoneInfoList
     */
    public ZoneInfo[] getZoneInfoList() {
        return zoneInfoList;
    }


    /**
     * Sets the zoneInfoList value for this GetZoneInfoResults.
     * 
     * @param zoneInfoList
     */
    public void setZoneInfoList(ZoneInfo[] zoneInfoList) {
        this.zoneInfoList = zoneInfoList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetZoneInfoResults)) return false;
        GetZoneInfoResults other = (GetZoneInfoResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.zoneInfoList==null && other.getZoneInfoList()==null) || 
             (this.zoneInfoList!=null &&
              java.util.Arrays.equals(this.zoneInfoList, other.getZoneInfoList())));
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
        if (getZoneInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZoneInfoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getZoneInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(GetZoneInfoResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZoneInfoResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneInfo"));
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
