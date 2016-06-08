/**
 * WiFiLockLocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WiFiLockLocationInfo  implements java.io.Serializable {
    private String locationID;

    private String locationName;

    private WiFiLockInfo[] wifiLocks;

    public WiFiLockLocationInfo() {
    }

    public WiFiLockLocationInfo(
           String locationID,
           String locationName,
           WiFiLockInfo[] wifiLocks) {
           this.locationID = locationID;
           this.locationName = locationName;
           this.wifiLocks = wifiLocks;
    }


    /**
     * Gets the locationID value for this WiFiLockLocationInfo.
     * 
     * @return locationID
     */
    public String getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this WiFiLockLocationInfo.
     * 
     * @param locationID
     */
    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the locationName value for this WiFiLockLocationInfo.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this WiFiLockLocationInfo.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the wifiLocks value for this WiFiLockLocationInfo.
     * 
     * @return wifiLocks
     */
    public WiFiLockInfo[] getWifiLocks() {
        return wifiLocks;
    }


    /**
     * Sets the wifiLocks value for this WiFiLockLocationInfo.
     * 
     * @param wifiLocks
     */
    public void setWifiLocks(WiFiLockInfo[] wifiLocks) {
        this.wifiLocks = wifiLocks;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiFiLockLocationInfo)) return false;
        WiFiLockLocationInfo other = (WiFiLockLocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locationID==null && other.getLocationID()==null) || 
             (this.locationID!=null &&
              this.locationID.equals(other.getLocationID()))) &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.wifiLocks==null && other.getWifiLocks()==null) || 
             (this.wifiLocks!=null &&
              java.util.Arrays.equals(this.wifiLocks, other.getWifiLocks())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLocationID() != null) {
            _hashCode += getLocationID().hashCode();
        }
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getWifiLocks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWifiLocks());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWifiLocks(), i);
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
        new org.apache.axis.description.TypeDesc(WiFiLockLocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockLocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiLocks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiLocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WiFiLockInfo"));
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
