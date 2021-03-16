package com.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.Product;
import com.application.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/")
	public @ResponseBody List<Product> saveProduct(@RequestBody Product product){
		return service.saveProduct(product);
	}

}
