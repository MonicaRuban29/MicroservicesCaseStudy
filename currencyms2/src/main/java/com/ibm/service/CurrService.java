package com.ibm.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.model.CurrencyModel;

@Service
public class CurrService {
	
	 @Autowired
	 RestTemplate template; 	
	
	 public BigDecimal convertCurrency(String countryCode, BigDecimal amount){
		 
		String Result = template.getForObject("http://localhost:8090/CurrencyManageModel/"+countryCode, String.class);
		
		BigDecimal ConversionFactorResult=new BigDecimal(Result);
		System.out.println("ConversionFactorResult"+ConversionFactorResult);
		BigDecimal convertedAmount = amount.multiply(ConversionFactorResult);
		
		return convertedAmount;
		
	}
}
