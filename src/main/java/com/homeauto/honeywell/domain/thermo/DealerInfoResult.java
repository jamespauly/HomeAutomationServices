/**
 * DealerInfoResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class DealerInfoResult  extends WebMethodResult implements java.io.Serializable {
    private int dealerInfoID;

    private String companyName;

    private String mainContact;

    private String streetAddress;

    private String city;

    private String state;

    private String zipcode;

    private String country;

    private String telephone;

    private String comments;

    private String email;

    private String website;

    private int locationID;

    private Integer contractorID;

    private LevelOfAccess levelOfAccess;

    private boolean tradeThermostatInstalled;

    private DealerInfoContact[] contacts;

    public DealerInfoResult() {
    }

    public DealerInfoResult(
           Results result,
           int dealerInfoID,
           String companyName,
           String mainContact,
           String streetAddress,
           String city,
           String state,
           String zipcode,
           String country,
           String telephone,
           String comments,
           String email,
           String website,
           int locationID,
           Integer contractorID,
           LevelOfAccess levelOfAccess,
           boolean tradeThermostatInstalled,
           DealerInfoContact[] contacts) {
        super(
            result);
        this.dealerInfoID = dealerInfoID;
        this.companyName = companyName;
        this.mainContact = mainContact;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
        this.telephone = telephone;
        this.comments = comments;
        this.email = email;
        this.website = website;
        this.locationID = locationID;
        this.contractorID = contractorID;
        this.levelOfAccess = levelOfAccess;
        this.tradeThermostatInstalled = tradeThermostatInstalled;
        this.contacts = contacts;
    }


    /**
     * Gets the dealerInfoID value for this DealerInfoResult.
     * 
     * @return dealerInfoID
     */
    public int getDealerInfoID() {
        return dealerInfoID;
    }


    /**
     * Sets the dealerInfoID value for this DealerInfoResult.
     * 
     * @param dealerInfoID
     */
    public void setDealerInfoID(int dealerInfoID) {
        this.dealerInfoID = dealerInfoID;
    }


    /**
     * Gets the companyName value for this DealerInfoResult.
     * 
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this DealerInfoResult.
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the mainContact value for this DealerInfoResult.
     * 
     * @return mainContact
     */
    public String getMainContact() {
        return mainContact;
    }


    /**
     * Sets the mainContact value for this DealerInfoResult.
     * 
     * @param mainContact
     */
    public void setMainContact(String mainContact) {
        this.mainContact = mainContact;
    }


    /**
     * Gets the streetAddress value for this DealerInfoResult.
     * 
     * @return streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }


    /**
     * Sets the streetAddress value for this DealerInfoResult.
     * 
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }


    /**
     * Gets the city value for this DealerInfoResult.
     * 
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DealerInfoResult.
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this DealerInfoResult.
     * 
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this DealerInfoResult.
     * 
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the zipcode value for this DealerInfoResult.
     * 
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this DealerInfoResult.
     * 
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the country value for this DealerInfoResult.
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DealerInfoResult.
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * Gets the telephone value for this DealerInfoResult.
     * 
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this DealerInfoResult.
     * 
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the comments value for this DealerInfoResult.
     * 
     * @return comments
     */
    public String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this DealerInfoResult.
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }


    /**
     * Gets the email value for this DealerInfoResult.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this DealerInfoResult.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the website value for this DealerInfoResult.
     * 
     * @return website
     */
    public String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this DealerInfoResult.
     * 
     * @param website
     */
    public void setWebsite(String website) {
        this.website = website;
    }


    /**
     * Gets the locationID value for this DealerInfoResult.
     * 
     * @return locationID
     */
    public int getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this DealerInfoResult.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the contractorID value for this DealerInfoResult.
     * 
     * @return contractorID
     */
    public Integer getContractorID() {
        return contractorID;
    }


    /**
     * Sets the contractorID value for this DealerInfoResult.
     * 
     * @param contractorID
     */
    public void setContractorID(Integer contractorID) {
        this.contractorID = contractorID;
    }


    /**
     * Gets the levelOfAccess value for this DealerInfoResult.
     * 
     * @return levelOfAccess
     */
    public LevelOfAccess getLevelOfAccess() {
        return levelOfAccess;
    }


    /**
     * Sets the levelOfAccess value for this DealerInfoResult.
     * 
     * @param levelOfAccess
     */
    public void setLevelOfAccess(LevelOfAccess levelOfAccess) {
        this.levelOfAccess = levelOfAccess;
    }


    /**
     * Gets the tradeThermostatInstalled value for this DealerInfoResult.
     * 
     * @return tradeThermostatInstalled
     */
    public boolean isTradeThermostatInstalled() {
        return tradeThermostatInstalled;
    }


    /**
     * Sets the tradeThermostatInstalled value for this DealerInfoResult.
     * 
     * @param tradeThermostatInstalled
     */
    public void setTradeThermostatInstalled(boolean tradeThermostatInstalled) {
        this.tradeThermostatInstalled = tradeThermostatInstalled;
    }


    /**
     * Gets the contacts value for this DealerInfoResult.
     * 
     * @return contacts
     */
    public DealerInfoContact[] getContacts() {
        return contacts;
    }


    /**
     * Sets the contacts value for this DealerInfoResult.
     * 
     * @param contacts
     */
    public void setContacts(DealerInfoContact[] contacts) {
        this.contacts = contacts;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DealerInfoResult)) return false;
        DealerInfoResult other = (DealerInfoResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.dealerInfoID == other.getDealerInfoID() &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.mainContact==null && other.getMainContact()==null) || 
             (this.mainContact!=null &&
              this.mainContact.equals(other.getMainContact()))) &&
            ((this.streetAddress==null && other.getStreetAddress()==null) || 
             (this.streetAddress!=null &&
              this.streetAddress.equals(other.getStreetAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.telephone==null && other.getTelephone()==null) || 
             (this.telephone!=null &&
              this.telephone.equals(other.getTelephone()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            this.locationID == other.getLocationID() &&
            ((this.contractorID==null && other.getContractorID()==null) || 
             (this.contractorID!=null &&
              this.contractorID.equals(other.getContractorID()))) &&
            ((this.levelOfAccess==null && other.getLevelOfAccess()==null) || 
             (this.levelOfAccess!=null &&
              this.levelOfAccess.equals(other.getLevelOfAccess()))) &&
            this.tradeThermostatInstalled == other.isTradeThermostatInstalled() &&
            ((this.contacts==null && other.getContacts()==null) || 
             (this.contacts!=null &&
              java.util.Arrays.equals(this.contacts, other.getContacts())));
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
        _hashCode += getDealerInfoID();
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getMainContact() != null) {
            _hashCode += getMainContact().hashCode();
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
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        _hashCode += getLocationID();
        if (getContractorID() != null) {
            _hashCode += getContractorID().hashCode();
        }
        if (getLevelOfAccess() != null) {
            _hashCode += getLevelOfAccess().hashCode();
        }
        _hashCode += (isTradeThermostatInstalled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getContacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContacts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContacts(), i);
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
        new org.apache.axis.description.TypeDesc(DealerInfoResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerInfoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "MainContact"));
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
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Zipcode"));
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
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ContractorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levelOfAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LevelOfAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LevelOfAccess"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeThermostatInstalled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TradeThermostatInstalled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contacts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Contacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
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
