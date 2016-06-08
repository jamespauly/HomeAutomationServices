package com.homeauto.honeywell.services;

import com.homeauto.honeywell.manager.SecurityManager;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by jpaul on 6/27/15.
 */
@Path("security")
public class HoneywellSecurity {
    @GET
    @Path("/armStayInstant")
    @Produces(MediaType.APPLICATION_JSON)
    public Response armStayInstant ()
    {
        SecurityManager sm = new SecurityManager();
        String sessionId = sm.armStayInstant();

        sm.close();

        return Response.ok().entity(sessionId).build();
    }

    @GET
    @Path("/armAway")
    @Produces(MediaType.APPLICATION_JSON)
    public Response armAway ()
    {
        SecurityManager sm = new SecurityManager();
        String sessionId = sm.armAway();

        sm.close();

        return Response.ok().entity(sessionId).build();
    }

    @GET
    @Path("/disarm")
    @Produces(MediaType.APPLICATION_JSON)
    public Response disarm ()
    {
        SecurityManager sm = new SecurityManager();
        String sessionId = sm.disarm();

        sm.close();

        return Response.ok().entity(sessionId).build();
    }

}
