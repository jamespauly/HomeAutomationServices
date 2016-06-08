/**
 * GetLocationsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class GetLocationsResult  extends WebMethodResult implements java.io.Serializable {
    private LocationInfo[] locations;

    private SiteAlertMessage[] siteAlerts;

    public GetLocationsResult() {
    }

    public GetLocationsResult(
           Results result,
           LocationInfo[] locations,
           SiteAlertMessage[] siteAlerts) {
        super(
            result);
        this.locations = locations;
        this.siteAlerts = siteAlerts;
    }


    /**
     * Gets the locations value for this GetLocationsResult.
     * 
     * @return locations
     */
    public LocationInfo[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this GetLocationsResult.
     * 
     * @param locations
     */
    public void setLocations(LocationInfo[] locations) {
        this.locations = locations;
    }


    /**
     * Gets the siteAlerts value for this GetLocationsResult.
     * 
     * @return siteAlerts
     */
    public SiteAlertMessage[] getSiteAlerts() {
        return siteAlerts;
    }


    /**
     * Sets the siteAlerts value for this GetLocationsResult.
     * 
     * @param siteAlerts
     */
    public void setSiteAlerts(SiteAlertMessage[] siteAlerts) {
        this.siteAlerts = siteAlerts;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetLocationsResult)) return false;
        GetLocationsResult other = (GetLocationsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.siteAlerts==null && other.getSiteAlerts()==null) || 
             (this.siteAlerts!=null &&
              java.util.Arrays.equals(this.siteAlerts, other.getSiteAlerts())));
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
        if (getLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocations());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiteAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSiteAlerts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSiteAlerts(), i);
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
        new org.apache.axis.description.TypeDesc(GetLocationsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetLocationsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "LocationInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAlerts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SiteAlerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SiteAlertMessage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SiteAlertMessage"));
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
