package com.nightspawn.stackexample.service.session;

import com.nightspawn.stackexample.dto.StringSVO;

public class AuthToken extends StringSVO {
    private static final long serialVersionUID = 85998554335472911L;

    public AuthToken(String value) {
        super(value);
    }

    public String getToken() {
        return value();
    }

}
