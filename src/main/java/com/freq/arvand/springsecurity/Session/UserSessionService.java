package com.freq.arvand.springsecurity.Session;

import com.freq.arvand.springsecurity.User.UserSimple;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserSessionService {
    public UserSession getSession() {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        if(userName == null) return null;
        if(userName == "anonymousUser"){
            return UserSession.getSysSession();
        }
        UserSimple userSimple  = new UserSimple();
        return new UserSession(userSimple);
    }
}
