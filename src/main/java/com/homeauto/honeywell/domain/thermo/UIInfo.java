/**
 * UIInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class UIInfo  implements java.io.Serializable {
    private java.util.Calendar created;

    private boolean thermostatLocked;

    private java.math.BigDecimal outdoorTemp;

    private java.math.BigDecimal dispTemperature;

    private java.math.BigDecimal heatSetpoint;

    private java.math.BigDecimal coolSetpoint;

    private String displayedUnits;

    private int statusHeat;

    private int statusCool;

    private boolean holdUntilCapable;

    private boolean scheduleCapable;

    private int vacationHold;

    private boolean dualSetpointStatus;

    private int heatNextPeriod;

    private int coolNextPeriod;

    private java.math.BigDecimal heatLowerSetptLimit;

    private java.math.BigDecimal heatUpperSetptLimit;

    private java.math.BigDecimal coolLowerSetptLimit;

    private java.math.BigDecimal coolUpperSetptLimit;

    private java.math.BigDecimal schedHeatSp;

    private java.math.BigDecimal schedCoolSp;

    private int systemSwitchPosition;

    private boolean canSetSwitchAuto;

    private boolean canSetSwitchCool;

    private boolean canSetSwitchOff;

    private boolean canSetSwitchHeat;

    private boolean canSetSwitchEmergencyHeat;

    private boolean canSetSwitchSouthernAway;

    private java.math.BigDecimal deadband;

    private java.math.BigDecimal outdoorHumidity;

    private java.math.BigDecimal indoorHumidity;

    private boolean commercial;

    private ChangeSource systemSwitchChangeSource;

    private ChangeSource heatSetpointChangeSource;

    private ChangeSource coolSetpointChangeSource;

    private ChangeSource vacationHoldChangeSource;

    public UIInfo() {
    }

    public UIInfo(
           java.util.Calendar created,
           boolean thermostatLocked,
           java.math.BigDecimal outdoorTemp,
           java.math.BigDecimal dispTemperature,
           java.math.BigDecimal heatSetpoint,
           java.math.BigDecimal coolSetpoint,
           String displayedUnits,
           int statusHeat,
           int statusCool,
           boolean holdUntilCapable,
           boolean scheduleCapable,
           int vacationHold,
           boolean dualSetpointStatus,
           int heatNextPeriod,
           int coolNextPeriod,
           java.math.BigDecimal heatLowerSetptLimit,
           java.math.BigDecimal heatUpperSetptLimit,
           java.math.BigDecimal coolLowerSetptLimit,
           java.math.BigDecimal coolUpperSetptLimit,
           java.math.BigDecimal schedHeatSp,
           java.math.BigDecimal schedCoolSp,
           int systemSwitchPosition,
           boolean canSetSwitchAuto,
           boolean canSetSwitchCool,
           boolean canSetSwitchOff,
           boolean canSetSwitchHeat,
           boolean canSetSwitchEmergencyHeat,
           boolean canSetSwitchSouthernAway,
           java.math.BigDecimal deadband,
           java.math.BigDecimal outdoorHumidity,
           java.math.BigDecimal indoorHumidity,
           boolean commercial,
           ChangeSource systemSwitchChangeSource,
           ChangeSource heatSetpointChangeSource,
           ChangeSource coolSetpointChangeSource,
           ChangeSource vacationHoldChangeSource) {
           this.created = created;
           this.thermostatLocked = thermostatLocked;
           this.outdoorTemp = outdoorTemp;
           this.dispTemperature = dispTemperature;
           this.heatSetpoint = heatSetpoint;
           this.coolSetpoint = coolSetpoint;
           this.displayedUnits = displayedUnits;
           this.statusHeat = statusHeat;
           this.statusCool = statusCool;
           this.holdUntilCapable = holdUntilCapable;
           this.scheduleCapable = scheduleCapable;
           this.vacationHold = vacationHold;
           this.dualSetpointStatus = dualSetpointStatus;
           this.heatNextPeriod = heatNextPeriod;
           this.coolNextPeriod = coolNextPeriod;
           this.heatLowerSetptLimit = heatLowerSetptLimit;
           this.heatUpperSetptLimit = heatUpperSetptLimit;
           this.coolLowerSetptLimit = coolLowerSetptLimit;
           this.coolUpperSetptLimit = coolUpperSetptLimit;
           this.schedHeatSp = schedHeatSp;
           this.schedCoolSp = schedCoolSp;
           this.systemSwitchPosition = systemSwitchPosition;
           this.canSetSwitchAuto = canSetSwitchAuto;
           this.canSetSwitchCool = canSetSwitchCool;
           this.canSetSwitchOff = canSetSwitchOff;
           this.canSetSwitchHeat = canSetSwitchHeat;
           this.canSetSwitchEmergencyHeat = canSetSwitchEmergencyHeat;
           this.canSetSwitchSouthernAway = canSetSwitchSouthernAway;
           this.deadband = deadband;
           this.outdoorHumidity = outdoorHumidity;
           this.indoorHumidity = indoorHumidity;
           this.commercial = commercial;
           this.systemSwitchChangeSource = systemSwitchChangeSource;
           this.heatSetpointChangeSource = heatSetpointChangeSource;
           this.coolSetpointChangeSource = coolSetpointChangeSource;
           this.vacationHoldChangeSource = vacationHoldChangeSource;
    }


    /**
     * Gets the created value for this UIInfo.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this UIInfo.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the thermostatLocked value for this UIInfo.
     * 
     * @return thermostatLocked
     */
    public boolean isThermostatLocked() {
        return thermostatLocked;
    }


    /**
     * Sets the thermostatLocked value for this UIInfo.
     * 
     * @param thermostatLocked
     */
    public void setThermostatLocked(boolean thermostatLocked) {
        this.thermostatLocked = thermostatLocked;
    }


    /**
     * Gets the outdoorTemp value for this UIInfo.
     * 
     * @return outdoorTemp
     */
    public java.math.BigDecimal getOutdoorTemp() {
        return outdoorTemp;
    }


    /**
     * Sets the outdoorTemp value for this UIInfo.
     * 
     * @param outdoorTemp
     */
    public void setOutdoorTemp(java.math.BigDecimal outdoorTemp) {
        this.outdoorTemp = outdoorTemp;
    }


    /**
     * Gets the dispTemperature value for this UIInfo.
     * 
     * @return dispTemperature
     */
    public java.math.BigDecimal getDispTemperature() {
        return dispTemperature;
    }


    /**
     * Sets the dispTemperature value for this UIInfo.
     * 
     * @param dispTemperature
     */
    public void setDispTemperature(java.math.BigDecimal dispTemperature) {
        this.dispTemperature = dispTemperature;
    }


    /**
     * Gets the heatSetpoint value for this UIInfo.
     * 
     * @return heatSetpoint
     */
    public java.math.BigDecimal getHeatSetpoint() {
        return heatSetpoint;
    }


    /**
     * Sets the heatSetpoint value for this UIInfo.
     * 
     * @param heatSetpoint
     */
    public void setHeatSetpoint(java.math.BigDecimal heatSetpoint) {
        this.heatSetpoint = heatSetpoint;
    }


    /**
     * Gets the coolSetpoint value for this UIInfo.
     * 
     * @return coolSetpoint
     */
    public java.math.BigDecimal getCoolSetpoint() {
        return coolSetpoint;
    }


    /**
     * Sets the coolSetpoint value for this UIInfo.
     * 
     * @param coolSetpoint
     */
    public void setCoolSetpoint(java.math.BigDecimal coolSetpoint) {
        this.coolSetpoint = coolSetpoint;
    }


    /**
     * Gets the displayedUnits value for this UIInfo.
     * 
     * @return displayedUnits
     */
    public String getDisplayedUnits() {
        return displayedUnits;
    }


    /**
     * Sets the displayedUnits value for this UIInfo.
     * 
     * @param displayedUnits
     */
    public void setDisplayedUnits(String displayedUnits) {
        this.displayedUnits = displayedUnits;
    }


    /**
     * Gets the statusHeat value for this UIInfo.
     * 
     * @return statusHeat
     */
    public int getStatusHeat() {
        return statusHeat;
    }


    /**
     * Sets the statusHeat value for this UIInfo.
     * 
     * @param statusHeat
     */
    public void setStatusHeat(int statusHeat) {
        this.statusHeat = statusHeat;
    }


    /**
     * Gets the statusCool value for this UIInfo.
     * 
     * @return statusCool
     */
    public int getStatusCool() {
        return statusCool;
    }


    /**
     * Sets the statusCool value for this UIInfo.
     * 
     * @param statusCool
     */
    public void setStatusCool(int statusCool) {
        this.statusCool = statusCool;
    }


    /**
     * Gets the holdUntilCapable value for this UIInfo.
     * 
     * @return holdUntilCapable
     */
    public boolean isHoldUntilCapable() {
        return holdUntilCapable;
    }


    /**
     * Sets the holdUntilCapable value for this UIInfo.
     * 
     * @param holdUntilCapable
     */
    public void setHoldUntilCapable(boolean holdUntilCapable) {
        this.holdUntilCapable = holdUntilCapable;
    }


    /**
     * Gets the scheduleCapable value for this UIInfo.
     * 
     * @return scheduleCapable
     */
    public boolean isScheduleCapable() {
        return scheduleCapable;
    }


    /**
     * Sets the scheduleCapable value for this UIInfo.
     * 
     * @param scheduleCapable
     */
    public void setScheduleCapable(boolean scheduleCapable) {
        this.scheduleCapable = scheduleCapable;
    }


    /**
     * Gets the vacationHold value for this UIInfo.
     * 
     * @return vacationHold
     */
    public int getVacationHold() {
        return vacationHold;
    }


    /**
     * Sets the vacationHold value for this UIInfo.
     * 
     * @param vacationHold
     */
    public void setVacationHold(int vacationHold) {
        this.vacationHold = vacationHold;
    }


    /**
     * Gets the dualSetpointStatus value for this UIInfo.
     * 
     * @return dualSetpointStatus
     */
    public boolean isDualSetpointStatus() {
        return dualSetpointStatus;
    }


    /**
     * Sets the dualSetpointStatus value for this UIInfo.
     * 
     * @param dualSetpointStatus
     */
    public void setDualSetpointStatus(boolean dualSetpointStatus) {
        this.dualSetpointStatus = dualSetpointStatus;
    }


    /**
     * Gets the heatNextPeriod value for this UIInfo.
     * 
     * @return heatNextPeriod
     */
    public int getHeatNextPeriod() {
        return heatNextPeriod;
    }


    /**
     * Sets the heatNextPeriod value for this UIInfo.
     * 
     * @param heatNextPeriod
     */
    public void setHeatNextPeriod(int heatNextPeriod) {
        this.heatNextPeriod = heatNextPeriod;
    }


    /**
     * Gets the coolNextPeriod value for this UIInfo.
     * 
     * @return coolNextPeriod
     */
    public int getCoolNextPeriod() {
        return coolNextPeriod;
    }


    /**
     * Sets the coolNextPeriod value for this UIInfo.
     * 
     * @param coolNextPeriod
     */
    public void setCoolNextPeriod(int coolNextPeriod) {
        this.coolNextPeriod = coolNextPeriod;
    }


    /**
     * Gets the heatLowerSetptLimit value for this UIInfo.
     * 
     * @return heatLowerSetptLimit
     */
    public java.math.BigDecimal getHeatLowerSetptLimit() {
        return heatLowerSetptLimit;
    }


    /**
     * Sets the heatLowerSetptLimit value for this UIInfo.
     * 
     * @param heatLowerSetptLimit
     */
    public void setHeatLowerSetptLimit(java.math.BigDecimal heatLowerSetptLimit) {
        this.heatLowerSetptLimit = heatLowerSetptLimit;
    }


    /**
     * Gets the heatUpperSetptLimit value for this UIInfo.
     * 
     * @return heatUpperSetptLimit
     */
    public java.math.BigDecimal getHeatUpperSetptLimit() {
        return heatUpperSetptLimit;
    }


    /**
     * Sets the heatUpperSetptLimit value for this UIInfo.
     * 
     * @param heatUpperSetptLimit
     */
    public void setHeatUpperSetptLimit(java.math.BigDecimal heatUpperSetptLimit) {
        this.heatUpperSetptLimit = heatUpperSetptLimit;
    }


    /**
     * Gets the coolLowerSetptLimit value for this UIInfo.
     * 
     * @return coolLowerSetptLimit
     */
    public java.math.BigDecimal getCoolLowerSetptLimit() {
        return coolLowerSetptLimit;
    }


    /**
     * Sets the coolLowerSetptLimit value for this UIInfo.
     * 
     * @param coolLowerSetptLimit
     */
    public void setCoolLowerSetptLimit(java.math.BigDecimal coolLowerSetptLimit) {
        this.coolLowerSetptLimit = coolLowerSetptLimit;
    }


    /**
     * Gets the coolUpperSetptLimit value for this UIInfo.
     * 
     * @return coolUpperSetptLimit
     */
    public java.math.BigDecimal getCoolUpperSetptLimit() {
        return coolUpperSetptLimit;
    }


    /**
     * Sets the coolUpperSetptLimit value for this UIInfo.
     * 
     * @param coolUpperSetptLimit
     */
    public void setCoolUpperSetptLimit(java.math.BigDecimal coolUpperSetptLimit) {
        this.coolUpperSetptLimit = coolUpperSetptLimit;
    }


    /**
     * Gets the schedHeatSp value for this UIInfo.
     * 
     * @return schedHeatSp
     */
    public java.math.BigDecimal getSchedHeatSp() {
        return schedHeatSp;
    }


    /**
     * Sets the schedHeatSp value for this UIInfo.
     * 
     * @param schedHeatSp
     */
    public void setSchedHeatSp(java.math.BigDecimal schedHeatSp) {
        this.schedHeatSp = schedHeatSp;
    }


    /**
     * Gets the schedCoolSp value for this UIInfo.
     * 
     * @return schedCoolSp
     */
    public java.math.BigDecimal getSchedCoolSp() {
        return schedCoolSp;
    }


    /**
     * Sets the schedCoolSp value for this UIInfo.
     * 
     * @param schedCoolSp
     */
    public void setSchedCoolSp(java.math.BigDecimal schedCoolSp) {
        this.schedCoolSp = schedCoolSp;
    }


    /**
     * Gets the systemSwitchPosition value for this UIInfo.
     * 
     * @return systemSwitchPosition
     */
    public int getSystemSwitchPosition() {
        return systemSwitchPosition;
    }


    /**
     * Sets the systemSwitchPosition value for this UIInfo.
     * 
     * @param systemSwitchPosition
     */
    public void setSystemSwitchPosition(int systemSwitchPosition) {
        this.systemSwitchPosition = systemSwitchPosition;
    }


    /**
     * Gets the canSetSwitchAuto value for this UIInfo.
     * 
     * @return canSetSwitchAuto
     */
    public boolean isCanSetSwitchAuto() {
        return canSetSwitchAuto;
    }


    /**
     * Sets the canSetSwitchAuto value for this UIInfo.
     * 
     * @param canSetSwitchAuto
     */
    public void setCanSetSwitchAuto(boolean canSetSwitchAuto) {
        this.canSetSwitchAuto = canSetSwitchAuto;
    }


    /**
     * Gets the canSetSwitchCool value for this UIInfo.
     * 
     * @return canSetSwitchCool
     */
    public boolean isCanSetSwitchCool() {
        return canSetSwitchCool;
    }


    /**
     * Sets the canSetSwitchCool value for this UIInfo.
     * 
     * @param canSetSwitchCool
     */
    public void setCanSetSwitchCool(boolean canSetSwitchCool) {
        this.canSetSwitchCool = canSetSwitchCool;
    }


    /**
     * Gets the canSetSwitchOff value for this UIInfo.
     * 
     * @return canSetSwitchOff
     */
    public boolean isCanSetSwitchOff() {
        return canSetSwitchOff;
    }


    /**
     * Sets the canSetSwitchOff value for this UIInfo.
     * 
     * @param canSetSwitchOff
     */
    public void setCanSetSwitchOff(boolean canSetSwitchOff) {
        this.canSetSwitchOff = canSetSwitchOff;
    }


    /**
     * Gets the canSetSwitchHeat value for this UIInfo.
     * 
     * @return canSetSwitchHeat
     */
    public boolean isCanSetSwitchHeat() {
        return canSetSwitchHeat;
    }


    /**
     * Sets the canSetSwitchHeat value for this UIInfo.
     * 
     * @param canSetSwitchHeat
     */
    public void setCanSetSwitchHeat(boolean canSetSwitchHeat) {
        this.canSetSwitchHeat = canSetSwitchHeat;
    }


    /**
     * Gets the canSetSwitchEmergencyHeat value for this UIInfo.
     * 
     * @return canSetSwitchEmergencyHeat
     */
    public boolean isCanSetSwitchEmergencyHeat() {
        return canSetSwitchEmergencyHeat;
    }


    /**
     * Sets the canSetSwitchEmergencyHeat value for this UIInfo.
     * 
     * @param canSetSwitchEmergencyHeat
     */
    public void setCanSetSwitchEmergencyHeat(boolean canSetSwitchEmergencyHeat) {
        this.canSetSwitchEmergencyHeat = canSetSwitchEmergencyHeat;
    }


    /**
     * Gets the canSetSwitchSouthernAway value for this UIInfo.
     * 
     * @return canSetSwitchSouthernAway
     */
    public boolean isCanSetSwitchSouthernAway() {
        return canSetSwitchSouthernAway;
    }


    /**
     * Sets the canSetSwitchSouthernAway value for this UIInfo.
     * 
     * @param canSetSwitchSouthernAway
     */
    public void setCanSetSwitchSouthernAway(boolean canSetSwitchSouthernAway) {
        this.canSetSwitchSouthernAway = canSetSwitchSouthernAway;
    }


    /**
     * Gets the deadband value for this UIInfo.
     * 
     * @return deadband
     */
    public java.math.BigDecimal getDeadband() {
        return deadband;
    }


    /**
     * Sets the deadband value for this UIInfo.
     * 
     * @param deadband
     */
    public void setDeadband(java.math.BigDecimal deadband) {
        this.deadband = deadband;
    }


    /**
     * Gets the outdoorHumidity value for this UIInfo.
     * 
     * @return outdoorHumidity
     */
    public java.math.BigDecimal getOutdoorHumidity() {
        return outdoorHumidity;
    }


    /**
     * Sets the outdoorHumidity value for this UIInfo.
     * 
     * @param outdoorHumidity
     */
    public void setOutdoorHumidity(java.math.BigDecimal outdoorHumidity) {
        this.outdoorHumidity = outdoorHumidity;
    }


    /**
     * Gets the indoorHumidity value for this UIInfo.
     * 
     * @return indoorHumidity
     */
    public java.math.BigDecimal getIndoorHumidity() {
        return indoorHumidity;
    }


    /**
     * Sets the indoorHumidity value for this UIInfo.
     * 
     * @param indoorHumidity
     */
    public void setIndoorHumidity(java.math.BigDecimal indoorHumidity) {
        this.indoorHumidity = indoorHumidity;
    }


    /**
     * Gets the commercial value for this UIInfo.
     * 
     * @return commercial
     */
    public boolean isCommercial() {
        return commercial;
    }


    /**
     * Sets the commercial value for this UIInfo.
     * 
     * @param commercial
     */
    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
    }


    /**
     * Gets the systemSwitchChangeSource value for this UIInfo.
     * 
     * @return systemSwitchChangeSource
     */
    public ChangeSource getSystemSwitchChangeSource() {
        return systemSwitchChangeSource;
    }


    /**
     * Sets the systemSwitchChangeSource value for this UIInfo.
     * 
     * @param systemSwitchChangeSource
     */
    public void setSystemSwitchChangeSource(ChangeSource systemSwitchChangeSource) {
        this.systemSwitchChangeSource = systemSwitchChangeSource;
    }


    /**
     * Gets the heatSetpointChangeSource value for this UIInfo.
     * 
     * @return heatSetpointChangeSource
     */
    public ChangeSource getHeatSetpointChangeSource() {
        return heatSetpointChangeSource;
    }


    /**
     * Sets the heatSetpointChangeSource value for this UIInfo.
     * 
     * @param heatSetpointChangeSource
     */
    public void setHeatSetpointChangeSource(ChangeSource heatSetpointChangeSource) {
        this.heatSetpointChangeSource = heatSetpointChangeSource;
    }


    /**
     * Gets the coolSetpointChangeSource value for this UIInfo.
     * 
     * @return coolSetpointChangeSource
     */
    public ChangeSource getCoolSetpointChangeSource() {
        return coolSetpointChangeSource;
    }


    /**
     * Sets the coolSetpointChangeSource value for this UIInfo.
     * 
     * @param coolSetpointChangeSource
     */
    public void setCoolSetpointChangeSource(ChangeSource coolSetpointChangeSource) {
        this.coolSetpointChangeSource = coolSetpointChangeSource;
    }


    /**
     * Gets the vacationHoldChangeSource value for this UIInfo.
     * 
     * @return vacationHoldChangeSource
     */
    public ChangeSource getVacationHoldChangeSource() {
        return vacationHoldChangeSource;
    }


    /**
     * Sets the vacationHoldChangeSource value for this UIInfo.
     * 
     * @param vacationHoldChangeSource
     */
    public void setVacationHoldChangeSource(ChangeSource vacationHoldChangeSource) {
        this.vacationHoldChangeSource = vacationHoldChangeSource;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UIInfo)) return false;
        UIInfo other = (UIInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            this.thermostatLocked == other.isThermostatLocked() &&
            ((this.outdoorTemp==null && other.getOutdoorTemp()==null) || 
             (this.outdoorTemp!=null &&
              this.outdoorTemp.equals(other.getOutdoorTemp()))) &&
            ((this.dispTemperature==null && other.getDispTemperature()==null) || 
             (this.dispTemperature!=null &&
              this.dispTemperature.equals(other.getDispTemperature()))) &&
            ((this.heatSetpoint==null && other.getHeatSetpoint()==null) || 
             (this.heatSetpoint!=null &&
              this.heatSetpoint.equals(other.getHeatSetpoint()))) &&
            ((this.coolSetpoint==null && other.getCoolSetpoint()==null) || 
             (this.coolSetpoint!=null &&
              this.coolSetpoint.equals(other.getCoolSetpoint()))) &&
            ((this.displayedUnits==null && other.getDisplayedUnits()==null) || 
             (this.displayedUnits!=null &&
              this.displayedUnits.equals(other.getDisplayedUnits()))) &&
            this.statusHeat == other.getStatusHeat() &&
            this.statusCool == other.getStatusCool() &&
            this.holdUntilCapable == other.isHoldUntilCapable() &&
            this.scheduleCapable == other.isScheduleCapable() &&
            this.vacationHold == other.getVacationHold() &&
            this.dualSetpointStatus == other.isDualSetpointStatus() &&
            this.heatNextPeriod == other.getHeatNextPeriod() &&
            this.coolNextPeriod == other.getCoolNextPeriod() &&
            ((this.heatLowerSetptLimit==null && other.getHeatLowerSetptLimit()==null) || 
             (this.heatLowerSetptLimit!=null &&
              this.heatLowerSetptLimit.equals(other.getHeatLowerSetptLimit()))) &&
            ((this.heatUpperSetptLimit==null && other.getHeatUpperSetptLimit()==null) || 
             (this.heatUpperSetptLimit!=null &&
              this.heatUpperSetptLimit.equals(other.getHeatUpperSetptLimit()))) &&
            ((this.coolLowerSetptLimit==null && other.getCoolLowerSetptLimit()==null) || 
             (this.coolLowerSetptLimit!=null &&
              this.coolLowerSetptLimit.equals(other.getCoolLowerSetptLimit()))) &&
            ((this.coolUpperSetptLimit==null && other.getCoolUpperSetptLimit()==null) || 
             (this.coolUpperSetptLimit!=null &&
              this.coolUpperSetptLimit.equals(other.getCoolUpperSetptLimit()))) &&
            ((this.schedHeatSp==null && other.getSchedHeatSp()==null) || 
             (this.schedHeatSp!=null &&
              this.schedHeatSp.equals(other.getSchedHeatSp()))) &&
            ((this.schedCoolSp==null && other.getSchedCoolSp()==null) || 
             (this.schedCoolSp!=null &&
              this.schedCoolSp.equals(other.getSchedCoolSp()))) &&
            this.systemSwitchPosition == other.getSystemSwitchPosition() &&
            this.canSetSwitchAuto == other.isCanSetSwitchAuto() &&
            this.canSetSwitchCool == other.isCanSetSwitchCool() &&
            this.canSetSwitchOff == other.isCanSetSwitchOff() &&
            this.canSetSwitchHeat == other.isCanSetSwitchHeat() &&
            this.canSetSwitchEmergencyHeat == other.isCanSetSwitchEmergencyHeat() &&
            this.canSetSwitchSouthernAway == other.isCanSetSwitchSouthernAway() &&
            ((this.deadband==null && other.getDeadband()==null) || 
             (this.deadband!=null &&
              this.deadband.equals(other.getDeadband()))) &&
            ((this.outdoorHumidity==null && other.getOutdoorHumidity()==null) || 
             (this.outdoorHumidity!=null &&
              this.outdoorHumidity.equals(other.getOutdoorHumidity()))) &&
            ((this.indoorHumidity==null && other.getIndoorHumidity()==null) || 
             (this.indoorHumidity!=null &&
              this.indoorHumidity.equals(other.getIndoorHumidity()))) &&
            this.commercial == other.isCommercial() &&
            ((this.systemSwitchChangeSource==null && other.getSystemSwitchChangeSource()==null) || 
             (this.systemSwitchChangeSource!=null &&
              this.systemSwitchChangeSource.equals(other.getSystemSwitchChangeSource()))) &&
            ((this.heatSetpointChangeSource==null && other.getHeatSetpointChangeSource()==null) || 
             (this.heatSetpointChangeSource!=null &&
              this.heatSetpointChangeSource.equals(other.getHeatSetpointChangeSource()))) &&
            ((this.coolSetpointChangeSource==null && other.getCoolSetpointChangeSource()==null) || 
             (this.coolSetpointChangeSource!=null &&
              this.coolSetpointChangeSource.equals(other.getCoolSetpointChangeSource()))) &&
            ((this.vacationHoldChangeSource==null && other.getVacationHoldChangeSource()==null) || 
             (this.vacationHoldChangeSource!=null &&
              this.vacationHoldChangeSource.equals(other.getVacationHoldChangeSource())));
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
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        _hashCode += (isThermostatLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOutdoorTemp() != null) {
            _hashCode += getOutdoorTemp().hashCode();
        }
        if (getDispTemperature() != null) {
            _hashCode += getDispTemperature().hashCode();
        }
        if (getHeatSetpoint() != null) {
            _hashCode += getHeatSetpoint().hashCode();
        }
        if (getCoolSetpoint() != null) {
            _hashCode += getCoolSetpoint().hashCode();
        }
        if (getDisplayedUnits() != null) {
            _hashCode += getDisplayedUnits().hashCode();
        }
        _hashCode += getStatusHeat();
        _hashCode += getStatusCool();
        _hashCode += (isHoldUntilCapable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScheduleCapable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getVacationHold();
        _hashCode += (isDualSetpointStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getHeatNextPeriod();
        _hashCode += getCoolNextPeriod();
        if (getHeatLowerSetptLimit() != null) {
            _hashCode += getHeatLowerSetptLimit().hashCode();
        }
        if (getHeatUpperSetptLimit() != null) {
            _hashCode += getHeatUpperSetptLimit().hashCode();
        }
        if (getCoolLowerSetptLimit() != null) {
            _hashCode += getCoolLowerSetptLimit().hashCode();
        }
        if (getCoolUpperSetptLimit() != null) {
            _hashCode += getCoolUpperSetptLimit().hashCode();
        }
        if (getSchedHeatSp() != null) {
            _hashCode += getSchedHeatSp().hashCode();
        }
        if (getSchedCoolSp() != null) {
            _hashCode += getSchedCoolSp().hashCode();
        }
        _hashCode += getSystemSwitchPosition();
        _hashCode += (isCanSetSwitchAuto() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetSwitchCool() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetSwitchOff() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetSwitchHeat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetSwitchEmergencyHeat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetSwitchSouthernAway() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeadband() != null) {
            _hashCode += getDeadband().hashCode();
        }
        if (getOutdoorHumidity() != null) {
            _hashCode += getOutdoorHumidity().hashCode();
        }
        if (getIndoorHumidity() != null) {
            _hashCode += getIndoorHumidity().hashCode();
        }
        _hashCode += (isCommercial() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSystemSwitchChangeSource() != null) {
            _hashCode += getSystemSwitchChangeSource().hashCode();
        }
        if (getHeatSetpointChangeSource() != null) {
            _hashCode += getHeatSetpointChangeSource().hashCode();
        }
        if (getCoolSetpointChangeSource() != null) {
            _hashCode += getCoolSetpointChangeSource().hashCode();
        }
        if (getVacationHoldChangeSource() != null) {
            _hashCode += getVacationHoldChangeSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UIInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UIInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ThermostatLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outdoorTemp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "OutdoorTemp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DispTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatSetpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolSetpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DisplayedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusHeat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StatusHeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StatusCool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdUntilCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HoldUntilCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ScheduleCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vacationHold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "VacationHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dualSetpointStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DualSetpointStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatNextPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatNextPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolNextPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolNextPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatLowerSetptLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatLowerSetptLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatUpperSetptLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatUpperSetptLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolLowerSetptLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolLowerSetptLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolUpperSetptLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolUpperSetptLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedHeatSp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SchedHeatSp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedCoolSp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SchedCoolSp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemSwitchPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SystemSwitchPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetSwitchAuto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetSwitchAuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetSwitchCool");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetSwitchCool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetSwitchOff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetSwitchOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetSwitchHeat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetSwitchHeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetSwitchEmergencyHeat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetSwitchEmergencyHeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetSwitchSouthernAway");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetSwitchSouthernAway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadband");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Deadband"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outdoorHumidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "OutdoorHumidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indoorHumidity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IndoorHumidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Commercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemSwitchChangeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SystemSwitchChangeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetpointChangeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatSetpointChangeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetpointChangeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolSetpointChangeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vacationHoldChangeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "VacationHoldChangeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "ChangeSource"));
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
