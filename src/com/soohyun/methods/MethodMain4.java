package com.soohyun.methods;

public class MethodMain4 {

	public static void main(String[] args) {
		MethodTest4 methodTest4 = new MethodTest4();
		
		int num = methodTest4.plus(10, 20);
		
		System.out.println(num);
		
		int [] nums = methodTest4.getNumbers();
		nums[0]=10;
		System.out.println(nums[1]);
		
		
		

	}

}
