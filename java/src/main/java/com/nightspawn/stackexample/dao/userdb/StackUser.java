package com.nightspawn.stackexample.dao.userdb;

public class StackUser {
    private long userId;
    private String username;
    private String password;
    private String email;

    public StackUser(long userId, String username, String password, String email) {
        super();
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
