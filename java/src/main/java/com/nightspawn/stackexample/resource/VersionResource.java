package com.nightspawn.stackexample.resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.WebApplicationException;

/**
 * retrieve api version information
 */
@Stateless
@Path("/version")
public class VersionResource {

    /**
     * reads version information from config.properties
     * 
     * @return a String containing version information
     */
    @GET
    public String getVersion() {
        try {
            InputStream in = getClass().getResourceAsStream("/config.properties");
            Properties prop = new Properties();
            prop.load(in);
            String versionStr = prop.getProperty("version");
            return versionStr;
        } catch (IOException e) {
            // throw new ServiceException(MSG, e);
            throw new WebApplicationException(500);
        }
    }
}
