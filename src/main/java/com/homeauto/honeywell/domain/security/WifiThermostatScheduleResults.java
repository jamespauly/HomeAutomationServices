/**
 * WifiThermostatScheduleResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class WifiThermostatScheduleResults  extends WebMethodResults  implements java.io.Serializable {
    private WifiThermostatSchedule thermostatSchedule;

    public WifiThermostatScheduleResults() {
    }

    public WifiThermostatScheduleResults(
           int resultCode,
           String resultData,
           WifiThermostatSchedule thermostatSchedule) {
        super(
            resultCode,
            resultData);
        this.thermostatSchedule = thermostatSchedule;
    }


    /**
     * Gets the thermostatSchedule value for this WifiThermostatScheduleResults.
     * 
     * @return thermostatSchedule
     */
    public WifiThermostatSchedule getThermostatSchedule() {
        return thermostatSchedule;
    }


    /**
     * Sets the thermostatSchedule value for this WifiThermostatScheduleResults.
     * 
     * @param thermostatSchedule
     */
    public void setThermostatSchedule(WifiThermostatSchedule thermostatSchedule) {
        this.thermostatSchedule = thermostatSchedule;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WifiThermostatScheduleResults)) return false;
        WifiThermostatScheduleResults other = (WifiThermostatScheduleResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.thermostatSchedule==null && other.getThermostatSchedule()==null) || 
             (this.thermostatSchedule!=null &&
              this.thermostatSchedule.equals(other.getThermostatSchedule())));
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
        if (getThermostatSchedule() != null) {
            _hashCode += getThermostatSchedule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WifiThermostatScheduleResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatScheduleResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WifiThermostatSchedule"));
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
