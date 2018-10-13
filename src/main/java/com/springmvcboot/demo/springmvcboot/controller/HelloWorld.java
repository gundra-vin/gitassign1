package com.springmvcboot.demo.springmvcboot.controller;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String helloworld(){
		System.out.println("Inside the controllr");
		return "hello";
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return (args) -> {
			System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
					Arrays.stream(ctx.getBeanDefinitionNames())
					.sorted()
					.forEach(name->System.out.println(name));
		};
		  
		  
	  }

}
