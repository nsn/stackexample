package com.nightspawn.stackexample.resource;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 */
@Stateless
@Path("/version")
public class VersionResource {

    @GET
    public String getVersion() {
        return "0.1";
    }
}
