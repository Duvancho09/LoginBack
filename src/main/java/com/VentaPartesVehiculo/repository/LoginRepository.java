package com.VentaPartesVehiculo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VentaPartesVehiculo.loginapi.Login;

@Repository
public interface LoginRepository  extends JpaRepository<Login, Long>{
    Optional<Login> findByUsernameAndPassword(String username, String password);
    
}
