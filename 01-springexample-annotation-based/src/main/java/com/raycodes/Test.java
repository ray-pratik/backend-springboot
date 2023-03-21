package com.raycodes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		// 1 Launch IOC Container or Context
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerBeanConfig.class);

		// 2 configure the things we want Spring to manage @Configuration and @Bean 
		
		// 3 Retrieve the beans managed by Spring
		System.out.println(context.getBeanDefinitionCount());
		System.out.println(context.getBean("accountDetails"));
		System.out.println(context.getBean("employee"));
		System.out.println(context.getBean("employee"));
		
		Employee emp1 = (Employee) context.getBean("employee");
		Employee emp2 = (Employee) context.getBean("employee");
		System.out.println(emp1==emp2);
	}

}
