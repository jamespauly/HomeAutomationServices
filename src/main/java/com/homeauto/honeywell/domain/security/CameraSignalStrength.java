/**
 * CameraSignalStrength.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.security;

public class CameraSignalStrength  implements java.io.Serializable {
    private int signalStrength;

    private String details;

    private String MAC;

    private int RSSI;

    private String SSID;

    private String noise;

    private String WAPMAC;

    private String channel;

    public CameraSignalStrength() {
    }

    public CameraSignalStrength(
           int signalStrength,
           String details,
           String MAC,
           int RSSI,
           String SSID,
           String noise,
           String WAPMAC,
           String channel) {
           this.signalStrength = signalStrength;
           this.details = details;
           this.MAC = MAC;
           this.RSSI = RSSI;
           this.SSID = SSID;
           this.noise = noise;
           this.WAPMAC = WAPMAC;
           this.channel = channel;
    }


    /**
     * Gets the signalStrength value for this CameraSignalStrength.
     * 
     * @return signalStrength
     */
    public int getSignalStrength() {
        return signalStrength;
    }


    /**
     * Sets the signalStrength value for this CameraSignalStrength.
     * 
     * @param signalStrength
     */
    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
    }


    /**
     * Gets the details value for this CameraSignalStrength.
     * 
     * @return details
     */
    public String getDetails() {
        return details;
    }


    /**
     * Sets the details value for this CameraSignalStrength.
     * 
     * @param details
     */
    public void setDetails(String details) {
        this.details = details;
    }


    /**
     * Gets the MAC value for this CameraSignalStrength.
     * 
     * @return MAC
     */
    public String getMAC() {
        return MAC;
    }


    /**
     * Sets the MAC value for this CameraSignalStrength.
     * 
     * @param MAC
     */
    public void setMAC(String MAC) {
        this.MAC = MAC;
    }


    /**
     * Gets the RSSI value for this CameraSignalStrength.
     * 
     * @return RSSI
     */
    public int getRSSI() {
        return RSSI;
    }


    /**
     * Sets the RSSI value for this CameraSignalStrength.
     * 
     * @param RSSI
     */
    public void setRSSI(int RSSI) {
        this.RSSI = RSSI;
    }


    /**
     * Gets the SSID value for this CameraSignalStrength.
     * 
     * @return SSID
     */
    public String getSSID() {
        return SSID;
    }


    /**
     * Sets the SSID value for this CameraSignalStrength.
     * 
     * @param SSID
     */
    public void setSSID(String SSID) {
        this.SSID = SSID;
    }


    /**
     * Gets the noise value for this CameraSignalStrength.
     * 
     * @return noise
     */
    public String getNoise() {
        return noise;
    }


    /**
     * Sets the noise value for this CameraSignalStrength.
     * 
     * @param noise
     */
    public void setNoise(String noise) {
        this.noise = noise;
    }


    /**
     * Gets the WAPMAC value for this CameraSignalStrength.
     * 
     * @return WAPMAC
     */
    public String getWAPMAC() {
        return WAPMAC;
    }


    /**
     * Sets the WAPMAC value for this CameraSignalStrength.
     * 
     * @param WAPMAC
     */
    public void setWAPMAC(String WAPMAC) {
        this.WAPMAC = WAPMAC;
    }


    /**
     * Gets the channel value for this CameraSignalStrength.
     * 
     * @return channel
     */
    public String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CameraSignalStrength.
     * 
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CameraSignalStrength)) return false;
        CameraSignalStrength other = (CameraSignalStrength) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.signalStrength == other.getSignalStrength() &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.MAC==null && other.getMAC()==null) || 
             (this.MAC!=null &&
              this.MAC.equals(other.getMAC()))) &&
            this.RSSI == other.getRSSI() &&
            ((this.SSID==null && other.getSSID()==null) || 
             (this.SSID!=null &&
              this.SSID.equals(other.getSSID()))) &&
            ((this.noise==null && other.getNoise()==null) || 
             (this.noise!=null &&
              this.noise.equals(other.getNoise()))) &&
            ((this.WAPMAC==null && other.getWAPMAC()==null) || 
             (this.WAPMAC!=null &&
              this.WAPMAC.equals(other.getWAPMAC()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        _hashCode += getSignalStrength();
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getMAC() != null) {
            _hashCode += getMAC().hashCode();
        }
        _hashCode += getRSSI();
        if (getSSID() != null) {
            _hashCode += getSSID().hashCode();
        }
        if (getNoise() != null) {
            _hashCode += getNoise().hashCode();
        }
        if (getWAPMAC() != null) {
            _hashCode += getWAPMAC().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CameraSignalStrength.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "CameraSignalStrength"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signalStrength");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SignalStrength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MAC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "MAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RSSI");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "RSSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSID");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "SSID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noise");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Noise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WAPMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "WAPMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://services.alarmnet.com/TC2/", "Channel"));
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
