package com.freq.arvand.springsecurity.Session;

import com.freq.arvand.springsecurity.User.UserSimple;

public class UserSession {
    private UserSimple userSimple;
    public static UserSession getSysSession() {
        UserSimple userSimple = new UserSimple();
        return new UserSession(userSimple);
    }

    public UserSession(UserSimple userSimple) {
        this.userSimple = userSimple;
    }

    public UserSimple getUserSimple() {
        return userSimple;
    }

    public void setUserSimple(UserSimple userSimple) {
        this.userSimple = userSimple;
    }
}
