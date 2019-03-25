package com.soohyun.methods;

public class MethodTest3 {

	public void test(int num) { //매개변수는 클래스명에서 선언한 지역변수
		num = num+3;
		//return num;
		
	}
	
	public void test2(Product product) {
		product.price = product.price + 300;
		
	}
	
	public void test3(Product product) {
		product = new Product();
		product.price = 100;
		
	}
	
	
}
