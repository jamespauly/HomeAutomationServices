/**
 * VideoPIRListResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIRListResults  extends WebMethodResults implements java.io.Serializable {
    private String sessionID;

    private VideoPIRInfo[] videoPIRList;

    public VideoPIRListResults() {
    }

    public VideoPIRListResults(
           int resultCode,
           String resultData,
           String sessionID,
           VideoPIRInfo[] videoPIRList) {
        super(
            resultCode,
            resultData);
        this.sessionID = sessionID;
        this.videoPIRList = videoPIRList;
    }


    /**
     * Gets the sessionID value for this VideoPIRListResults.
     * 
     * @return sessionID
     */
    public String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this VideoPIRListResults.
     * 
     * @param sessionID
     */
    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the videoPIRList value for this VideoPIRListResults.
     * 
     * @return videoPIRList
     */
    public VideoPIRInfo[] getVideoPIRList() {
        return videoPIRList;
    }


    /**
     * Sets the videoPIRList value for this VideoPIRListResults.
     * 
     * @param videoPIRList
     */
    public void setVideoPIRList(VideoPIRInfo[] videoPIRList) {
        this.videoPIRList = videoPIRList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIRListResults)) return false;
        VideoPIRListResults other = (VideoPIRListResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.videoPIRList==null && other.getVideoPIRList()==null) || 
             (this.videoPIRList!=null &&
              java.util.Arrays.equals(this.videoPIRList, other.getVideoPIRList())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getVideoPIRList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoPIRList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getVideoPIRList(), i);
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
        new org.apache.axis.description.TypeDesc(VideoPIRListResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRListResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SessionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPIRList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRInfo"));
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
