/**
 * CameraSignalStrengthResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraSignalStrengthResults  extends WebMethodResults implements java.io.Serializable {
    private CameraSignalStrength signalStrength;

    public CameraSignalStrengthResults() {
    }

    public CameraSignalStrengthResults(
           int resultCode,
           String resultData,
           CameraSignalStrength signalStrength) {
        super(
            resultCode,
            resultData);
        this.signalStrength = signalStrength;
    }


    /**
     * Gets the signalStrength value for this CameraSignalStrengthResults.
     * 
     * @return signalStrength
     */
    public CameraSignalStrength getSignalStrength() {
        return signalStrength;
    }


    /**
     * Sets the signalStrength value for this CameraSignalStrengthResults.
     * 
     * @param signalStrength
     */
    public void setSignalStrength(CameraSignalStrength signalStrength) {
        this.signalStrength = signalStrength;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraSignalStrengthResults)) return false;
        CameraSignalStrengthResults other = (CameraSignalStrengthResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.signalStrength==null && other.getSignalStrength()==null) || 
             (this.signalStrength!=null &&
              this.signalStrength.equals(other.getSignalStrength())));
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
        if (getSignalStrength() != null) {
            _hashCode += getSignalStrength().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraSignalStrengthResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrengthResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalStrength");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SignalStrength"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength"));
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
