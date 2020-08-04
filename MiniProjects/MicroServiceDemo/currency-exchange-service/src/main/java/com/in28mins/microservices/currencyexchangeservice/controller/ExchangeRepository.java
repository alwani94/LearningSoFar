package com.in28mins.microservices.currencyexchangeservice.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<ExchangeValue, Long>{
	
	
	ExchangeValue findByFromAndTo(String from, String to);
}
