package com.in28mins.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28mins.microservice.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public LimitConfiguration retirveLimitFromConfiguration() {
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());
		
	}
	
}
