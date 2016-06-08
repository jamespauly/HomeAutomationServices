/**
 * GetVideoPIREventRecordResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class GetVideoPIREventRecordResults  extends WebMethodResults implements java.io.Serializable {
    private VideoPIREvent videoPIREventRecord;

    public GetVideoPIREventRecordResults() {
    }

    public GetVideoPIREventRecordResults(
           int resultCode,
           String resultData,
           VideoPIREvent videoPIREventRecord) {
        super(
            resultCode,
            resultData);
        this.videoPIREventRecord = videoPIREventRecord;
    }


    /**
     * Gets the videoPIREventRecord value for this GetVideoPIREventRecordResults.
     * 
     * @return videoPIREventRecord
     */
    public VideoPIREvent getVideoPIREventRecord() {
        return videoPIREventRecord;
    }


    /**
     * Sets the videoPIREventRecord value for this GetVideoPIREventRecordResults.
     * 
     * @param videoPIREventRecord
     */
    public void setVideoPIREventRecord(VideoPIREvent videoPIREventRecord) {
        this.videoPIREventRecord = videoPIREventRecord;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetVideoPIREventRecordResults)) return false;
        GetVideoPIREventRecordResults other = (GetVideoPIREventRecordResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.videoPIREventRecord==null && other.getVideoPIREventRecord()==null) || 
             (this.videoPIREventRecord!=null &&
              this.videoPIREventRecord.equals(other.getVideoPIREventRecord())));
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
        if (getVideoPIREventRecord() != null) {
            _hashCode += getVideoPIREventRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetVideoPIREventRecordResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "GetVideoPIREventRecordResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPIREventRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent"));
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
