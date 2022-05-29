package com.mydoc.demoDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {
	
	@GetMapping("/hello")
	public String myMessage() {
		return "Welcome to My New Docker Demo !!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
