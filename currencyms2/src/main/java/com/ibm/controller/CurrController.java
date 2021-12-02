package com.ibm.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.CurrencyModel;
import com.ibm.service.CurrService;
import com.ibm.model.CurrencyModel;

@RestController
public class CurrController {
	
	@Autowired
	CurrService currService;
	
	 private static Logger log = LoggerFactory.getLogger(CurrController.class);
	
	@GetMapping("CurrencyConversion/{countryCode}/{amount}")
	public BigDecimal convertCurrency(@PathVariable String countryCode,@PathVariable BigDecimal amount)
	{
		log.info("Inside  convertCurrency");
		return currService.convertCurrency(countryCode,amount);
		//conversion factor
	}

}
