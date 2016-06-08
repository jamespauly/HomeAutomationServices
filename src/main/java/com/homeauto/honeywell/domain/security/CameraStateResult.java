/**
 * CameraStateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraStateResult  extends WebMethodResults implements java.io.Serializable {
    private String cameraName;

    private String featureFlags;

    private String currentPosition;

    private int wlledState;

    private String output_1_State;

    public CameraStateResult() {
    }

    public CameraStateResult(
           int resultCode,
           String resultData,
           String cameraName,
           String featureFlags,
           String currentPosition,
           int wlledState,
           String output_1_State) {
        super(
            resultCode,
            resultData);
        this.cameraName = cameraName;
        this.featureFlags = featureFlags;
        this.currentPosition = currentPosition;
        this.wlledState = wlledState;
        this.output_1_State = output_1_State;
    }


    /**
     * Gets the cameraName value for this CameraStateResult.
     * 
     * @return cameraName
     */
    public String getCameraName() {
        return cameraName;
    }


    /**
     * Sets the cameraName value for this CameraStateResult.
     * 
     * @param cameraName
     */
    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }


    /**
     * Gets the featureFlags value for this CameraStateResult.
     * 
     * @return featureFlags
     */
    public String getFeatureFlags() {
        return featureFlags;
    }


    /**
     * Sets the featureFlags value for this CameraStateResult.
     * 
     * @param featureFlags
     */
    public void setFeatureFlags(String featureFlags) {
        this.featureFlags = featureFlags;
    }


    /**
     * Gets the currentPosition value for this CameraStateResult.
     * 
     * @return currentPosition
     */
    public String getCurrentPosition() {
        return currentPosition;
    }


    /**
     * Sets the currentPosition value for this CameraStateResult.
     * 
     * @param currentPosition
     */
    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }


    /**
     * Gets the wlledState value for this CameraStateResult.
     * 
     * @return wlledState
     */
    public int getWlledState() {
        return wlledState;
    }


    /**
     * Sets the wlledState value for this CameraStateResult.
     * 
     * @param wlledState
     */
    public void setWlledState(int wlledState) {
        this.wlledState = wlledState;
    }


    /**
     * Gets the output_1_State value for this CameraStateResult.
     * 
     * @return output_1_State
     */
    public String getOutput_1_State() {
        return output_1_State;
    }


    /**
     * Sets the output_1_State value for this CameraStateResult.
     * 
     * @param output_1_State
     */
    public void setOutput_1_State(String output_1_State) {
        this.output_1_State = output_1_State;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraStateResult)) return false;
        CameraStateResult other = (CameraStateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cameraName==null && other.getCameraName()==null) || 
             (this.cameraName!=null &&
              this.cameraName.equals(other.getCameraName()))) &&
            ((this.featureFlags==null && other.getFeatureFlags()==null) || 
             (this.featureFlags!=null &&
              this.featureFlags.equals(other.getFeatureFlags()))) &&
            ((this.currentPosition==null && other.getCurrentPosition()==null) || 
             (this.currentPosition!=null &&
              this.currentPosition.equals(other.getCurrentPosition()))) &&
            this.wlledState == other.getWlledState() &&
            ((this.output_1_State==null && other.getOutput_1_State()==null) || 
             (this.output_1_State!=null &&
              this.output_1_State.equals(other.getOutput_1_State())));
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
        if (getCameraName() != null) {
            _hashCode += getCameraName().hashCode();
        }
        if (getFeatureFlags() != null) {
            _hashCode += getFeatureFlags().hashCode();
        }
        if (getCurrentPosition() != null) {
            _hashCode += getCurrentPosition().hashCode();
        }
        _hashCode += getWlledState();
        if (getOutput_1_State() != null) {
            _hashCode += getOutput_1_State().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraStateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraStateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cameraName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featureFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FeatureFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wlledState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WlledState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output_1_State");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Output_1_State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
