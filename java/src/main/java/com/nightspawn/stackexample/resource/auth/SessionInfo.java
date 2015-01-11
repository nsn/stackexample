package com.nightspawn.stackexample.resource.auth;

import com.nightspawn.stackexample.service.session.Session;

/**
 * SessionInfo DTO, used as RESTfull outpu
 * 
 * @author nsn
 * 
 */
public class SessionInfo {
    private String username;
    private String token;

    /**
     * default constructor needed for de-serialisaztion
     */
    public SessionInfo() {
        super();
    }

    public SessionInfo(Session s) {
        super();
        this.username = s.getUsername().value();
        this.token = s.getToken().value();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
