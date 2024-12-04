package com.javaeasily.demos.mockito;

public class LoginController {
    private AuthenticationService authenticationSevice;
    public String service(String username, String password) {
        // send to: /home
        // send to: /login
        return authenticationSevice.authenticate(username, password) ? "/home" : "/login"; // return /home if its true, /login if not

    }
}
