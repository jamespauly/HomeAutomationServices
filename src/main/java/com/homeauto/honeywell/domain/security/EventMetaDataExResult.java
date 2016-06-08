/**
 * EventMetaDataExResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventMetaDataExResult  extends WebMethodResults implements java.io.Serializable {
    private EventClass[] eventClassCollection;

    private String locationLimitations;

    private CameraSimple[] locationCameraList;

    public EventMetaDataExResult() {
    }

    public EventMetaDataExResult(
           int resultCode,
           String resultData,
           EventClass[] eventClassCollection,
           String locationLimitations,
           CameraSimple[] locationCameraList) {
        super(
            resultCode,
            resultData);
        this.eventClassCollection = eventClassCollection;
        this.locationLimitations = locationLimitations;
        this.locationCameraList = locationCameraList;
    }


    /**
     * Gets the eventClassCollection value for this EventMetaDataExResult.
     * 
     * @return eventClassCollection
     */
    public EventClass[] getEventClassCollection() {
        return eventClassCollection;
    }


    /**
     * Sets the eventClassCollection value for this EventMetaDataExResult.
     * 
     * @param eventClassCollection
     */
    public void setEventClassCollection(EventClass[] eventClassCollection) {
        this.eventClassCollection = eventClassCollection;
    }


    /**
     * Gets the locationLimitations value for this EventMetaDataExResult.
     * 
     * @return locationLimitations
     */
    public String getLocationLimitations() {
        return locationLimitations;
    }


    /**
     * Sets the locationLimitations value for this EventMetaDataExResult.
     * 
     * @param locationLimitations
     */
    public void setLocationLimitations(String locationLimitations) {
        this.locationLimitations = locationLimitations;
    }


    /**
     * Gets the locationCameraList value for this EventMetaDataExResult.
     * 
     * @return locationCameraList
     */
    public CameraSimple[] getLocationCameraList() {
        return locationCameraList;
    }


    /**
     * Sets the locationCameraList value for this EventMetaDataExResult.
     * 
     * @param locationCameraList
     */
    public void setLocationCameraList(CameraSimple[] locationCameraList) {
        this.locationCameraList = locationCameraList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventMetaDataExResult)) return false;
        EventMetaDataExResult other = (EventMetaDataExResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventClassCollection==null && other.getEventClassCollection()==null) || 
             (this.eventClassCollection!=null &&
              java.util.Arrays.equals(this.eventClassCollection, other.getEventClassCollection()))) &&
            ((this.locationLimitations==null && other.getLocationLimitations()==null) || 
             (this.locationLimitations!=null &&
              this.locationLimitations.equals(other.getLocationLimitations()))) &&
            ((this.locationCameraList==null && other.getLocationCameraList()==null) || 
             (this.locationCameraList!=null &&
              java.util.Arrays.equals(this.locationCameraList, other.getLocationCameraList())));
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
        if (getEventClassCollection() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventClassCollection());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEventClassCollection(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationLimitations() != null) {
            _hashCode += getLocationLimitations().hashCode();
        }
        if (getLocationCameraList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationCameraList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLocationCameraList(), i);
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
        new org.apache.axis.description.TypeDesc(EventMetaDataExResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventMetaDataExResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventClassCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClassCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventClass"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationLimitations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationLimitations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCameraList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationCameraList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSimple"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSimple"));
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
