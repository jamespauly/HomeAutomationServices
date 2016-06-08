/**
 * CreateLocationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class CreateLocationResult  extends WebMethodResult implements java.io.Serializable {
    private String locationName;

    private int locationID;

    public CreateLocationResult() {
    }

    public CreateLocationResult(
           Results result,
           String locationName,
           int locationID) {
        super(
            result);
        this.locationName = locationName;
        this.locationID = locationID;
    }


    /**
     * Gets the locationName value for this CreateLocationResult.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this CreateLocationResult.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the locationID value for this CreateLocationResult.
     * 
     * @return locationID
     */
    public int getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this CreateLocationResult.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateLocationResult)) return false;
        CreateLocationResult other = (CreateLocationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            this.locationID == other.getLocationID();
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
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        _hashCode += getLocationID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateLocationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CreateLocationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationName"));
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
