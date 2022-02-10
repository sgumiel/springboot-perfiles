package com.kairosds.cursospb2.perfiles;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "saludo")
public class SaludoConfiguration {

    private String corto;
    private String largo;
}
