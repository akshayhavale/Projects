package com.application.model;

import java.util.Map;

public class Product {

	private String productName;

	private Double productPrice;

	private int quantity;

	private Map<String, String> productDescription;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Map<String, String> getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(Map<String, String> productDescription) {
		this.productDescription = productDescription;
	}

}
