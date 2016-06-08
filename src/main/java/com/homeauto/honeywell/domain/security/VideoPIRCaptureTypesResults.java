/**
 * VideoPIRCaptureTypesResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIRCaptureTypesResults  extends WebMethodResults implements java.io.Serializable {
    private VideoPIREventCaptureType[] captureTypeList;

    public VideoPIRCaptureTypesResults() {
    }

    public VideoPIRCaptureTypesResults(
           int resultCode,
           String resultData,
           VideoPIREventCaptureType[] captureTypeList) {
        super(
            resultCode,
            resultData);
        this.captureTypeList = captureTypeList;
    }


    /**
     * Gets the captureTypeList value for this VideoPIRCaptureTypesResults.
     * 
     * @return captureTypeList
     */
    public VideoPIREventCaptureType[] getCaptureTypeList() {
        return captureTypeList;
    }


    /**
     * Sets the captureTypeList value for this VideoPIRCaptureTypesResults.
     * 
     * @param captureTypeList
     */
    public void setCaptureTypeList(VideoPIREventCaptureType[] captureTypeList) {
        this.captureTypeList = captureTypeList;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIRCaptureTypesResults)) return false;
        VideoPIRCaptureTypesResults other = (VideoPIRCaptureTypesResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.captureTypeList==null && other.getCaptureTypeList()==null) || 
             (this.captureTypeList!=null &&
              java.util.Arrays.equals(this.captureTypeList, other.getCaptureTypeList())));
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
        if (getCaptureTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaptureTypeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCaptureTypeList(), i);
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
        new org.apache.axis.description.TypeDesc(VideoPIRCaptureTypesResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIRCaptureTypesResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CaptureTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventCaptureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREventCaptureType"));
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
