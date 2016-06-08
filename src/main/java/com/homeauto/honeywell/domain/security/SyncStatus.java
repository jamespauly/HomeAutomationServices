/**
 * SyncStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SyncStatus  implements java.io.Serializable {
    private long deviceID;

    private String deviceName;

    private int totalSteps;

    private int currentStep;

    private String description;

    private String statusText;

    private int resultCode;

    private String resultData;

    public SyncStatus() {
    }

    public SyncStatus(
           long deviceID,
           String deviceName,
           int totalSteps,
           int currentStep,
           String description,
           String statusText,
           int resultCode,
           String resultData) {
           this.deviceID = deviceID;
           this.deviceName = deviceName;
           this.totalSteps = totalSteps;
           this.currentStep = currentStep;
           this.description = description;
           this.statusText = statusText;
           this.resultCode = resultCode;
           this.resultData = resultData;
    }


    /**
     * Gets the deviceID value for this SyncStatus.
     * 
     * @return deviceID
     */
    public long getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this SyncStatus.
     * 
     * @param deviceID
     */
    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the deviceName value for this SyncStatus.
     * 
     * @return deviceName
     */
    public String getDeviceName() {
        return deviceName;
    }


    /**
     * Sets the deviceName value for this SyncStatus.
     * 
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * Gets the totalSteps value for this SyncStatus.
     * 
     * @return totalSteps
     */
    public int getTotalSteps() {
        return totalSteps;
    }


    /**
     * Sets the totalSteps value for this SyncStatus.
     * 
     * @param totalSteps
     */
    public void setTotalSteps(int totalSteps) {
        this.totalSteps = totalSteps;
    }


    /**
     * Gets the currentStep value for this SyncStatus.
     * 
     * @return currentStep
     */
    public int getCurrentStep() {
        return currentStep;
    }


    /**
     * Sets the currentStep value for this SyncStatus.
     * 
     * @param currentStep
     */
    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }


    /**
     * Gets the description value for this SyncStatus.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this SyncStatus.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the statusText value for this SyncStatus.
     * 
     * @return statusText
     */
    public String getStatusText() {
        return statusText;
    }


    /**
     * Sets the statusText value for this SyncStatus.
     * 
     * @param statusText
     */
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }


    /**
     * Gets the resultCode value for this SyncStatus.
     * 
     * @return resultCode
     */
    public int getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this SyncStatus.
     * 
     * @param resultCode
     */
    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultData value for this SyncStatus.
     * 
     * @return resultData
     */
    public String getResultData() {
        return resultData;
    }


    /**
     * Sets the resultData value for this SyncStatus.
     * 
     * @param resultData
     */
    public void setResultData(String resultData) {
        this.resultData = resultData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SyncStatus)) return false;
        SyncStatus other = (SyncStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.deviceID == other.getDeviceID() &&
            ((this.deviceName==null && other.getDeviceName()==null) || 
             (this.deviceName!=null &&
              this.deviceName.equals(other.getDeviceName()))) &&
            this.totalSteps == other.getTotalSteps() &&
            this.currentStep == other.getCurrentStep() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.statusText==null && other.getStatusText()==null) || 
             (this.statusText!=null &&
              this.statusText.equals(other.getStatusText()))) &&
            this.resultCode == other.getResultCode() &&
            ((this.resultData==null && other.getResultData()==null) || 
             (this.resultData!=null &&
              this.resultData.equals(other.getResultData())));
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
        _hashCode += new Long(getDeviceID()).hashCode();
        if (getDeviceName() != null) {
            _hashCode += getDeviceName().hashCode();
        }
        _hashCode += getTotalSteps();
        _hashCode += getCurrentStep();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatusText() != null) {
            _hashCode += getStatusText().hashCode();
        }
        _hashCode += getResultCode();
        if (getResultData() != null) {
            _hashCode += getResultData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SyncStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "TotalSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentStep");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CurrentStep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "StatusText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ResultData"));
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
