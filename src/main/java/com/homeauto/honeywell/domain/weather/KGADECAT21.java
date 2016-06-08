
package com.homeauto.honeywell.domain.weather;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "response",
    "current_observation"
})
public class KGADECAT21 {

    @JsonProperty("response")
    private Response response;
    @JsonProperty("current_observation")
    private CurrentObservation currentObservation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The response
     */
    @JsonProperty("response")
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The response
     */
    @JsonProperty("response")
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * 
     * @return
     *     The currentObservation
     */
    @JsonProperty("current_observation")
    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    /**
     * 
     * @param currentObservation
     *     The current_observation
     */
    @JsonProperty("current_observation")
    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
