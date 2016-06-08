/**
 * AutomationInfo_Transitional.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class AutomationInfo_Transitional  implements java.io.Serializable {
    private long accountID;

    private long deviceID;

    private long deviceSerialNumber;

    private String deviceSerialText;

    private short lockCapacity;

    private short switchCapacity;

    private short thermostatCapacity;

    private short sceneCapacity;

    private short deviceCapacityPerScene;

    private boolean syncDeviceFlag;

    private boolean communicationState;

    private int automationStatusLimit;

    private SwitchInfo[] automationSwitch;

    private ThermostatInfo[] automationThermostat;

    private LockInfo_Transitional[] automationLock;

    public AutomationInfo_Transitional() {
    }

    public AutomationInfo_Transitional(
           long accountID,
           long deviceID,
           long deviceSerialNumber,
           String deviceSerialText,
           short lockCapacity,
           short switchCapacity,
           short thermostatCapacity,
           short sceneCapacity,
           short deviceCapacityPerScene,
           boolean syncDeviceFlag,
           boolean communicationState,
           int automationStatusLimit,
           SwitchInfo[] automationSwitch,
           ThermostatInfo[] automationThermostat,
           LockInfo_Transitional[] automationLock) {
           this.accountID = accountID;
           this.deviceID = deviceID;
           this.deviceSerialNumber = deviceSerialNumber;
           this.deviceSerialText = deviceSerialText;
           this.lockCapacity = lockCapacity;
           this.switchCapacity = switchCapacity;
           this.thermostatCapacity = thermostatCapacity;
           this.sceneCapacity = sceneCapacity;
           this.deviceCapacityPerScene = deviceCapacityPerScene;
           this.syncDeviceFlag = syncDeviceFlag;
           this.communicationState = communicationState;
           this.automationStatusLimit = automationStatusLimit;
           this.automationSwitch = automationSwitch;
           this.automationThermostat = automationThermostat;
           this.automationLock = automationLock;
    }


    /**
     * Gets the accountID value for this AutomationInfo_Transitional.
     * 
     * @return accountID
     */
    public long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this AutomationInfo_Transitional.
     * 
     * @param accountID
     */
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the deviceID value for this AutomationInfo_Transitional.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this AutomationInfo_Transitional.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceSerialNumber value for this AutomationInfo_Transitional.
     * 
     * @return deviceSerialNumber
     */
    public long getDeviceSerialNumber() {
        return deviceSerialNumber;
    }


    /**
     * Sets the deviceSerialNumber value for this AutomationInfo_Transitional.
     * 
     * @param deviceSerialNumber
     */
    public void setDeviceSerialNumber(long deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }


    /**
     * Gets the deviceSerialText value for this AutomationInfo_Transitional.
     * 
     * @return deviceSerialText
     */
    public String getDeviceSerialText() {
        return deviceSerialText;
    }


    /**
     * Sets the deviceSerialText value for this AutomationInfo_Transitional.
     * 
     * @param deviceSerialText
     */
    public void setDeviceSerialText(String deviceSerialText) {
        this.deviceSerialText = deviceSerialText;
    }


    /**
     * Gets the lockCapacity value for this AutomationInfo_Transitional.
     * 
     * @return lockCapacity
     */
    public short getLockCapacity() {
        return lockCapacity;
    }


    /**
     * Sets the lockCapacity value for this AutomationInfo_Transitional.
     * 
     * @param lockCapacity
     */
    public void setLockCapacity(short lockCapacity) {
        this.lockCapacity = lockCapacity;
    }


    /**
     * Gets the switchCapacity value for this AutomationInfo_Transitional.
     * 
     * @return switchCapacity
     */
    public short getSwitchCapacity() {
        return switchCapacity;
    }


    /**
     * Sets the switchCapacity value for this AutomationInfo_Transitional.
     * 
     * @param switchCapacity
     */
    public void setSwitchCapacity(short switchCapacity) {
        this.switchCapacity = switchCapacity;
    }


    /**
     * Gets the thermostatCapacity value for this AutomationInfo_Transitional.
     * 
     * @return thermostatCapacity
     */
    public short getThermostatCapacity() {
        return thermostatCapacity;
    }


    /**
     * Sets the thermostatCapacity value for this AutomationInfo_Transitional.
     * 
     * @param thermostatCapacity
     */
    public void setThermostatCapacity(short thermostatCapacity) {
        this.thermostatCapacity = thermostatCapacity;
    }


    /**
     * Gets the sceneCapacity value for this AutomationInfo_Transitional.
     * 
     * @return sceneCapacity
     */
    public short getSceneCapacity() {
        return sceneCapacity;
    }


    /**
     * Sets the sceneCapacity value for this AutomationInfo_Transitional.
     * 
     * @param sceneCapacity
     */
    public void setSceneCapacity(short sceneCapacity) {
        this.sceneCapacity = sceneCapacity;
    }


    /**
     * Gets the deviceCapacityPerScene value for this AutomationInfo_Transitional.
     * 
     * @return deviceCapacityPerScene
     */
    public short getDeviceCapacityPerScene() {
        return deviceCapacityPerScene;
    }


    /**
     * Sets the deviceCapacityPerScene value for this AutomationInfo_Transitional.
     * 
     * @param deviceCapacityPerScene
     */
    public void setDeviceCapacityPerScene(short deviceCapacityPerScene) {
        this.deviceCapacityPerScene = deviceCapacityPerScene;
    }


    /**
     * Gets the syncDeviceFlag value for this AutomationInfo_Transitional.
     * 
     * @return syncDeviceFlag
     */
    public boolean isSyncDeviceFlag() {
        return syncDeviceFlag;
    }


    /**
     * Sets the syncDeviceFlag value for this AutomationInfo_Transitional.
     * 
     * @param syncDeviceFlag
     */
    public void setSyncDeviceFlag(boolean syncDeviceFlag) {
        this.syncDeviceFlag = syncDeviceFlag;
    }


    /**
     * Gets the communicationState value for this AutomationInfo_Transitional.
     * 
     * @return communicationState
     */
    public boolean isCommunicationState() {
        return communicationState;
    }


    /**
     * Sets the communicationState value for this AutomationInfo_Transitional.
     * 
     * @param communicationState
     */
    public void setCommunicationState(boolean communicationState) {
        this.communicationState = communicationState;
    }


    /**
     * Gets the automationStatusLimit value for this AutomationInfo_Transitional.
     * 
     * @return automationStatusLimit
     */
    public int getAutomationStatusLimit() {
        return automationStatusLimit;
    }


    /**
     * Sets the automationStatusLimit value for this AutomationInfo_Transitional.
     * 
     * @param automationStatusLimit
     */
    public void setAutomationStatusLimit(int automationStatusLimit) {
        this.automationStatusLimit = automationStatusLimit;
    }


    /**
     * Gets the automationSwitch value for this AutomationInfo_Transitional.
     * 
     * @return automationSwitch
     */
    public SwitchInfo[] getAutomationSwitch() {
        return automationSwitch;
    }


    /**
     * Sets the automationSwitch value for this AutomationInfo_Transitional.
     * 
     * @param automationSwitch
     */
    public void setAutomationSwitch(SwitchInfo[] automationSwitch) {
        this.automationSwitch = automationSwitch;
    }


    /**
     * Gets the automationThermostat value for this AutomationInfo_Transitional.
     * 
     * @return automationThermostat
     */
    public ThermostatInfo[] getAutomationThermostat() {
        return automationThermostat;
    }


    /**
     * Sets the automationThermostat value for this AutomationInfo_Transitional.
     * 
     * @param automationThermostat
     */
    public void setAutomationThermostat(ThermostatInfo[] automationThermostat) {
        this.automationThermostat = automationThermostat;
    }


    /**
     * Gets the automationLock value for this AutomationInfo_Transitional.
     * 
     * @return automationLock
     */
    public LockInfo_Transitional[] getAutomationLock() {
        return automationLock;
    }


    /**
     * Sets the automationLock value for this AutomationInfo_Transitional.
     * 
     * @param automationLock
     */
    public void setAutomationLock(LockInfo_Transitional[] automationLock) {
        this.automationLock = automationLock;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AutomationInfo_Transitional)) return false;
        AutomationInfo_Transitional other = (AutomationInfo_Transitional) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountID == other.getAccountID() &&
            this.deviceID == other.getDeviceID() &&
            this.deviceSerialNumber == other.getDeviceSerialNumber() &&
            ((this.deviceSerialText==null && other.getDeviceSerialText()==null) || 
             (this.deviceSerialText!=null &&
              this.deviceSerialText.equals(other.getDeviceSerialText()))) &&
            this.lockCapacity == other.getLockCapacity() &&
            this.switchCapacity == other.getSwitchCapacity() &&
            this.thermostatCapacity == other.getThermostatCapacity() &&
            this.sceneCapacity == other.getSceneCapacity() &&
            this.deviceCapacityPerScene == other.getDeviceCapacityPerScene() &&
            this.syncDeviceFlag == other.isSyncDeviceFlag() &&
            this.communicationState == other.isCommunicationState() &&
            this.automationStatusLimit == other.getAutomationStatusLimit() &&
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
        _hashCode += new Long(getAccountID()).hashCode();
        _hashCode += new Long(getDeviceID()).hashCode();
        _hashCode += new Long(getDeviceSerialNumber()).hashCode();
        if (getDeviceSerialText() != null) {
            _hashCode += getDeviceSerialText().hashCode();
        }
        _hashCode += getLockCapacity();
        _hashCode += getSwitchCapacity();
        _hashCode += getThermostatCapacity();
        _hashCode += getSceneCapacity();
        _hashCode += getDeviceCapacityPerScene();
        _hashCode += (isSyncDeviceFlag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCommunicationState() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAutomationStatusLimit();
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
        new org.apache.axis.description.TypeDesc(AutomationInfo_Transitional.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationInfo_Transitional"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("lockCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceCapacityPerScene");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceCapacityPerScene"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncDeviceFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncDeviceFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CommunicationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationStatusLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationStatusLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationThermostat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationThermostat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationLock");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutomationLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockInfo_Transitional"));
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
