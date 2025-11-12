package com.freq.arvand.springsecurity.Base;

import com.freq.arvand.springsecurity.Session.UserSession;
import com.freq.arvand.springsecurity.Session.UserSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService implements BaseInterface {
    @Autowired
    UserSessionService userSessionService;

    @Override
    public UserSession getSession() throws Exception {
        return userSessionService.getSession();
    }
}
