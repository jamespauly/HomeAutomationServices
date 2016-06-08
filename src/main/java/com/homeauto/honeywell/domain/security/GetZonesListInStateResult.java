/**
 * GetZonesListInStateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetZonesListInStateResult  extends WebMethodResults implements java.io.Serializable {
    private ZoneStatusList zoneStatus;

    public GetZonesListInStateResult() {
    }

    public GetZonesListInStateResult(
           int resultCode,
           String resultData,
           ZoneStatusList zoneStatus) {
        super(
            resultCode,
            resultData);
        this.zoneStatus = zoneStatus;
    }


    /**
     * Gets the zoneStatus value for this GetZonesListInStateResult.
     * 
     * @return zoneStatus
     */
    public ZoneStatusList getZoneStatus() {
        return zoneStatus;
    }


    /**
     * Sets the zoneStatus value for this GetZonesListInStateResult.
     * 
     * @param zoneStatus
     */
    public void setZoneStatus(ZoneStatusList zoneStatus) {
        this.zoneStatus = zoneStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetZonesListInStateResult)) return false;
        GetZonesListInStateResult other = (GetZonesListInStateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.zoneStatus==null && other.getZoneStatus()==null) || 
             (this.zoneStatus!=null &&
              this.zoneStatus.equals(other.getZoneStatus())));
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
        if (getZoneStatus() != null) {
            _hashCode += getZoneStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZonesListInStateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetZonesListInStateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ZoneStatusList"));
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
