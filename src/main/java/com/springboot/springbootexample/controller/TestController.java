package com.springboot.springbootexample.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello()
	{
		return "Welcome to Spring boot";
	}
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable("name") String name)
	{
		return "Hello "+name;
	}
	
	
}
