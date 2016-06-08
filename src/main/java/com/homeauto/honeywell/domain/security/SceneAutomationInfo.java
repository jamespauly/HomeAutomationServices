/**
 * SceneAutomationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SceneAutomationInfo  implements java.io.Serializable {
    private SceneInfo sceneInfoHeader;

    private long accountID;

    private long deviceID;

    private long deviceSerialNumber;

    private String deviceSerialText;

    private SceneStatusSwitch[] automationSwitch;

    private SceneStatusThermostat[] automationThermostat;

    private SceneStatusLock[] automationLock;

    public SceneAutomationInfo() {
    }

    public SceneAutomationInfo(
           SceneInfo sceneInfoHeader,
           long accountID,
           long deviceID,
           long deviceSerialNumber,
           String deviceSerialText,
           SceneStatusSwitch[] automationSwitch,
           SceneStatusThermostat[] automationThermostat,
           SceneStatusLock[] automationLock) {
           this.sceneInfoHeader = sceneInfoHeader;
           this.accountID = accountID;
           this.deviceID = deviceID;
           this.deviceSerialNumber = deviceSerialNumber;
           this.deviceSerialText = deviceSerialText;
           this.automationSwitch = automationSwitch;
           this.automationThermostat = automationThermostat;
           this.automationLock = automationLock;
    }


    /**
     * Gets the sceneInfoHeader value for this SceneAutomationInfo.
     * 
     * @return sceneInfoHeader
     */
    public SceneInfo getSceneInfoHeader() {
        return sceneInfoHeader;
    }


    /**
     * Sets the sceneInfoHeader value for this SceneAutomationInfo.
     * 
     * @param sceneInfoHeader
     */
    public void setSceneInfoHeader(SceneInfo sceneInfoHeader) {
        this.sceneInfoHeader = sceneInfoHeader;
    }


    /**
     * Gets the accountID value for this SceneAutomationInfo.
     * 
     * @return accountID
     */
    public long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this SceneAutomationInfo.
     * 
     * @param accountID
     */
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the deviceID value for this SceneAutomationInfo.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this SceneAutomationInfo.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceSerialNumber value for this SceneAutomationInfo.
     * 
     * @return deviceSerialNumber
     */
    public long getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this SceneAutomationInfo.
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(long deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the deviceSerialText value for this SceneAutomationInfo.
     * 
     * @return deviceSerialText
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }


    /**
     * Sets the deviceSerialText value for this SceneAutomationInfo.
     * 
     * @param deviceSerialText
     */
    public void setDeviceSerialText(String deviceSerialText) {
        this.deviceSerialText = deviceSerialText;
    }


    /**
     * Gets the automationSwitch value for this SceneAutomationInfo.
     * 
     * @return automationSwitch
     */
    public SceneStatusSwitch[] getAutomationSwitch() {
        return automationSwitch;
    }


    /**
     * Sets the automationSwitch value for this SceneAutomationInfo.
     * 
     * @param automationSwitch
     */
    public void setAutomationSwitch(SceneStatusSwitch[] automationSwitch) {
        this.automationSwitch = automationSwitch;
    }


    /**
     * Gets the automationThermostat value for this SceneAutomationInfo.
     * 
     * @return automationThermostat
     */
    public SceneStatusThermostat[] getAutomationThermostat() {
        return automationThermostat;
    }


    /**
     * Sets the automationThermostat value for this SceneAutomationInfo.
     * 
     * @param automationThermostat
     */
    public void setAutomationThermostat(SceneStatusThermostat[] automationThermostat) {
        this.automationThermostat = automationThermostat;
    }


    /**
     * Gets the automationLock value for this SceneAutomationInfo.
     * 
     * @return automationLock
     */
    public SceneStatusLock[] getAutomationLock() {
        return automationLock;
    }


    /**
     * Sets the automationLock value for this SceneAutomationInfo.
     * 
     * @param automationLock
     */
    public void setAutomationLock(SceneStatusLock[] automationLock) {
        this.automationLock = automationLock;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SceneAutomationInfo)) return false;
        SceneAutomationInfo other = (SceneAutomationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sceneInfoHeader==null && other.getSceneInfoHeader()==null) || 
             (this.sceneInfoHeader!=null &&
              this.sceneInfoHeader.equals(other.getSceneInfoHeader()))) &&
            this.accountID == other.getAccountID() &&
            this.deviceID == other.getDeviceID() &&
            this.deviceSerialNumber == other.getDeviceSerialNumber() &&
            ((this.deviceSerialText==null && other.getDeviceSerialText()==null) || 
             (this.deviceSerialText!=null &&
              this.deviceSerialText.equals(other.getDeviceSerialText()))) &&
            ((this.automationSwitch==null && other.getAutomationSwitch()==null) || 
             (this.automationSwitch!=null &&
              java.util.Arrays.equals(this.automationSwitch, other.getAutomationSwitch()))) &&
            ((this.automationThermostat==null && other.getAutomationThermostat()==null) || 
             (this.automationThermostat!=null &&
              java.util.Arrays.equals(this.automationThermostat, other.getAutomationThermostat()))) &&
            ((this.automationLock==null && other.getAutomationLock()==null) || 
             (this.automationLock!=null &&
              java.util.Arrays.equals(this.automationLock, other.getAutomationLock())));
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
        if (getSceneInfoHeader() != null) {
            _hashCode += getSceneInfoHeader().hashCode();
        }
        _hashCode += new Long(getAccountID()).hashCode();
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += new Long(getDeviceSerialNumber()).hashCode();
        if (getDeviceSerialText() != null) {
            _hashCode += getDeviceSerialText().hashCode();
        }
        if (getAutomationSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutomationSwitch());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAutomationSwitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutomationThermostat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutomationThermostat());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAutomationThermostat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutomationLock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutomationLock());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAutomationLock(), i);
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
        new org.apache.axis.description.TypeDesc(SceneAutomationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneAutomationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneInfoHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneInfoHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceSerialText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceSerialText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusSwitch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusSwitch"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationThermostat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationThermostat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusThermostat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusThermostat"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationLock");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusLock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneStatusLock"));
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
