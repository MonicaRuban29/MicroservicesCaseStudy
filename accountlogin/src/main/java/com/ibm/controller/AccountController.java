package com.ibm.controller;

import java.net.http.HttpHeaders;
import java.util.List;

import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.ibm.entity.AuthRequest;
import com.ibm.util.JwtUtil;


@RestController
public class AccountController {

	    @Autowired
	    private JwtUtil jwtUtil;
	    @Autowired
	    private AuthenticationManager authenticationManager;
	    
	    @Autowired
	    RestTemplate template;
		

	    @GetMapping("/")
	    public String welcome() {
	        return "Welcome to homepage!";
	    }
	    String orderUrl= "http://localhost:8084/";
		
		  @GetMapping("/order") public String order() 
		  { 
			  String Result =
		  template.getForObject("http://localhost:8084/", String.class);
		  
		  return Result; 
		  }

	   @GetMapping("/orderservice") 
	   public  List<String> orderservice(HttpEntity<Object> requestEntity) {
	
		   List<String> orders = null;
	    	
	        try {
				
			ResponseEntity<List> responseEntity =template.exchange(orderUrl + "order",
	                HttpMethod.GET,
	                requestEntity,
	                List.class);
			
	        HttpStatus statusCode = responseEntity.getStatusCode();
	        System.out.println("status code - " + statusCode);
	        orders = responseEntity.getBody();
	        System.out.println("response body - " + orders);
	        org.springframework.http.HttpHeaders responseHeaders = responseEntity.getHeaders();
	        System.out.println("response Headers - " + responseHeaders);
	      
	        
	        } catch (Exception e) {
				// TODO: handle exception
	        	 System.out.println("exception");
			}
	        return orders;
	        
	      
	    }
	        
	        
	    @PostMapping("/authenticate")
	    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
	        try {
	            authenticationManager.authenticate(
	                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
	            );
	        } catch (Exception ex) {
	            throw new Exception("inavalid username/password");
	        }
	        final String token =jwtUtil.generateToken(authRequest.getUserName());
	        return token;
	    }
}
