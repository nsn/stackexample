package com.nightspawn.stackexample.service.session;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.nightspawn.stackexample.resource.auth.Credentials;

public class SessionServiceTest {
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";
    private Credentials creds;
    private SessionService service;

    @Before
    public void init() {
        service = new SessionService();
    }

    @Test
    public void testCreateSession() {
        Session sess = service.createSession(new Username(USERNAME), new Password(PASSWORD));
        assertThat(sess.getUsername(), equalTo(new Username(USERNAME)));
    }

    @Test()
    public void testFailedCreate() {
        service.createSession(new Username("notAValidUser"), new Password("somethingstupid"));
    }
}
