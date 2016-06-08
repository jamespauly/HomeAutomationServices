/**
 * GetVolatileThermostatDataResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class GetVolatileThermostatDataResult  extends WebMethodResult implements java.io.Serializable {
    private UIInfo UI;

    private boolean upgrading;

    private ThermostatsAlert[] thermostatsAlerts;

    public GetVolatileThermostatDataResult() {
    }

    public GetVolatileThermostatDataResult(
           Results result,
           UIInfo UI,
           boolean upgrading,
           ThermostatsAlert[] thermostatsAlerts) {
        super(
            result);
        this.UI = UI;
        this.upgrading = upgrading;
        this.thermostatsAlerts = thermostatsAlerts;
    }


    /**
     * Gets the UI value for this GetVolatileThermostatDataResult.
     * 
     * @return UI
     */
    public UIInfo getUI() {
        return UI;
    }


    /**
     * Sets the UI value for this GetVolatileThermostatDataResult.
     * 
     * @param UI
     */
    public void setUI(UIInfo UI) {
        this.UI = UI;
    }


    /**
     * Gets the upgrading value for this GetVolatileThermostatDataResult.
     * 
     * @return upgrading
     */
    public boolean isUpgrading() {
        return upgrading;
    }


    /**
     * Sets the upgrading value for this GetVolatileThermostatDataResult.
     * 
     * @param upgrading
     */
    public void setUpgrading(boolean upgrading) {
        this.upgrading = upgrading;
    }


    /**
     * Gets the thermostatsAlerts value for this GetVolatileThermostatDataResult.
     * 
     * @return thermostatsAlerts
     */
    public ThermostatsAlert[] getThermostatsAlerts() {
        return thermostatsAlerts;
    }


    /**
     * Sets the thermostatsAlerts value for this GetVolatileThermostatDataResult.
     * 
     * @param thermostatsAlerts
     */
    public void setThermostatsAlerts(ThermostatsAlert[] thermostatsAlerts) {
        this.thermostatsAlerts = thermostatsAlerts;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetVolatileThermostatDataResult)) return false;
        GetVolatileThermostatDataResult other = (GetVolatileThermostatDataResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.UI==null && other.getUI()==null) || 
             (this.UI!=null &&
              this.UI.equals(other.getUI()))) &&
            this.upgrading == other.isUpgrading() &&
            ((this.thermostatsAlerts==null && other.getThermostatsAlerts()==null) || 
             (this.thermostatsAlerts!=null &&
              java.util.Arrays.equals(this.thermostatsAlerts, other.getThermostatsAlerts())));
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
        if (getUI() != null) {
            _hashCode += getUI().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVolatileThermostatDataResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetVolatileThermostatDataResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "UIInfo"));
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
