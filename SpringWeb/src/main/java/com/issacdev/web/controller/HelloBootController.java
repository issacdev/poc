package com.issacdev.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloBootController {

    @RequestMapping("/helloboot")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloBootController.class, args);
    }

}