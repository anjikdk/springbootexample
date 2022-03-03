package com.springboot.springbootexample.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootexample.model.Product;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public Product save(@RequestBody Product p)
	{
		return p;
	}
}
