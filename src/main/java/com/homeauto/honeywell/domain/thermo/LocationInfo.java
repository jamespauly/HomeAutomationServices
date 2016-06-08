/**
 * LocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class LocationInfo  implements java.io.Serializable {
    private int locationID;

    private boolean canControl;

    private String name;

    private String type;

    private String country;

    private String zipCode;

    private CurrentWeatherInfo currentWeather;

    private ThermostatInfo[] thermostats;

    private TimeZone timeZone;

    public LocationInfo() {
    }

    public LocationInfo(
           int locationID,
           boolean canControl,
           String name,
           String type,
           String country,
           String zipCode,
           CurrentWeatherInfo currentWeather,
           ThermostatInfo[] thermostats,
           TimeZone timeZone) {
           this.locationID = locationID;
           this.canControl = canControl;
           this.name = name;
           this.type = type;
           this.country = country;
           this.zipCode = zipCode;
           this.currentWeather = currentWeather;
           this.thermostats = thermostats;
           this.timeZone = timeZone;
    }


    /**
     * Gets the locationID value for this LocationInfo.
     * 
     * @return locationID
     */
    public int getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this LocationInfo.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the canControl value for this LocationInfo.
     * 
     * @return canControl
     */
    public boolean isCanControl() {
        return canControl;
    }


    /**
     * Sets the canControl value for this LocationInfo.
     * 
     * @param canControl
     */
    public void setCanControl(boolean canControl) {
        this.canControl = canControl;
    }


    /**
     * Gets the name value for this LocationInfo.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this LocationInfo.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this LocationInfo.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this LocationInfo.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the country value for this LocationInfo.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this LocationInfo.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the zipCode value for this LocationInfo.
     * 
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this LocationInfo.
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the currentWeather value for this LocationInfo.
     * 
     * @return currentWeather
     */
    public CurrentWeatherInfo getCurrentWeather() {
        return currentWeather;
    }


    /**
     * Sets the currentWeather value for this LocationInfo.
     * 
     * @param currentWeather
     */
    public void setCurrentWeather(CurrentWeatherInfo currentWeather) {
        this.currentWeather = currentWeather;
    }


    /**
     * Gets the thermostats value for this LocationInfo.
     * 
     * @return thermostats
     */
    public ThermostatInfo[] getThermostats() {
        return thermostats;
    }


    /**
     * Sets the thermostats value for this LocationInfo.
     * 
     * @param thermostats
     */
    public void setThermostats(ThermostatInfo[] thermostats) {
        this.thermostats = thermostats;
    }


    /**
     * Gets the timeZone value for this LocationInfo.
     * 
     * @return timeZone
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this LocationInfo.
     * 
     * @param timeZone
     */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
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
        _equals = true && 
            this.locationID == other.getLocationID() &&
            this.canControl == other.isCanControl() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.currentWeather==null && other.getCurrentWeather()==null) || 
             (this.currentWeather!=null &&
              this.currentWeather.equals(other.getCurrentWeather()))) &&
            ((this.thermostats==null && other.getThermostats()==null) || 
             (this.thermostats!=null &&
              java.util.Arrays.equals(this.thermostats, other.getThermostats()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone())));
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
        _hashCode += getLocationID();
        _hashCode += (isCanControl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCurrentWeather() != null) {
            _hashCode += getCurrentWeather().hashCode();
        }
        if (getThermostats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThermostats());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThermostats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentWeather");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CurrentWeather"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CurrentWeatherInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Thermostats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"));
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
