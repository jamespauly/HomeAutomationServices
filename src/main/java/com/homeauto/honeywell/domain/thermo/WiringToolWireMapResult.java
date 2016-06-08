/**
 * WiringToolWireMapResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class WiringToolWireMapResult  extends WebMethodResult  implements java.io.Serializable {
    private String[] wireMapping;

    private String narrative;

    private String notation;

    private String context;

    private String description;

    private String guidance;

    private String tieBreaker;

    private String[] tieBreakerAnswers;

    public WiringToolWireMapResult() {
    }

    public WiringToolWireMapResult(
           Results result,
           String[] wireMapping,
           String narrative,
           String notation,
           String context,
           String description,
           String guidance,
           String tieBreaker,
           String[] tieBreakerAnswers) {
        super(
            result);
        this.wireMapping = wireMapping;
        this.narrative = narrative;
        this.notation = notation;
        this.context = context;
        this.description = description;
        this.guidance = guidance;
        this.tieBreaker = tieBreaker;
        this.tieBreakerAnswers = tieBreakerAnswers;
    }


    /**
     * Gets the wireMapping value for this WiringToolWireMapResult.
     * 
     * @return wireMapping
     */
    public String[] getWireMapping() {
        return wireMapping;
    }


    /**
     * Sets the wireMapping value for this WiringToolWireMapResult.
     * 
     * @param wireMapping
     */
    public void setWireMapping(String[] wireMapping) {
        this.wireMapping = wireMapping;
    }


    /**
     * Gets the narrative value for this WiringToolWireMapResult.
     * 
     * @return narrative
     */
    public String getNarrative() {
        return narrative;
    }


    /**
     * Sets the narrative value for this WiringToolWireMapResult.
     * 
     * @param narrative
     */
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }


    /**
     * Gets the notation value for this WiringToolWireMapResult.
     * 
     * @return notation
     */
    public String getNotation() {
        return notation;
    }


    /**
     * Sets the notation value for this WiringToolWireMapResult.
     * 
     * @param notation
     */
    public void setNotation(String notation) {
        this.notation = notation;
    }


    /**
     * Gets the context value for this WiringToolWireMapResult.
     * 
     * @return context
     */
    public String getContext() {
        return context;
    }


    /**
     * Sets the context value for this WiringToolWireMapResult.
     * 
     * @param context
     */
    public void setContext(String context) {
        this.context = context;
    }


    /**
     * Gets the description value for this WiringToolWireMapResult.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this WiringToolWireMapResult.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the guidance value for this WiringToolWireMapResult.
     * 
     * @return guidance
     */
    public String getGuidance() {
        return guidance;
    }


    /**
     * Sets the guidance value for this WiringToolWireMapResult.
     * 
     * @param guidance
     */
    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }


    /**
     * Gets the tieBreaker value for this WiringToolWireMapResult.
     * 
     * @return tieBreaker
     */
    public String getTieBreaker() {
        return tieBreaker;
    }


    /**
     * Sets the tieBreaker value for this WiringToolWireMapResult.
     * 
     * @param tieBreaker
     */
    public void setTieBreaker(String tieBreaker) {
        this.tieBreaker = tieBreaker;
    }


    /**
     * Gets the tieBreakerAnswers value for this WiringToolWireMapResult.
     * 
     * @return tieBreakerAnswers
     */
    public String[] getTieBreakerAnswers() {
        return tieBreakerAnswers;
    }


    /**
     * Sets the tieBreakerAnswers value for this WiringToolWireMapResult.
     * 
     * @param tieBreakerAnswers
     */
    public void setTieBreakerAnswers(String[] tieBreakerAnswers) {
        this.tieBreakerAnswers = tieBreakerAnswers;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WiringToolWireMapResult)) return false;
        WiringToolWireMapResult other = (WiringToolWireMapResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.wireMapping==null && other.getWireMapping()==null) || 
             (this.wireMapping!=null &&
              java.util.Arrays.equals(this.wireMapping, other.getWireMapping()))) &&
            ((this.narrative==null && other.getNarrative()==null) || 
             (this.narrative!=null &&
              this.narrative.equals(other.getNarrative()))) &&
            ((this.notation==null && other.getNotation()==null) || 
             (this.notation!=null &&
              this.notation.equals(other.getNotation()))) &&
            ((this.context==null && other.getContext()==null) || 
             (this.context!=null &&
              this.context.equals(other.getContext()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.guidance==null && other.getGuidance()==null) || 
             (this.guidance!=null &&
              this.guidance.equals(other.getGuidance()))) &&
            ((this.tieBreaker==null && other.getTieBreaker()==null) || 
             (this.tieBreaker!=null &&
              this.tieBreaker.equals(other.getTieBreaker()))) &&
            ((this.tieBreakerAnswers==null && other.getTieBreakerAnswers()==null) || 
             (this.tieBreakerAnswers!=null &&
              java.util.Arrays.equals(this.tieBreakerAnswers, other.getTieBreakerAnswers())));
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
        if (getWireMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWireMapping());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWireMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNarrative() != null) {
            _hashCode += getNarrative().hashCode();
        }
        if (getNotation() != null) {
            _hashCode += getNotation().hashCode();
        }
        if (getContext() != null) {
            _hashCode += getContext().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getGuidance() != null) {
            _hashCode += getGuidance().hashCode();
        }
        if (getTieBreaker() != null) {
            _hashCode += getTieBreaker().hashCode();
        }
        if (getTieBreakerAnswers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTieBreakerAnswers());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTieBreakerAnswers(), i);
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
        new org.apache.axis.description.TypeDesc(WiringToolWireMapResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WiringToolWireMapResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wireMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WireMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("narrative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Narrative"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Notation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("context");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Context"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guidance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "Guidance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tieBreaker");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TieBreaker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tieBreakerAnswers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "TieBreakerAnswers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "string"));
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
