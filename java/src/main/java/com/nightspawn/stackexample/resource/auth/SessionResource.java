package com.nightspawn.stackexample.resource.auth;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nightspawn.stackexample.service.session.Password;
import com.nightspawn.stackexample.service.session.SessionService;
import com.nightspawn.stackexample.service.session.Username;

@Stateless
@Path("/session")
public class SessionResource {
    private SessionService service;

    @Inject
    public SessionResource(SessionService service) {
        this.service = service;
    }

    /**
     * creates a new session
     * 
     * @return
     */
    @POST
    public SessionInfo createSession(Credentials creds) {
        Username u = new Username(creds.getUsername());
        Password p = new Password(creds.getPassword());
        SessionInfo rv = new SessionInfo(service.createSession(u, p));
        return rv;
    }

}
