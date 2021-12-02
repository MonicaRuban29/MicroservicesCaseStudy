package com.ibm.model;

import java.math.BigDecimal;

public class CurrencyModel {

	  private long id;
	  private String countryCode;
	  private BigDecimal conversionFactor;
	  private BigDecimal Amount;
	  private BigDecimal convertedAmount;
	 // private int port;
	  
	public CurrencyModel(long id, String countryCode, BigDecimal conversionFactor, BigDecimal amount,
			BigDecimal convertedAmount) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
		Amount = amount;
		this.convertedAmount = convertedAmount;
	}

	public CurrencyModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getAmount() {
		return Amount;
	}

	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}

	public BigDecimal getConvertedAmount() {
		return convertedAmount;
	}

	public void setConvertedAmount(BigDecimal convertedAmount) {
		this.convertedAmount = convertedAmount;
	}
	  
}
