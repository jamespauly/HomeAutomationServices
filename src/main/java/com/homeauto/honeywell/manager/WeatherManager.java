package com.homeauto.honeywell.manager;

import com.homeauto.honeywell.domain.weather.KGADECAT21;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jpaul on 6/7/15.
 */
public class WeatherManager {


    public WeatherManager() {

    }

    public KGADECAT21 getWeatherInfo() {
        try {
            Client client = ClientBuilder.newClient(new ClientConfig());
            WebTarget webResource = client.target("http://api.wunderground.com/api/d77a2569871bc312/conditions/q/pws:KGADECAT21.json");

            Response apiResponse = webResource.request().accept(MediaType.APPLICATION_JSON).get();
            KGADECAT21 weatherObj = apiResponse.readEntity(KGADECAT21.class);

            client.close();

            return weatherObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}