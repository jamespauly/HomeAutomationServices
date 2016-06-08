/**
 * DREvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class DREvent  implements java.io.Serializable {
    private int DREventId;

    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private boolean optedOut;

    private boolean optoutable;

    private DemandResponsePhase phase;

    private java.math.BigDecimal heatSetpointLimit;

    private java.math.BigDecimal coolSetpointLimit;

    private DREventInterval[] intervals;

    private boolean hidden;

    public DREvent() {
    }

    public DREvent(
           int DREventId,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           boolean optedOut,
           boolean optoutable,
           DemandResponsePhase phase,
           java.math.BigDecimal heatSetpointLimit,
           java.math.BigDecimal coolSetpointLimit,
           DREventInterval[] intervals,
           boolean hidden) {
           this.DREventId = DREventId;
           this.startTime = startTime;
           this.endTime = endTime;
           this.optedOut = optedOut;
           this.optoutable = optoutable;
           this.phase = phase;
           this.heatSetpointLimit = heatSetpointLimit;
           this.coolSetpointLimit = coolSetpointLimit;
           this.intervals = intervals;
           this.hidden = hidden;
    }


    /**
     * Gets the DREventId value for this DREvent.
     * 
     * @return DREventId
     */
    public int getDREventId() {
        return DREventId;
    }


    /**
     * Sets the DREventId value for this DREvent.
     * 
     * @param DREventId
     */
    public void setDREventId(int DREventId) {
        this.DREventId = DREventId;
    }


    /**
     * Gets the startTime value for this DREvent.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this DREvent.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this DREvent.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this DREvent.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the optedOut value for this DREvent.
     * 
     * @return optedOut
     */
    public boolean isOptedOut() {
        return optedOut;
    }


    /**
     * Sets the optedOut value for this DREvent.
     * 
     * @param optedOut
     */
    public void setOptedOut(boolean optedOut) {
        this.optedOut = optedOut;
    }


    /**
     * Gets the optoutable value for this DREvent.
     * 
     * @return optoutable
     */
    public boolean isOptoutable() {
        return optoutable;
    }


    /**
     * Sets the optoutable value for this DREvent.
     * 
     * @param optoutable
     */
    public void setOptoutable(boolean optoutable) {
        this.optoutable = optoutable;
    }


    /**
     * Gets the phase value for this DREvent.
     * 
     * @return phase
     */
    public DemandResponsePhase getPhase() {
        return phase;
    }


    /**
     * Sets the phase value for this DREvent.
     * 
     * @param phase
     */
    public void setPhase(DemandResponsePhase phase) {
        this.phase = phase;
    }


    /**
     * Gets the heatSetpointLimit value for this DREvent.
     * 
     * @return heatSetpointLimit
     */
    public java.math.BigDecimal getHeatSetpointLimit() {
        return heatSetpointLimit;
    }


    /**
     * Sets the heatSetpointLimit value for this DREvent.
     * 
     * @param heatSetpointLimit
     */
    public void setHeatSetpointLimit(java.math.BigDecimal heatSetpointLimit) {
        this.heatSetpointLimit = heatSetpointLimit;
    }


    /**
     * Gets the coolSetpointLimit value for this DREvent.
     * 
     * @return coolSetpointLimit
     */
    public java.math.BigDecimal getCoolSetpointLimit() {
        return coolSetpointLimit;
    }


    /**
     * Sets the coolSetpointLimit value for this DREvent.
     * 
     * @param coolSetpointLimit
     */
    public void setCoolSetpointLimit(java.math.BigDecimal coolSetpointLimit) {
        this.coolSetpointLimit = coolSetpointLimit;
    }


    /**
     * Gets the intervals value for this DREvent.
     * 
     * @return intervals
     */
    public DREventInterval[] getIntervals() {
        return intervals;
    }


    /**
     * Sets the intervals value for this DREvent.
     * 
     * @param intervals
     */
    public void setIntervals(DREventInterval[] intervals) {
        this.intervals = intervals;
    }


    /**
     * Gets the hidden value for this DREvent.
     * 
     * @return hidden
     */
    public boolean isHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this DREvent.
     * 
     * @param hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DREvent)) return false;
        DREvent other = (DREvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.DREventId == other.getDREventId() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.optedOut == other.isOptedOut() &&
            this.optoutable == other.isOptoutable() &&
            ((this.phase==null && other.getPhase()==null) || 
             (this.phase!=null &&
              this.phase.equals(other.getPhase()))) &&
            ((this.heatSetpointLimit==null && other.getHeatSetpointLimit()==null) || 
             (this.heatSetpointLimit!=null &&
              this.heatSetpointLimit.equals(other.getHeatSetpointLimit()))) &&
            ((this.coolSetpointLimit==null && other.getCoolSetpointLimit()==null) || 
             (this.coolSetpointLimit!=null &&
              this.coolSetpointLimit.equals(other.getCoolSetpointLimit()))) &&
            ((this.intervals==null && other.getIntervals()==null) || 
             (this.intervals!=null &&
              java.util.Arrays.equals(this.intervals, other.getIntervals()))) &&
            this.hidden == other.isHidden();
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
        _hashCode += getDREventId();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += (isOptedOut() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOptoutable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPhase() != null) {
            _hashCode += getPhase().hashCode();
        }
        if (getHeatSetpointLimit() != null) {
            _hashCode += getHeatSetpointLimit().hashCode();
        }
        if (getCoolSetpointLimit() != null) {
            _hashCode += getCoolSetpointLimit().hashCode();
        }
        if (getIntervals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntervals());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIntervals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DREvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DREventId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optedOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "OptedOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optoutable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Optoutable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Phase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DemandResponsePhase"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heatSetpointLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HeatSetpointLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coolSetpointLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CoolSetpointLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Intervals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventInterval"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DREventInterval"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
