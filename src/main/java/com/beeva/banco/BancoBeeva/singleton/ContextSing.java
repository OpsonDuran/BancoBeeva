package com.beeva.banco.BancoBeeva.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Armando Duran Salavador
 */

public class ContextSing {
	private static ContextSing instance;
	private ApplicationContext context;
	
	private ContextSing(){
		
	}

	public static ContextSing getInstance() {
		if(instance==null){
			instance= new ContextSing(); 				
		}
		return instance;
	}

	public ApplicationContext getContext() {
		 return context = new  ClassPathXmlApplicationContext("core-context.xml");
	}

	


}
