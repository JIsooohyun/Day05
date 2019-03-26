package com.soohyun.methods;

public class MethodTest4 {

	public int plus(int a, int b) {
		int sum = a+b;
		
		return sum;
		//void는 반환값이 없을 때 사용
		//되돌려줄 것이 있으면 반환값을 데이터타입을 써준다.
		
	}
	
	public String getName() {
		
		
		return "";
	}
	
	public int [] getNumbers() {
		
		int [] nums = new int[3];
		return nums; 
	}
	
}
