/**
 * EventRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class EventRecord  implements java.io.Serializable {
    private long eventRecordId;

    private long eventType;

    private String event;

    private String originator;

    private String notice;

    private String notes;

    private boolean hasNotes;

    private boolean isLocked;

    private boolean isHidden;

    private String recDateTimeGMT;

    private String recDateLocal;

    private String recDateSuffix;

    private int filterClass;

    private long deviceId;

    public EventRecord() {
    }

    public EventRecord(
           long eventRecordId,
           long eventType,
           String event,
           String originator,
           String notice,
           String notes,
           boolean hasNotes,
           boolean isLocked,
           boolean isHidden,
           String recDateTimeGMT,
           String recDateLocal,
           String recDateSuffix,
           int filterClass,
           long deviceId) {
           this.eventRecordId = eventRecordId;
           this.eventType = eventType;
           this.event = event;
           this.originator = originator;
           this.notice = notice;
           this.notes = notes;
           this.hasNotes = hasNotes;
           this.isLocked = isLocked;
           this.isHidden = isHidden;
           this.recDateTimeGMT = recDateTimeGMT;
           this.recDateLocal = recDateLocal;
           this.recDateSuffix = recDateSuffix;
           this.filterClass = filterClass;
           this.deviceId = deviceId;
    }


    /**
     * Gets the eventRecordId value for this EventRecord.
     * 
     * @return eventRecordId
     */
    public long getEventRecordId() {
        return eventRecordId;
    }


    /**
     * Sets the eventRecordId value for this EventRecord.
     * 
     * @param eventRecordId
     */
    public void setEventRecordId(long eventRecordId) {
        this.eventRecordId = eventRecordId;
    }


    /**
     * Gets the eventType value for this EventRecord.
     * 
     * @return eventType
     */
    public long getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this EventRecord.
     * 
     * @param eventType
     */
    public void setEventType(long eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the event value for this EventRecord.
     * 
     * @return event
     */
    public String getEvent() {
        return event;
    }


    /**
     * Sets the event value for this EventRecord.
     * 
     * @param event
     */
    public void setEvent(String event) {
        this.event = event;
    }


    /**
     * Gets the originator value for this EventRecord.
     * 
     * @return originator
     */
    public String getOriginator() {
        return originator;
    }


    /**
     * Sets the originator value for this EventRecord.
     * 
     * @param originator
     */
    public void setOriginator(String originator) {
        this.originator = originator;
    }


    /**
     * Gets the notice value for this EventRecord.
     * 
     * @return notice
     */
    public String getNotice() {
        return notice;
    }


    /**
     * Sets the notice value for this EventRecord.
     * 
     * @param notice
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }


    /**
     * Gets the notes value for this EventRecord.
     * 
     * @return notes
     */
    public String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this EventRecord.
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }


    /**
     * Gets the hasNotes value for this EventRecord.
     * 
     * @return hasNotes
     */
    public boolean isHasNotes() {
        return hasNotes;
    }


    /**
     * Sets the hasNotes value for this EventRecord.
     * 
     * @param hasNotes
     */
    public void setHasNotes(boolean hasNotes) {
        this.hasNotes = hasNotes;
    }


    /**
     * Gets the isLocked value for this EventRecord.
     * 
     * @return isLocked
     */
    public boolean isIsLocked() {
        return isLocked;
    }


    /**
     * Sets the isLocked value for this EventRecord.
     * 
     * @param isLocked
     */
    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }


    /**
     * Gets the isHidden value for this EventRecord.
     * 
     * @return isHidden
     */
    public boolean isIsHidden() {
        return isHidden;
    }


    /**
     * Sets the isHidden value for this EventRecord.
     * 
     * @param isHidden
     */
    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }


    /**
     * Gets the recDateTimeGMT value for this EventRecord.
     * 
     * @return recDateTimeGMT
     */
    public String getRecDateTimeGMT() {
        return recDateTimeGMT;
    }


    /**
     * Sets the recDateTimeGMT value for this EventRecord.
     * 
     * @param recDateTimeGMT
     */
    public void setRecDateTimeGMT(String recDateTimeGMT) {
        this.recDateTimeGMT = recDateTimeGMT;
    }


    /**
     * Gets the recDateLocal value for this EventRecord.
     * 
     * @return recDateLocal
     */
    public String getRecDateLocal() {
        return recDateLocal;
    }


    /**
     * Sets the recDateLocal value for this EventRecord.
     * 
     * @param recDateLocal
     */
    public void setRecDateLocal(String recDateLocal) {
        this.recDateLocal = recDateLocal;
    }


    /**
     * Gets the recDateSuffix value for this EventRecord.
     * 
     * @return recDateSuffix
     */
    public String getRecDateSuffix() {
        return recDateSuffix;
    }


    /**
     * Sets the recDateSuffix value for this EventRecord.
     * 
     * @param recDateSuffix
     */
    public void setRecDateSuffix(String recDateSuffix) {
        this.recDateSuffix = recDateSuffix;
    }


    /**
     * Gets the filterClass value for this EventRecord.
     * 
     * @return filterClass
     */
    public int getFilterClass() {
        return filterClass;
    }


    /**
     * Sets the filterClass value for this EventRecord.
     * 
     * @param filterClass
     */
    public void setFilterClass(int filterClass) {
        this.filterClass = filterClass;
    }


    /**
     * Gets the deviceId value for this EventRecord.
     * 
     * @return deviceId
     */
    public long getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this EventRecord.
     * 
     * @param deviceId
     */
    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventRecord)) return false;
        EventRecord other = (EventRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.eventRecordId == other.getEventRecordId() &&
            this.eventType == other.getEventType() &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent()))) &&
            ((this.originator==null && other.getOriginator()==null) || 
             (this.originator!=null &&
              this.originator.equals(other.getOriginator()))) &&
            ((this.notice==null && other.getNotice()==null) || 
             (this.notice!=null &&
              this.notice.equals(other.getNotice()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            this.hasNotes == other.isHasNotes() &&
            this.isLocked == other.isIsLocked() &&
            this.isHidden == other.isIsHidden() &&
            ((this.recDateTimeGMT==null && other.getRecDateTimeGMT()==null) || 
             (this.recDateTimeGMT!=null &&
              this.recDateTimeGMT.equals(other.getRecDateTimeGMT()))) &&
            ((this.recDateLocal==null && other.getRecDateLocal()==null) || 
             (this.recDateLocal!=null &&
              this.recDateLocal.equals(other.getRecDateLocal()))) &&
            ((this.recDateSuffix==null && other.getRecDateSuffix()==null) || 
             (this.recDateSuffix!=null &&
              this.recDateSuffix.equals(other.getRecDateSuffix()))) &&
            this.filterClass == other.getFilterClass() &&
            this.deviceId == other.getDeviceId();
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
        _hashCode += new Long(getEventRecordId()).hashCode();
        _hashCode += new Long(getEventType()).hashCode();
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        if (getOriginator() != null) {
            _hashCode += getOriginator().hashCode();
        }
        if (getNotice() != null) {
            _hashCode += getNotice().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        _hashCode += (isHasNotes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsLocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecDateTimeGMT() != null) {
            _hashCode += getRecDateTimeGMT().hashCode();
        }
        if (getRecDateLocal() != null) {
            _hashCode += getRecDateLocal().hashCode();
        }
        if (getRecDateSuffix() != null) {
            _hashCode += getRecDateSuffix().hashCode();
        }
        _hashCode += getFilterClass();
        _hashCode += new Long(getDeviceId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventRecordId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "EventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Event"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Originator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Notice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "HasNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "IsHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recDateTimeGMT");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RecDateTimeGMT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recDateLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RecDateLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recDateSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RecDateSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterClass");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "FilterClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "DeviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
