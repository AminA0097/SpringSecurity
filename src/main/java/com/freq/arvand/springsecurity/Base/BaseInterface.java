package com.freq.arvand.springsecurity.Base;

import com.freq.arvand.springsecurity.Session.UserSession;

public interface BaseInterface {
    public UserSession getSession()throws Exception;
}
