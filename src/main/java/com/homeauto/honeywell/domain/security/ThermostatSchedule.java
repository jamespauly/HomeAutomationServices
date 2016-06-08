/**
 * ThermostatSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ThermostatSchedule  implements java.io.Serializable {
    private long thermostatID;

    private ScheduleInfo[] setPoints;

    private short highThresholdValue;

    private short lowThresholdValue;

    private int highThresholdStatus;

    private int lowThresholdStatus;

    public ThermostatSchedule() {
    }

    public ThermostatSchedule(
           long thermostatID,
           ScheduleInfo[] setPoints,
           short highThresholdValue,
           short lowThresholdValue,
           int highThresholdStatus,
           int lowThresholdStatus) {
           this.thermostatID = thermostatID;
           this.setPoints = setPoints;
           this.highThresholdValue = highThresholdValue;
           this.lowThresholdValue = lowThresholdValue;
           this.highThresholdStatus = highThresholdStatus;
           this.lowThresholdStatus = lowThresholdStatus;
    }


    /**
     * Gets the thermostatID value for this ThermostatSchedule.
     * 
     * @return thermostatID
     */
    public long getThermostatID() {
        return thermostatID;
    }


    /**
     * Sets the thermostatID value for this ThermostatSchedule.
     * 
     * @param thermostatID
     */
    public void setThermostatID(long thermostatID) {
        this.thermostatID = thermostatID;
    }


    /**
     * Gets the setPoints value for this ThermostatSchedule.
     * 
     * @return setPoints
     */
    public ScheduleInfo[] getSetPoints() {
        return setPoints;
    }


    /**
     * Sets the setPoints value for this ThermostatSchedule.
     * 
     * @param setPoints
     */
    public void setSetPoints(ScheduleInfo[] setPoints) {
        this.setPoints = setPoints;
    }


    /**
     * Gets the highThresholdValue value for this ThermostatSchedule.
     * 
     * @return highThresholdValue
     */
    public short getHighThresholdValue() {
        return highThresholdValue;
    }


    /**
     * Sets the highThresholdValue value for this ThermostatSchedule.
     * 
     * @param highThresholdValue
     */
    public void setHighThresholdValue(short highThresholdValue) {
        this.highThresholdValue = highThresholdValue;
    }


    /**
     * Gets the lowThresholdValue value for this ThermostatSchedule.
     * 
     * @return lowThresholdValue
     */
    public short getLowThresholdValue() {
        return lowThresholdValue;
    }


    /**
     * Sets the lowThresholdValue value for this ThermostatSchedule.
     * 
     * @param lowThresholdValue
     */
    public void setLowThresholdValue(short lowThresholdValue) {
        this.lowThresholdValue = lowThresholdValue;
    }


    /**
     * Gets the highThresholdStatus value for this ThermostatSchedule.
     * 
     * @return highThresholdStatus
     */
    public int getHighThresholdStatus() {
        return highThresholdStatus;
    }


    /**
     * Sets the highThresholdStatus value for this ThermostatSchedule.
     * 
     * @param highThresholdStatus
     */
    public void setHighThresholdStatus(int highThresholdStatus) {
        this.highThresholdStatus = highThresholdStatus;
    }


    /**
     * Gets the lowThresholdStatus value for this ThermostatSchedule.
     * 
     * @return lowThresholdStatus
     */
    public int getLowThresholdStatus() {
        return lowThresholdStatus;
    }


    /**
     * Sets the lowThresholdStatus value for this ThermostatSchedule.
     * 
     * @param lowThresholdStatus
     */
    public void setLowThresholdStatus(int lowThresholdStatus) {
        this.lowThresholdStatus = lowThresholdStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ThermostatSchedule)) return false;
        ThermostatSchedule other = (ThermostatSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.thermostatID == other.getThermostatID() &&
            ((this.setPoints==null && other.getSetPoints()==null) || 
             (this.setPoints!=null &&
              java.util.Arrays.equals(this.setPoints, other.getSetPoints()))) &&
            this.highThresholdValue == other.getHighThresholdValue() &&
            this.lowThresholdValue == other.getLowThresholdValue() &&
            this.highThresholdStatus == other.getHighThresholdStatus() &&
            this.lowThresholdStatus == other.getLowThresholdStatus();
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
        _hashCode += new Long(getThermostatID()).hashCode();
        if (getSetPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSetPoints());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSetPoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getHighThresholdValue();
        _hashCode += getLowThresholdValue();
        _hashCode += getHighThresholdStatus();
        _hashCode += getLowThresholdStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThermostatSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thermostatID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ThermostatID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SetPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ScheduleInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highThresholdValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HighThresholdValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowThresholdValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LowThresholdValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highThresholdStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HighThresholdStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowThresholdStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LowThresholdStatus"));
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
