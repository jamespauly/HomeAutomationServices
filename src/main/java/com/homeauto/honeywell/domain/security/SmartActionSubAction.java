/**
 * SmartActionSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartActionSubAction  implements java.io.Serializable {
    private SwitchSubAction[] switchSubActions;

    private LockSubAction[] lockSubActions;

    private ThermostatSubAction[] thermostatSubActions;

    private WifiThermostatSubAction[] wifiThermostatSubActions;

    private CameraSubAction[] cameraSubActions;

    private SecuritySubAction[] securitySubActions;

    private SmartActionTriggerEvent triggerEvent;

    private SmartActionSchedule schedule;

    private int geoFenceTriggerType;

    public SmartActionSubAction() {
    }

    public SmartActionSubAction(
           SwitchSubAction[] switchSubActions,
           LockSubAction[] lockSubActions,
           ThermostatSubAction[] thermostatSubActions,
           WifiThermostatSubAction[] wifiThermostatSubActions,
           CameraSubAction[] cameraSubActions,
           SecuritySubAction[] securitySubActions,
           SmartActionTriggerEvent triggerEvent,
           SmartActionSchedule schedule,
           int geoFenceTriggerType) {
           this.switchSubActions = switchSubActions;
           this.lockSubActions = lockSubActions;
           this.thermostatSubActions = thermostatSubActions;
           this.wifiThermostatSubActions = wifiThermostatSubActions;
           this.cameraSubActions = cameraSubActions;
           this.securitySubActions = securitySubActions;
           this.triggerEvent = triggerEvent;
           this.schedule = schedule;
           this.geoFenceTriggerType = geoFenceTriggerType;
    }


    /**
     * Gets the switchSubActions value for this SmartActionSubAction.
     * 
     * @return switchSubActions
     */
    public SwitchSubAction[] getSwitchSubActions() {
        return switchSubActions;
    }


    /**
     * Sets the switchSubActions value for this SmartActionSubAction.
     * 
     * @param switchSubActions
     */
    public void setSwitchSubActions(SwitchSubAction[] switchSubActions) {
        this.switchSubActions = switchSubActions;
    }


    /**
     * Gets the lockSubActions value for this SmartActionSubAction.
     * 
     * @return lockSubActions
     */
    public LockSubAction[] getLockSubActions() {
        return lockSubActions;
    }


    /**
     * Sets the lockSubActions value for this SmartActionSubAction.
     * 
     * @param lockSubActions
     */
    public void setLockSubActions(LockSubAction[] lockSubActions) {
        this.lockSubActions = lockSubActions;
    }


    /**
     * Gets the thermostatSubActions value for this SmartActionSubAction.
     * 
     * @return thermostatSubActions
     */
    public ThermostatSubAction[] getThermostatSubActions() {
        return thermostatSubActions;
    }


    /**
     * Sets the thermostatSubActions value for this SmartActionSubAction.
     * 
     * @param thermostatSubActions
     */
    public void setThermostatSubActions(ThermostatSubAction[] thermostatSubActions) {
        this.thermostatSubActions = thermostatSubActions;
    }


    /**
     * Gets the wifiThermostatSubActions value for this SmartActionSubAction.
     * 
     * @return wifiThermostatSubActions
     */
    public WifiThermostatSubAction[] getWifiThermostatSubActions() {
        return wifiThermostatSubActions;
    }


    /**
     * Sets the wifiThermostatSubActions value for this SmartActionSubAction.
     * 
     * @param wifiThermostatSubActions
     */
    public void setWifiThermostatSubActions(WifiThermostatSubAction[] wifiThermostatSubActions) {
        this.wifiThermostatSubActions = wifiThermostatSubActions;
    }


    /**
     * Gets the cameraSubActions value for this SmartActionSubAction.
     * 
     * @return cameraSubActions
     */
    public CameraSubAction[] getCameraSubActions() {
        return cameraSubActions;
    }


    /**
     * Sets the cameraSubActions value for this SmartActionSubAction.
     * 
     * @param cameraSubActions
     */
    public void setCameraSubActions(CameraSubAction[] cameraSubActions) {
        this.cameraSubActions = cameraSubActions;
    }


    /**
     * Gets the securitySubActions value for this SmartActionSubAction.
     * 
     * @return securitySubActions
     */
    public SecuritySubAction[] getSecuritySubActions() {
        return securitySubActions;
    }


    /**
     * Sets the securitySubActions value for this SmartActionSubAction.
     * 
     * @param securitySubActions
     */
    public void setSecuritySubActions(SecuritySubAction[] securitySubActions) {
        this.securitySubActions = securitySubActions;
    }


    /**
     * Gets the triggerEvent value for this SmartActionSubAction.
     * 
     * @return triggerEvent
     */
    public SmartActionTriggerEvent getTriggerEvent() {
        return triggerEvent;
    }


    /**
     * Sets the triggerEvent value for this SmartActionSubAction.
     * 
     * @param triggerEvent
     */
    public void setTriggerEvent(SmartActionTriggerEvent triggerEvent) {
        this.triggerEvent = triggerEvent;
    }


    /**
     * Gets the schedule value for this SmartActionSubAction.
     * 
     * @return schedule
     */
    public SmartActionSchedule getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this SmartActionSubAction.
     * 
     * @param schedule
     */
    public void setSchedule(SmartActionSchedule schedule) {
        this.schedule = schedule;
    }


    /**
     * Gets the geoFenceTriggerType value for this SmartActionSubAction.
     * 
     * @return geoFenceTriggerType
     */
    public int getGeoFenceTriggerType() {
        return geoFenceTriggerType;
    }


    /**
     * Sets the geoFenceTriggerType value for this SmartActionSubAction.
     * 
     * @param geoFenceTriggerType
     */
    public void setGeoFenceTriggerType(int geoFenceTriggerType) {
        this.geoFenceTriggerType = geoFenceTriggerType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartActionSubAction)) return false;
        SmartActionSubAction other = (SmartActionSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.switchSubActions==null && other.getSwitchSubActions()==null) || 
             (this.switchSubActions!=null &&
              java.util.Arrays.equals(this.switchSubActions, other.getSwitchSubActions()))) &&
            ((this.lockSubActions==null && other.getLockSubActions()==null) || 
             (this.lockSubActions!=null &&
              java.util.Arrays.equals(this.lockSubActions, other.getLockSubActions()))) &&
            ((this.thermostatSubActions==null && other.getThermostatSubActions()==null) || 
             (this.thermostatSubActions!=null &&
              java.util.Arrays.equals(this.thermostatSubActions, other.getThermostatSubActions()))) &&
            ((this.wifiThermostatSubActions==null && other.getWifiThermostatSubActions()==null) || 
             (this.wifiThermostatSubActions!=null &&
              java.util.Arrays.equals(this.wifiThermostatSubActions, other.getWifiThermostatSubActions()))) &&
            ((this.cameraSubActions==null && other.getCameraSubActions()==null) || 
             (this.cameraSubActions!=null &&
              java.util.Arrays.equals(this.cameraSubActions, other.getCameraSubActions()))) &&
            ((this.securitySubActions==null && other.getSecuritySubActions()==null) || 
             (this.securitySubActions!=null &&
              java.util.Arrays.equals(this.securitySubActions, other.getSecuritySubActions()))) &&
            ((this.triggerEvent==null && other.getTriggerEvent()==null) || 
             (this.triggerEvent!=null &&
              this.triggerEvent.equals(other.getTriggerEvent()))) &&
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              this.schedule.equals(other.getSchedule()))) &&
            this.geoFenceTriggerType == other.getGeoFenceTriggerType();
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
        if (getSwitchSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSwitchSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSwitchSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLockSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLockSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLockSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThermostatSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThermostatSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThermostatSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWifiThermostatSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWifiThermostatSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWifiThermostatSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCameraSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCameraSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCameraSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecuritySubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecuritySubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSecuritySubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTriggerEvent() != null) {
            _hashCode += getTriggerEvent().hashCode();
        }
        if (getSchedule() != null) {
            _hashCode += getSchedule().hashCode();
        }
        _hashCode += getGeoFenceTriggerType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartActionSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SwitchSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LockSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wifiThermostatSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securitySubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionTriggerEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoFenceTriggerType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GeoFenceTriggerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
