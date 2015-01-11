package com.nightspawn.stackexample.resource.auth;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.nightspawn.stackexample.service.session.AuthToken;
import com.nightspawn.stackexample.service.session.Password;
import com.nightspawn.stackexample.service.session.Session;
import com.nightspawn.stackexample.service.session.SessionService;
import com.nightspawn.stackexample.service.session.Username;

public class SessionResourceTest {
    private SessionResource resource;
    private static final String USERNAME = "user";
    private static final String PASSWORD = "passwd";
    private static final String TOKEN = "token";
    private Credentials creds;
    private SessionService service;

    @Before
    public void init() {
        creds = new Credentials(USERNAME, PASSWORD);
        service = mock(SessionService.class);
        Session sess = new Session(new Username(USERNAME), new AuthToken(TOKEN));
        when(service.createSession(any(Username.class), any(Password.class))).thenReturn(sess);
        resource = new SessionResource(service);
    }

    @Test
    public void testCreateSession() {
        SessionInfo sess = resource.createSession(creds);

        verify(service).createSession(eq(new Username(USERNAME)), eq(new Password(PASSWORD)));
    }
}
