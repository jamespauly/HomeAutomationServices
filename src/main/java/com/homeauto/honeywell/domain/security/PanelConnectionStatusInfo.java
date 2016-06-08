/**
 * PanelConnectionStatusInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class PanelConnectionStatusInfo  implements java.io.Serializable {
    private long locationID;

    private String locationName;

    private String photoURL;

    private int connectionStatus;

    private int syncStatus;

    private String syncStatusMessage;

    private int connectionType;

    private Integer singnalStrength;

    public PanelConnectionStatusInfo() {
    }

    public PanelConnectionStatusInfo(
           long locationID,
           String locationName,
           String photoURL,
           int connectionStatus,
           int syncStatus,
           String syncStatusMessage,
           int connectionType,
           Integer singnalStrength) {
           this.locationID = locationID;
           this.locationName = locationName;
           this.photoURL = photoURL;
           this.connectionStatus = connectionStatus;
           this.syncStatus = syncStatus;
           this.syncStatusMessage = syncStatusMessage;
           this.connectionType = connectionType;
           this.singnalStrength = singnalStrength;
    }


    /**
     * Gets the locationID value for this PanelConnectionStatusInfo.
     * 
     * @return locationID
     */
    public long getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this PanelConnectionStatusInfo.
     * 
     * @param locationID
     */
    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the locationName value for this PanelConnectionStatusInfo.
     * 
     * @return locationName
     */
    public String getLocationName() {
        return locationName;
    }


    /**
     * Sets the locationName value for this PanelConnectionStatusInfo.
     * 
     * @param locationName
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    /**
     * Gets the photoURL value for this PanelConnectionStatusInfo.
     * 
     * @return photoURL
     */
    public String getPhotoURL() {
        return photoURL;
    }


    /**
     * Sets the photoURL value for this PanelConnectionStatusInfo.
     * 
     * @param photoURL
     */
    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }


    /**
     * Gets the connectionStatus value for this PanelConnectionStatusInfo.
     * 
     * @return connectionStatus
     */
    public int getConnectionStatus() {
        return connectionStatus;
    }


    /**
     * Sets the connectionStatus value for this PanelConnectionStatusInfo.
     * 
     * @param connectionStatus
     */
    public void setConnectionStatus(int connectionStatus) {
        this.connectionStatus = connectionStatus;
    }


    /**
     * Gets the syncStatus value for this PanelConnectionStatusInfo.
     * 
     * @return syncStatus
     */
    public int getSyncStatus() {
        return syncStatus;
    }


    /**
     * Sets the syncStatus value for this PanelConnectionStatusInfo.
     * 
     * @param syncStatus
     */
    public void setSyncStatus(int syncStatus) {
        this.syncStatus = syncStatus;
    }


    /**
     * Gets the syncStatusMessage value for this PanelConnectionStatusInfo.
     * 
     * @return syncStatusMessage
     */
    public String getSyncStatusMessage() {
        return syncStatusMessage;
    }


    /**
     * Sets the syncStatusMessage value for this PanelConnectionStatusInfo.
     * 
     * @param syncStatusMessage
     */
    public void setSyncStatusMessage(String syncStatusMessage) {
        this.syncStatusMessage = syncStatusMessage;
    }


    /**
     * Gets the connectionType value for this PanelConnectionStatusInfo.
     * 
     * @return connectionType
     */
    public int getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this PanelConnectionStatusInfo.
     * 
     * @param connectionType
     */
    public void setConnectionType(int connectionType) {
        this.connectionType = connectionType;
    }


    /**
     * Gets the singnalStrength value for this PanelConnectionStatusInfo.
     * 
     * @return singnalStrength
     */
    public Integer getSingnalStrength() {
        return singnalStrength;
    }


    /**
     * Sets the singnalStrength value for this PanelConnectionStatusInfo.
     * 
     * @param singnalStrength
     */
    public void setSingnalStrength(Integer singnalStrength) {
        this.singnalStrength = singnalStrength;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelConnectionStatusInfo)) return false;
        PanelConnectionStatusInfo other = (PanelConnectionStatusInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.locationID == other.getLocationID() &&
            ((this.locationName==null && other.getLocationName()==null) || 
             (this.locationName!=null &&
              this.locationName.equals(other.getLocationName()))) &&
            ((this.photoURL==null && other.getPhotoURL()==null) || 
             (this.photoURL!=null &&
              this.photoURL.equals(other.getPhotoURL()))) &&
            this.connectionStatus == other.getConnectionStatus() &&
            this.syncStatus == other.getSyncStatus() &&
            ((this.syncStatusMessage==null && other.getSyncStatusMessage()==null) || 
             (this.syncStatusMessage!=null &&
              this.syncStatusMessage.equals(other.getSyncStatusMessage()))) &&
            this.connectionType == other.getConnectionType() &&
            ((this.singnalStrength==null && other.getSingnalStrength()==null) || 
             (this.singnalStrength!=null &&
              this.singnalStrength.equals(other.getSingnalStrength())));
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
        _hashCode += new Long(getLocationID()).hashCode();
        if (getLocationName() != null) {
            _hashCode += getLocationName().hashCode();
        }
        if (getPhotoURL() != null) {
            _hashCode += getPhotoURL().hashCode();
        }
        _hashCode += getConnectionStatus();
        _hashCode += getSyncStatus();
        if (getSyncStatusMessage() != null) {
            _hashCode += getSyncStatusMessage().hashCode();
        }
        _hashCode += getConnectionType();
        if (getSingnalStrength() != null) {
            _hashCode += getSingnalStrength().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PanelConnectionStatusInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelConnectionStatusInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"));
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
        elemField.setFieldName("photoURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConnectionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncStatusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ConnectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singnalStrength");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SingnalStrength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
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
