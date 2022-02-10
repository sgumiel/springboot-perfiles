package com.kairosds.cursospb2.perfiles;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class PerfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerfilesApplication.class, args);
	}

	@Bean
	CommandLineRunner execute(SaludoConfiguration saludoConfiguration,
							  Environment environment){
		return args -> {
			System.out.println(saludoConfiguration.getCorto());
			System.out.println(saludoConfiguration.getLargo());

			System.out.println(environment.getProperty("propiedad"));

		};
	}


}
