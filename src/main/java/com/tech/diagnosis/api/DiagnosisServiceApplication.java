package com.tech.diagnosis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiagnosisServiceApplication {
	
	@GetMapping("/diagnose")
	public String diagnosis() {
		return "Diagnosis service is invoked..";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisServiceApplication.class, args);
	}

}
