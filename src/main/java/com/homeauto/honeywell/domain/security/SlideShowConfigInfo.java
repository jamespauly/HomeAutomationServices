/**
 * SlideShowConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class SlideShowConfigInfo  implements java.io.Serializable {
    private ContentPhotoInfo[] photoList;

    private int photoCountLeft;

    public SlideShowConfigInfo() {
    }

    public SlideShowConfigInfo(
           ContentPhotoInfo[] photoList,
           int photoCountLeft) {
           this.photoList = photoList;
           this.photoCountLeft = photoCountLeft;
    }


    /**
     * Gets the photoList value for this SlideShowConfigInfo.
     * 
     * @return photoList
     */
    public ContentPhotoInfo[] getPhotoList() {
        return photoList;
    }


    /**
     * Sets the photoList value for this SlideShowConfigInfo.
     * 
     * @param photoList
     */
    public void setPhotoList(ContentPhotoInfo[] photoList) {
        this.photoList = photoList;
    }


    /**
     * Gets the photoCountLeft value for this SlideShowConfigInfo.
     * 
     * @return photoCountLeft
     */
    public int getPhotoCountLeft() {
        return photoCountLeft;
    }


    /**
     * Sets the photoCountLeft value for this SlideShowConfigInfo.
     * 
     * @param photoCountLeft
     */
    public void setPhotoCountLeft(int photoCountLeft) {
        this.photoCountLeft = photoCountLeft;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SlideShowConfigInfo)) return false;
        SlideShowConfigInfo other = (SlideShowConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.photoList==null && other.getPhotoList()==null) || 
             (this.photoList!=null &&
              java.util.Arrays.equals(this.photoList, other.getPhotoList()))) &&
            this.photoCountLeft == other.getPhotoCountLeft();
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
        if (getPhotoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhotoList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPhotoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPhotoCountLeft();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SlideShowConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SlideShowConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentPhotoInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentPhotoInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoCountLeft");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PhotoCountLeft"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
