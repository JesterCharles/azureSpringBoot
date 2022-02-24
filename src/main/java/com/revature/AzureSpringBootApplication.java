package com.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class AzureSpringBootApplication {
	
	@GetMapping("/testingCICD")
	public String testingCiCd() {
		return "Hello from the pipelines";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureSpringBootApplication.class, args);
	}
	
	
}
