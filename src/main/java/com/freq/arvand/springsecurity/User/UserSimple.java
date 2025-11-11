package com.freq.arvand.springsecurity.User;

public class UserSimple {
    private Long userId;
    private String userName;

    public UserSimple() {
    }

    public UserSimple(UserEntity e) {
        this.userId = e.getUserId() == null ? null : e.getUserId();
        this.userName = e.getUserName() == null ? null : e.getUserName();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
