package com.nightspawn.stackexample.resource.auth;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.nightspawn.stackexample.service.session.AuthToken;
import com.nightspawn.stackexample.service.session.Session;
import com.nightspawn.stackexample.service.session.Username;

public class SessionInfoTest {
    private static final String USER = "USER";
    private static final String TOKEN = "TOKEN";

    @Test
    public void testSessionConstructor() {
        Session sess = new Session(new Username(USER), new AuthToken(TOKEN));
        SessionInfo info = new SessionInfo(sess);
        assertThat(info.getUsername(), equalTo(USER));
        assertThat(info.getToken(), equalTo(TOKEN));
    }
}
