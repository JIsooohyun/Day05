package com.soohyun.mart;

public class MartMain {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.price = 10000;
		product.amount = 100;
		product.brand = "nike";
		
		Product product2 = new Product();
		product2.price = 20000;
		product2.amount = 20;
		product2.brand = "adidas";
		
		ProductView productView = new ProductView();
		productView.view(product);
		
		

	}

}
