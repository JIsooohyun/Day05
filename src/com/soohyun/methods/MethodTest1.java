package com.soohyun.methods;

import java.util.Scanner;

public class MethodTest1 {

	//멤버 메서드  hap
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
		

	}

	//메서드 명 minus
	//10-20
	public void minus() {
		System.out.println(10-20);
	}

	public void bark(int size) {  //매개변수 : 어떤 값을 받겠다. 
		//메서드내에 size
		//메서드내에 size변수를 선안 값을 출력


		if(size >=90) {
			System.out.println("컹컹컹");
		}else if(size >=60) {
			System.out.println("멍멍멍");
		}else {
			System.out.println("왈왈왈");
		}

	}

}
