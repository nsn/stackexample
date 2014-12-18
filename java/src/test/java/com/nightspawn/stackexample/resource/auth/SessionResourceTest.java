package com.nightspawn.stackexample.resource.auth;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.nightspawn.stackexample.service.session.Password;
import com.nightspawn.stackexample.service.session.SessionService;
import com.nightspawn.stackexample.service.session.Username;

public class SessionResourceTest {
    private SessionResource resource;
    private static final String USERNAME = "user";
    private static final String PASSWORD = "passwd";
    private Credentials creds;
    private SessionService service;

    @Before
    public void init() {
        creds = new Credentials(USERNAME, PASSWORD);
        service = mock(SessionService.class);
        resource = new SessionResource(service);
    }

    @Test
    public void testCreateSession() {
        resource.createSession(creds);
        verify(service).createSession(eq(new Username(USERNAME)), eq(new Password(PASSWORD)));
    }
}
