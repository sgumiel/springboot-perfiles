package com.kairosds.cursospb2.perfiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ServicioImpresionConfiguration {

    @Bean
    @Profile("conformato")
    ServicioImpresion servicioImpresionConFormato() {
        return new ServicioImpresionConFormato();
    }

    @Bean
    @Profile("sinformato")
    ServicioImpresion servicioImpresionSinFormato() {
        return new ServicioImpresionSinFormato();
    }
}
