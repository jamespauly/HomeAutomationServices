/**
 * SwitchInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SwitchInfo  implements java.io.Serializable {
    private long deviceID;

    private long switchID;

    private String switchName;

    private short switchIndex;

    private int switchType;

    private short switchState;

    private short switchLevel;

    private short switchIconID;

    private org.apache.axis.types.UnsignedByte deviceStatusID;

    public SwitchInfo() {
    }

    public SwitchInfo(
           long deviceID,
           long switchID,
           String switchName,
           short switchIndex,
           int switchType,
           short switchState,
           short switchLevel,
           short switchIconID,
           org.apache.axis.types.UnsignedByte deviceStatusID) {
           this.deviceID = deviceID;
           this.switchID = switchID;
           this.switchName = switchName;
           this.switchIndex = switchIndex;
           this.switchType = switchType;
           this.switchState = switchState;
           this.switchLevel = switchLevel;
           this.switchIconID = switchIconID;
           this.deviceStatusID = deviceStatusID;
    }


    /**
     * Gets the deviceID value for this SwitchInfo.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this SwitchInfo.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the switchID value for this SwitchInfo.
     * 
     * @return switchID
     */
    public long getSwitchID() {
        return switchID;
    }


    /**
     * Sets the switchID value for this SwitchInfo.
     * 
     * @param switchID
     */
    public void setSwitchID(long switchID) {
        this.switchID = switchID;
    }


    /**
     * Gets the switchName value for this SwitchInfo.
     * 
     * @return switchName
     */
    public String getSwitchName() {
        return switchName;
    }


    /**
     * Sets the switchName value for this SwitchInfo.
     * 
     * @param switchName
     */
    public void setSwitchName(String switchName) {
        this.switchName = switchName;
    }


    /**
     * Gets the switchIndex value for this SwitchInfo.
     * 
     * @return switchIndex
     */
    public short getSwitchIndex() {
        return switchIndex;
    }


    /**
     * Sets the switchIndex value for this SwitchInfo.
     * 
     * @param switchIndex
     */
    public void setSwitchIndex(short switchIndex) {
        this.switchIndex = switchIndex;
    }


    /**
     * Gets the switchType value for this SwitchInfo.
     * 
     * @return switchType
     */
    public int getSwitchType() {
        return switchType;
    }


    /**
     * Sets the switchType value for this SwitchInfo.
     * 
     * @param switchType
     */
    public void setSwitchType(int switchType) {
        this.switchType = switchType;
    }


    /**
     * Gets the switchState value for this SwitchInfo.
     * 
     * @return switchState
     */
    public short getSwitchState() {
        return switchState;
    }


    /**
     * Sets the switchState value for this SwitchInfo.
     * 
     * @param switchState
     */
    public void setSwitchState(short switchState) {
        this.switchState = switchState;
    }


    /**
     * Gets the switchLevel value for this SwitchInfo.
     * 
     * @return switchLevel
     */
    public short getSwitchLevel() {
        return switchLevel;
    }


    /**
     * Sets the switchLevel value for this SwitchInfo.
     * 
     * @param switchLevel
     */
    public void setSwitchLevel(short switchLevel) {
        this.switchLevel = switchLevel;
    }


    /**
     * Gets the switchIconID value for this SwitchInfo.
     * 
     * @return switchIconID
     */
    public short getSwitchIconID() {
        return switchIconID;
    }


    /**
     * Sets the switchIconID value for this SwitchInfo.
     * 
     * @param switchIconID
     */
    public void setSwitchIconID(short switchIconID) {
        this.switchIconID = switchIconID;
    }


    /**
     * Gets the deviceStatusID value for this SwitchInfo.
     * 
     * @return deviceStatusID
     */
    public org.apache.axis.types.UnsignedByte getDeviceStatusID() {
        return deviceStatusID;
    }


    /**
     * Sets the deviceStatusID value for this SwitchInfo.
     * 
     * @param deviceStatusID
     */
    public void setDeviceStatusID(org.apache.axis.types.UnsignedByte deviceStatusID) {
        this.deviceStatusID = deviceStatusID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SwitchInfo)) return false;
        SwitchInfo other = (SwitchInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            this.switchID == other.getSwitchID() &&
            ((this.switchName==null && other.getSwitchName()==null) || 
             (this.switchName!=null &&
              this.switchName.equals(other.getSwitchName()))) &&
            this.switchIndex == other.getSwitchIndex() &&
            this.switchType == other.getSwitchType() &&
            this.switchState == other.getSwitchState() &&
            this.switchLevel == other.getSwitchLevel() &&
            this.switchIconID == other.getSwitchIconID() &&
            ((this.deviceStatusID==null && other.getDeviceStatusID()==null) || 
             (this.deviceStatusID!=null &&
              this.deviceStatusID.equals(other.getDeviceStatusID())));
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
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += new Long(getSwitchID()).hashCode();
        if (getSwitchName() != null) {
            _hashCode += getSwitchName().hashCode();
        }
        _hashCode += getSwitchIndex();
        _hashCode += getSwitchType();
        _hashCode += getSwitchState();
        _hashCode += getSwitchLevel();
        _hashCode += getSwitchIconID();
        if (getDeviceStatusID() != null) {
            _hashCode += getDeviceStatusID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SwitchInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchIconID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchIconID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
