package com.ibm.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

//before going to end point controller , token has to authenticated so this class is used to authenticate and validate
public class JwtFilter extends OncePerRequestFilter{

	 @Override
	    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

	        String authorizationHeader = httpServletRequest.getHeader("Authorization");
	        //authorizationHeader --> Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYzMjMzOTAyOCwiaWF0IjoxNjMyMzAzMDI4fQ.6iF-y5UvE1sr0m3HY63Y4IrFFxHIhSTazI831Q_3AWo
	        //eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmMiLCJleHAiOjE2Mzc4OTkxNDksImlhdCI6MTYzNzg2MzE0OX0.j7o5fK_u3rRXxKqFE6v-q5r2LxxNRoSvvmcDf7C9eIw
	 }	
}
