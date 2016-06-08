/**
 * PreferredDealerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class PreferredDealerInfo  implements java.io.Serializable {
    private int locationID;

    private DealerInfoContact[] dealerInfoContacts;

    private LevelOfAccess levelOfAccess;

    private String comments;

    public PreferredDealerInfo() {
    }

    public PreferredDealerInfo(
           int locationID,
           DealerInfoContact[] dealerInfoContacts,
           LevelOfAccess levelOfAccess,
           String comments) {
           this.locationID = locationID;
           this.dealerInfoContacts = dealerInfoContacts;
           this.levelOfAccess = levelOfAccess;
           this.comments = comments;
    }


    /**
     * Gets the locationID value for this PreferredDealerInfo.
     * 
     * @return locationID
     */
    public int getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this PreferredDealerInfo.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the dealerInfoContacts value for this PreferredDealerInfo.
     * 
     * @return dealerInfoContacts
     */
    public DealerInfoContact[] getDealerInfoContacts() {
        return dealerInfoContacts;
    }


    /**
     * Sets the dealerInfoContacts value for this PreferredDealerInfo.
     * 
     * @param dealerInfoContacts
     */
    public void setDealerInfoContacts(DealerInfoContact[] dealerInfoContacts) {
        this.dealerInfoContacts = dealerInfoContacts;
    }


    /**
     * Gets the levelOfAccess value for this PreferredDealerInfo.
     * 
     * @return levelOfAccess
     */
    public LevelOfAccess getLevelOfAccess() {
        return levelOfAccess;
    }


    /**
     * Sets the levelOfAccess value for this PreferredDealerInfo.
     * 
     * @param levelOfAccess
     */
    public void setLevelOfAccess(LevelOfAccess levelOfAccess) {
        this.levelOfAccess = levelOfAccess;
    }


    /**
     * Gets the comments value for this PreferredDealerInfo.
     * 
     * @return comments
     */
    public String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this PreferredDealerInfo.
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreferredDealerInfo)) return false;
        PreferredDealerInfo other = (PreferredDealerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.locationID == other.getLocationID() &&
            ((this.dealerInfoContacts==null && other.getDealerInfoContacts()==null) || 
             (this.dealerInfoContacts!=null &&
              java.util.Arrays.equals(this.dealerInfoContacts, other.getDealerInfoContacts()))) &&
            ((this.levelOfAccess==null && other.getLevelOfAccess()==null) || 
             (this.levelOfAccess!=null &&
              this.levelOfAccess.equals(other.getLevelOfAccess()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getDealerInfoContacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDealerInfoContacts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDealerInfoContacts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLevelOfAccess() != null) {
            _hashCode += getLevelOfAccess().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreferredDealerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PreferredDealerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerInfoContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DealerInfoContact"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("levelOfAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LevelOfAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LevelOfAccess"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Comments"));
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
