package com.human.myorganigation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.human.myorganigation.beans.MessageBean;

@RestController
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/message")
	public String getMessage() {
		
		return "Hello there";
	}
	
	@GetMapping(path="/age")
	public int getAge() {
		
		return 10+30;
	}
	
	@GetMapping(path = "message-bean")
	public MessageBean getMessageBean() {
		return new MessageBean("Hello again!!!");
	}

}
