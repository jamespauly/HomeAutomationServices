/**
 * GetCommTaskStateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class GetCommTaskStateResult  extends WebMethodResult implements java.io.Serializable {
    private int commTaskID;

    private TaskState state;

    private FaultReasons faultReason;

    public GetCommTaskStateResult() {
    }

    public GetCommTaskStateResult(
           Results result,
           int commTaskID,
           TaskState state,
           FaultReasons faultReason) {
        super(
            result);
        this.commTaskID = commTaskID;
        this.state = state;
        this.faultReason = faultReason;
    }


    /**
     * Gets the commTaskID value for this GetCommTaskStateResult.
     * 
     * @return commTaskID
     */
    public int getCommTaskID() {
        return commTaskID;
    }


    /**
     * Sets the commTaskID value for this GetCommTaskStateResult.
     * 
     * @param commTaskID
     */
    public void setCommTaskID(int commTaskID) {
        this.commTaskID = commTaskID;
    }


    /**
     * Gets the state value for this GetCommTaskStateResult.
     * 
     * @return state
     */
    public TaskState getState() {
        return state;
    }


    /**
     * Sets the state value for this GetCommTaskStateResult.
     * 
     * @param state
     */
    public void setState(TaskState state) {
        this.state = state;
    }


    /**
     * Gets the faultReason value for this GetCommTaskStateResult.
     * 
     * @return faultReason
     */
    public FaultReasons getFaultReason() {
        return faultReason;
    }


    /**
     * Sets the faultReason value for this GetCommTaskStateResult.
     * 
     * @param faultReason
     */
    public void setFaultReason(FaultReasons faultReason) {
        this.faultReason = faultReason;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCommTaskStateResult)) return false;
        GetCommTaskStateResult other = (GetCommTaskStateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.commTaskID == other.getCommTaskID() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.faultReason==null && other.getFaultReason()==null) || 
             (this.faultReason!=null &&
              this.faultReason.equals(other.getFaultReason())));
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
        _hashCode += getCommTaskID();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getFaultReason() != null) {
            _hashCode += getFaultReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCommTaskStateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "GetCommTaskStateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commTaskID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "CommTaskID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TaskState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FaultReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "FaultReasons"));
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
