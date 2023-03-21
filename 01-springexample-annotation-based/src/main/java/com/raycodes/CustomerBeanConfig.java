package com.raycodes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = (AccountDetails.class))
public class CustomerBeanConfig {
	
}
