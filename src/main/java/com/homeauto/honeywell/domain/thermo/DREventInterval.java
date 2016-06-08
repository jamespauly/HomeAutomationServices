/**
 * DREventInterval.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class DREventInterval  implements java.io.Serializable {
    private int sequenceNumber;

    private java.math.BigDecimal heatSetpointC;

    private java.math.BigDecimal coolSetpointC;

    private java.math.BigDecimal heatDeltaC;

    private java.math.BigDecimal coolDeltaC;

    private java.math.BigDecimal dutyCycle;

    private int durationSeconds;

    public DREventInterval() {
    }

    public DREventInterval(
           int sequenceNumber,
           java.math.BigDecimal heatSetpointC,
           java.math.BigDecimal coolSetpointC,
           java.math.BigDecimal heatDeltaC,
           java.math.BigDecimal coolDeltaC,
           java.math.BigDecimal dutyCycle,
           int durationSeconds) {
           this.sequenceNumber = sequenceNumber;
           this.heatSetpointC = heatSetpointC;
           this.coolSetpointC = coolSetpointC;
           this.heatDeltaC = heatDeltaC;
           this.coolDeltaC = coolDeltaC;
           this.dutyCycle = dutyCycle;
           this.durationSeconds = durationSeconds;
    }


    /**
     * Gets the sequenceNumber value for this DREventInterval.
     * 
     * @return sequenceNumber
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this DREventInterval.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the heatSetpointC value for this DREventInterval.
     * 
     * @return heatSetpointC
     */
    public java.math.BigDecimal getHeatSetpointC() {
        return heatSetpointC;
    }


    /**
     * Sets the heatSetpointC value for this DREventInterval.
     * 
     * @param heatSetpointC
     */
    public void setHeatSetpointC(java.math.BigDecimal heatSetpointC) {
        this.heatSetpointC = heatSetpointC;
    }


    /**
     * Gets the coolSetpointC value for this DREventInterval.
     * 
     * @return coolSetpointC
     */
    public java.math.BigDecimal getCoolSetpointC() {
        return coolSetpointC;
    }


    /**
     * Sets the coolSetpointC value for this DREventInterval.
     * 
     * @param coolSetpointC
     */
    public void setCoolSetpointC(java.math.BigDecimal coolSetpointC) {
        this.coolSetpointC = coolSetpointC;
    }


    /**
     * Gets the heatDeltaC value for this DREventInterval.
     * 
     * @return heatDeltaC
     */
    public java.math.BigDecimal getHeatDeltaC() {
        return heatDeltaC;
    }


    /**
     * Sets the heatDeltaC value for this DREventInterval.
     * 
     * @param heatDeltaC
     */
    public void setHeatDeltaC(java.math.BigDecimal heatDeltaC) {
        this.heatDeltaC = heatDeltaC;
    }


    /**
     * Gets the coolDeltaC value for this DREventInterval.
     * 
     * @return coolDeltaC
     */
    public java.math.BigDecimal getCoolDeltaC() {
        return coolDeltaC;
    }


    /**
     * Sets the coolDeltaC value for this DREventInterval.
     * 
     * @param coolDeltaC
     */
    public void setCoolDeltaC(java.math.BigDecimal coolDeltaC) {
        this.coolDeltaC = coolDeltaC;
    }


    /**
     * Gets the dutyCycle value for this DREventInterval.
     * 
     * @return dutyCycle
     */
    public java.math.BigDecimal getDutyCycle() {
        return dutyCycle;
    }


    /**
     * Sets the dutyCycle value for this DREventInterval.
     * 
     * @param dutyCycle
     */
    public void setDutyCycle(java.math.BigDecimal dutyCycle) {
        this.dutyCycle = dutyCycle;
    }


    /**
     * Gets the durationSeconds value for this DREventInterval.
     * 
     * @return durationSeconds
     */
    public int getDurationSeconds() {
        return durationSeconds;
    }


    /**
     * Sets the durationSeconds value for this DREventInterval.
     * 
     * @param durationSeconds
     */
    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DREventInterval)) return false;
        DREventInterval other = (DREventInterval) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sequenceNumber == other.getSequenceNumber() &&
            ((this.heatSetpointC==null && other.getHeatSetpointC()==null) || 
             (this.heatSetpointC!=null &&
              this.heatSetpointC.equals(other.getHeatSetpointC()))) &&
            ((this.coolSetpointC==null && other.getCoolSetpointC()==null) || 
             (this.coolSetpointC!=null &&
              this.coolSetpointC.equals(other.getCoolSetpointC()))) &&
            ((this.heatDeltaC==null && other.getHeatDeltaC()==null) || 
             (this.heatDeltaC!=null &&
              this.heatDeltaC.equals(other.getHeatDeltaC()))) &&
            ((this.coolDeltaC==null && other.getCoolDeltaC()==null) || 
             (this.coolDeltaC!=null &&
              this.coolDeltaC.equals(other.getCoolDeltaC()))) &&
            ((this.dutyCycle==null && other.getDutyCycle()==null) || 
             (this.dutyCycle!=null &&
              this.dutyCycle.equals(other.getDutyCycle()))) &&
            this.durationSeconds == other.getDurationSeconds();
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
        _hashCode += getSequenceNumber();
        if (getHeatSetpointC() != null) {
            _hashCode += getHeatSetpointC().hashCode();
        }
        if (getCoolSetpointC() != null) {
            _hashCode += getCoolSetpointC().hashCode();
        }
        if (getHeatDeltaC() != null) {
            _hashCode += getHeatDeltaC().hashCode();
        }
        if (getCoolDeltaC() != null) {
            _hashCode += getCoolDeltaC().hashCode();
        }
        if (getDutyCycle() != null) {
            _hashCode += getDutyCycle().hashCode();
        }
        _hashCode += getDurationSeconds();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DREventInterval.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventInterval"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetpointC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatSetpointC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetpointC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolSetpointC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatDeltaC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatDeltaC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolDeltaC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolDeltaC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dutyCycle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DutyCycle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DurationSeconds"));
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
