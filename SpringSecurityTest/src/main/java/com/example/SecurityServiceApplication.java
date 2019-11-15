package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This class must remain in the root package, or spring security will give 403 errors for every endpoint.
@SpringBootApplication
public class SecurityServiceApplication {

	// Runs the spring boot program.
	public static void main(String[] args) {
		SpringApplication.run(SecurityServiceApplication.class, args);
	}

}
