package com.homeauto.honeywell.services;

import com.homeauto.honeywell.domain.weather.KGADECAT21;
import com.homeauto.honeywell.manager.WeatherManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jpaul on 7/2/15.
 */
@Path("weather")
public class WeatherServices {
    @GET
    @Path("/getCurrentWeather")
    @Produces(MediaType.APPLICATION_JSON)
    public Response setCurrentTempAndHold ()
    {
        WeatherManager wm = new WeatherManager();
        KGADECAT21 response = wm.getWeatherInfo();

        return Response.ok().entity(response).build();
    }
}
