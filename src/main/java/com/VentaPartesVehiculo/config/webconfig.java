package com.VentaPartesVehiculo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webconfig {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Aplica a tus endpoints
                        .allowedOrigins("http://localhost:4200") // Permite frontend local
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permite todos los métodos necesarios
                        .allowedHeaders("*") // Permite cualquier cabecera
                        .allowCredentials(false); // true si usas cookies/sesión
            }
        };
    }
}
