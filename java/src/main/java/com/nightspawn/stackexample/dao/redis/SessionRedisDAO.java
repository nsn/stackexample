package com.nightspawn.stackexample.dao.redis;

import java.util.UUID;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.nightspawn.stackexample.dto.UserInfo;

/**
 * 
 * @author nsn
 * 
 */
@Stateless
public class SessionRedisDAO {
    private RedisMockup redisMock;

    @Inject
    public SessionRedisDAO(RedisMockup mock) {
        this.redisMock = mock;
    }

    public void createSession(UserInfo i) {
        UUID id = UUID.randomUUID();
        redisMock.put(id.toString(), i);
    }

}
