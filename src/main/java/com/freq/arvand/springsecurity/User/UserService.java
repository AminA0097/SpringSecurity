package com.freq.arvand.springsecurity.User;

import com.freq.arvand.springsecurity.Session.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.freq.arvand.springsecurity.Base.Statics.SEARCH_ACTION;

@Service
public class UserService implements UserInterface {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserEntity getUserByUsername(String username) throws Exception {
        if(username == null || username.isEmpty() || username.length() == 0){
            throw new Exception("Invalid username");
        }
        UserSession userSession = new UserSession();
//        userSession.getUserAccess.hasAccess(this.getClass().getSimpleName(),SEARCH_ACTION);
        return null;
    }

    @Override
    public String login(LoginForm loginForm) throws Exception {
        userRepo.findByUsername(loginForm.getUserName());
        return "";
    }
}
