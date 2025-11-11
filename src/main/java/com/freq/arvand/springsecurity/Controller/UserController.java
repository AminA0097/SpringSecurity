package com.freq.arvand.springsecurity.Controller;

import com.freq.arvand.springsecurity.User.LoginForm;
import com.freq.arvand.springsecurity.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(EndPoints.USER)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(EndPoints.USER_LOGIN)
    public String login(@RequestBody LoginForm loginForm) throws Exception {
        return userService.login(loginForm);
    }
}
