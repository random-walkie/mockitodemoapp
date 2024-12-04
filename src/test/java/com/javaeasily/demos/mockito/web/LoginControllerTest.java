package com.javaeasily.demos.mockito.web;

import com.javaeasily.demos.mockito.service.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LoginControllerTest {
    private LoginController loginController; // system under test
    private AuthenticationService authenticationService; // mock

    @BeforeEach
    public void setUp() throws Exception {
        this.authenticationService = mock(AuthenticationService.class);
        this.loginController = new LoginController(this.authenticationService);
      }

    @Test
    public void testServiceValidUsernameAndPassword() {
        //arrange
        when(authenticationService.authenticate(anyString(), anyString())).thenReturn(true);

        // act
        String viewPath = loginController.service("tom", "password123");

        // assert
        assertNotNull(viewPath);
        assertEquals("/home", viewPath);
      }
}