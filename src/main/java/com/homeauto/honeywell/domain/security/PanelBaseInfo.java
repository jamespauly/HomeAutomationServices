/**
 * PanelBaseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public abstract class PanelBaseInfo  implements java.io.Serializable {
    private PartitionInfo[] partitions;

    private long lastUpdatedTimestampTicks;  // attribute

    private int configurationSequenceNumber;  // attribute

    private boolean isInACLoss;  // attribute

    private boolean isInLowBattery;  // attribute

    public PanelBaseInfo() {
    }

    public PanelBaseInfo(
            PartitionInfo[] partitions,
            long lastUpdatedTimestampTicks,
            int configurationSequenceNumber,
            boolean isInACLoss,
            boolean isInLowBattery) {
           this.partitions = partitions;
           this.lastUpdatedTimestampTicks = lastUpdatedTimestampTicks;
           this.configurationSequenceNumber = configurationSequenceNumber;
           this.isInACLoss = isInACLoss;
           this.isInLowBattery = isInLowBattery;
    }


    /**
     * Gets the partitions value for this PanelBaseInfo.
     * 
     * @return partitions
     */
    public PartitionInfo[] getPartitions() {
        return partitions;
    }


    /**
     * Sets the partitions value for this PanelBaseInfo.
     * 
     * @param partitions
     */
    public void setPartitions(PartitionInfo[] partitions) {
        this.partitions = partitions;
    }


    /**
     * Gets the lastUpdatedTimestampTicks value for this PanelBaseInfo.
     * 
     * @return lastUpdatedTimestampTicks
     */
    public long getLastUpdatedTimestampTicks() {
        return lastUpdatedTimestampTicks;
    }


    /**
     * Sets the lastUpdatedTimestampTicks value for this PanelBaseInfo.
     * 
     * @param lastUpdatedTimestampTicks
     */
    public void setLastUpdatedTimestampTicks(long lastUpdatedTimestampTicks) {
        this.lastUpdatedTimestampTicks = lastUpdatedTimestampTicks;
    }


    /**
     * Gets the configurationSequenceNumber value for this PanelBaseInfo.
     * 
     * @return configurationSequenceNumber
     */
    public int getConfigurationSequenceNumber() {
        return configurationSequenceNumber;
    }


    /**
     * Sets the configurationSequenceNumber value for this PanelBaseInfo.
     * 
     * @param configurationSequenceNumber
     */
    public void setConfigurationSequenceNumber(int configurationSequenceNumber) {
        this.configurationSequenceNumber = configurationSequenceNumber;
    }


    /**
     * Gets the isInACLoss value for this PanelBaseInfo.
     * 
     * @return isInACLoss
     */
    public boolean isIsInACLoss() {
        return isInACLoss;
    }


    /**
     * Sets the isInACLoss value for this PanelBaseInfo.
     * 
     * @param isInACLoss
     */
    public void setIsInACLoss(boolean isInACLoss) {
        this.isInACLoss = isInACLoss;
    }


    /**
     * Gets the isInLowBattery value for this PanelBaseInfo.
     * 
     * @return isInLowBattery
     */
    public boolean isIsInLowBattery() {
        return isInLowBattery;
    }


    /**
     * Sets the isInLowBattery value for this PanelBaseInfo.
     * 
     * @param isInLowBattery
     */
    public void setIsInLowBattery(boolean isInLowBattery) {
        this.isInLowBattery = isInLowBattery;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PanelBaseInfo)) return false;
        PanelBaseInfo other = (PanelBaseInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partitions==null && other.getPartitions()==null) || 
             (this.partitions!=null &&
              java.util.Arrays.equals(this.partitions, other.getPartitions()))) &&
            this.lastUpdatedTimestampTicks == other.getLastUpdatedTimestampTicks() &&
            this.configurationSequenceNumber == other.getConfigurationSequenceNumber() &&
            this.isInACLoss == other.isIsInACLoss() &&
            this.isInLowBattery == other.isIsInLowBattery();
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
        if (getPartitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartitions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPartitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getLastUpdatedTimestampTicks()).hashCode();
        _hashCode += getConfigurationSequenceNumber();
        _hashCode += (isIsInACLoss() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsInLowBattery() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PanelBaseInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PanelBaseInfo"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lastUpdatedTimestampTicks");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LastUpdatedTimestampTicks"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("configurationSequenceNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConfigurationSequenceNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isInACLoss");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsInACLoss"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isInLowBattery");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsInLowBattery"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partitions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Partitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "PartitionInfo"));
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
