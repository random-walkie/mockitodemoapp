package com.javaeasily.demos.mockito.web;

import com.javaeasily.demos.mockito.service.AuthenticationService;

public class LoginController {
    private AuthenticationService authenticationSevice;

    public LoginController(AuthenticationService authenticationSevice) {
        this.authenticationSevice = authenticationSevice;
    }

    public String service(String username, String password) {
        // send to: /home
        // send to: /login
        return authenticationSevice.authenticate(username, password) ? "/home" : "/login"; // return /home if its true, /login if not

    }
}
