package com.ibm.controller;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ibm.model.CurrencyManageModel;
import com.ibm.service.CurrencyManageService;

@RestController
public class CurrencyManageController {
	
	@Autowired
	CurrencyManageService currencyManageService;
	
	@GetMapping("CurrencyManageModel")
	public ResponseEntity<List<CurrencyManageModel>> getCurrencyConversion(){
		
		return  ResponseEntity.ok(currencyManageService.getCurrencyConversion());
	}
	
	@GetMapping("CurrencyManageModel/{countryCode}")
	public BigDecimal getConversionfactor(@PathVariable String countryCode){
		
		//return ResponseEntity.ok(currencyManageService.getConversionfactor(countryCode));
		
		return currencyManageService.getConversionfactor(countryCode);
	}

	
	  @PostMapping("CurrencyManageModel") 
	  public ResponseEntity<CurrencyManageModel> addConversionfactor(@Valid @RequestBody CurrencyManageModel CurrencyManage)
	  {
	  CurrencyManageModel result =currencyManageService.addConversionfactor(CurrencyManage);
	  
	  //URI link = ServletUriComponentsBuilder.fromCurrentRequest().path("/{countryCode}")
			  									//	.buildAndExpand(result.getCountrycode()).toUri();
	  
	  return ResponseEntity.ok(result); 
	  }
	  
	  @PutMapping("CurrencyManageModel/{countryCode}")
	  public ResponseEntity<CurrencyManageModel> updateConversionfactor(@PathVariable
	  String countryCode, @Valid @RequestBody CurrencyManageModel CurrencyManage)
	  {  
	  return ResponseEntity.ok(currencyManageService.updateConversionfactor(countryCode,CurrencyManage)); 
	  }
	 
}
