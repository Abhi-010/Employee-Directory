package com.luv2code.springboot.thymeleafdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ThymeleafdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ThymeleafdemoApplication.class, args);
	}
		//ApplicationContext context = SpringApplication.run(CruddemoApplication.class, args);

//		String[] beans = context.getBeanDefinitionNames();
//		System.out.println("Spring beans list : >>>>>>>>>>");
//		for(String s : beans){
//			System.out.println(s);
//		}
//	}

}
