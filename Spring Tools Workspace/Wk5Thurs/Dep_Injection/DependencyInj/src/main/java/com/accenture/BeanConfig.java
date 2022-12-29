package com.accenture;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// this is the java version of the beans.xml

@Configuration

//@ComponentScan(basePackages="com.accenture")
// multiple packages can be imported by separating the names of packages using a comma

public class BeanConfig {
	
	// instantiate Delivery here and declare it as a bean by doing the following:
	@Bean("delivery") 
	public Delivery DeliveryBean() {
		Delivery d = new Delivery();
		return d;
	}
	
	// you can do the same for Courier
	// if you don't give the bean a name, it will take the name of the method
//	@Bean()
//	public Courier CourierBean() {
//		Courier c = new Courier();
//		return c;
//	}
	
	@Bean()
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public Deliveryman DeliverymanBeanDefinition() {
		return new Deliveryman();
	}
	
	@Bean()
	public Courier CourierBeanDefinition() {
		return new Courier(DeliverymanBeanDefinition());
	}

}
