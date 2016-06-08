/**
 * GPSInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GPSInfo  extends DeviceInfo  implements java.io.Serializable {
    private String photoURL;

    private long photoId;

    private int GPSDeviceClassId;

    private int GPSServiceLevelId;

    private int iconId;

    public GPSInfo() {
    }

    public GPSInfo(
           String deviceName,
           long deviceId,
           long locationId,
           long accountId,
           long deviceSerialNumber,
           String deviceSerialText,
           int deviceClassId,
           String deviceAlias,
           java.util.Calendar deviceCreatedTimeStamp,
           String photoURL,
           long photoId,
           int GPSDeviceClassId,
           int GPSServiceLevelId,
           int iconId) {
        super(
            deviceName,
            deviceId,
            locationId,
            accountId,
            deviceSerialNumber,
            deviceSerialText,
            deviceClassId,
            deviceAlias,
            deviceCreatedTimeStamp);
        this.photoURL = photoURL;
        this.photoId = photoId;
        this.GPSDeviceClassId = GPSDeviceClassId;
        this.GPSServiceLevelId = GPSServiceLevelId;
        this.iconId = iconId;
    }


    /**
     * Gets the photoURL value for this GPSInfo.
     * 
     * @return photoURL
     */
    public String getPhotoURL() {
        return photoURL;
    }


    /**
     * Sets the photoURL value for this GPSInfo.
     * 
     * @param photoURL
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    /**
     * Gets the photoId value for this GPSInfo.
     * 
     * @return photoId
     */
    public long getPhotoId() {
        return photoId;
    }


    /**
     * Sets the photoId value for this GPSInfo.
     * 
     * @param photoId
     */
    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }


    /**
     * Gets the GPSDeviceClassId value for this GPSInfo.
     * 
     * @return GPSDeviceClassId
     */
    public int getGPSDeviceClassId() {
        return GPSDeviceClassId;
    }


    /**
     * Sets the GPSDeviceClassId value for this GPSInfo.
     * 
     * @param GPSDeviceClassId
     */
    public void setGPSDeviceClassId(int GPSDeviceClassId) {
        this.GPSDeviceClassId = GPSDeviceClassId;
    }


    /**
     * Gets the GPSServiceLevelId value for this GPSInfo.
     * 
     * @return GPSServiceLevelId
     */
    public int getGPSServiceLevelId() {
        return GPSServiceLevelId;
    }


    /**
     * Sets the GPSServiceLevelId value for this GPSInfo.
     * 
     * @param GPSServiceLevelId
     */
    public void setGPSServiceLevelId(int GPSServiceLevelId) {
        this.GPSServiceLevelId = GPSServiceLevelId;
    }


    /**
     * Gets the iconId value for this GPSInfo.
     * 
     * @return iconId
     */
    public int getIconId() {
        return iconId;
    }


    /**
     * Sets the iconId value for this GPSInfo.
     * 
     * @param iconId
     */
    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GPSInfo)) return false;
        GPSInfo other = (GPSInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.photoURL==null && other.getPhotoURL()==null) || 
             (this.photoURL!=null &&
              this.photoURL.equals(other.getPhotoURL()))) &&
            this.photoId == other.getPhotoId() &&
            this.GPSDeviceClassId == other.getGPSDeviceClassId() &&
            this.GPSServiceLevelId == other.getGPSServiceLevelId() &&
            this.iconId == other.getIconId();
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
        if (getPhotoURL() != null) {
            _hashCode += getPhotoURL().hashCode();
        }
        _hashCode += new Long(getPhotoId()).hashCode();
        _hashCode += getGPSDeviceClassId();
        _hashCode += getGPSServiceLevelId();
        _hashCode += getIconId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GPSInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSDeviceClassId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceClassId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GPSServiceLevelId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSServiceLevelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iconId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IconId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
