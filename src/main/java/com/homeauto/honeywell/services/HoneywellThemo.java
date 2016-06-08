package com.homeauto.honeywell.services;

import com.homeauto.honeywell.domain.thermo.UIInfo;
import com.homeauto.honeywell.manager.ThermoManager;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;

/**
 * Created by jpaul on 6/7/15.
 */
@Path("thermostat")
public class HoneywellThemo {

    @GET
    @Path("/setCurrentTempAndHold")
    @Produces(MediaType.APPLICATION_JSON)
    public Response setCurrentTempAndHold (@DefaultValue("75.0") @QueryParam("coolTemp") BigDecimal cTemp,
                                           @DefaultValue("80.0") @QueryParam("heatTemp") BigDecimal hTemp)
    {
        ThermoManager tm = new ThermoManager();
        tm.setTempAndHold(cTemp, hTemp);

        tm.close();

        return Response.ok().entity("Done").build();
    }

    @GET
    @Path("/getThermoDetails")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getThermoDetails ()
    {
        ThermoManager tm = new ThermoManager();
        UIInfo response = tm.getThermoDetails();

        tm.close();

        return Response.ok().entity(response).build();
    }

    @GET
    @Path("/getCurrentTemp")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCurrentTemp ()
    {
        ThermoManager tm = new ThermoManager();
        String response = tm.getCurrentTemp();
        tm.close();

        return Response.ok().entity(response).build();
    }

    @GET
    @Path("/changeMode/{mode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getChangeMode (@PathParam("mode") int mode)
    {
        ThermoManager tm = new ThermoManager();
        tm.changeMode(mode);
        tm.close();

        return Response.ok().entity("Done").build();
    }
    // 0 = emheat
    // 1 = heat
    // 2 = off
    // 3 = Cool

}
