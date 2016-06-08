/**
 * SmartSceneSubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartSceneSubAction  implements java.io.Serializable {
    private SceneSwitchSubAction[] sceneSwitchSubActions;

    private SceneLockSubAction[] sceneLockSubActions;

    private SceneThermostatSubAction[] sceneThermostatSubActions;

    private ScenesTimeTriggeredAction timeTriggeredAction;

    private ScenesTriggerEvent triggerEvent;

    public SmartSceneSubAction() {
    }

    public SmartSceneSubAction(
           SceneSwitchSubAction[] sceneSwitchSubActions,
           SceneLockSubAction[] sceneLockSubActions,
           SceneThermostatSubAction[] sceneThermostatSubActions,
           ScenesTimeTriggeredAction timeTriggeredAction,
           ScenesTriggerEvent triggerEvent) {
           this.sceneSwitchSubActions = sceneSwitchSubActions;
           this.sceneLockSubActions = sceneLockSubActions;
           this.sceneThermostatSubActions = sceneThermostatSubActions;
           this.timeTriggeredAction = timeTriggeredAction;
           this.triggerEvent = triggerEvent;
    }


    /**
     * Gets the sceneSwitchSubActions value for this SmartSceneSubAction.
     * 
     * @return sceneSwitchSubActions
     */
    public SceneSwitchSubAction[] getSceneSwitchSubActions() {
        return sceneSwitchSubActions;
    }


    /**
     * Sets the sceneSwitchSubActions value for this SmartSceneSubAction.
     * 
     * @param sceneSwitchSubActions
     */
    public void setSceneSwitchSubActions(SceneSwitchSubAction[] sceneSwitchSubActions) {
        this.sceneSwitchSubActions = sceneSwitchSubActions;
    }


    /**
     * Gets the sceneLockSubActions value for this SmartSceneSubAction.
     * 
     * @return sceneLockSubActions
     */
    public SceneLockSubAction[] getSceneLockSubActions() {
        return sceneLockSubActions;
    }


    /**
     * Sets the sceneLockSubActions value for this SmartSceneSubAction.
     * 
     * @param sceneLockSubActions
     */
    public void setSceneLockSubActions(SceneLockSubAction[] sceneLockSubActions) {
        this.sceneLockSubActions = sceneLockSubActions;
    }


    /**
     * Gets the sceneThermostatSubActions value for this SmartSceneSubAction.
     * 
     * @return sceneThermostatSubActions
     */
    public SceneThermostatSubAction[] getSceneThermostatSubActions() {
        return sceneThermostatSubActions;
    }


    /**
     * Sets the sceneThermostatSubActions value for this SmartSceneSubAction.
     * 
     * @param sceneThermostatSubActions
     */
    public void setSceneThermostatSubActions(SceneThermostatSubAction[] sceneThermostatSubActions) {
        this.sceneThermostatSubActions = sceneThermostatSubActions;
    }


    /**
     * Gets the timeTriggeredAction value for this SmartSceneSubAction.
     * 
     * @return timeTriggeredAction
     */
    public ScenesTimeTriggeredAction getTimeTriggeredAction() {
        return timeTriggeredAction;
    }


    /**
     * Sets the timeTriggeredAction value for this SmartSceneSubAction.
     * 
     * @param timeTriggeredAction
     */
    public void setTimeTriggeredAction(ScenesTimeTriggeredAction timeTriggeredAction) {
        this.timeTriggeredAction = timeTriggeredAction;
    }


    /**
     * Gets the triggerEvent value for this SmartSceneSubAction.
     * 
     * @return triggerEvent
     */
    public ScenesTriggerEvent getTriggerEvent() {
        return triggerEvent;
    }


    /**
     * Sets the triggerEvent value for this SmartSceneSubAction.
     * 
     * @param triggerEvent
     */
    public void setTriggerEvent(ScenesTriggerEvent triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartSceneSubAction)) return false;
        SmartSceneSubAction other = (SmartSceneSubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sceneSwitchSubActions==null && other.getSceneSwitchSubActions()==null) || 
             (this.sceneSwitchSubActions!=null &&
              java.util.Arrays.equals(this.sceneSwitchSubActions, other.getSceneSwitchSubActions()))) &&
            ((this.sceneLockSubActions==null && other.getSceneLockSubActions()==null) || 
             (this.sceneLockSubActions!=null &&
              java.util.Arrays.equals(this.sceneLockSubActions, other.getSceneLockSubActions()))) &&
            ((this.sceneThermostatSubActions==null && other.getSceneThermostatSubActions()==null) || 
             (this.sceneThermostatSubActions!=null &&
              java.util.Arrays.equals(this.sceneThermostatSubActions, other.getSceneThermostatSubActions()))) &&
            ((this.timeTriggeredAction==null && other.getTimeTriggeredAction()==null) || 
             (this.timeTriggeredAction!=null &&
              this.timeTriggeredAction.equals(other.getTimeTriggeredAction()))) &&
            ((this.triggerEvent==null && other.getTriggerEvent()==null) || 
             (this.triggerEvent!=null &&
              this.triggerEvent.equals(other.getTriggerEvent())));
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
        if (getSceneSwitchSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSceneSwitchSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSceneSwitchSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSceneLockSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSceneLockSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSceneLockSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSceneThermostatSubActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSceneThermostatSubActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSceneThermostatSubActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeTriggeredAction() != null) {
            _hashCode += getTimeTriggeredAction().hashCode();
        }
        if (getTriggerEvent() != null) {
            _hashCode += getTriggerEvent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartSceneSubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneSubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneSwitchSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneSwitchSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneLockSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneLockSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sceneThermostatSubActions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubActions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SceneThermostatSubAction"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTriggeredAction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimeTriggeredAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScenesTimeTriggeredAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScenesTriggerEvent"));
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
