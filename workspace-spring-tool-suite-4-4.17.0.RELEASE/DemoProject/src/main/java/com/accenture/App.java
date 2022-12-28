package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("----------------------------");
        // Airtel objects are prototyped, so they only get instantiated when they're called
        Airtel obj1 = (Airtel)context.getBean("airtel"); // you have to typecast it
        //you need to typecast so that you can tell context exactly which bean you want
        // because there are multiple beans present 
        // typecast from the parent <beans> object into the specific object you want 
//        System.out.println(obj1);
        obj1.test();
        
//        Airtel obj2 = context.getBean("airtel", Airtel.class);
//        System.out.println(obj2); //yields a different object because airtel is made into a prototype scope
    
        System.out.println("----------------------------");
        //notice that the vodaphone object was instantiated right at the start, even before it was called
        // singleton beans are instantiated automatically without being called
        Vodaphone v1 = (Vodaphone)context.getBean("vodaphone");
//        System.out.println(v1);
        v1.test();
        
        Vodaphone v2 = (Vodaphone)context.getBean("vodaphone");
//        System.out.println(v2); //yields the same object because this is singleton scoped by default
    }
}
