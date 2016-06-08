/**
 * WiFiDoorBellInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiDoorBellInfoResult  extends WebMethodResults  implements java.io.Serializable {
    private WiFiDoorBellInfo wifiDoorBellInfo;

    public WiFiDoorBellInfoResult() {
    }

    public WiFiDoorBellInfoResult(
           int resultCode,
           String resultData,
           WiFiDoorBellInfo wifiDoorBellInfo) {
        super(
            resultCode,
            resultData);
        this.wifiDoorBellInfo = wifiDoorBellInfo;
    }


    /**
     * Gets the wifiDoorBellInfo value for this WiFiDoorBellInfoResult.
     * 
     * @return wifiDoorBellInfo
     */
    public WiFiDoorBellInfo getWifiDoorBellInfo() {
        return wifiDoorBellInfo;
    }


    /**
     * Sets the wifiDoorBellInfo value for this WiFiDoorBellInfoResult.
     * 
     * @param wifiDoorBellInfo
     */
    public void setWifiDoorBellInfo(WiFiDoorBellInfo wifiDoorBellInfo) {
        this.wifiDoorBellInfo = wifiDoorBellInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiDoorBellInfoResult)) return false;
        WiFiDoorBellInfoResult other = (WiFiDoorBellInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.wifiDoorBellInfo==null && other.getWifiDoorBellInfo()==null) || 
             (this.wifiDoorBellInfo!=null &&
              this.wifiDoorBellInfo.equals(other.getWifiDoorBellInfo())));
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
        if (getWifiDoorBellInfo() != null) {
            _hashCode += getWifiDoorBellInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WiFiDoorBellInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiDoorBellInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "wifiDoorBellInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiDoorBellInfo"));
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
