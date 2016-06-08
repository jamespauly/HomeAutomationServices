/**
 * DealerMessageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class DealerMessageInfo  implements java.io.Serializable {
    private short displayTypeID;

    private long accountID;

    private long locationID;

    private int priority;

    private int messageID;

    private int messageType;

    private String title;

    private String messageData;

    private String receivedTime;

    private int readState;

    public DealerMessageInfo() {
    }

    public DealerMessageInfo(
           short displayTypeID,
           long accountID,
           long locationID,
           int priority,
           int messageID,
           int messageType,
           String title,
           String messageData,
           String receivedTime,
           int readState) {
           this.displayTypeID = displayTypeID;
           this.accountID = accountID;
           this.locationID = locationID;
           this.priority = priority;
           this.messageID = messageID;
           this.messageType = messageType;
           this.title = title;
           this.messageData = messageData;
           this.receivedTime = receivedTime;
           this.readState = readState;
    }


    /**
     * Gets the displayTypeID value for this DealerMessageInfo.
     * 
     * @return displayTypeID
     */
    public short getDisplayTypeID() {
        return displayTypeID;
    }


    /**
     * Sets the displayTypeID value for this DealerMessageInfo.
     * 
     * @param displayTypeID
     */
    public void setDisplayTypeID(short displayTypeID) {
        this.displayTypeID = displayTypeID;
    }


    /**
     * Gets the accountID value for this DealerMessageInfo.
     * 
     * @return accountID
     */
    public long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this DealerMessageInfo.
     * 
     * @param accountID
     */
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the locationID value for this DealerMessageInfo.
     * 
     * @return locationID
     */
    public long getLocationID() {
        return locationID;
    }


    /**
     * Sets the locationID value for this DealerMessageInfo.
     * 
     * @param locationID
     */
    public void setLocationID(long locationID) {
        this.locationID = locationID;
    }


    /**
     * Gets the priority value for this DealerMessageInfo.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this DealerMessageInfo.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the messageID value for this DealerMessageInfo.
     * 
     * @return messageID
     */
    public int getMessageID() {
        return messageID;
    }


    /**
     * Sets the messageID value for this DealerMessageInfo.
     * 
     * @param messageID
     */
    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }


    /**
     * Gets the messageType value for this DealerMessageInfo.
     * 
     * @return messageType
     */
    public int getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this DealerMessageInfo.
     * 
     * @param messageType
     */
    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the title value for this DealerMessageInfo.
     * 
     * @return title
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this DealerMessageInfo.
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the messageData value for this DealerMessageInfo.
     * 
     * @return messageData
     */
    public String getMessageData() {
        return messageData;
    }


    /**
     * Sets the messageData value for this DealerMessageInfo.
     * 
     * @param messageData
     */
    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }


    /**
     * Gets the receivedTime value for this DealerMessageInfo.
     * 
     * @return receivedTime
     */
    public String getReceivedTime() {
        return receivedTime;
    }


    /**
     * Sets the receivedTime value for this DealerMessageInfo.
     * 
     * @param receivedTime
     */
    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }


    /**
     * Gets the readState value for this DealerMessageInfo.
     * 
     * @return readState
     */
    public int getReadState() {
        return readState;
    }


    /**
     * Sets the readState value for this DealerMessageInfo.
     * 
     * @param readState
     */
    public void setReadState(int readState) {
        this.readState = readState;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DealerMessageInfo)) return false;
        DealerMessageInfo other = (DealerMessageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.displayTypeID == other.getDisplayTypeID() &&
            this.accountID == other.getAccountID() &&
            this.locationID == other.getLocationID() &&
            this.priority == other.getPriority() &&
            this.messageID == other.getMessageID() &&
            this.messageType == other.getMessageType() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.messageData==null && other.getMessageData()==null) || 
             (this.messageData!=null &&
              this.messageData.equals(other.getMessageData()))) &&
            ((this.receivedTime==null && other.getReceivedTime()==null) || 
             (this.receivedTime!=null &&
              this.receivedTime.equals(other.getReceivedTime()))) &&
            this.readState == other.getReadState();
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
        _hashCode += getDisplayTypeID();
        _hashCode += new Long(getAccountID()).hashCode();
        _hashCode += new Long(getLocationID()).hashCode();
        _hashCode += getPriority();
        _hashCode += getMessageID();
        _hashCode += getMessageType();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getMessageData() != null) {
            _hashCode += getMessageData().hashCode();
        }
        if (getReceivedTime() != null) {
            _hashCode += getReceivedTime().hashCode();
        }
        _hashCode += getReadState();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DealerMessageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DealerMessageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DisplayTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "LocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MessageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MessageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReceivedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "ReadState"));
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
