package com.ibm.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="currency")
public class CurrencyManageModel {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;  
	 
	@NotBlank (message = "countryCode can't be empty!")
	@NotNull (message = "countryCode can't be null!")
	private String countryCode; 
	
	@NotBlank (message = "conversionFactor can't be empty!")
	@NotNull (message = "conversionFactor can't be null!")
	private BigDecimal conversionFactor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountrycode() {
		return countryCode;
	}
	public void Countrycode(String countryCode) {
		this.countryCode = countryCode;
	}
	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public CurrencyManageModel(Long id, String countryCode, BigDecimal conversionFactor) {
		super();
		this.id = id;
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}
	public CurrencyManageModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CurrencyManageModel [id=" + id + ", countryCode=" + countryCode + ", conversionFactor="
				+ conversionFactor + "]";
	} 
}
