/**
 * TimePeriodInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class TimePeriodInfo  implements java.io.Serializable {
    private short index;  // attribute

    private boolean enabled;  // attribute

    private short tempHeat;  // attribute

    private short tempCool;  // attribute

    private String time;  // attribute

    public TimePeriodInfo() {
    }

    public TimePeriodInfo(
           short index,
           boolean enabled,
           short tempHeat,
           short tempCool,
           String time) {
           this.index = index;
           this.enabled = enabled;
           this.tempHeat = tempHeat;
           this.tempCool = tempCool;
           this.time = time;
    }


    /**
     * Gets the index value for this TimePeriodInfo.
     * 
     * @return index
     */
    public short getIndex() {
        return index;
    }


    /**
     * Sets the index value for this TimePeriodInfo.
     * 
     * @param index
     */
    public void setIndex(short index) {
        this.index = index;
    }


    /**
     * Gets the enabled value for this TimePeriodInfo.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this TimePeriodInfo.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the tempHeat value for this TimePeriodInfo.
     * 
     * @return tempHeat
     */
    public short getTempHeat() {
        return tempHeat;
    }


    /**
     * Sets the tempHeat value for this TimePeriodInfo.
     * 
     * @param tempHeat
     */
    public void setTempHeat(short tempHeat) {
        this.tempHeat = tempHeat;
    }


    /**
     * Gets the tempCool value for this TimePeriodInfo.
     * 
     * @return tempCool
     */
    public short getTempCool() {
        return tempCool;
    }


    /**
     * Sets the tempCool value for this TimePeriodInfo.
     * 
     * @param tempCool
     */
    public void setTempCool(short tempCool) {
        this.tempCool = tempCool;
    }


    /**
     * Gets the time value for this TimePeriodInfo.
     * 
     * @return time
     */
    public String getTime() {
        return time;
    }


    /**
     * Sets the time value for this TimePeriodInfo.
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimePeriodInfo)) return false;
        TimePeriodInfo other = (TimePeriodInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.index == other.getIndex() &&
            this.enabled == other.isEnabled() &&
            this.tempHeat == other.getTempHeat() &&
            this.tempCool == other.getTempCool() &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
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
        _hashCode += getIndex();
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getTempHeat();
        _hashCode += getTempCool();
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimePeriodInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TimePeriodInfo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("index");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Index"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enabled");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Enabled"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tempHeat");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TempHeat"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tempCool");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TempCool"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("time");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Time"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
