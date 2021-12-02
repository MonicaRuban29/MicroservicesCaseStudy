package com.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.filter.JwtRequestFilter;
import com.order.util.JwtTokenUtil;

@RestController
public class OrderController {

	@GetMapping("/")
	public String welcome() {
		return " order servcies";
	}
	
	@GetMapping("/order") 
	   public  List<String> orderservice(HttpEntity<Object> requestEntity) {
	
		List<String> ProductNames = new ArrayList<String>();
		ProductNames.add("sup1");
		ProductNames.add("sup2");
		ProductNames.add("sup3");
		org.springframework.http.HttpHeaders responseHeaders = requestEntity.getHeaders();
		
		System.out.println("order response Headers - " + responseHeaders);
		return ProductNames;
        
	}
	
}
