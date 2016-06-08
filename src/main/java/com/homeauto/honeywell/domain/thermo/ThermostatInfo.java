/**
 * ThermostatInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class ThermostatInfo  implements java.io.Serializable {
    private int thermostatID;

    private String macID;

    private int domainID;

    private int instance;

    private String deviceName;

    private String userDefinedDeviceName;

    private boolean upgrading;

    private ThermostatsAlert[] thermostatsAlerts;

    private UIInfo UI;

    private FanInfo fan;

    private HumidificationInfo humidification;

    private EquipmentStatus equipmentStatus;

    private boolean canControlSchedule;

    private boolean willSupportSchedule;

    private DREvent demandResponseEvent;

    public ThermostatInfo() {
    }

    public ThermostatInfo(
           int thermostatID,
           String macID,
           int domainID,
           int instance,
           String deviceName,
           String userDefinedDeviceName,
           boolean upgrading,
           ThermostatsAlert[] thermostatsAlerts,
           UIInfo UI,
           FanInfo fan,
           HumidificationInfo humidification,
           EquipmentStatus equipmentStatus,
           boolean canControlSchedule,
           boolean willSupportSchedule,
           DREvent demandResponseEvent) {
           this.thermostatID = thermostatID;
           this.macID = macID;
           this.domainID = domainID;
           this.instance = instance;
           this.deviceName = deviceName;
           this.userDefinedDeviceName = userDefinedDeviceName;
           this.upgrading = upgrading;
           this.thermostatsAlerts = thermostatsAlerts;
           this.UI = UI;
           this.fan = fan;
           this.humidification = humidification;
           this.equipmentStatus = equipmentStatus;
           this.canControlSchedule = canControlSchedule;
           this.willSupportSchedule = willSupportSchedule;
           this.demandResponseEvent = demandResponseEvent;
    }


    /**
     * Gets the thermostatID value for this ThermostatInfo.
     * 
     * @return thermostatID
     */
    public int getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this ThermostatInfo.
     * 
     * @param thermostatID
     */
    public void setThermostatID(int thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the macID value for this ThermostatInfo.
     * 
     * @return macID
     */
    public String getMacID() {
        return macID;
    }


    /**
     * Sets the macID value for this ThermostatInfo.
     * 
     * @param macID
     */
    public void setMacID(String macID) {
        this.macID = macID;
    }


    /**
     * Gets the domainID value for this ThermostatInfo.
     * 
     * @return domainID
     */
    public int getDomainID() {
        return domainID;
    }


    /**
     * Sets the domainID value for this ThermostatInfo.
     * 
     * @param domainID
     */
    public void setDomainID(int domainID) {
        this.domainID = domainID;
    }


    /**
     * Gets the instance value for this ThermostatInfo.
     * 
     * @return instance
     */
    public int getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this ThermostatInfo.
     * 
     * @param instance
     */
    public void setInstance(int instance) {
        this.instance = instance;
    }


    /**
     * Gets the deviceName value for this ThermostatInfo.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this ThermostatInfo.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the userDefinedDeviceName value for this ThermostatInfo.
     * 
     * @return userDefinedDeviceName
     */
    public String getUserDefinedDeviceName() {
        return userDefinedDeviceName;
    }


    /**
     * Sets the userDefinedDeviceName value for this ThermostatInfo.
     * 
     * @param userDefinedDeviceName
     */
    public void setUserDefinedDeviceName(String userDefinedDeviceName) {
        this.userDefinedDeviceName = userDefinedDeviceName;
    }


    /**
     * Gets the upgrading value for this ThermostatInfo.
     * 
     * @return upgrading
     */
    public boolean isUpgrading() {
        return upgrading;
    }


    /**
     * Sets the upgrading value for this ThermostatInfo.
     * 
     * @param upgrading
     */
    public void setUpgrading(boolean upgrading) {
        this.upgrading = upgrading;
    }


    /**
     * Gets the thermostatsAlerts value for this ThermostatInfo.
     * 
     * @return thermostatsAlerts
     */
    public ThermostatsAlert[] getThermostatsAlerts() {
        return thermostatsAlerts;
    }


    /**
     * Sets the thermostatsAlerts value for this ThermostatInfo.
     * 
     * @param thermostatsAlerts
     */
    public void setThermostatsAlerts(ThermostatsAlert[] thermostatsAlerts) {
        this.thermostatsAlerts = thermostatsAlerts;
    }


    /**
     * Gets the UI value for this ThermostatInfo.
     * 
     * @return UI
     */
    public UIInfo getUI() {
        return UI;
    }


    /**
     * Sets the UI value for this ThermostatInfo.
     * 
     * @param UI
     */
    public void setUI(UIInfo UI) {
        this.UI = UI;
    }


    /**
     * Gets the fan value for this ThermostatInfo.
     * 
     * @return fan
     */
    public FanInfo getFan() {
        return fan;
    }


    /**
     * Sets the fan value for this ThermostatInfo.
     * 
     * @param fan
     */
    public void setFan(FanInfo fan) {
        this.fan = fan;
    }


    /**
     * Gets the humidification value for this ThermostatInfo.
     * 
     * @return humidification
     */
    public HumidificationInfo getHumidification() {
        return humidification;
    }


    /**
     * Sets the humidification value for this ThermostatInfo.
     * 
     * @param humidification
     */
    public void setHumidification(HumidificationInfo humidification) {
        this.humidification = humidification;
    }


    /**
     * Gets the equipmentStatus value for this ThermostatInfo.
     * 
     * @return equipmentStatus
     */
    public EquipmentStatus getEquipmentStatus() {
        return equipmentStatus;
    }


    /**
     * Sets the equipmentStatus value for this ThermostatInfo.
     * 
     * @param equipmentStatus
     */
    public void setEquipmentStatus(EquipmentStatus equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }


    /**
     * Gets the canControlSchedule value for this ThermostatInfo.
     * 
     * @return canControlSchedule
     */
    public boolean isCanControlSchedule() {
        return canControlSchedule;
    }


    /**
     * Sets the canControlSchedule value for this ThermostatInfo.
     * 
     * @param canControlSchedule
     */
    public void setCanControlSchedule(boolean canControlSchedule) {
        this.canControlSchedule = canControlSchedule;
    }


    /**
     * Gets the willSupportSchedule value for this ThermostatInfo.
     * 
     * @return willSupportSchedule
     */
    public boolean isWillSupportSchedule() {
        return willSupportSchedule;
    }


    /**
     * Sets the willSupportSchedule value for this ThermostatInfo.
     * 
     * @param willSupportSchedule
     */
    public void setWillSupportSchedule(boolean willSupportSchedule) {
        this.willSupportSchedule = willSupportSchedule;
    }


    /**
     * Gets the demandResponseEvent value for this ThermostatInfo.
     * 
     * @return demandResponseEvent
     */
    public DREvent getDemandResponseEvent() {
        return demandResponseEvent;
    }


    /**
     * Sets the demandResponseEvent value for this ThermostatInfo.
     * 
     * @param demandResponseEvent
     */
    public void setDemandResponseEvent(DREvent demandResponseEvent) {
        this.demandResponseEvent = demandResponseEvent;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ThermostatInfo)) return false;
        ThermostatInfo other = (ThermostatInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.thermostatID == other.getThermostatID() &&
            ((this.macID==null && other.getMacID()==null) || 
             (this.macID!=null &&
              this.macID.equals(other.getMacID()))) &&
            this.domainID == other.getDomainID() &&
            this.instance == other.getInstance() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            ((this.userDefinedDeviceName==null && other.getUserDefinedDeviceName()==null) || 
             (this.userDefinedDeviceName!=null &&
              this.userDefinedDeviceName.equals(other.getUserDefinedDeviceName()))) &&
            this.upgrading == other.isUpgrading() &&
            ((this.thermostatsAlerts==null && other.getThermostatsAlerts()==null) || 
             (this.thermostatsAlerts!=null &&
              java.util.Arrays.equals(this.thermostatsAlerts, other.getThermostatsAlerts()))) &&
            ((this.UI==null && other.getUI()==null) || 
             (this.UI!=null &&
              this.UI.equals(other.getUI()))) &&
            ((this.fan==null && other.getFan()==null) || 
             (this.fan!=null &&
              this.fan.equals(other.getFan()))) &&
            ((this.humidification==null && other.getHumidification()==null) || 
             (this.humidification!=null &&
              this.humidification.equals(other.getHumidification()))) &&
            ((this.equipmentStatus==null && other.getEquipmentStatus()==null) || 
             (this.equipmentStatus!=null &&
              this.equipmentStatus.equals(other.getEquipmentStatus()))) &&
            this.canControlSchedule == other.isCanControlSchedule() &&
            this.willSupportSchedule == other.isWillSupportSchedule() &&
            ((this.demandResponseEvent==null && other.getDemandResponseEvent()==null) || 
             (this.demandResponseEvent!=null &&
              this.demandResponseEvent.equals(other.getDemandResponseEvent())));
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
        _hashCode += getThermostatID();
        if (getMacID() != null) {
            _hashCode += getMacID().hashCode();
        }
        _hashCode += getDomainID();
        _hashCode += getInstance();
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        if (getUserDefinedDeviceName() != null) {
            _hashCode += getUserDefinedDeviceName().hashCode();
        }
        _hashCode += (isUpgrading() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getThermostatsAlerts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThermostatsAlerts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThermostatsAlerts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUI() != null) {
            _hashCode += getUI().hashCode();
        }
        if (getFan() != null) {
            _hashCode += getFan().hashCode();
        }
        if (getHumidification() != null) {
            _hashCode += getHumidification().hashCode();
        }
        if (getEquipmentStatus() != null) {
            _hashCode += getEquipmentStatus().hashCode();
        }
        _hashCode += (isCanControlSchedule() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWillSupportSchedule() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDemandResponseEvent() != null) {
            _hashCode += getDemandResponseEvent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "MacID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DomainID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Instance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedDeviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UserDefinedDeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upgrading");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Upgrading"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatsAlerts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlerts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlert"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatsAlert"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UIInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Fan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Humidification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EquipmentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EquipmentStatus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canControlSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanControlSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("willSupportSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WillSupportSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandResponseEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DemandResponseEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREvent"));
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
