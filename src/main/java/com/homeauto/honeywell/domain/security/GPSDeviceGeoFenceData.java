/**
 * GPSDeviceGeoFenceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GPSDeviceGeoFenceData  implements java.io.Serializable {
    private String geoFenceName;

    private long geoFenceId;

    private int direction;

    private String timestamp;

    private String address;

    private float latitude;

    private float longitude;

    public GPSDeviceGeoFenceData() {
    }

    public GPSDeviceGeoFenceData(
           String geoFenceName,
           long geoFenceId,
           int direction,
           String timestamp,
           String address,
           float latitude,
           float longitude) {
           this.geoFenceName = geoFenceName;
           this.geoFenceId = geoFenceId;
           this.direction = direction;
           this.timestamp = timestamp;
           this.address = address;
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the geoFenceName value for this GPSDeviceGeoFenceData.
     * 
     * @return geoFenceName
     */
    public String getGeoFenceName() {
        return geoFenceName;
    }


    /**
     * Sets the geoFenceName value for this GPSDeviceGeoFenceData.
     * 
     * @param geoFenceName
     */
    public void setGeoFenceName(String geoFenceName) {
        this.geoFenceName = geoFenceName;
    }


    /**
     * Gets the geoFenceId value for this GPSDeviceGeoFenceData.
     * 
     * @return geoFenceId
     */
    public long getGeoFenceId() {
        return geoFenceId;
    }


    /**
     * Sets the geoFenceId value for this GPSDeviceGeoFenceData.
     * 
     * @param geoFenceId
     */
    public void setGeoFenceId(long geoFenceId) {
        this.geoFenceId = geoFenceId;
    }


    /**
     * Gets the direction value for this GPSDeviceGeoFenceData.
     * 
     * @return direction
     */
    public int getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this GPSDeviceGeoFenceData.
     * 
     * @param direction
     */
    public void setDirection(int direction) {
        this.direction = direction;
    }


    /**
     * Gets the timestamp value for this GPSDeviceGeoFenceData.
     * 
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this GPSDeviceGeoFenceData.
     * 
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the address value for this GPSDeviceGeoFenceData.
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this GPSDeviceGeoFenceData.
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the latitude value for this GPSDeviceGeoFenceData.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GPSDeviceGeoFenceData.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GPSDeviceGeoFenceData.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GPSDeviceGeoFenceData.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GPSDeviceGeoFenceData)) return false;
        GPSDeviceGeoFenceData other = (GPSDeviceGeoFenceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoFenceName==null && other.getGeoFenceName()==null) || 
             (this.geoFenceName!=null &&
              this.geoFenceName.equals(other.getGeoFenceName()))) &&
            this.geoFenceId == other.getGeoFenceId() &&
            this.direction == other.getDirection() &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude();
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
        if (getGeoFenceName() != null) {
            _hashCode += getGeoFenceName().hashCode();
        }
        _hashCode += new Long(getGeoFenceId()).hashCode();
        _hashCode += getDirection();
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GPSDeviceGeoFenceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GPSDeviceGeoFenceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoFenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeoFenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoFenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeoFenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
