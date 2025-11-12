package com.freq.arvand.springsecurity.User;

import com.freq.arvand.springsecurity.Base.BaseInterface;

import java.io.IOException;

public interface UserInterface extends BaseInterface {
    public String login(LoginForm loginForm)throws Exception;
    public UserEntity getUserByUsername(String username)throws Exception;
}
