package com.example.demo.actuator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "stage") 
public class StageEndpoint {
		
	
	Map<String,Stage> map = new ConcurrentHashMap<>();

	@ReadOperation
	public Map<String, Stage> getAllStage() {
		return map;
	}
	
	@ReadOperation
	public Stage getStage(@Selector String name) {
		return map.get(name);
	}
	
	@WriteOperation
	public void setValue(@Selector String name,int stage) {
		map.put(name, new Stage(stage));
	}
	
	static class Stage{
		int value;

		public Stage(int value) {
			super();
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	}
}
