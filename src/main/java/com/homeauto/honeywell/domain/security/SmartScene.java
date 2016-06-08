/**
 * SmartScene.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SmartScene  extends SmartSceneSubAction implements java.io.Serializable {
    private long smartSceneID;

    private int smartSceneIndex;

    private long locationID;

    private String name;

    private int triggerType;

    private boolean isSmartSceneEnabled;

    private short smartSceneIconID;

    public SmartScene() {
    }

    public SmartScene(
           SceneSwitchSubAction[] sceneSwitchSubActions,
           SceneLockSubAction[] sceneLockSubActions,
           SceneThermostatSubAction[] sceneThermostatSubActions,
           ScenesTimeTriggeredAction timeTriggeredAction,
           ScenesTriggerEvent triggerEvent,
           long smartSceneID,
           int smartSceneIndex,
           long locationID,
           String name,
           int triggerType,
           boolean isSmartSceneEnabled,
           short smartSceneIconID) {
        super(
            sceneSwitchSubActions,
            sceneLockSubActions,
            sceneThermostatSubActions,
            timeTriggeredAction,
            triggerEvent);
        this.smartSceneID = smartSceneID;
        this.smartSceneIndex = smartSceneIndex;
        this.locationID = locationID;
        this.name = name;
        this.triggerType = triggerType;
        this.isSmartSceneEnabled = isSmartSceneEnabled;
        this.smartSceneIconID = smartSceneIconID;
    }


    /**
     * Gets the smartSceneID value for this SmartScene.
     * 
     * @return smartSceneID
     */
    public long getSmartSceneID() {
        return smartSceneID;
    }


    /**
     * Sets the smartSceneID value for this SmartScene.
     * 
     * @param smartSceneID
     */
    public void setSmartSceneID(long smartSceneID) {
        this.smartSceneID = smartSceneID;
    }


    /**
     * Gets the smartSceneIndex value for this SmartScene.
     * 
     * @return smartSceneIndex
     */
    public int getSmartSceneIndex() {
        return smartSceneIndex;
    }


    /**
     * Sets the smartSceneIndex value for this SmartScene.
     * 
     * @param smartSceneIndex
     */
    public void setSmartSceneIndex(int smartSceneIndex) {
        this.smartSceneIndex = smartSceneIndex;
    }


    /**
     * Gets the locationID value for this SmartScene.
     * 
     * @return locationID
     */
    public long getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this SmartScene.
     * 
     * @param locationID
     */
    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the name value for this SmartScene.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this SmartScene.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the triggerType value for this SmartScene.
     * 
     * @return triggerType
     */
    public int getTriggerType() {
        return triggerType;
    }


    /**
     * Sets the triggerType value for this SmartScene.
     * 
     * @param triggerType
     */
    public void setTriggerType(int triggerType) {
        this.triggerType = triggerType;
    }


    /**
     * Gets the isSmartSceneEnabled value for this SmartScene.
     * 
     * @return isSmartSceneEnabled
     */
    public boolean isIsSmartSceneEnabled() {
        return isSmartSceneEnabled;
    }


    /**
     * Sets the isSmartSceneEnabled value for this SmartScene.
     * 
     * @param isSmartSceneEnabled
     */
    public void setIsSmartSceneEnabled(boolean isSmartSceneEnabled) {
        this.isSmartSceneEnabled = isSmartSceneEnabled;
    }


    /**
     * Gets the smartSceneIconID value for this SmartScene.
     * 
     * @return smartSceneIconID
     */
    public short getSmartSceneIconID() {
        return smartSceneIconID;
    }


    /**
     * Sets the smartSceneIconID value for this SmartScene.
     * 
     * @param smartSceneIconID
     */
    public void setSmartSceneIconID(short smartSceneIconID) {
        this.smartSceneIconID = smartSceneIconID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SmartScene)) return false;
        SmartScene other = (SmartScene) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.smartSceneID == other.getSmartSceneID() &&
            this.smartSceneIndex == other.getSmartSceneIndex() &&
            this.locationID == other.getLocationID() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.triggerType == other.getTriggerType() &&
            this.isSmartSceneEnabled == other.isIsSmartSceneEnabled() &&
            this.smartSceneIconID == other.getSmartSceneIconID();
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
        _hashCode += new Long(getSmartSceneID()).hashCode();
        _hashCode += getSmartSceneIndex();
        _hashCode += new Long(getLocationID()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getTriggerType();
        _hashCode += (isIsSmartSceneEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSmartSceneIconID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SmartScene.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartScene"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartSceneID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartSceneIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("isSmartSceneEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsSmartSceneEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartSceneIconID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SmartSceneIconID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
