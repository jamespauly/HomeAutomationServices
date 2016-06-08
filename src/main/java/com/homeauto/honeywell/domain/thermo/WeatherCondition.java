/**
 * WeatherCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.homeauto.honeywell.domain.thermo;

public class WeatherCondition implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WeatherCondition(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _Unknown = "Unknown";
    public static final String _Sunny = "Sunny";
    public static final String _MostlySunny = "MostlySunny";
    public static final String _PartlySunny = "PartlySunny";
    public static final String _IntermittentClouds = "IntermittentClouds";
    public static final String _HazySunshine = "HazySunshine";
    public static final String _MostlyCloudy = "MostlyCloudy";
    public static final String _Cloudy = "Cloudy";
    public static final String _Dreary = "Dreary";
    public static final String _Fog = "Fog";
    public static final String _Showers = "Showers";
    public static final String _MostlyCloudyWithShowers = "MostlyCloudyWithShowers";
    public static final String _PartlySunnyWithShowers = "PartlySunnyWithShowers";
    public static final String _Thunderstorms = "Thunderstorms";
    public static final String _MostlyCloudyWithThunderShowers = "MostlyCloudyWithThunderShowers";
    public static final String _PartlySunnyWithThunderShowers = "PartlySunnyWithThunderShowers";
    public static final String _Rain = "Rain";
    public static final String _Flurries = "Flurries";
    public static final String _MostlyCloudyWithFlurries = "MostlyCloudyWithFlurries";
    public static final String _PartlySunnyWithFlurries = "PartlySunnyWithFlurries";
    public static final String _Snow = "Snow";
    public static final String _MostlyCloudyWithSnow = "MostlyCloudyWithSnow";
    public static final String _Ice = "Ice";
    public static final String _Sleet = "Sleet";
    public static final String _FreezingRain = "FreezingRain";
    public static final String _RainAndSnowMixed = "RainAndSnowMixed";
    public static final String _Hot = "Hot";
    public static final String _Cold = "Cold";
    public static final String _Windy = "Windy";
    public static final String _NightClear = "NightClear";
    public static final String _NightMostlyClear = "NightMostlyClear";
    public static final String _NightPartlyCloudy = "NightPartlyCloudy";
    public static final String _NightIntermittentClouds = "NightIntermittentClouds";
    public static final String _NightHazy = "NightHazy";
    public static final String _NightMostlyCloudy = "NightMostlyCloudy";
    public static final String _NightPartlyCloudyWithShowers = "NightPartlyCloudyWithShowers";
    public static final String _NightMostlyCloudyWithShowers = "NightMostlyCloudyWithShowers";
    public static final String _NightPartlyCloudyWithThunderShowers = "NightPartlyCloudyWithThunderShowers";
    public static final String _NightMostlyCloudyWithThunderShowers = "NightMostlyCloudyWithThunderShowers";
    public static final String _NightMostlyCloudyWithFlurries = "NightMostlyCloudyWithFlurries";
    public static final String _NightMostlyCloudyWithSnow = "NightMostlyCloudyWithSnow";
    public static final WeatherCondition Unknown = new WeatherCondition(_Unknown);
    public static final WeatherCondition Sunny = new WeatherCondition(_Sunny);
    public static final WeatherCondition MostlySunny = new WeatherCondition(_MostlySunny);
    public static final WeatherCondition PartlySunny = new WeatherCondition(_PartlySunny);
    public static final WeatherCondition IntermittentClouds = new WeatherCondition(_IntermittentClouds);
    public static final WeatherCondition HazySunshine = new WeatherCondition(_HazySunshine);
    public static final WeatherCondition MostlyCloudy = new WeatherCondition(_MostlyCloudy);
    public static final WeatherCondition Cloudy = new WeatherCondition(_Cloudy);
    public static final WeatherCondition Dreary = new WeatherCondition(_Dreary);
    public static final WeatherCondition Fog = new WeatherCondition(_Fog);
    public static final WeatherCondition Showers = new WeatherCondition(_Showers);
    public static final WeatherCondition MostlyCloudyWithShowers = new WeatherCondition(_MostlyCloudyWithShowers);
    public static final WeatherCondition PartlySunnyWithShowers = new WeatherCondition(_PartlySunnyWithShowers);
    public static final WeatherCondition Thunderstorms = new WeatherCondition(_Thunderstorms);
    public static final WeatherCondition MostlyCloudyWithThunderShowers = new WeatherCondition(_MostlyCloudyWithThunderShowers);
    public static final WeatherCondition PartlySunnyWithThunderShowers = new WeatherCondition(_PartlySunnyWithThunderShowers);
    public static final WeatherCondition Rain = new WeatherCondition(_Rain);
    public static final WeatherCondition Flurries = new WeatherCondition(_Flurries);
    public static final WeatherCondition MostlyCloudyWithFlurries = new WeatherCondition(_MostlyCloudyWithFlurries);
    public static final WeatherCondition PartlySunnyWithFlurries = new WeatherCondition(_PartlySunnyWithFlurries);
    public static final WeatherCondition Snow = new WeatherCondition(_Snow);
    public static final WeatherCondition MostlyCloudyWithSnow = new WeatherCondition(_MostlyCloudyWithSnow);
    public static final WeatherCondition Ice = new WeatherCondition(_Ice);
    public static final WeatherCondition Sleet = new WeatherCondition(_Sleet);
    public static final WeatherCondition FreezingRain = new WeatherCondition(_FreezingRain);
    public static final WeatherCondition RainAndSnowMixed = new WeatherCondition(_RainAndSnowMixed);
    public static final WeatherCondition Hot = new WeatherCondition(_Hot);
    public static final WeatherCondition Cold = new WeatherCondition(_Cold);
    public static final WeatherCondition Windy = new WeatherCondition(_Windy);
    public static final WeatherCondition NightClear = new WeatherCondition(_NightClear);
    public static final WeatherCondition NightMostlyClear = new WeatherCondition(_NightMostlyClear);
    public static final WeatherCondition NightPartlyCloudy = new WeatherCondition(_NightPartlyCloudy);
    public static final WeatherCondition NightIntermittentClouds = new WeatherCondition(_NightIntermittentClouds);
    public static final WeatherCondition NightHazy = new WeatherCondition(_NightHazy);
    public static final WeatherCondition NightMostlyCloudy = new WeatherCondition(_NightMostlyCloudy);
    public static final WeatherCondition NightPartlyCloudyWithShowers = new WeatherCondition(_NightPartlyCloudyWithShowers);
    public static final WeatherCondition NightMostlyCloudyWithShowers = new WeatherCondition(_NightMostlyCloudyWithShowers);
    public static final WeatherCondition NightPartlyCloudyWithThunderShowers = new WeatherCondition(_NightPartlyCloudyWithThunderShowers);
    public static final WeatherCondition NightMostlyCloudyWithThunderShowers = new WeatherCondition(_NightMostlyCloudyWithThunderShowers);
    public static final WeatherCondition NightMostlyCloudyWithFlurries = new WeatherCondition(_NightMostlyCloudyWithFlurries);
    public static final WeatherCondition NightMostlyCloudyWithSnow = new WeatherCondition(_NightMostlyCloudyWithSnow);
    public String getValue() { return _value_;}
    public static WeatherCondition fromValue(String value)
          throws IllegalArgumentException {
        WeatherCondition enumeration = (WeatherCondition)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static WeatherCondition fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WeatherCondition.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.alarmnet.com/Services/MobileV2/", "WeatherCondition"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
