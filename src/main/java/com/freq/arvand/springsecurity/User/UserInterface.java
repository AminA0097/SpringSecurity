package com.freq.arvand.springsecurity.User;

import java.io.IOException;

public interface UserInterface {
    public String login(LoginForm loginForm)throws Exception;
    public UserEntity getUserByUsername(String username)throws Exception;
}
