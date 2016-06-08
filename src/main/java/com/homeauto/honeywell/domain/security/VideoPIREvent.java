/**
 * VideoPIREvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class VideoPIREvent  implements java.io.Serializable {
    private long eventID;

    private String imageURL;

    private int eventImageCount;

    private java.util.Calendar imageDateTime;

    private java.util.Calendar imageDateTimeUTC;

    private int captureTypeID;

    private String imageRequestID;

    public VideoPIREvent() {
    }

    public VideoPIREvent(
           long eventID,
           String imageURL,
           int eventImageCount,
           java.util.Calendar imageDateTime,
           java.util.Calendar imageDateTimeUTC,
           int captureTypeID,
           String imageRequestID) {
           this.eventID = eventID;
           this.imageURL = imageURL;
           this.eventImageCount = eventImageCount;
           this.imageDateTime = imageDateTime;
           this.imageDateTimeUTC = imageDateTimeUTC;
           this.captureTypeID = captureTypeID;
           this.imageRequestID = imageRequestID;
    }


    /**
     * Gets the eventID value for this VideoPIREvent.
     * 
     * @return eventID
     */
    public long getEventID() {
        return eventID;
    }


    /**
     * Sets the eventID value for this VideoPIREvent.
     * 
     * @param eventID
     */
    public void setEventID(long eventID) {
        this.eventID = eventID;
    }


    /**
     * Gets the imageURL value for this VideoPIREvent.
     * 
     * @return imageURL
     */
    public String getImageURL() {
        return imageURL;
    }


    /**
     * Sets the imageURL value for this VideoPIREvent.
     * 
     * @param imageURL
     */
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    /**
     * Gets the eventImageCount value for this VideoPIREvent.
     * 
     * @return eventImageCount
     */
    public int getEventImageCount() {
        return eventImageCount;
    }


    /**
     * Sets the eventImageCount value for this VideoPIREvent.
     * 
     * @param eventImageCount
     */
    public void setEventImageCount(int eventImageCount) {
        this.eventImageCount = eventImageCount;
    }


    /**
     * Gets the imageDateTime value for this VideoPIREvent.
     * 
     * @return imageDateTime
     */
    public java.util.Calendar getImageDateTime() {
        return imageDateTime;
    }


    /**
     * Sets the imageDateTime value for this VideoPIREvent.
     * 
     * @param imageDateTime
     */
    public void setImageDateTime(java.util.Calendar imageDateTime) {
        this.imageDateTime = imageDateTime;
    }


    /**
     * Gets the imageDateTimeUTC value for this VideoPIREvent.
     * 
     * @return imageDateTimeUTC
     */
    public java.util.Calendar getImageDateTimeUTC() {
        return imageDateTimeUTC;
    }


    /**
     * Sets the imageDateTimeUTC value for this VideoPIREvent.
     * 
     * @param imageDateTimeUTC
     */
    public void setImageDateTimeUTC(java.util.Calendar imageDateTimeUTC) {
        this.imageDateTimeUTC = imageDateTimeUTC;
    }


    /**
     * Gets the captureTypeID value for this VideoPIREvent.
     * 
     * @return captureTypeID
     */
    public int getCaptureTypeID() {
        return captureTypeID;
    }


    /**
     * Sets the captureTypeID value for this VideoPIREvent.
     * 
     * @param captureTypeID
     */
    public void setCaptureTypeID(int captureTypeID) {
        this.captureTypeID = captureTypeID;
    }


    /**
     * Gets the imageRequestID value for this VideoPIREvent.
     * 
     * @return imageRequestID
     */
    public String getImageRequestID() {
        return imageRequestID;
    }


    /**
     * Sets the imageRequestID value for this VideoPIREvent.
     * 
     * @param imageRequestID
     */
    public void setImageRequestID(String imageRequestID) {
        this.imageRequestID = imageRequestID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VideoPIREvent)) return false;
        VideoPIREvent other = (VideoPIREvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventID == other.getEventID() &&
            ((this.imageURL==null && other.getImageURL()==null) || 
             (this.imageURL!=null &&
              this.imageURL.equals(other.getImageURL()))) &&
            this.eventImageCount == other.getEventImageCount() &&
            ((this.imageDateTime==null && other.getImageDateTime()==null) || 
             (this.imageDateTime!=null &&
              this.imageDateTime.equals(other.getImageDateTime()))) &&
            ((this.imageDateTimeUTC==null && other.getImageDateTimeUTC()==null) || 
             (this.imageDateTimeUTC!=null &&
              this.imageDateTimeUTC.equals(other.getImageDateTimeUTC()))) &&
            this.captureTypeID == other.getCaptureTypeID() &&
            ((this.imageRequestID==null && other.getImageRequestID()==null) || 
             (this.imageRequestID!=null &&
              this.imageRequestID.equals(other.getImageRequestID())));
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
        _hashCode += new Long(getEventID()).hashCode();
        if (getImageURL() != null) {
            _hashCode += getImageURL().hashCode();
        }
        _hashCode += getEventImageCount();
        if (getImageDateTime() != null) {
            _hashCode += getImageDateTime().hashCode();
        }
        if (getImageDateTimeUTC() != null) {
            _hashCode += getImageDateTimeUTC().hashCode();
        }
        _hashCode += getCaptureTypeID();
        if (getImageRequestID() != null) {
            _hashCode += getImageRequestID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPIREvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "VideoPIREvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventImageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventImageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageDateTimeUTC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageDateTimeUTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CaptureTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ImageRequestID"));
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
