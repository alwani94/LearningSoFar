package com.in28mins.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConversionController {
	
	
	

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionMapping getConversionMapping(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity){
		
			Map<String,String> uriVariables = new HashMap<>();
			uriVariables.put("from", from);
			uriVariables.put("to", to);
			
			ResponseEntity<ConversionMapping> entity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
					ConversionMapping.class, uriVariables);
		
			ConversionMapping response = entity.getBody();
			
			
		return new ConversionMapping(response.getId(), from, to, response.getConversionRate(), quantity, quantity.multiply(response.getConversionRate()), response.getPort());
		
	}
}
