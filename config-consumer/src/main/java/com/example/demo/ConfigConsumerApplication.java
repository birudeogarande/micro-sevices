package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.util.ConfigurationModel;

@SpringBootApplication
@EntityScan(basePackages = "com.commons.model")
@RestController
public class ConfigConsumerApplication {

	@Autowired
	ConfigurationModel configurationModel;

	public static void main(String[] args) {
		SpringApplication.run(ConfigConsumerApplication.class, args);
	}

	@GetMapping("profile")
	public ConfigurationModel getConfigurationModel() {
		return configurationModel;
	}

}
