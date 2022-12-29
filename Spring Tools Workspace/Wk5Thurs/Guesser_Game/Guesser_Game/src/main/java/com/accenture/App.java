package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	Guesser guesser = (Guesser) context.getBean("guesser");
    	Player p1 = (Player) context.getBean("player");
    	Player p2 = (Player) context.getBean("player");
    	Player p3 = (Player) context.getBean("player");
    	Umpire umpire = (Umpire) context.getBean("umpire");
    	
    	umpire.collectFromGuesser(guesser);
    	umpire.collectFromPlayers(p1, p2, p3);
    	umpire.compareNums();
    }
}
