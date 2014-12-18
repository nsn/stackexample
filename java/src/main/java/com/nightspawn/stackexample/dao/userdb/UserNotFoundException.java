package com.nightspawn.stackexample.dao.userdb;

import com.nightspawn.stackexample.service.session.Username;

public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = -8926575192691328997L;

    public UserNotFoundException(long id) {
        super(String.format("no user found /w id %d", id));
    }

    public UserNotFoundException(Username username) {
        super(String.format("no user found /w username %s", username.toString()));
    }

}
