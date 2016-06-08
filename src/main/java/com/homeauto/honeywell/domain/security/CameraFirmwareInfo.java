/**
 * CameraFirmwareInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraFirmwareInfo  implements java.io.Serializable {
    private String firmwareVersion;

    private int firmwareVersionNumber;

    private String firmwareVersionDescription;

    private String firmwareVersionState;

    private String firmwareReleaseDate;

    public CameraFirmwareInfo() {
    }

    public CameraFirmwareInfo(
           String firmwareVersion,
           int firmwareVersionNumber,
           String firmwareVersionDescription,
           String firmwareVersionState,
           String firmwareReleaseDate) {
           this.firmwareVersion = firmwareVersion;
           this.firmwareVersionNumber = firmwareVersionNumber;
           this.firmwareVersionDescription = firmwareVersionDescription;
           this.firmwareVersionState = firmwareVersionState;
           this.firmwareReleaseDate = firmwareReleaseDate;
    }


    /**
     * Gets the firmwareVersion value for this CameraFirmwareInfo.
     * 
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }


    /**
     * Sets the firmwareVersion value for this CameraFirmwareInfo.
     * 
     * @param firmwareVersion
     */
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }


    /**
     * Gets the firmwareVersionNumber value for this CameraFirmwareInfo.
     * 
     * @return firmwareVersionNumber
     */
    public int getFirmwareVersionNumber() {
        return firmwareVersionNumber;
    }


    /**
     * Sets the firmwareVersionNumber value for this CameraFirmwareInfo.
     * 
     * @param firmwareVersionNumber
     */
    public void setFirmwareVersionNumber(int firmwareVersionNumber) {
        this.firmwareVersionNumber = firmwareVersionNumber;
    }


    /**
     * Gets the firmwareVersionDescription value for this CameraFirmwareInfo.
     * 
     * @return firmwareVersionDescription
     */
    public String getFirmwareVersionDescription() {
        return firmwareVersionDescription;
    }


    /**
     * Sets the firmwareVersionDescription value for this CameraFirmwareInfo.
     * 
     * @param firmwareVersionDescription
     */
    public void setFirmwareVersionDescription(String firmwareVersionDescription) {
        this.firmwareVersionDescription = firmwareVersionDescription;
    }


    /**
     * Gets the firmwareVersionState value for this CameraFirmwareInfo.
     * 
     * @return firmwareVersionState
     */
    public String getFirmwareVersionState() {
        return firmwareVersionState;
    }


    /**
     * Sets the firmwareVersionState value for this CameraFirmwareInfo.
     * 
     * @param firmwareVersionState
     */
    public void setFirmwareVersionState(String firmwareVersionState) {
        this.firmwareVersionState = firmwareVersionState;
    }


    /**
     * Gets the firmwareReleaseDate value for this CameraFirmwareInfo.
     * 
     * @return firmwareReleaseDate
     */
    public String getFirmwareReleaseDate() {
        return firmwareReleaseDate;
    }


    /**
     * Sets the firmwareReleaseDate value for this CameraFirmwareInfo.
     * 
     * @param firmwareReleaseDate
     */
    public void setFirmwareReleaseDate(String firmwareReleaseDate) {
        this.firmwareReleaseDate = firmwareReleaseDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraFirmwareInfo)) return false;
        CameraFirmwareInfo other = (CameraFirmwareInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firmwareVersion==null && other.getFirmwareVersion()==null) || 
             (this.firmwareVersion!=null &&
              this.firmwareVersion.equals(other.getFirmwareVersion()))) &&
            this.firmwareVersionNumber == other.getFirmwareVersionNumber() &&
            ((this.firmwareVersionDescription==null && other.getFirmwareVersionDescription()==null) || 
             (this.firmwareVersionDescription!=null &&
              this.firmwareVersionDescription.equals(other.getFirmwareVersionDescription()))) &&
            ((this.firmwareVersionState==null && other.getFirmwareVersionState()==null) || 
             (this.firmwareVersionState!=null &&
              this.firmwareVersionState.equals(other.getFirmwareVersionState()))) &&
            ((this.firmwareReleaseDate==null && other.getFirmwareReleaseDate()==null) || 
             (this.firmwareReleaseDate!=null &&
              this.firmwareReleaseDate.equals(other.getFirmwareReleaseDate())));
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
        if (getFirmwareVersion() != null) {
            _hashCode += getFirmwareVersion().hashCode();
        }
        _hashCode += getFirmwareVersionNumber();
        if (getFirmwareVersionDescription() != null) {
            _hashCode += getFirmwareVersionDescription().hashCode();
        }
        if (getFirmwareVersionState() != null) {
            _hashCode += getFirmwareVersionState().hashCode();
        }
        if (getFirmwareReleaseDate() != null) {
            _hashCode += getFirmwareReleaseDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraFirmwareInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraFirmwareInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareVersionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareVersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareVersionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareVersionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareVersionState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareVersionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareReleaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirmwareReleaseDate"));
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
