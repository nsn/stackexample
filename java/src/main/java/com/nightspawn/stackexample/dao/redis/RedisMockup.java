package com.nightspawn.stackexample.dao.redis;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * 
 * @author nsn
 * 
 */
@Startup
@Singleton
public class RedisMockup {
    private Map<String, Object> store;

    @PostConstruct
    public void init() {
        this.store = new HashMap<>();
    }

    public void put(String key, Object val) {
        store.put(key, val);
    }

    public Object get(String key) {
        return store.get(key);
    }

    public boolean containsKey(String key) {
        return store.containsKey(key);
    }
}
