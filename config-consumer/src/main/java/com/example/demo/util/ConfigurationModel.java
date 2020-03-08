package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationModel {

	@Autowired
	Environment environment; 
	
	public String getId() {
		return environment.getProperty("service.id");
	}
	public String getMsg() {
		return environment.getProperty("service.msg");
	}
}
