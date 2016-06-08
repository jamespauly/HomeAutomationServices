/**
 * TCCThermostatdata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TCCThermostatdata  implements java.io.Serializable {
    private short indoorHumidity;

    private short outdoorHumidity;

    private short outdoorTemperature;

    private String tempHoldTime;

    private boolean isScheduleCapable;

    private short minHeatSetPoint;

    private short maxHeatSetPoint;

    private short minCoolSetPoint;

    private short maxCoolSetPoint;

    private String deadbandforF;

    private String deadbandforC;

    public TCCThermostatdata() {
    }

    public TCCThermostatdata(
           short indoorHumidity,
           short outdoorHumidity,
           short outdoorTemperature,
           String tempHoldTime,
           boolean isScheduleCapable,
           short minHeatSetPoint,
           short maxHeatSetPoint,
           short minCoolSetPoint,
           short maxCoolSetPoint,
           String deadbandforF,
           String deadbandforC) {
           this.indoorHumidity = indoorHumidity;
           this.outdoorHumidity = outdoorHumidity;
           this.outdoorTemperature = outdoorTemperature;
           this.tempHoldTime = tempHoldTime;
           this.isScheduleCapable = isScheduleCapable;
           this.minHeatSetPoint = minHeatSetPoint;
           this.maxHeatSetPoint = maxHeatSetPoint;
           this.minCoolSetPoint = minCoolSetPoint;
           this.maxCoolSetPoint = maxCoolSetPoint;
           this.deadbandforF = deadbandforF;
           this.deadbandforC = deadbandforC;
    }


    /**
     * Gets the indoorHumidity value for this TCCThermostatdata.
     * 
     * @return indoorHumidity
     */
    public short getIndoorHumidity() {
        return indoorHumidity;
    }


    /**
     * Sets the indoorHumidity value for this TCCThermostatdata.
     * 
     * @param indoorHumidity
     */
    public void setIndoorHumidity(short indoorHumidity) {
        this.indoorHumidity = indoorHumidity;
    }


    /**
     * Gets the outdoorHumidity value for this TCCThermostatdata.
     * 
     * @return outdoorHumidity
     */
    public short getOutdoorHumidity() {
        return outdoorHumidity;
    }


    /**
     * Sets the outdoorHumidity value for this TCCThermostatdata.
     * 
     * @param outdoorHumidity
     */
    public void setOutdoorHumidity(short outdoorHumidity) {
        this.outdoorHumidity = outdoorHumidity;
    }


    /**
     * Gets the outdoorTemperature value for this TCCThermostatdata.
     * 
     * @return outdoorTemperature
     */
    public short getOutdoorTemperature() {
        return outdoorTemperature;
    }


    /**
     * Sets the outdoorTemperature value for this TCCThermostatdata.
     * 
     * @param outdoorTemperature
     */
    public void setOutdoorTemperature(short outdoorTemperature) {
        this.outdoorTemperature = outdoorTemperature;
    }


    /**
     * Gets the tempHoldTime value for this TCCThermostatdata.
     * 
     * @return tempHoldTime
     */
    public String getTempHoldTime() {
        return tempHoldTime;
    }


    /**
     * Sets the tempHoldTime value for this TCCThermostatdata.
     * 
     * @param tempHoldTime
     */
    public void setTempHoldTime(String tempHoldTime) {
        this.tempHoldTime = tempHoldTime;
    }


    /**
     * Gets the isScheduleCapable value for this TCCThermostatdata.
     * 
     * @return isScheduleCapable
     */
    public boolean isIsScheduleCapable() {
        return isScheduleCapable;
    }


    /**
     * Sets the isScheduleCapable value for this TCCThermostatdata.
     * 
     * @param isScheduleCapable
     */
    public void setIsScheduleCapable(boolean isScheduleCapable) {
        this.isScheduleCapable = isScheduleCapable;
    }


    /**
     * Gets the minHeatSetPoint value for this TCCThermostatdata.
     * 
     * @return minHeatSetPoint
     */
    public short getMinHeatSetPoint() {
        return minHeatSetPoint;
    }


    /**
     * Sets the minHeatSetPoint value for this TCCThermostatdata.
     * 
     * @param minHeatSetPoint
     */
    public void setMinHeatSetPoint(short minHeatSetPoint) {
        this.minHeatSetPoint = minHeatSetPoint;
    }


    /**
     * Gets the maxHeatSetPoint value for this TCCThermostatdata.
     * 
     * @return maxHeatSetPoint
     */
    public short getMaxHeatSetPoint() {
        return maxHeatSetPoint;
    }


    /**
     * Sets the maxHeatSetPoint value for this TCCThermostatdata.
     * 
     * @param maxHeatSetPoint
     */
    public void setMaxHeatSetPoint(short maxHeatSetPoint) {
        this.maxHeatSetPoint = maxHeatSetPoint;
    }


    /**
     * Gets the minCoolSetPoint value for this TCCThermostatdata.
     * 
     * @return minCoolSetPoint
     */
    public short getMinCoolSetPoint() {
        return minCoolSetPoint;
    }


    /**
     * Sets the minCoolSetPoint value for this TCCThermostatdata.
     * 
     * @param minCoolSetPoint
     */
    public void setMinCoolSetPoint(short minCoolSetPoint) {
        this.minCoolSetPoint = minCoolSetPoint;
    }


    /**
     * Gets the maxCoolSetPoint value for this TCCThermostatdata.
     * 
     * @return maxCoolSetPoint
     */
    public short getMaxCoolSetPoint() {
        return maxCoolSetPoint;
    }


    /**
     * Sets the maxCoolSetPoint value for this TCCThermostatdata.
     * 
     * @param maxCoolSetPoint
     */
    public void setMaxCoolSetPoint(short maxCoolSetPoint) {
        this.maxCoolSetPoint = maxCoolSetPoint;
    }


    /**
     * Gets the deadbandforF value for this TCCThermostatdata.
     * 
     * @return deadbandforF
     */
    public String getDeadbandforF() {
        return deadbandforF;
    }


    /**
     * Sets the deadbandforF value for this TCCThermostatdata.
     * 
     * @param deadbandforF
     */
    public void setDeadbandforF(String deadbandforF) {
        this.deadbandforF = deadbandforF;
    }


    /**
     * Gets the deadbandforC value for this TCCThermostatdata.
     * 
     * @return deadbandforC
     */
    public String getDeadbandforC() {
        return deadbandforC;
    }


    /**
     * Sets the deadbandforC value for this TCCThermostatdata.
     * 
     * @param deadbandforC
     */
    public void setDeadbandforC(String deadbandforC) {
        this.deadbandforC = deadbandforC;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TCCThermostatdata)) return false;
        TCCThermostatdata other = (TCCThermostatdata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.indoorHumidity == other.getIndoorHumidity() &&
            this.outdoorHumidity == other.getOutdoorHumidity() &&
            this.outdoorTemperature == other.getOutdoorTemperature() &&
            ((this.tempHoldTime==null && other.getTempHoldTime()==null) || 
             (this.tempHoldTime!=null &&
              this.tempHoldTime.equals(other.getTempHoldTime()))) &&
            this.isScheduleCapable == other.isIsScheduleCapable() &&
            this.minHeatSetPoint == other.getMinHeatSetPoint() &&
            this.maxHeatSetPoint == other.getMaxHeatSetPoint() &&
            this.minCoolSetPoint == other.getMinCoolSetPoint() &&
            this.maxCoolSetPoint == other.getMaxCoolSetPoint() &&
            ((this.deadbandforF==null && other.getDeadbandforF()==null) || 
             (this.deadbandforF!=null &&
              this.deadbandforF.equals(other.getDeadbandforF()))) &&
            ((this.deadbandforC==null && other.getDeadbandforC()==null) || 
             (this.deadbandforC!=null &&
              this.deadbandforC.equals(other.getDeadbandforC())));
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
        _hashCode += getIndoorHumidity();
        _hashCode += getOutdoorHumidity();
        _hashCode += getOutdoorTemperature();
        if (getTempHoldTime() != null) {
            _hashCode += getTempHoldTime().hashCode();
        }
        _hashCode += (isIsScheduleCapable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMinHeatSetPoint();
        _hashCode += getMaxHeatSetPoint();
        _hashCode += getMinCoolSetPoint();
        _hashCode += getMaxCoolSetPoint();
        if (getDeadbandforF() != null) {
            _hashCode += getDeadbandforF().hashCode();
        }
        if (getDeadbandforC() != null) {
            _hashCode += getDeadbandforC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCCThermostatdata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TCCThermostatdata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indoorHumidity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IndoorHumidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outdoorHumidity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "OutdoorHumidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outdoorTemperature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "OutdoorTemperature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempHoldTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TempHoldTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isScheduleCapable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsScheduleCapable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minHeatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MinHeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxHeatSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxHeatSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCoolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MinCoolSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCoolSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MaxCoolSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadbandforF");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeadbandforF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadbandforC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeadbandforC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
