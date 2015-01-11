package com.nightspawn.stackexample.service.session;

import javax.ejb.Stateless;

@Stateless
public class SessionService {

    public Session createSession(Username user, Password pwd) {
        AuthToken tok = new AuthToken("AValidToken");
        Session sess = new Session(user, tok);
        return sess;
    }
}
