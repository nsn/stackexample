package com.nightspawn.stackexample.dao.userdb;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.nightspawn.stackexample.service.session.Username;

public class UserDBDAOTest {
    private UserDBDAO dao;

    @Before
    public void init() {
        dao = new UserDBDAO();
    }

    @Test
    public void testFindById() throws UserNotFoundException {
        StackUser u = dao.findUser(UserDBDAO.TEST_ID);
        assertThat(u.getEmail(), equalTo("test@test.com"));
    }

    @Test(expected = UserNotFoundException.class)
    public void testNotFound() throws UserNotFoundException {
        dao.findUser(-1L);
    }

    @Test
    public void testFindByUsername() throws UserNotFoundException {
        StackUser u = dao.findUser(new Username(UserDBDAO.TEST_USERNAME));
        assertThat(u.getEmail(), equalTo("test@test.com"));
    }
}
