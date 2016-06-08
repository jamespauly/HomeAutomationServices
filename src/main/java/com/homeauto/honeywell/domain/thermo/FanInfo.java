/**
 * FanInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class FanInfo  implements java.io.Serializable {
    private boolean canControl;

    private FanSwitch position;

    private boolean canSetAuto;

    private boolean canSetCirculate;

    private boolean canFollowSchedule;

    private boolean canSetOn;

    private Boolean isFanRunning;

    public FanInfo() {
    }

    public FanInfo(
           boolean canControl,
           FanSwitch position,
           boolean canSetAuto,
           boolean canSetCirculate,
           boolean canFollowSchedule,
           boolean canSetOn,
           Boolean isFanRunning) {
           this.canControl = canControl;
           this.position = position;
           this.canSetAuto = canSetAuto;
           this.canSetCirculate = canSetCirculate;
           this.canFollowSchedule = canFollowSchedule;
           this.canSetOn = canSetOn;
           this.isFanRunning = isFanRunning;
    }


    /**
     * Gets the canControl value for this FanInfo.
     * 
     * @return canControl
     */
    public boolean isCanControl() {
        return canControl;
    }


    /**
     * Sets the canControl value for this FanInfo.
     * 
     * @param canControl
     */
    public void setCanControl(boolean canControl) {
        this.canControl = canControl;
    }


    /**
     * Gets the position value for this FanInfo.
     * 
     * @return position
     */
    public FanSwitch getPosition() {
        return position;
    }


    /**
     * Sets the position value for this FanInfo.
     * 
     * @param position
     */
    public void setPosition(FanSwitch position) {
        this.position = position;
    }


    /**
     * Gets the canSetAuto value for this FanInfo.
     * 
     * @return canSetAuto
     */
    public boolean isCanSetAuto() {
        return canSetAuto;
    }


    /**
     * Sets the canSetAuto value for this FanInfo.
     * 
     * @param canSetAuto
     */
    public void setCanSetAuto(boolean canSetAuto) {
        this.canSetAuto = canSetAuto;
    }


    /**
     * Gets the canSetCirculate value for this FanInfo.
     * 
     * @return canSetCirculate
     */
    public boolean isCanSetCirculate() {
        return canSetCirculate;
    }


    /**
     * Sets the canSetCirculate value for this FanInfo.
     * 
     * @param canSetCirculate
     */
    public void setCanSetCirculate(boolean canSetCirculate) {
        this.canSetCirculate = canSetCirculate;
    }


    /**
     * Gets the canFollowSchedule value for this FanInfo.
     * 
     * @return canFollowSchedule
     */
    public boolean isCanFollowSchedule() {
        return canFollowSchedule;
    }


    /**
     * Sets the canFollowSchedule value for this FanInfo.
     * 
     * @param canFollowSchedule
     */
    public void setCanFollowSchedule(boolean canFollowSchedule) {
        this.canFollowSchedule = canFollowSchedule;
    }


    /**
     * Gets the canSetOn value for this FanInfo.
     * 
     * @return canSetOn
     */
    public boolean isCanSetOn() {
        return canSetOn;
    }


    /**
     * Sets the canSetOn value for this FanInfo.
     * 
     * @param canSetOn
     */
    public void setCanSetOn(boolean canSetOn) {
        this.canSetOn = canSetOn;
    }


    /**
     * Gets the isFanRunning value for this FanInfo.
     * 
     * @return isFanRunning
     */
    public Boolean getIsFanRunning() {
        return isFanRunning;
    }


    /**
     * Sets the isFanRunning value for this FanInfo.
     * 
     * @param isFanRunning
     */
    public void setIsFanRunning(Boolean isFanRunning) {
        this.isFanRunning = isFanRunning;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FanInfo)) return false;
        FanInfo other = (FanInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.canControl == other.isCanControl() &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            this.canSetAuto == other.isCanSetAuto() &&
            this.canSetCirculate == other.isCanSetCirculate() &&
            this.canFollowSchedule == other.isCanFollowSchedule() &&
            this.canSetOn == other.isCanSetOn() &&
            ((this.isFanRunning==null && other.getIsFanRunning()==null) || 
             (this.isFanRunning!=null &&
              this.isFanRunning.equals(other.getIsFanRunning())));
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
        _hashCode += (isCanControl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        _hashCode += (isCanSetAuto() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetCirculate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanFollowSchedule() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanSetOn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIsFanRunning() != null) {
            _hashCode += getIsFanRunning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FanInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FanSwitch"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetAuto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetAuto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetCirculate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetCirculate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canFollowSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanFollowSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSetOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CanSetOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFanRunning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "IsFanRunning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
