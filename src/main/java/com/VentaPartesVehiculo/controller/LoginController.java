package com.VentaPartesVehiculo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VentaPartesVehiculo.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> user) {
        String username = user.get("username");
        String password = user.get("password");

        boolean isValid = loginService.validateCredentials(username, password);

        if (isValid) {
            return "Login exitoso";
        } else {
            return "Usuario o contraseña incorrectos";
        }
    }
    
}
