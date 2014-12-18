package com.nightspawn.stackexample.dao.redis;

import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import com.nightspawn.stackexample.dto.UserInfo;

public class SessionRedisDAOTest {
    private static final String USER = "user";
    private static final String EMAIL = "EMAIL";
    private RedisMockup redis;
    private SessionRedisDAO dao;

    @Before
    public void init() {
        redis = mock(RedisMockup.class);
        dao = new SessionRedisDAO(redis);
    }

    @Test
    public void testCreateSession() {
        UserInfo i = new UserInfo(USER, EMAIL);
        dao.createSession(i);
    }
}
