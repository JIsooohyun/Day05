package com.soohyun.methods;

public class MethodMain3 {

	public static void main(String[] args) {
		
		MethodTest3 t3 = new MethodTest3();
		int num = 3;
		
		t3.test(num);
		
		System.out.println(num);  // 매개변수명만 같을 뿐  영역이 달라서 값이 다르다.  // 값은 3이 나옴
		
		
		Product product = new Product();
		product.price = 700;
		
		t3.test2(product);
		System.out.println(product.price);  // reference타입이 넘어갈 때는 전체가 바뀐다..?  //값은 1000이 나온다
		
		t3.test3(product);
		System.out.println(product.price);
		
		
	}

}
