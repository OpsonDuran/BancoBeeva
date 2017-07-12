package com.beeva.banco.BancoBeeva.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextSing {
	private static ContextSing instance;
	private ApplicationContext context = new ClassPathXmlApplicationContext("jobSimple.xml");
	
	private ContextSing(){
		
	}
	
	public static ContextSing getInstance(){
		if(instance==null){
			instance= new ContextSing(); 				
		}
		return instance;
		
	}
		 
    public ApplicationContext getContext() {
		 return this.context;
	}

}
