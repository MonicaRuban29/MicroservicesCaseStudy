package com.ibm.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.CurrencyManageModel;
import com.ibm.repository.CRepository;

@Service
public class CurrencyManageService {
	
	@Autowired
	CRepository repo;
	

	 public List<CurrencyManageModel> getCurrencyConversion() {
		
		return repo.findAll();
	 }
	 
	public BigDecimal getConversionfactor(String countryCode){
	
		System.out.print(countryCode+"---"+repo.findBycountryCode(countryCode));
		
		CurrencyManageModel result = repo.findBycountryCode(countryCode);
			
		return result.getConversionFactor();
				
	}
	
	
	  public CurrencyManageModel addConversionfactor(CurrencyManageModel CurrencyManage){
		  
		  return repo.save(CurrencyManage);
	  
	  }
	  
	  public CurrencyManageModel updateConversionfactor(String countryCode,CurrencyManageModel CurrencyManage){
	  
		  if(getConversionfactor(countryCode)!=null)
			{
				return repo.saveAndFlush(CurrencyManage);
			}
			return null;
		}
	 
}
