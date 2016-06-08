/**
 * GeofenceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GeofenceInfo  implements java.io.Serializable {
    private String geoFenceName;

    private int geofenceID;

    private float latitude;

    private float longitude;

    private double radius;

    private String eventType;

    private int eventTypeID;

    public GeofenceInfo() {
    }

    public GeofenceInfo(
           String geoFenceName,
           int geofenceID,
           float latitude,
           float longitude,
           double radius,
           String eventType,
           int eventTypeID) {
           this.geoFenceName = geoFenceName;
           this.geofenceID = geofenceID;
           this.latitude = latitude;
           this.longitude = longitude;
           this.radius = radius;
           this.eventType = eventType;
           this.eventTypeID = eventTypeID;
    }


    /**
     * Gets the geoFenceName value for this GeofenceInfo.
     * 
     * @return geoFenceName
     */
    public String getGeoFenceName() {
        return geoFenceName;
    }


    /**
     * Sets the geoFenceName value for this GeofenceInfo.
     * 
     * @param geoFenceName
     */
    public void setGeoFenceName(String geoFenceName) {
        this.geoFenceName = geoFenceName;
    }


    /**
     * Gets the geofenceID value for this GeofenceInfo.
     * 
     * @return geofenceID
     */
    public int getGeofenceID() {
        return geofenceID;
    }


    /**
     * Sets the geofenceID value for this GeofenceInfo.
     * 
     * @param geofenceID
     */
    public void setGeofenceID(int geofenceID) {
        this.geofenceID = geofenceID;
    }


    /**
     * Gets the latitude value for this GeofenceInfo.
     * 
     * @return latitude
     */
    public float getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this GeofenceInfo.
     * 
     * @param latitude
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this GeofenceInfo.
     * 
     * @return longitude
     */
    public float getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this GeofenceInfo.
     * 
     * @param longitude
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the radius value for this GeofenceInfo.
     * 
     * @return radius
     */
    public double getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this GeofenceInfo.
     * 
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * Gets the eventType value for this GeofenceInfo.
     * 
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this GeofenceInfo.
     * 
     * @param eventType
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the eventTypeID value for this GeofenceInfo.
     * 
     * @return eventTypeID
     */
    public int getEventTypeID() {
        return eventTypeID;
    }


    /**
     * Sets the eventTypeID value for this GeofenceInfo.
     * 
     * @param eventTypeID
     */
    public void setEventTypeID(int eventTypeID) {
        this.eventTypeID = eventTypeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeofenceInfo)) return false;
        GeofenceInfo other = (GeofenceInfo) obj;
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
            this.geofenceID == other.getGeofenceID() &&
            this.latitude == other.getLatitude() &&
            this.longitude == other.getLongitude() &&
            this.radius == other.getRadius() &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            this.eventTypeID == other.getEventTypeID();
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
        _hashCode += getGeofenceID();
        _hashCode += new Float(getLatitude()).hashCode();
        _hashCode += new Float(getLongitude()).hashCode();
        _hashCode += new Double(getRadius()).hashCode();
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        _hashCode += getEventTypeID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeofenceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoFenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeoFenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geofenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeofenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventTypeID"));
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
