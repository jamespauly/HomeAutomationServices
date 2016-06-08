/**
 * ThermostatInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ThermostatInfo  implements java.io.Serializable {
    private long deviceID;

    private long thermostatID;

    private String thermostatName;

    private short thermostatIndex;

    private short currentOpMode;

    private short thermostatMode;

    private short thermostatFanMode;

    private short heatSetPoint;

    private short coolSetPoint;

    private short energySaveHeatSetPoint;

    private short energySaveCoolSetPoint;

    private String temperatureScale;

    private short currentTemperture;

    private short batteryState;

    private ModeInfo[] fanModeList;

    private ModeInfo[] thermostatModeList;

    private ModeInfo[] thermostatSupportedOpModeList;

    private org.apache.axis.types.UnsignedByte deviceStatusID;

    private int lyricUserID;

    private ThermostatPartnerRefData partnerReferenceData;

    private int deviceType;

    private Boolean autoChangeOverEnabled;

    private SmartAwayValues smartAway;

    private TCCThermostatdata TCCthermostatdata;

    public ThermostatInfo() {
    }

    public ThermostatInfo(
           long deviceID,
           long thermostatID,
           String thermostatName,
           short thermostatIndex,
           short currentOpMode,
           short thermostatMode,
           short thermostatFanMode,
           short heatSetPoint,
           short coolSetPoint,
           short energySaveHeatSetPoint,
           short energySaveCoolSetPoint,
           String temperatureScale,
           short currentTemperture,
           short batteryState,
           ModeInfo[] fanModeList,
           ModeInfo[] thermostatModeList,
           ModeInfo[] thermostatSupportedOpModeList,
           org.apache.axis.types.UnsignedByte deviceStatusID,
           int lyricUserID,
           ThermostatPartnerRefData partnerReferenceData,
           int deviceType,
           Boolean autoChangeOverEnabled,
           SmartAwayValues smartAway,
           TCCThermostatdata TCCthermostatdata) {
           this.deviceID = deviceID;
           this.thermostatID = thermostatID;
           this.thermostatName = thermostatName;
           this.thermostatIndex = thermostatIndex;
           this.currentOpMode = currentOpMode;
           this.thermostatMode = thermostatMode;
           this.thermostatFanMode = thermostatFanMode;
           this.heatSetPoint = heatSetPoint;
           this.coolSetPoint = coolSetPoint;
           this.energySaveHeatSetPoint = energySaveHeatSetPoint;
           this.energySaveCoolSetPoint = energySaveCoolSetPoint;
           this.temperatureScale = temperatureScale;
           this.currentTemperture = currentTemperture;
           this.batteryState = batteryState;
           this.fanModeList = fanModeList;
           this.thermostatModeList = thermostatModeList;
           this.thermostatSupportedOpModeList = thermostatSupportedOpModeList;
           this.deviceStatusID = deviceStatusID;
           this.lyricUserID = lyricUserID;
           this.partnerReferenceData = partnerReferenceData;
           this.deviceType = deviceType;
           this.autoChangeOverEnabled = autoChangeOverEnabled;
           this.smartAway = smartAway;
           this.TCCthermostatdata = TCCthermostatdata;
    }


    /**
     * Gets the deviceID value for this ThermostatInfo.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this ThermostatInfo.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the thermostatID value for this ThermostatInfo.
     * 
     * @return thermostatID
     */
    public long getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this ThermostatInfo.
     * 
     * @param thermostatID
     */
    public void setThermostatID(long thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the thermostatName value for this ThermostatInfo.
     * 
     * @return thermostatName
     */
    public String getThermostatName() {
        return thermostatName;
    }


    /**
     * Sets the thermostatName value for this ThermostatInfo.
     * 
     * @param thermostatName
     */
    public void setThermostatName(String thermostatName) {
        this.thermostatName = thermostatName;
    }


    /**
     * Gets the thermostatIndex value for this ThermostatInfo.
     * 
     * @return thermostatIndex
     */
    public short getThermostatIndex() {
        return thermostatIndex;
    }


    /**
     * Sets the thermostatIndex value for this ThermostatInfo.
     * 
     * @param thermostatIndex
     */
    public void setThermostatIndex(short thermostatIndex) {
        this.thermostatIndex = thermostatIndex;
    }


    /**
     * Gets the currentOpMode value for this ThermostatInfo.
     * 
     * @return currentOpMode
     */
    public short getCurrentOpMode() {
        return currentOpMode;
    }


    /**
     * Sets the currentOpMode value for this ThermostatInfo.
     * 
     * @param currentOpMode
     */
    public void setCurrentOpMode(short currentOpMode) {
        this.currentOpMode = currentOpMode;
    }


    /**
     * Gets the thermostatMode value for this ThermostatInfo.
     * 
     * @return thermostatMode
     */
    public short getThermostatMode() {
        return thermostatMode;
    }


    /**
     * Sets the thermostatMode value for this ThermostatInfo.
     * 
     * @param thermostatMode
     */
    public void setThermostatMode(short thermostatMode) {
        this.thermostatMode = thermostatMode;
    }


    /**
     * Gets the thermostatFanMode value for this ThermostatInfo.
     * 
     * @return thermostatFanMode
     */
    public short getThermostatFanMode() {
        return thermostatFanMode;
    }


    /**
     * Sets the thermostatFanMode value for this ThermostatInfo.
     * 
     * @param thermostatFanMode
     */
    public void setThermostatFanMode(short thermostatFanMode) {
        this.thermostatFanMode = thermostatFanMode;
    }


    /**
     * Gets the heatSetPoint value for this ThermostatInfo.
     * 
     * @return heatSetPoint
     */
    public short getHeatSetPoint() {
        return heatSetPoint;
    }


    /**
     * Sets the heatSetPoint value for this ThermostatInfo.
     * 
     * @param heatSetPoint
     */
    public void setHeatSetPoint(short heatSetPoint) {
        this.heatSetPoint = heatSetPoint;
    }


    /**
     * Gets the coolSetPoint value for this ThermostatInfo.
     * 
     * @return coolSetPoint
     */
    public short getCoolSetPoint() {
        return coolSetPoint;
    }


    /**
     * Sets the coolSetPoint value for this ThermostatInfo.
     * 
     * @param coolSetPoint
     */
    public void setCoolSetPoint(short coolSetPoint) {
        this.coolSetPoint = coolSetPoint;
    }


    /**
     * Gets the energySaveHeatSetPoint value for this ThermostatInfo.
     * 
     * @return energySaveHeatSetPoint
     */
    public short getEnergySaveHeatSetPoint() {
        return energySaveHeatSetPoint;
    }


    /**
     * Sets the energySaveHeatSetPoint value for this ThermostatInfo.
     * 
     * @param energySaveHeatSetPoint
     */
    public void setEnergySaveHeatSetPoint(short energySaveHeatSetPoint) {
        this.energySaveHeatSetPoint = energySaveHeatSetPoint;
    }


    /**
     * Gets the energySaveCoolSetPoint value for this ThermostatInfo.
     * 
     * @return energySaveCoolSetPoint
     */
    public short getEnergySaveCoolSetPoint() {
        return energySaveCoolSetPoint;
    }


    /**
     * Sets the energySaveCoolSetPoint value for this ThermostatInfo.
     * 
     * @param energySaveCoolSetPoint
     */
    public void setEnergySaveCoolSetPoint(short energySaveCoolSetPoint) {
        this.energySaveCoolSetPoint = energySaveCoolSetPoint;
    }


    /**
     * Gets the temperatureScale value for this ThermostatInfo.
     * 
     * @return temperatureScale
     */
    public String getTemperatureScale() {
        return temperatureScale;
    }


    /**
     * Sets the temperatureScale value for this ThermostatInfo.
     * 
     * @param temperatureScale
     */
    public void setTemperatureScale(String temperatureScale) {
        this.temperatureScale = temperatureScale;
    }


    /**
     * Gets the currentTemperture value for this ThermostatInfo.
     * 
     * @return currentTemperture
     */
    public short getCurrentTemperture() {
        return currentTemperture;
    }


    /**
     * Sets the currentTemperture value for this ThermostatInfo.
     * 
     * @param currentTemperture
     */
    public void setCurrentTemperture(short currentTemperture) {
        this.currentTemperture = currentTemperture;
    }


    /**
     * Gets the batteryState value for this ThermostatInfo.
     * 
     * @return batteryState
     */
    public short getBatteryState() {
        return batteryState;
    }


    /**
     * Sets the batteryState value for this ThermostatInfo.
     * 
     * @param batteryState
     */
    public void setBatteryState(short batteryState) {
        this.batteryState = batteryState;
    }


    /**
     * Gets the fanModeList value for this ThermostatInfo.
     * 
     * @return fanModeList
     */
    public ModeInfo[] getFanModeList() {
        return fanModeList;
    }


    /**
     * Sets the fanModeList value for this ThermostatInfo.
     * 
     * @param fanModeList
     */
    public void setFanModeList(ModeInfo[] fanModeList) {
        this.fanModeList = fanModeList;
    }


    /**
     * Gets the thermostatModeList value for this ThermostatInfo.
     * 
     * @return thermostatModeList
     */
    public ModeInfo[] getThermostatModeList() {
        return thermostatModeList;
    }


    /**
     * Sets the thermostatModeList value for this ThermostatInfo.
     * 
     * @param thermostatModeList
     */
    public void setThermostatModeList(ModeInfo[] thermostatModeList) {
        this.thermostatModeList = thermostatModeList;
    }


    /**
     * Gets the thermostatSupportedOpModeList value for this ThermostatInfo.
     * 
     * @return thermostatSupportedOpModeList
     */
    public ModeInfo[] getThermostatSupportedOpModeList() {
        return thermostatSupportedOpModeList;
    }


    /**
     * Sets the thermostatSupportedOpModeList value for this ThermostatInfo.
     * 
     * @param thermostatSupportedOpModeList
     */
    public void setThermostatSupportedOpModeList(ModeInfo[] thermostatSupportedOpModeList) {
        this.thermostatSupportedOpModeList = thermostatSupportedOpModeList;
    }


    /**
     * Gets the deviceStatusID value for this ThermostatInfo.
     * 
     * @return deviceStatusID
     */
    public org.apache.axis.types.UnsignedByte getDeviceStatusID() {
        return deviceStatusID;
    }


    /**
     * Sets the deviceStatusID value for this ThermostatInfo.
     * 
     * @param deviceStatusID
     */
    public void setDeviceStatusID(org.apache.axis.types.UnsignedByte deviceStatusID) {
        this.deviceStatusID = deviceStatusID;
    }


    /**
     * Gets the lyricUserID value for this ThermostatInfo.
     * 
     * @return lyricUserID
     */
    public int getLyricUserID() {
        return lyricUserID;
    }


    /**
     * Sets the lyricUserID value for this ThermostatInfo.
     * 
     * @param lyricUserID
     */
    public void setLyricUserID(int lyricUserID) {
        this.lyricUserID = lyricUserID;
    }


    /**
     * Gets the partnerReferenceData value for this ThermostatInfo.
     * 
     * @return partnerReferenceData
     */
    public ThermostatPartnerRefData getPartnerReferenceData() {
        return partnerReferenceData;
    }


    /**
     * Sets the partnerReferenceData value for this ThermostatInfo.
     * 
     * @param partnerReferenceData
     */
    public void setPartnerReferenceData(ThermostatPartnerRefData partnerReferenceData) {
        this.partnerReferenceData = partnerReferenceData;
    }


    /**
     * Gets the deviceType value for this ThermostatInfo.
     * 
     * @return deviceType
     */
    public int getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this ThermostatInfo.
     * 
     * @param deviceType
     */
    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the autoChangeOverEnabled value for this ThermostatInfo.
     * 
     * @return autoChangeOverEnabled
     */
    public Boolean getAutoChangeOverEnabled() {
        return autoChangeOverEnabled;
    }


    /**
     * Sets the autoChangeOverEnabled value for this ThermostatInfo.
     * 
     * @param autoChangeOverEnabled
     */
    public void setAutoChangeOverEnabled(Boolean autoChangeOverEnabled) {
        this.autoChangeOverEnabled = autoChangeOverEnabled;
    }


    /**
     * Gets the smartAway value for this ThermostatInfo.
     * 
     * @return smartAway
     */
    public SmartAwayValues getSmartAway() {
        return smartAway;
    }


    /**
     * Sets the smartAway value for this ThermostatInfo.
     * 
     * @param smartAway
     */
    public void setSmartAway(SmartAwayValues smartAway) {
        this.smartAway = smartAway;
    }


    /**
     * Gets the TCCthermostatdata value for this ThermostatInfo.
     * 
     * @return TCCthermostatdata
     */
    public TCCThermostatdata getTCCthermostatdata() {
        return TCCthermostatdata;
    }


    /**
     * Sets the TCCthermostatdata value for this ThermostatInfo.
     * 
     * @param TCCthermostatdata
     */
    public void setTCCthermostatdata(TCCThermostatdata TCCthermostatdata) {
        this.TCCthermostatdata = TCCthermostatdata;
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
            this.deviceID == other.getDeviceID() &&
            this.thermostatID == other.getThermostatID() &&
            ((this.thermostatName==null && other.getThermostatName()==null) || 
             (this.thermostatName!=null &&
              this.thermostatName.equals(other.getThermostatName()))) &&
            this.thermostatIndex == other.getThermostatIndex() &&
            this.currentOpMode == other.getCurrentOpMode() &&
            this.thermostatMode == other.getThermostatMode() &&
            this.thermostatFanMode == other.getThermostatFanMode() &&
            this.heatSetPoint == other.getHeatSetPoint() &&
            this.coolSetPoint == other.getCoolSetPoint() &&
            this.energySaveHeatSetPoint == other.getEnergySaveHeatSetPoint() &&
            this.energySaveCoolSetPoint == other.getEnergySaveCoolSetPoint() &&
            ((this.temperatureScale==null && other.getTemperatureScale()==null) || 
             (this.temperatureScale!=null &&
              this.temperatureScale.equals(other.getTemperatureScale()))) &&
            this.currentTemperture == other.getCurrentTemperture() &&
            this.batteryState == other.getBatteryState() &&
            ((this.fanModeList==null && other.getFanModeList()==null) || 
             (this.fanModeList!=null &&
              java.util.Arrays.equals(this.fanModeList, other.getFanModeList()))) &&
            ((this.thermostatModeList==null && other.getThermostatModeList()==null) || 
             (this.thermostatModeList!=null &&
              java.util.Arrays.equals(this.thermostatModeList, other.getThermostatModeList()))) &&
            ((this.thermostatSupportedOpModeList==null && other.getThermostatSupportedOpModeList()==null) || 
             (this.thermostatSupportedOpModeList!=null &&
              java.util.Arrays.equals(this.thermostatSupportedOpModeList, other.getThermostatSupportedOpModeList()))) &&
            ((this.deviceStatusID==null && other.getDeviceStatusID()==null) || 
             (this.deviceStatusID!=null &&
              this.deviceStatusID.equals(other.getDeviceStatusID()))) &&
            this.lyricUserID == other.getLyricUserID() &&
            ((this.partnerReferenceData==null && other.getPartnerReferenceData()==null) || 
             (this.partnerReferenceData!=null &&
              this.partnerReferenceData.equals(other.getPartnerReferenceData()))) &&
            this.deviceType == other.getDeviceType() &&
            ((this.autoChangeOverEnabled==null && other.getAutoChangeOverEnabled()==null) || 
             (this.autoChangeOverEnabled!=null &&
              this.autoChangeOverEnabled.equals(other.getAutoChangeOverEnabled()))) &&
            ((this.smartAway==null && other.getSmartAway()==null) || 
             (this.smartAway!=null &&
              this.smartAway.equals(other.getSmartAway()))) &&
            ((this.TCCthermostatdata==null && other.getTCCthermostatdata()==null) || 
             (this.TCCthermostatdata!=null &&
              this.TCCthermostatdata.equals(other.getTCCthermostatdata())));
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
        _hashCode += new Long(getThermostatID()).hashCode();
        if (getThermostatName() != null) {
            _hashCode += getThermostatName().hashCode();
        }
        _hashCode += getThermostatIndex();
        _hashCode += getCurrentOpMode();
        _hashCode += getThermostatMode();
        _hashCode += getThermostatFanMode();
        _hashCode += getHeatSetPoint();
        _hashCode += getCoolSetPoint();
        _hashCode += getEnergySaveHeatSetPoint();
        _hashCode += getEnergySaveCoolSetPoint();
        if (getTemperatureScale() != null) {
            _hashCode += getTemperatureScale().hashCode();
        }
        _hashCode += getCurrentTemperture();
        _hashCode += getBatteryState();
        if (getFanModeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFanModeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFanModeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThermostatModeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThermostatModeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThermostatModeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThermostatSupportedOpModeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThermostatSupportedOpModeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThermostatSupportedOpModeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeviceStatusID() != null) {
            _hashCode += getDeviceStatusID().hashCode();
        }
        _hashCode += getLyricUserID();
        if (getPartnerReferenceData() != null) {
            _hashCode += getPartnerReferenceData().hashCode();
        }
        _hashCode += getDeviceType();
        if (getAutoChangeOverEnabled() != null) {
            _hashCode += getAutoChangeOverEnabled().hashCode();
        }
        if (getSmartAway() != null) {
            _hashCode += getSmartAway().hashCode();
        }
        if (getTCCthermostatdata() != null) {
            _hashCode += getTCCthermostatdata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentOpMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentOpMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatFanMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatFanMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CoolSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("energySaveHeatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EnergySaveHeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("energySaveCoolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EnergySaveCoolSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperatureScale");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TemperatureScale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentTemperture");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentTemperture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "BatteryState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fanModeList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FanModeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatModeList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatModeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatSupportedOpModeList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSupportedOpModeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ModeInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lyricUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LyricUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerReferenceData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartnerReferenceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatPartnerRefData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoChangeOverEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AutoChangeOverEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartAway");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAway"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAwayValues"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCCthermostatdata");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCthermostatdata"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCThermostatdata"));
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
