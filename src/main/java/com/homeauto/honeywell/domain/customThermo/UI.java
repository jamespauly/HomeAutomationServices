package com.homeauto.honeywell.domain.customThermo;

import java.math.BigDecimal;

/**
 * Created by jamesp on 5/17/16.
 */
public class UI {
    private String sessionId;
    private int thermoId;
    private boolean changeSystemSwitch;
    private int systemSwitch;
    private boolean changeHeatSetpoint;
    private BigDecimal heatSetpoint;
    private boolean changeCoolSetpoint;
    private BigDecimal coolSetpoint;
    private boolean changeHeatNextPeriod;
    private int heatNextPeriod;
    private boolean changeCoolNextPeriod;
    private int coolNextPeriod;
    private boolean changeStatusHeat;
    private int statusHeat;
    private boolean changeStatusCool;
    private int statusCool;
    private boolean holdUntilCapable;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getThermoId() {
        return thermoId;
    }

    public void setThermoId(int thermoId) {
        this.thermoId = thermoId;
    }

    public boolean isChangeSystemSwitch() {
        return changeSystemSwitch;
    }

    public void setChangeSystemSwitch(boolean changeSystemSwitch) {
        this.changeSystemSwitch = changeSystemSwitch;
    }

    public int getSystemSwitch() {
        return systemSwitch;
    }

    public void setSystemSwitch(int systemSwitch) {
        this.systemSwitch = systemSwitch;
    }

    public boolean isChangeHeatSetpoint() {
        return changeHeatSetpoint;
    }

    public void setChangeHeatSetpoint(boolean changeHeatSetpoint) {
        this.changeHeatSetpoint = changeHeatSetpoint;
    }

    public BigDecimal getHeatSetpoint() {
        return heatSetpoint;
    }

    public void setHeatSetpoint(BigDecimal heatSetpoint) {
        this.heatSetpoint = heatSetpoint;
    }

    public boolean isChangeCoolSetpoint() {
        return changeCoolSetpoint;
    }

    public void setChangeCoolSetpoint(boolean changeCoolSetpoint) {
        this.changeCoolSetpoint = changeCoolSetpoint;
    }

    public BigDecimal getCoolSetpoint() {
        return coolSetpoint;
    }

    public void setCoolSetpoint(BigDecimal coolSetpoint) {
        this.coolSetpoint = coolSetpoint;
    }

    public boolean isChangeHeatNextPeriod() {
        return changeHeatNextPeriod;
    }

    public void setChangeHeatNextPeriod(boolean changeHeatNextPeriod) {
        this.changeHeatNextPeriod = changeHeatNextPeriod;
    }

    public int getHeatNextPeriod() {
        return heatNextPeriod;
    }

    public void setHeatNextPeriod(int heatNextPeriod) {
        this.heatNextPeriod = heatNextPeriod;
    }

    public boolean isChangeCoolNextPeriod() {
        return changeCoolNextPeriod;
    }

    public void setChangeCoolNextPeriod(boolean changeCoolNextPeriod) {
        this.changeCoolNextPeriod = changeCoolNextPeriod;
    }

    public int getCoolNextPeriod() {
        return coolNextPeriod;
    }

    public void setCoolNextPeriod(int coolNextPeriod) {
        this.coolNextPeriod = coolNextPeriod;
    }

    public boolean isChangeStatusHeat() {
        return changeStatusHeat;
    }

    public void setChangeStatusHeat(boolean changeStatusHeat) {
        this.changeStatusHeat = changeStatusHeat;
    }

    public int getStatusHeat() {
        return statusHeat;
    }

    public void setStatusHeat(int statusHeat) {
        this.statusHeat = statusHeat;
    }

    public boolean isChangeStatusCool() {
        return changeStatusCool;
    }

    public void setChangeStatusCool(boolean changeStatusCool) {
        this.changeStatusCool = changeStatusCool;
    }

    public int getStatusCool() {
        return statusCool;
    }

    public void setStatusCool(int statusCool) {
        this.statusCool = statusCool;
    }

    public boolean isHoldUntilCapable() {
        return holdUntilCapable;
    }

    public void setHoldUntilCapable(boolean holdUntilCapable) {
        this.holdUntilCapable = holdUntilCapable;
    }
}
