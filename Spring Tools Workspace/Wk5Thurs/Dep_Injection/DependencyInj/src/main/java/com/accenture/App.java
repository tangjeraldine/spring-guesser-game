package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext is an interface that allows you to create objects from Spring IoC
    	// when you have beanconfig, you can delete beans.xml
    	// you're using annotations, so you can remove this now
//    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	// you can use annotation configuration, which simplifies the process for you
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
         System.out.println("----------------------------");
         System.out.println("Delivery");
         Delivery del = (Delivery) context.getBean("delivery");
         System.out.println(del);
         // object is instantiated in the bean, by default is singleton and you get the same object
         Delivery del2 = (Delivery) context.getBean("delivery");
         System.out.println(del2);

//         System.out.println("----------------------------");
//         System.out.println("Courier");
//         Courier co = (Courier) context.getBean("CourierBean");
//         //bean id is in all small letters
//         System.out.println(co);
         
         System.out.println("----------------------------");
         Courier co = (Courier) context.getBean("CourierBeanDefinition");
         System.out.println(co); //--> all values null for now
         co.greetings();
         
         System.out.println("----------------------------");
         System.out.println("Prototype scoped deliveryman bean definition");
         Deliveryman delDefinition = (Deliveryman) context.getBean("DeliverymanBeanDefinition");
         System.out.println(delDefinition);
         // both will yield different objects
         Deliveryman delDefinition2 = (Deliveryman) context.getBean("DeliverymanBeanDefinition");
         System.out.println(delDefinition2);
    }
}
// Note--> good practice to try not to use prototype scoped beans
// uses a lot of memory space and beans tend to be heavy load, will slow down your program