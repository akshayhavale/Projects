package com.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.model.Product;

@Service
public class ProductServiceImple implements ProductService {

	private static List<Product> list = new ArrayList<>();

	@Override
	public List<Product> saveProduct(Product product) {
		list.add(product);
		return list;
	}

}
