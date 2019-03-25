package com.soohyun.methods;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest2 method = new MethodTest2();
		int val =0;


		boolean check = true;
		while(check) {
			System.out.println("1.급여입력");
			System.out.println("2.고용보험");
			System.out.println("3.의료보험");
			System.out.println("4.국민연금");
			System.out.println("5.산재보험");
			System.out.println("6.종     료");
			System.out.println("번호를 입력하세요");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("급여를 입력하세요");
				val = sc.nextInt();
				break;
			case 2: 
				System.out.println("고용보험을 계산하세요");
				method.m1(val);
				break;
			case 3: 
				System.out.println("의료보험을 계산하세요");
				method.m2(val);
				break;
			case 4: 
				System.out.println("국민연금을 계산하세요");
				method.m3(val);
				break;
			case 5: 
				System.out.println("산재보험을 계산하세요");
				method.m4(val);
				break;
			default:
				check =! check;
				break;
			}

		}
		System.out.println("프로그램을 종료합니다. ");
	}
}
