package com.springmvcboot.demo.springmvcboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvcboot.demo.springmvcboot.bean.Subject;

@RestController
public class GreetingResource {
	
	@GetMapping("/greet")
	public String greet(){
		System.out.println("Hi");
		return "Hi";
	}
	
	@GetMapping("/greetobject")
	public Subject greetObject(){
		Subject sub = new Subject();
	    sub.setSubjectId(1000);
	    sub.setSubtitle("SpringRest");
	    sub.setDurationInHours(40);
	    return sub;
	}
	
	@PostMapping("/inssub")
	public Subject insertSubject(@RequestBody Subject sub1){
		
		sub1.setDurationInHours(60);
		return sub1;
		
	}
	

}
