package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrencyMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyMsApplication.class, args);
	}

	@Bean
	public RestTemplate gettemplate()
	{
		return new RestTemplate();
	}
}
