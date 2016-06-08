/**
 * HumidificationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class HumidificationInfo  implements java.io.Serializable {
    private boolean canControlHumidification;

    private boolean canControlDehumidification;

    private short humidificationSetPoint;

    private short humidificationUpperLimit;

    private short humidificationLowerLimit;

    private HumidificationMode humidificationMode;

    private short dehumidificationSetPoint;

    private short dehumidificationUpperLimit;

    private short dehumidificationLowerLimit;

    private HumidificationMode dehumidificationMode;

    private int deadband;

    public HumidificationInfo() {
    }

    public HumidificationInfo(
           boolean canControlHumidification,
           boolean canControlDehumidification,
           short humidificationSetPoint,
           short humidificationUpperLimit,
           short humidificationLowerLimit,
           HumidificationMode humidificationMode,
           short dehumidificationSetPoint,
           short dehumidificationUpperLimit,
           short dehumidificationLowerLimit,
           HumidificationMode dehumidificationMode,
           int deadband) {
           this.canControlHumidification = canControlHumidification;
           this.canControlDehumidification = canControlDehumidification;
           this.humidificationSetPoint = humidificationSetPoint;
           this.humidificationUpperLimit = humidificationUpperLimit;
           this.humidificationLowerLimit = humidificationLowerLimit;
           this.humidificationMode = humidificationMode;
           this.dehumidificationSetPoint = dehumidificationSetPoint;
           this.dehumidificationUpperLimit = dehumidificationUpperLimit;
           this.dehumidificationLowerLimit = dehumidificationLowerLimit;
           this.dehumidificationMode = dehumidificationMode;
           this.deadband = deadband;
    }


    /**
     * Gets the canControlHumidification value for this HumidificationInfo.
     * 
     * @return canControlHumidification
     */
    public boolean isCanControlHumidification() {
        return canControlHumidification;
    }


    /**
     * Sets the canControlHumidification value for this HumidificationInfo.
     * 
     * @param canControlHumidification
     */
    public void setCanControlHumidification(boolean canControlHumidification) {
        this.canControlHumidification = canControlHumidification;
    }


    /**
     * Gets the canControlDehumidification value for this HumidificationInfo.
     * 
     * @return canControlDehumidification
     */
    public boolean isCanControlDehumidification() {
        return canControlDehumidification;
    }


    /**
     * Sets the canControlDehumidification value for this HumidificationInfo.
     * 
     * @param canControlDehumidification
     */
    public void setCanControlDehumidification(boolean canControlDehumidification) {
        this.canControlDehumidification = canControlDehumidification;
    }


    /**
     * Gets the humidificationSetPoint value for this HumidificationInfo.
     * 
     * @return humidificationSetPoint
     */
    public short getHumidificationSetPoint() {
        return humidificationSetPoint;
    }


    /**
     * Sets the humidificationSetPoint value for this HumidificationInfo.
     * 
     * @param humidificationSetPoint
     */
    public void setHumidificationSetPoint(short humidificationSetPoint) {
        this.humidificationSetPoint = humidificationSetPoint;
    }


    /**
     * Gets the humidificationUpperLimit value for this HumidificationInfo.
     * 
     * @return humidificationUpperLimit
     */
    public short getHumidificationUpperLimit() {
        return humidificationUpperLimit;
    }


    /**
     * Sets the humidificationUpperLimit value for this HumidificationInfo.
     * 
     * @param humidificationUpperLimit
     */
    public void setHumidificationUpperLimit(short humidificationUpperLimit) {
        this.humidificationUpperLimit = humidificationUpperLimit;
    }


    /**
     * Gets the humidificationLowerLimit value for this HumidificationInfo.
     * 
     * @return humidificationLowerLimit
     */
    public short getHumidificationLowerLimit() {
        return humidificationLowerLimit;
    }


    /**
     * Sets the humidificationLowerLimit value for this HumidificationInfo.
     * 
     * @param humidificationLowerLimit
     */
    public void setHumidificationLowerLimit(short humidificationLowerLimit) {
        this.humidificationLowerLimit = humidificationLowerLimit;
    }


    /**
     * Gets the humidificationMode value for this HumidificationInfo.
     * 
     * @return humidificationMode
     */
    public HumidificationMode getHumidificationMode() {
        return humidificationMode;
    }


    /**
     * Sets the humidificationMode value for this HumidificationInfo.
     * 
     * @param humidificationMode
     */
    public void setHumidificationMode(HumidificationMode humidificationMode) {
        this.humidificationMode = humidificationMode;
    }


    /**
     * Gets the dehumidificationSetPoint value for this HumidificationInfo.
     * 
     * @return dehumidificationSetPoint
     */
    public short getDehumidificationSetPoint() {
        return dehumidificationSetPoint;
    }


    /**
     * Sets the dehumidificationSetPoint value for this HumidificationInfo.
     * 
     * @param dehumidificationSetPoint
     */
    public void setDehumidificationSetPoint(short dehumidificationSetPoint) {
        this.dehumidificationSetPoint = dehumidificationSetPoint;
    }


    /**
     * Gets the dehumidificationUpperLimit value for this HumidificationInfo.
     * 
     * @return dehumidificationUpperLimit
     */
    public short getDehumidificationUpperLimit() {
        return dehumidificationUpperLimit;
    }


    /**
     * Sets the dehumidificationUpperLimit value for this HumidificationInfo.
     * 
     * @param dehumidificationUpperLimit
     */
    public void setDehumidificationUpperLimit(short dehumidificationUpperLimit) {
        this.dehumidificationUpperLimit = dehumidificationUpperLimit;
    }


    /**
     * Gets the dehumidificationLowerLimit value for this HumidificationInfo.
     * 
     * @return dehumidificationLowerLimit
     */
    public short getDehumidificationLowerLimit() {
        return dehumidificationLowerLimit;
    }


    /**
     * Sets the dehumidificationLowerLimit value for this HumidificationInfo.
     * 
     * @param dehumidificationLowerLimit
     */
    public void setDehumidificationLowerLimit(short dehumidificationLowerLimit) {
        this.dehumidificationLowerLimit = dehumidificationLowerLimit;
    }


    /**
     * Gets the dehumidificationMode value for this HumidificationInfo.
     * 
     * @return dehumidificationMode
     */
    public HumidificationMode getDehumidificationMode() {
        return dehumidificationMode;
    }


    /**
     * Sets the dehumidificationMode value for this HumidificationInfo.
     * 
     * @param dehumidificationMode
     */
    public void setDehumidificationMode(HumidificationMode dehumidificationMode) {
        this.dehumidificationMode = dehumidificationMode;
    }


    /**
     * Gets the deadband value for this HumidificationInfo.
     * 
     * @return deadband
     */
    public int getDeadband() {
        return deadband;
    }


    /**
     * Sets the deadband value for this HumidificationInfo.
     * 
     * @param deadband
     */
    public void setDeadband(int deadband) {
        this.deadband = deadband;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HumidificationInfo)) return false;
        HumidificationInfo other = (HumidificationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.canControlHumidification == other.isCanControlHumidification() &&
            this.canControlDehumidification == other.isCanControlDehumidification() &&
            this.humidificationSetPoint == other.getHumidificationSetPoint() &&
            this.humidificationUpperLimit == other.getHumidificationUpperLimit() &&
            this.humidificationLowerLimit == other.getHumidificationLowerLimit() &&
            ((this.humidificationMode==null && other.getHumidificationMode()==null) || 
             (this.humidificationMode!=null &&
              this.humidificationMode.equals(other.getHumidificationMode()))) &&
            this.dehumidificationSetPoint == other.getDehumidificationSetPoint() &&
            this.dehumidificationUpperLimit == other.getDehumidificationUpperLimit() &&
            this.dehumidificationLowerLimit == other.getDehumidificationLowerLimit() &&
            ((this.dehumidificationMode==null && other.getDehumidificationMode()==null) || 
             (this.dehumidificationMode!=null &&
              this.dehumidificationMode.equals(other.getDehumidificationMode()))) &&
            this.deadband == other.getDeadband();
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
        _hashCode += (isCanControlHumidification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanControlDehumidification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getHumidificationSetPoint();
        _hashCode += getHumidificationUpperLimit();
        _hashCode += getHumidificationLowerLimit();
        if (getHumidificationMode() != null) {
            _hashCode += getHumidificationMode().hashCode();
        }
        _hashCode += getDehumidificationSetPoint();
        _hashCode += getDehumidificationUpperLimit();
        _hashCode += getDehumidificationLowerLimit();
        if (getDehumidificationMode() != null) {
            _hashCode += getDehumidificationMode().hashCode();
        }
        _hashCode += getDeadband();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HumidificationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canControlHumidification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanControlHumidification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canControlDehumidification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanControlDehumidification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidificationSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidificationUpperLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationUpperLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidificationLowerLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationLowerLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("humidificationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dehumidificationSetPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DehumidificationSetPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dehumidificationUpperLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DehumidificationUpperLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dehumidificationLowerLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DehumidificationLowerLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dehumidificationMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "DehumidificationMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "HumidificationMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadband");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Deadband"));
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
