package com.accenture;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

	@Bean("guesser")
	public Guesser GuesserBean() {
		Guesser g = new Guesser();
		return g;
	}

	@Bean("player")
	@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
	public Player PlayerBean() {
		Player p = new Player();
		return p;
	}

	@Bean("umpire")
	public Umpire UmpireBean() {
		Umpire u = new Umpire();
		return u;
	}

}
