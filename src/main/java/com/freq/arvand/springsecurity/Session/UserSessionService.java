package com.freq.arvand.springsecurity.Session;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserSessionService {
    public UserSession getUserSession() {
        String userName = SecurityContextHolder.getContext().getAuthentication().getName();
        if(userName == null) return null;
        if(userName == "anonymousUser"){
            return UserSession.getSysSession();
        }
        return new UserSession();
    }
}
