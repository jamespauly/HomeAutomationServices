/**
 * LocationInfoBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class LocationInfoBasic  implements java.io.Serializable {
    private long locationID;

    private String locationName;

    private String photoURL;

    private String locationModuleFlags;

    private long securityDeviceID;

    private DeviceInfoBasic[] deviceList;

    public LocationInfoBasic() {
    }

    public LocationInfoBasic(
           long locationID,
           String locationName,
           String photoURL,
           String locationModuleFlags,
           long securityDeviceID,
           DeviceInfoBasic[] deviceList) {
           this.locationID = locationID;
           this.locationName = locationName;
           this.photoURL = photoURL;
           this.locationModuleFlags = locationModuleFlags;
           this.securityDeviceID = securityDeviceID;
           this.deviceList = deviceList;
    }


    /**
     * Gets the locationID value for this LocationInfoBasic.
     * 
     * @return locationID
     */
    public long getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this LocationInfoBasic.
     * 
     * @param locationID
     */
    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the locationName value for this LocationInfoBasic.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this LocationInfoBasic.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the photoURL value for this LocationInfoBasic.
     * 
     * @return photoURL
     */
    public String getPhotoURL() {
        return photoURL;
    }


    /**
     * Sets the photoURL value for this LocationInfoBasic.
     * 
     * @param photoURL
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    /**
     * Gets the locationModuleFlags value for this LocationInfoBasic.
     * 
     * @return locationModuleFlags
     */
    public String getLocationModuleFlags() {
        return locationModuleFlags;
    }


    /**
     * Sets the locationModuleFlags value for this LocationInfoBasic.
     * 
     * @param locationModuleFlags
     */
    public void setLocationModuleFlags(String locationModuleFlags) {
        this.locationModuleFlags = locationModuleFlags;
    }


    /**
     * Gets the securityDeviceID value for this LocationInfoBasic.
     * 
     * @return securityDeviceID
     */
    public long getSecurityDeviceID() {
        return securityDeviceID;
    }


    /**
     * Sets the securityDeviceID value for this LocationInfoBasic.
     * 
     * @param securityDeviceID
     */
    public void setSecurityDeviceID(long securityDeviceID) {
        this.securityDeviceID = securityDeviceID;
    }


    /**
     * Gets the deviceList value for this LocationInfoBasic.
     * 
     * @return deviceList
     */
    public DeviceInfoBasic[] getDeviceList() {
        return deviceList;
    }


    /**
     * Sets the deviceList value for this LocationInfoBasic.
     * 
     * @param deviceList
     */
    public void setDeviceList(DeviceInfoBasic[] deviceList) {
        this.deviceList = deviceList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocationInfoBasic)) return false;
        LocationInfoBasic other = (LocationInfoBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.locationID == other.getLocationID() &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.photoURL==null && other.getPhotoURL()==null) || 
             (this.photoURL!=null &&
              this.photoURL.equals(other.getPhotoURL()))) &&
            ((this.locationModuleFlags==null && other.getLocationModuleFlags()==null) || 
             (this.locationModuleFlags!=null &&
              this.locationModuleFlags.equals(other.getLocationModuleFlags()))) &&
            this.securityDeviceID == other.getSecurityDeviceID() &&
            ((this.deviceList==null && other.getDeviceList()==null) || 
             (this.deviceList!=null &&
              java.util.Arrays.equals(this.deviceList, other.getDeviceList())));
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
        _hashCode += new Long(getLocationID()).hashCode();
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getPhotoURL() != null) {
            _hashCode += getPhotoURL().hashCode();
        }
        if (getLocationModuleFlags() != null) {
            _hashCode += getLocationModuleFlags().hashCode();
        }
        _hashCode += new Long(getSecurityDeviceID()).hashCode();
        if (getDeviceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeviceList(), i);
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
        new org.apache.axis.description.TypeDesc(LocationInfoBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("photoURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationModuleFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationModuleFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecurityDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceInfoBasic"));
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
