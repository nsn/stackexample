package com.nightspawn.stackexample.dao.userdb;

import javax.ejb.Stateless;

import com.nightspawn.stackexample.service.session.Username;

/**
 * just a mockup
 * 
 * @author nsn
 * 
 */
@Stateless
public class UserDBDAO {
    static final String TEST_USERNAME = "testname";
    static final long TEST_ID = 1L;
    static final String TEST_PW = "testpw";
    static final String TEST_EMAIL = "test@test.com";

    public StackUser findUser(long id) throws UserNotFoundException {
        if (id == TEST_ID) {
            return UserDBDAO.makeTestUser();
        }
        throw new UserNotFoundException(id);
    }

    public StackUser findUser(Username username) throws UserNotFoundException {
        if (TEST_USERNAME.equals(username.value())) {
            return makeTestUser();
        }
        throw new UserNotFoundException(username);
    }

    private static StackUser makeTestUser() {
        return new StackUser(TEST_ID, TEST_USERNAME, TEST_PW, TEST_EMAIL);
    }

}
