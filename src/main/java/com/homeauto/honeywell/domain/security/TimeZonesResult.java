/**
 * TimeZonesResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TimeZonesResult  extends WebMethodResults implements java.io.Serializable {
    private TimeZoneData[] timeZoneRegions;

    public TimeZonesResult() {
    }

    public TimeZonesResult(
           int resultCode,
           String resultData,
           TimeZoneData[] timeZoneRegions) {
        super(
            resultCode,
            resultData);
        this.timeZoneRegions = timeZoneRegions;
    }


    /**
     * Gets the timeZoneRegions value for this TimeZonesResult.
     * 
     * @return timeZoneRegions
     */
    public TimeZoneData[] getTimeZoneRegions() {
        return timeZoneRegions;
    }


    /**
     * Sets the timeZoneRegions value for this TimeZonesResult.
     * 
     * @param timeZoneRegions
     */
    public void setTimeZoneRegions(TimeZoneData[] timeZoneRegions) {
        this.timeZoneRegions = timeZoneRegions;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeZonesResult)) return false;
        TimeZonesResult other = (TimeZonesResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.timeZoneRegions==null && other.getTimeZoneRegions()==null) || 
             (this.timeZoneRegions!=null &&
              java.util.Arrays.equals(this.timeZoneRegions, other.getTimeZoneRegions())));
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
        if (getTimeZoneRegions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeZoneRegions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTimeZoneRegions(), i);
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
        new org.apache.axis.description.TypeDesc(TimeZonesResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZonesResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneRegions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneRegions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneData"));
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
