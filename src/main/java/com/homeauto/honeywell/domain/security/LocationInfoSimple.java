/**
 * LocationInfoSimple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class LocationInfoSimple  implements java.io.Serializable {
    private long locationId;

    private String locationName;

    private long accountId;

    private long photoId;

    private int timeZoneId;

    private String photoURL;

    private boolean setDefaultLocationName;

    private String securitySystemAlias;

    private long securitySystemPanelDeviceID;

    private long countryID;

    private String streetNumber;

    private String streetName;

    private String city;

    private long stateID;

    private String postalCode;

    private String temperatureUnits;

    private String latitude;

    private String longitude;

    public LocationInfoSimple() {
    }

    public LocationInfoSimple(
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
           String longitude) {
           this.locationId = locationId;
           this.locationName = locationName;
           this.accountId = accountId;
           this.photoId = photoId;
           this.timeZoneId = timeZoneId;
           this.photoURL = photoURL;
           this.setDefaultLocationName = setDefaultLocationName;
           this.securitySystemAlias = securitySystemAlias;
           this.securitySystemPanelDeviceID = securitySystemPanelDeviceID;
           this.countryID = countryID;
           this.streetNumber = streetNumber;
           this.streetName = streetName;
           this.city = city;
           this.stateID = stateID;
           this.postalCode = postalCode;
           this.temperatureUnits = temperatureUnits;
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the locationId value for this LocationInfoSimple.
     * 
     * @return locationId
     */
    public long getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this LocationInfoSimple.
     * 
     * @param locationId
     */
    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the locationName value for this LocationInfoSimple.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this LocationInfoSimple.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the accountId value for this LocationInfoSimple.
     * 
     * @return accountId
     */
    public long getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this LocationInfoSimple.
     * 
     * @param accountId
     */
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the photoId value for this LocationInfoSimple.
     * 
     * @return photoId
     */
    public long getPhotoId() {
        return photoId;
    }


    /**
     * Sets the photoId value for this LocationInfoSimple.
     * 
     * @param photoId
     */
    public void setPhotoId(long photoId) {
        this.photoId = photoId;
    }


    /**
     * Gets the timeZoneId value for this LocationInfoSimple.
     * 
     * @return timeZoneId
     */
    public int getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this LocationInfoSimple.
     * 
     * @param timeZoneId
     */
    public void setTimeZoneId(int timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the photoURL value for this LocationInfoSimple.
     * 
     * @return photoURL
     */
    public String getPhotoURL() {
        return photoURL;
    }


    /**
     * Sets the photoURL value for this LocationInfoSimple.
     * 
     * @param photoURL
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    /**
     * Gets the setDefaultLocationName value for this LocationInfoSimple.
     * 
     * @return setDefaultLocationName
     */
    public boolean isSetDefaultLocationName() {
        return setDefaultLocationName;
    }


    /**
     * Sets the setDefaultLocationName value for this LocationInfoSimple.
     * 
     * @param setDefaultLocationName
     */
    public void setSetDefaultLocationName(boolean setDefaultLocationName) {
        this.setDefaultLocationName = setDefaultLocationName;
    }


    /**
     * Gets the securitySystemAlias value for this LocationInfoSimple.
     * 
     * @return securitySystemAlias
     */
    public String getSecuritySystemAlias() {
        return securitySystemAlias;
    }


    /**
     * Sets the securitySystemAlias value for this LocationInfoSimple.
     * 
     * @param securitySystemAlias
     */
    public void setSecuritySystemAlias(String securitySystemAlias) {
        this.securitySystemAlias = securitySystemAlias;
    }


    /**
     * Gets the securitySystemPanelDeviceID value for this LocationInfoSimple.
     * 
     * @return securitySystemPanelDeviceID
     */
    public long getSecuritySystemPanelDeviceID() {
        return securitySystemPanelDeviceID;
    }


    /**
     * Sets the securitySystemPanelDeviceID value for this LocationInfoSimple.
     * 
     * @param securitySystemPanelDeviceID
     */
    public void setSecuritySystemPanelDeviceID(long securitySystemPanelDeviceID) {
        this.securitySystemPanelDeviceID = securitySystemPanelDeviceID;
    }


    /**
     * Gets the countryID value for this LocationInfoSimple.
     * 
     * @return countryID
     */
    public long getCountryID() {
        return countryID;
    }


    /**
     * Sets the countryID value for this LocationInfoSimple.
     * 
     * @param countryID
     */
    public void setCountryID(long countryID) {
        this.countryID = countryID;
    }


    /**
     * Gets the streetNumber value for this LocationInfoSimple.
     * 
     * @return streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this LocationInfoSimple.
     * 
     * @param streetNumber
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }


    /**
     * Gets the streetName value for this LocationInfoSimple.
     * 
     * @return streetName
     */
    public String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this LocationInfoSimple.
     * 
     * @param streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the city value for this LocationInfoSimple.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this LocationInfoSimple.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the stateID value for this LocationInfoSimple.
     * 
     * @return stateID
     */
    public long getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this LocationInfoSimple.
     * 
     * @param stateID
     */
    public void setStateID(long stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the postalCode value for this LocationInfoSimple.
     * 
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this LocationInfoSimple.
     * 
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the temperatureUnits value for this LocationInfoSimple.
     * 
     * @return temperatureUnits
     */
    public String getTemperatureUnits() {
        return temperatureUnits;
    }


    /**
     * Sets the temperatureUnits value for this LocationInfoSimple.
     * 
     * @param temperatureUnits
     */
    public void setTemperatureUnits(String temperatureUnits) {
        this.temperatureUnits = temperatureUnits;
    }


    /**
     * Gets the latitude value for this LocationInfoSimple.
     * 
     * @return latitude
     */
    public String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this LocationInfoSimple.
     * 
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this LocationInfoSimple.
     * 
     * @return longitude
     */
    public String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this LocationInfoSimple.
     * 
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocationInfoSimple)) return false;
        LocationInfoSimple other = (LocationInfoSimple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.locationId == other.getLocationId() &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            this.accountId == other.getAccountId() &&
            this.photoId == other.getPhotoId() &&
            this.timeZoneId == other.getTimeZoneId() &&
            ((this.photoURL==null && other.getPhotoURL()==null) || 
             (this.photoURL!=null &&
              this.photoURL.equals(other.getPhotoURL()))) &&
            this.setDefaultLocationName == other.isSetDefaultLocationName() &&
            ((this.securitySystemAlias==null && other.getSecuritySystemAlias()==null) || 
             (this.securitySystemAlias!=null &&
              this.securitySystemAlias.equals(other.getSecuritySystemAlias()))) &&
            this.securitySystemPanelDeviceID == other.getSecuritySystemPanelDeviceID() &&
            this.countryID == other.getCountryID() &&
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            this.stateID == other.getStateID() &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.temperatureUnits==null && other.getTemperatureUnits()==null) || 
             (this.temperatureUnits!=null &&
              this.temperatureUnits.equals(other.getTemperatureUnits()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude())));
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
        _hashCode += new Long(getLocationId()).hashCode();
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        _hashCode += new Long(getAccountId()).hashCode();
        _hashCode += new Long(getPhotoId()).hashCode();
        _hashCode += getTimeZoneId();
        if (getPhotoURL() != null) {
            _hashCode += getPhotoURL().hashCode();
        }
        _hashCode += (isSetDefaultLocationName() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSecuritySystemAlias() != null) {
            _hashCode += getSecuritySystemAlias().hashCode();
        }
        _hashCode += new Long(getSecuritySystemPanelDeviceID()).hashCode();
        _hashCode += new Long(getCountryID()).hashCode();
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        _hashCode += new Long(getStateID()).hashCode();
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getTemperatureUnits() != null) {
            _hashCode += getTemperatureUnits().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationInfoSimple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoSimple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationId"));
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
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("setDefaultLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetDefaultLocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securitySystemAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySystemAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securitySystemPanelDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySystemPanelDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CountryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StreetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperatureUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TemperatureUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
