package com.ibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.model.CurrencyManageModel;

@Repository
public interface CRepository extends JpaRepository<CurrencyManageModel, Long> {
 
	
	CurrencyManageModel findBycountryCode(String countrycode);
	

}
