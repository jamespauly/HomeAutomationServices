/**
 * LocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class LocationInfo  extends LocationInfoSimple implements java.io.Serializable {
    private int contentServiceLevelID;

    private int doorBellServiceLevelID;

    private int dealerPushMessageRemainingCount;

    private int advertisingServiceLevelID;

    private java.util.Calendar latestMessageDate;

    public LocationInfo() {
    }

    public LocationInfo(
           long locationId,
           String locationName,
           long accountId,
           long photoId,
           int timeZoneId,
           String photoURL,
           boolean setDefaultLocationName,
           String securitySystemAlias,
           long securitySystemPanelDeviceID,
           long countryID,
           String streetNumber,
           String streetName,
           String city,
           long stateID,
           String postalCode,
           String temperatureUnits,
           String latitude,
           String longitude,
           int contentServiceLevelID,
           int doorBellServiceLevelID,
           int dealerPushMessageRemainingCount,
           int advertisingServiceLevelID,
           java.util.Calendar latestMessageDate) {
        super(
            locationId,
            locationName,
            accountId,
            photoId,
            timeZoneId,
            photoURL,
            setDefaultLocationName,
            securitySystemAlias,
            securitySystemPanelDeviceID,
            countryID,
            streetNumber,
            streetName,
            city,
            stateID,
            postalCode,
            temperatureUnits,
            latitude,
            longitude);
        this.contentServiceLevelID = contentServiceLevelID;
        this.doorBellServiceLevelID = doorBellServiceLevelID;
        this.dealerPushMessageRemainingCount = dealerPushMessageRemainingCount;
        this.advertisingServiceLevelID = advertisingServiceLevelID;
        this.latestMessageDate = latestMessageDate;
    }


    /**
     * Gets the contentServiceLevelID value for this LocationInfo.
     * 
     * @return contentServiceLevelID
     */
    public int getContentServiceLevelID() {
        return contentServiceLevelID;
    }


    /**
     * Sets the contentServiceLevelID value for this LocationInfo.
     * 
     * @param contentServiceLevelID
     */
    public void setContentServiceLevelID(int contentServiceLevelID) {
        this.contentServiceLevelID = contentServiceLevelID;
    }


    /**
     * Gets the doorBellServiceLevelID value for this LocationInfo.
     * 
     * @return doorBellServiceLevelID
     */
    public int getDoorBellServiceLevelID() {
        return doorBellServiceLevelID;
    }


    /**
     * Sets the doorBellServiceLevelID value for this LocationInfo.
     * 
     * @param doorBellServiceLevelID
     */
    public void setDoorBellServiceLevelID(int doorBellServiceLevelID) {
        this.doorBellServiceLevelID = doorBellServiceLevelID;
    }


    /**
     * Gets the dealerPushMessageRemainingCount value for this LocationInfo.
     * 
     * @return dealerPushMessageRemainingCount
     */
    public int getDealerPushMessageRemainingCount() {
        return dealerPushMessageRemainingCount;
    }


    /**
     * Sets the dealerPushMessageRemainingCount value for this LocationInfo.
     * 
     * @param dealerPushMessageRemainingCount
     */
    public void setDealerPushMessageRemainingCount(int dealerPushMessageRemainingCount) {
        this.dealerPushMessageRemainingCount = dealerPushMessageRemainingCount;
    }


    /**
     * Gets the advertisingServiceLevelID value for this LocationInfo.
     * 
     * @return advertisingServiceLevelID
     */
    public int getAdvertisingServiceLevelID() {
        return advertisingServiceLevelID;
    }


    /**
     * Sets the advertisingServiceLevelID value for this LocationInfo.
     * 
     * @param advertisingServiceLevelID
     */
    public void setAdvertisingServiceLevelID(int advertisingServiceLevelID) {
        this.advertisingServiceLevelID = advertisingServiceLevelID;
    }


    /**
     * Gets the latestMessageDate value for this LocationInfo.
     * 
     * @return latestMessageDate
     */
    public java.util.Calendar getLatestMessageDate() {
        return latestMessageDate;
    }


    /**
     * Sets the latestMessageDate value for this LocationInfo.
     * 
     * @param latestMessageDate
     */
    public void setLatestMessageDate(java.util.Calendar latestMessageDate) {
        this.latestMessageDate = latestMessageDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocationInfo)) return false;
        LocationInfo other = (LocationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.contentServiceLevelID == other.getContentServiceLevelID() &&
            this.doorBellServiceLevelID == other.getDoorBellServiceLevelID() &&
            this.dealerPushMessageRemainingCount == other.getDealerPushMessageRemainingCount() &&
            this.advertisingServiceLevelID == other.getAdvertisingServiceLevelID() &&
            ((this.latestMessageDate==null && other.getLatestMessageDate()==null) || 
             (this.latestMessageDate!=null &&
              this.latestMessageDate.equals(other.getLatestMessageDate())));
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
        _hashCode += getContentServiceLevelID();
        _hashCode += getDoorBellServiceLevelID();
        _hashCode += getDealerPushMessageRemainingCount();
        _hashCode += getAdvertisingServiceLevelID();
        if (getLatestMessageDate() != null) {
            _hashCode += getLatestMessageDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentServiceLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentServiceLevelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doorBellServiceLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DoorBellServiceLevelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerPushMessageRemainingCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerPushMessageRemainingCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertisingServiceLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AdvertisingServiceLevelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestMessageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LatestMessageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
