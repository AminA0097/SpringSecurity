package com.freq.arvand.springsecurity.User;

import com.freq.arvand.springsecurity.Base.BaseService;
import com.freq.arvand.springsecurity.Session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.freq.arvand.springsecurity.Base.Statics.SEARCH_ACTION;

@Service
public class UserService extends BaseService implements UserInterface {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserEntity getUserByUsername(String username) throws Exception {
        UserSession userSession = getSession();
        if(username == null || username.isEmpty() || username.length() == 0){
            throw new Exception("Invalid username");
        }
        return null;
    }

    @Override
    public String login(LoginForm loginForm) throws Exception {
        getUserByUsername(loginForm.getUserName());
        return "";
    }
}
