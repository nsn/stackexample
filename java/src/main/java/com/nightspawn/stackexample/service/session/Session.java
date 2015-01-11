package com.nightspawn.stackexample.service.session;

public class Session {
    private Username username;
    private AuthToken token;

    public Session(Username username, AuthToken token) {
        super();
        this.username = username;
        this.token = token;
    }

    public Username getUsername() {
        return username;
    }

    public AuthToken getToken() {
        return token;
    }

}
