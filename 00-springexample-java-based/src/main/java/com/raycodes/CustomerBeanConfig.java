package com.raycodes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerBeanConfig {
	
	//@Bean annotation we can use at the method level for the IOC container to recognize
	
	@Bean
	public AccountDetails accountDetails() {
		return new AccountDetails();	}
	
	@Bean(name="ac")
	public AccountDetails accountObject() {
		return new AccountDetails("300","James","Chicago");	}
	
	@Bean
	public Employee employee() {
		return new Employee();	}

}
