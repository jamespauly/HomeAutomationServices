/**
 * SessionDetailResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SessionDetailResults  extends WebMethodResults implements java.io.Serializable {
    private String moduleFlags;

    private String sessionID;

    private UserInfoBasic userInfo;

    private LocationInfoBasic[] locations;

    private InterfaceSchemaConfigInfo interfaceSchemaConfigInfo;

    public SessionDetailResults() {
    }

    public SessionDetailResults(
           int resultCode,
           String resultData,
           String moduleFlags,
           String sessionID,
           UserInfoBasic userInfo,
           LocationInfoBasic[] locations,
           InterfaceSchemaConfigInfo interfaceSchemaConfigInfo) {
        super(
            resultCode,
            resultData);
        this.moduleFlags = moduleFlags;
        this.sessionID = sessionID;
        this.userInfo = userInfo;
        this.locations = locations;
        this.interfaceSchemaConfigInfo = interfaceSchemaConfigInfo;
    }


    /**
     * Gets the moduleFlags value for this SessionDetailResults.
     * 
     * @return moduleFlags
     */
    public String getModuleFlags() {
        return moduleFlags;
    }


    /**
     * Sets the moduleFlags value for this SessionDetailResults.
     * 
     * @param moduleFlags
     */
    public void setModuleFlags(String moduleFlags) {
        this.moduleFlags = moduleFlags;
    }


    /**
     * Gets the sessionID value for this SessionDetailResults.
     * 
     * @return sessionID
     */
    public String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this SessionDetailResults.
     * 
     * @param sessionID
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the userInfo value for this SessionDetailResults.
     * 
     * @return userInfo
     */
    public UserInfoBasic getUserInfo() {
        return userInfo;
    }


    /**
     * Sets the userInfo value for this SessionDetailResults.
     * 
     * @param userInfo
     */
    public void setUserInfo(UserInfoBasic userInfo) {
        this.userInfo = userInfo;
    }


    /**
     * Gets the locations value for this SessionDetailResults.
     * 
     * @return locations
     */
    public LocationInfoBasic[] getLocations() {
        return locations;
    }


    /**
     * Sets the locations value for this SessionDetailResults.
     * 
     * @param locations
     */
    public void setLocations(LocationInfoBasic[] locations) {
        this.locations = locations;
    }


    /**
     * Gets the interfaceSchemaConfigInfo value for this SessionDetailResults.
     * 
     * @return interfaceSchemaConfigInfo
     */
    public InterfaceSchemaConfigInfo getInterfaceSchemaConfigInfo() {
        return interfaceSchemaConfigInfo;
    }


    /**
     * Sets the interfaceSchemaConfigInfo value for this SessionDetailResults.
     * 
     * @param interfaceSchemaConfigInfo
     */
    public void setInterfaceSchemaConfigInfo(InterfaceSchemaConfigInfo interfaceSchemaConfigInfo) {
        this.interfaceSchemaConfigInfo = interfaceSchemaConfigInfo;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SessionDetailResults)) return false;
        SessionDetailResults other = (SessionDetailResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.moduleFlags==null && other.getModuleFlags()==null) || 
             (this.moduleFlags!=null &&
              this.moduleFlags.equals(other.getModuleFlags()))) &&
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.userInfo==null && other.getUserInfo()==null) || 
             (this.userInfo!=null &&
              this.userInfo.equals(other.getUserInfo()))) &&
            ((this.locations==null && other.getLocations()==null) || 
             (this.locations!=null &&
              java.util.Arrays.equals(this.locations, other.getLocations()))) &&
            ((this.interfaceSchemaConfigInfo==null && other.getInterfaceSchemaConfigInfo()==null) || 
             (this.interfaceSchemaConfigInfo!=null &&
              this.interfaceSchemaConfigInfo.equals(other.getInterfaceSchemaConfigInfo())));
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
        if (getModuleFlags() != null) {
            _hashCode += getModuleFlags().hashCode();
        }
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getUserInfo() != null) {
            _hashCode += getUserInfo().hashCode();
        }
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
        if (getInterfaceSchemaConfigInfo() != null) {
            _hashCode += getInterfaceSchemaConfigInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionDetailResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionDetailResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModuleFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "UserInfoBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationInfoBasic"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaceSchemaConfigInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaConfigInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "InterfaceSchemaConfigInfo"));
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
