/**
 * SecuritySubAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SecuritySubAction  implements java.io.Serializable {
    private long subActionID;

    private long securitySystemID;

    private int state;

    private int[] byPassZones;

    public SecuritySubAction() {
    }

    public SecuritySubAction(
           long subActionID,
           long securitySystemID,
           int state,
           int[] byPassZones) {
           this.subActionID = subActionID;
           this.securitySystemID = securitySystemID;
           this.state = state;
           this.byPassZones = byPassZones;
    }


    /**
     * Gets the subActionID value for this SecuritySubAction.
     * 
     * @return subActionID
     */
    public long getSubActionID() {
        return subActionID;
    }


    /**
     * Sets the subActionID value for this SecuritySubAction.
     * 
     * @param subActionID
     */
    public void setSubActionID(long subActionID) {
        this.subActionID = subActionID;
    }


    /**
     * Gets the securitySystemID value for this SecuritySubAction.
     * 
     * @return securitySystemID
     */
    public long getSecuritySystemID() {
        return securitySystemID;
    }


    /**
     * Sets the securitySystemID value for this SecuritySubAction.
     * 
     * @param securitySystemID
     */
    public void setSecuritySystemID(long securitySystemID) {
        this.securitySystemID = securitySystemID;
    }


    /**
     * Gets the state value for this SecuritySubAction.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this SecuritySubAction.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the byPassZones value for this SecuritySubAction.
     * 
     * @return byPassZones
     */
    public int[] getByPassZones() {
        return byPassZones;
    }


    /**
     * Sets the byPassZones value for this SecuritySubAction.
     * 
     * @param byPassZones
     */
    public void setByPassZones(int[] byPassZones) {
        this.byPassZones = byPassZones;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SecuritySubAction)) return false;
        SecuritySubAction other = (SecuritySubAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.subActionID == other.getSubActionID() &&
            this.securitySystemID == other.getSecuritySystemID() &&
            this.state == other.getState() &&
            ((this.byPassZones==null && other.getByPassZones()==null) || 
             (this.byPassZones!=null &&
              java.util.Arrays.equals(this.byPassZones, other.getByPassZones())));
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
        _hashCode += new Long(getSubActionID()).hashCode();
        _hashCode += new Long(getSecuritySystemID()).hashCode();
        _hashCode += getState();
        if (getByPassZones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getByPassZones());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getByPassZones(), i);
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
        new org.apache.axis.description.TypeDesc(SecuritySubAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySubAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subActionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SubActionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securitySystemID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecuritySystemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("byPassZones");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ByPassZones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
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
