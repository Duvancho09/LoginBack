package com.VentaPartesVehiculo.service;

// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VentaPartesVehiculo.repository.LoginRepository;

@Service
public class LoginService {

     @Autowired
    public LoginRepository loginRepository;

    public boolean validateCredentials(String username, String password) {
        // Optional<Login> user = loginRepository.findByUsernameAndPassword(username, password);
        return "admin".equals(username) && "admin".equals(password);
    }
    
}
