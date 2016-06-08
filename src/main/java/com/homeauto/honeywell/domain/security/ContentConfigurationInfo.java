/**
 * ContentConfigurationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class ContentConfigurationInfo  implements java.io.Serializable {
    private int[] availableContentTypeList;

    private ContentSettingsInfo[] contentSettingsList;

    private NewsRegionsInfo[] newsRegionsList;

    private int[] homeIconList;

    private int firstRefreshTime;

    private int secondRefreshTime;

    public ContentConfigurationInfo() {
    }

    public ContentConfigurationInfo(
           int[] availableContentTypeList,
           ContentSettingsInfo[] contentSettingsList,
           NewsRegionsInfo[] newsRegionsList,
           int[] homeIconList,
           int firstRefreshTime,
           int secondRefreshTime) {
           this.availableContentTypeList = availableContentTypeList;
           this.contentSettingsList = contentSettingsList;
           this.newsRegionsList = newsRegionsList;
           this.homeIconList = homeIconList;
           this.firstRefreshTime = firstRefreshTime;
           this.secondRefreshTime = secondRefreshTime;
    }


    /**
     * Gets the availableContentTypeList value for this ContentConfigurationInfo.
     * 
     * @return availableContentTypeList
     */
    public int[] getAvailableContentTypeList() {
        return availableContentTypeList;
    }


    /**
     * Sets the availableContentTypeList value for this ContentConfigurationInfo.
     * 
     * @param availableContentTypeList
     */
    public void setAvailableContentTypeList(int[] availableContentTypeList) {
        this.availableContentTypeList = availableContentTypeList;
    }


    /**
     * Gets the contentSettingsList value for this ContentConfigurationInfo.
     * 
     * @return contentSettingsList
     */
    public ContentSettingsInfo[] getContentSettingsList() {
        return contentSettingsList;
    }


    /**
     * Sets the contentSettingsList value for this ContentConfigurationInfo.
     * 
     * @param contentSettingsList
     */
    public void setContentSettingsList(ContentSettingsInfo[] contentSettingsList) {
        this.contentSettingsList = contentSettingsList;
    }


    /**
     * Gets the newsRegionsList value for this ContentConfigurationInfo.
     * 
     * @return newsRegionsList
     */
    public NewsRegionsInfo[] getNewsRegionsList() {
        return newsRegionsList;
    }


    /**
     * Sets the newsRegionsList value for this ContentConfigurationInfo.
     * 
     * @param newsRegionsList
     */
    public void setNewsRegionsList(NewsRegionsInfo[] newsRegionsList) {
        this.newsRegionsList = newsRegionsList;
    }


    /**
     * Gets the homeIconList value for this ContentConfigurationInfo.
     * 
     * @return homeIconList
     */
    public int[] getHomeIconList() {
        return homeIconList;
    }


    /**
     * Sets the homeIconList value for this ContentConfigurationInfo.
     * 
     * @param homeIconList
     */
    public void setHomeIconList(int[] homeIconList) {
        this.homeIconList = homeIconList;
    }


    /**
     * Gets the firstRefreshTime value for this ContentConfigurationInfo.
     * 
     * @return firstRefreshTime
     */
    public int getFirstRefreshTime() {
        return firstRefreshTime;
    }


    /**
     * Sets the firstRefreshTime value for this ContentConfigurationInfo.
     * 
     * @param firstRefreshTime
     */
    public void setFirstRefreshTime(int firstRefreshTime) {
        this.firstRefreshTime = firstRefreshTime;
    }


    /**
     * Gets the secondRefreshTime value for this ContentConfigurationInfo.
     * 
     * @return secondRefreshTime
     */
    public int getSecondRefreshTime() {
        return secondRefreshTime;
    }


    /**
     * Sets the secondRefreshTime value for this ContentConfigurationInfo.
     * 
     * @param secondRefreshTime
     */
    public void setSecondRefreshTime(int secondRefreshTime) {
        this.secondRefreshTime = secondRefreshTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContentConfigurationInfo)) return false;
        ContentConfigurationInfo other = (ContentConfigurationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableContentTypeList==null && other.getAvailableContentTypeList()==null) || 
             (this.availableContentTypeList!=null &&
              java.util.Arrays.equals(this.availableContentTypeList, other.getAvailableContentTypeList()))) &&
            ((this.contentSettingsList==null && other.getContentSettingsList()==null) || 
             (this.contentSettingsList!=null &&
              java.util.Arrays.equals(this.contentSettingsList, other.getContentSettingsList()))) &&
            ((this.newsRegionsList==null && other.getNewsRegionsList()==null) || 
             (this.newsRegionsList!=null &&
              java.util.Arrays.equals(this.newsRegionsList, other.getNewsRegionsList()))) &&
            ((this.homeIconList==null && other.getHomeIconList()==null) || 
             (this.homeIconList!=null &&
              java.util.Arrays.equals(this.homeIconList, other.getHomeIconList()))) &&
            this.firstRefreshTime == other.getFirstRefreshTime() &&
            this.secondRefreshTime == other.getSecondRefreshTime();
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
        if (getAvailableContentTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableContentTypeList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAvailableContentTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentSettingsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentSettingsList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContentSettingsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewsRegionsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewsRegionsList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNewsRegionsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHomeIconList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHomeIconList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getHomeIconList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getFirstRefreshTime();
        _hashCode += getSecondRefreshTime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentConfigurationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentConfigurationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableContentTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AvailableContentTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSettingsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentSettingsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentSettingsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ContentSettingsInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newsRegionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewsRegionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewsRegionsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "NewsRegionsInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeIconList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HomeIconList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstRefreshTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FirstRefreshTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondRefreshTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SecondRefreshTime"));
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
