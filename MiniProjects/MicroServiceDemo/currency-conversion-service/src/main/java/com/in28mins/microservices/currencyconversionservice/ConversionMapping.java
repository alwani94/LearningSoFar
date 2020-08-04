package com.in28mins.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class ConversionMapping {
	
	private long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionRate;
	
	private BigDecimal quantity;
	
	private BigDecimal totalAmountAfterConversion;
	
	private int port;
	
	
	
	

	public ConversionMapping() {
		super();
	}

	public ConversionMapping(long id, String from, String to, BigDecimal conversionRate, BigDecimal quantity,
			BigDecimal totalAmountAfterConversion, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.quantity = quantity;
		this.totalAmountAfterConversion = totalAmountAfterConversion;
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalAmountAfterConversion() {
		return totalAmountAfterConversion;
	}

	public void setTotalAmountAfterConversion(BigDecimal totalAmountAfterConversion) {
		this.totalAmountAfterConversion = totalAmountAfterConversion;
	}
	
	
	
	

}
