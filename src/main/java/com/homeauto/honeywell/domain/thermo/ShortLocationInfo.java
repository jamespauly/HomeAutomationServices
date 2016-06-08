/**
 * ShortLocationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ShortLocationInfo  implements java.io.Serializable {
    private int locationID;

    private boolean canControl;

    private String name;

    private String type;

    private String countryCode;

    private String streetAddress;

    private String city;

    private String state;

    private String zipCode;

    private TimeZone timeZone;

    private boolean useDayLightSavingTime;

    private int contractorId;

    private String contractorCompanyName;

    private String notificationEmails;

    public ShortLocationInfo() {
    }

    public ShortLocationInfo(
           int locationID,
           boolean canControl,
           String name,
           String type,
           String countryCode,
           String streetAddress,
           String city,
           String state,
           String zipCode,
           TimeZone timeZone,
           boolean useDayLightSavingTime,
           int contractorId,
           String contractorCompanyName,
           String notificationEmails) {
           this.locationID = locationID;
           this.canControl = canControl;
           this.name = name;
           this.type = type;
           this.countryCode = countryCode;
           this.streetAddress = streetAddress;
           this.city = city;
           this.state = state;
           this.zipCode = zipCode;
           this.timeZone = timeZone;
           this.useDayLightSavingTime = useDayLightSavingTime;
           this.contractorId = contractorId;
           this.contractorCompanyName = contractorCompanyName;
           this.notificationEmails = notificationEmails;
    }


    /**
     * Gets the locationID value for this ShortLocationInfo.
     * 
     * @return locationID
     */
    public int getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this ShortLocationInfo.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the canControl value for this ShortLocationInfo.
     * 
     * @return canControl
     */
    public boolean isCanControl() {
        return canControl;
    }


    /**
     * Sets the canControl value for this ShortLocationInfo.
     * 
     * @param canControl
     */
    public void setCanControl(boolean canControl) {
        this.canControl = canControl;
    }


    /**
     * Gets the name value for this ShortLocationInfo.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this ShortLocationInfo.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this ShortLocationInfo.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this ShortLocationInfo.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the countryCode value for this ShortLocationInfo.
     * 
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this ShortLocationInfo.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the streetAddress value for this ShortLocationInfo.
     * 
     * @return streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }


    /**
     * Sets the streetAddress value for this ShortLocationInfo.
     * 
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    /**
     * Gets the city value for this ShortLocationInfo.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this ShortLocationInfo.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this ShortLocationInfo.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this ShortLocationInfo.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the zipCode value for this ShortLocationInfo.
     * 
     * @return zipCode
     */
    public String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this ShortLocationInfo.
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the timeZone value for this ShortLocationInfo.
     * 
     * @return timeZone
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this ShortLocationInfo.
     * 
     * @param timeZone
     */
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the useDayLightSavingTime value for this ShortLocationInfo.
     * 
     * @return useDayLightSavingTime
     */
    public boolean isUseDayLightSavingTime() {
        return useDayLightSavingTime;
    }


    /**
     * Sets the useDayLightSavingTime value for this ShortLocationInfo.
     * 
     * @param useDayLightSavingTime
     */
    public void setUseDayLightSavingTime(boolean useDayLightSavingTime) {
        this.useDayLightSavingTime = useDayLightSavingTime;
    }


    /**
     * Gets the contractorId value for this ShortLocationInfo.
     * 
     * @return contractorId
     */
    public int getContractorId() {
        return contractorId;
    }


    /**
     * Sets the contractorId value for this ShortLocationInfo.
     * 
     * @param contractorId
     */
    public void setContractorId(int contractorId) {
        this.contractorId = contractorId;
    }


    /**
     * Gets the contractorCompanyName value for this ShortLocationInfo.
     * 
     * @return contractorCompanyName
     */
    public String getContractorCompanyName() {
        return contractorCompanyName;
    }


    /**
     * Sets the contractorCompanyName value for this ShortLocationInfo.
     * 
     * @param contractorCompanyName
     */
    public void setContractorCompanyName(String contractorCompanyName) {
        this.contractorCompanyName = contractorCompanyName;
    }


    /**
     * Gets the notificationEmails value for this ShortLocationInfo.
     * 
     * @return notificationEmails
     */
    public String getNotificationEmails() {
        return notificationEmails;
    }


    /**
     * Sets the notificationEmails value for this ShortLocationInfo.
     * 
     * @param notificationEmails
     */
    public void setNotificationEmails(String notificationEmails) {
        this.notificationEmails = notificationEmails;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShortLocationInfo)) return false;
        ShortLocationInfo other = (ShortLocationInfo) obj;
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
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.streetAddress==null && other.getStreetAddress()==null) || 
             (this.streetAddress!=null &&
              this.streetAddress.equals(other.getStreetAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            this.useDayLightSavingTime == other.isUseDayLightSavingTime() &&
            this.contractorId == other.getContractorId() &&
            ((this.contractorCompanyName==null && other.getContractorCompanyName()==null) || 
             (this.contractorCompanyName!=null &&
              this.contractorCompanyName.equals(other.getContractorCompanyName()))) &&
            ((this.notificationEmails==null && other.getNotificationEmails()==null) || 
             (this.notificationEmails!=null &&
              this.notificationEmails.equals(other.getNotificationEmails())));
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
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getStreetAddress() != null) {
            _hashCode += getStreetAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        _hashCode += (isUseDayLightSavingTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getContractorId();
        if (getContractorCompanyName() != null) {
            _hashCode += getContractorCompanyName().hashCode();
        }
        if (getNotificationEmails() != null) {
            _hashCode += getNotificationEmails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShortLocationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ShortLocationInfo"));
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
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StreetAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "State"));
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
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TimeZone"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDayLightSavingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UseDayLightSavingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractorCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "NotificationEmails"));
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
