/**
 * SmartAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartAction  extends SmartActionSubAction implements java.io.Serializable {
    private long smartActionID;

    private int smartActionIndex;

    private String name;

    private int triggerType;

    private java.util.Calendar created;

    private int state;

    private int syncStatus;

    private int smartActionIconId;

    public SmartAction() {
    }

    public SmartAction(
           SwitchSubAction[] switchSubActions,
           LockSubAction[] lockSubActions,
           ThermostatSubAction[] thermostatSubActions,
           WifiThermostatSubAction[] wifiThermostatSubActions,
           CameraSubAction[] cameraSubActions,
           SecuritySubAction[] securitySubActions,
           SmartActionTriggerEvent triggerEvent,
           SmartActionSchedule schedule,
           int geoFenceTriggerType,
           long smartActionID,
           int smartActionIndex,
           String name,
           int triggerType,
           java.util.Calendar created,
           int state,
           int syncStatus,
           int smartActionIconId) {
        super(
            switchSubActions,
            lockSubActions,
            thermostatSubActions,
            wifiThermostatSubActions,
            cameraSubActions,
            securitySubActions,
            triggerEvent,
            schedule,
            geoFenceTriggerType);
        this.smartActionID = smartActionID;
        this.smartActionIndex = smartActionIndex;
        this.name = name;
        this.triggerType = triggerType;
        this.created = created;
        this.state = state;
        this.syncStatus = syncStatus;
        this.smartActionIconId = smartActionIconId;
    }


    /**
     * Gets the smartActionID value for this SmartAction.
     * 
     * @return smartActionID
     */
    public long getSmartActionID() {
        return smartActionID;
    }


    /**
     * Sets the smartActionID value for this SmartAction.
     * 
     * @param smartActionID
     */
    public void setSmartActionID(long smartActionID) {
        this.smartActionID = smartActionID;
    }


    /**
     * Gets the smartActionIndex value for this SmartAction.
     * 
     * @return smartActionIndex
     */
    public int getSmartActionIndex() {
        return smartActionIndex;
    }


    /**
     * Sets the smartActionIndex value for this SmartAction.
     * 
     * @param smartActionIndex
     */
    public void setSmartActionIndex(int smartActionIndex) {
        this.smartActionIndex = smartActionIndex;
    }


    /**
     * Gets the name value for this SmartAction.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartAction.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the triggerType value for this SmartAction.
     * 
     * @return triggerType
     */
    public int getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this SmartAction.
     * 
     * @param triggerType
     */
    public void setTriggerType(int triggerType) {
        this.triggerType = triggerType;
    }


    /**
     * Gets the created value for this SmartAction.
     * 
     * @return created
     */
    public java.util.Calendar getCreated() {
        return created;
    }


    /**
     * Sets the created value for this SmartAction.
     * 
     * @param created
     */
    public void setCreated(java.util.Calendar created) {
        this.created = created;
    }


    /**
     * Gets the state value for this SmartAction.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this SmartAction.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the syncStatus value for this SmartAction.
     * 
     * @return syncStatus
     */
    public int getSyncStatus() {
        return syncStatus;
    }


    /**
     * Sets the syncStatus value for this SmartAction.
     * 
     * @param syncStatus
     */
    public void setSyncStatus(int syncStatus) {
        this.syncStatus = syncStatus;
    }


    /**
     * Gets the smartActionIconId value for this SmartAction.
     * 
     * @return smartActionIconId
     */
    public int getSmartActionIconId() {
        return smartActionIconId;
    }


    /**
     * Sets the smartActionIconId value for this SmartAction.
     * 
     * @param smartActionIconId
     */
    public void setSmartActionIconId(int smartActionIconId) {
        this.smartActionIconId = smartActionIconId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartAction)) return false;
        SmartAction other = (SmartAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.smartActionID == other.getSmartActionID() &&
            this.smartActionIndex == other.getSmartActionIndex() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.triggerType == other.getTriggerType() &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            this.state == other.getState() &&
            this.syncStatus == other.getSyncStatus() &&
            this.smartActionIconId == other.getSmartActionIconId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Long(getSmartActionID()).hashCode();
        _hashCode += getSmartActionIndex();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getTriggerType();
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        _hashCode += getState();
        _hashCode += getSyncStatus();
        _hashCode += getSmartActionIconId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartActionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartActionIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggerType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TriggerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartActionIconId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartActionIconId"));
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
