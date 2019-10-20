package com.bee.sample.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bee.sample.service.ICustomerService;
/**
 * 
 * 使用注解 演示 Spring AOP
 * 
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		ICustomerService cs = (ICustomerService) ac.getBean("customerService");
		cs.saveCustomer();
	}

}
