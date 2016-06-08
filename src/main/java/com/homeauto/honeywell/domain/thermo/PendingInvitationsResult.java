/**
 * PendingInvitationsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class PendingInvitationsResult  extends WebMethodResult implements java.io.Serializable {
    private PendingInvitation[] pendingInvitations;

    public PendingInvitationsResult() {
    }

    public PendingInvitationsResult(
           Results result,
           PendingInvitation[] pendingInvitations) {
        super(
            result);
        this.pendingInvitations = pendingInvitations;
    }


    /**
     * Gets the pendingInvitations value for this PendingInvitationsResult.
     * 
     * @return pendingInvitations
     */
    public PendingInvitation[] getPendingInvitations() {
        return pendingInvitations;
    }


    /**
     * Sets the pendingInvitations value for this PendingInvitationsResult.
     * 
     * @param pendingInvitations
     */
    public void setPendingInvitations(PendingInvitation[] pendingInvitations) {
        this.pendingInvitations = pendingInvitations;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PendingInvitationsResult)) return false;
        PendingInvitationsResult other = (PendingInvitationsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pendingInvitations==null && other.getPendingInvitations()==null) || 
             (this.pendingInvitations!=null &&
              java.util.Arrays.equals(this.pendingInvitations, other.getPendingInvitations())));
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
        if (getPendingInvitations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPendingInvitations());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPendingInvitations(), i);
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
        new org.apache.axis.description.TypeDesc(PendingInvitationsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitationsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingInvitations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "PendingInvitation"));
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
