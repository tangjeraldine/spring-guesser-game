package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         System.out.println("----------------------------");
         Customer c1 = (Customer) context.getBean("customer");
         System.out.println(c1);
         c1.dispCustomerInfo();
         System.out.println("----------------------------");
         Delivery d = (Delivery) context.getBean("delivery");
         System.out.println(d);
         System.out.println("----------------------------");
         Courier courier = (Courier) context.getBean("courier");
         System.out.println(courier);
         courier.courierInfo();

    }
}
