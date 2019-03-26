package com.soohyun.mart;

public class ProductView {

	//제품의 정보를 출력하는 메서드
	public void view(Product product) {

		System.out.println(product.price);
		System.out.println(product.brand);
		System.out.println(product.amount);

	}


}
