package com.soohyun.school;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {

		//student class를 참조해서 student객체를 생성
		//클래스명 변수명 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);
		System.out.println("------------------------------");
		st.name = "iu";
		st.num = 1;
		
		System.out.println(st.name);
		System.out.println(st.num);
		
		//만들려고 하는 클래스명 변수명 = new 클래스명
		Student st2 = new Student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st2.num);
		
		System.out.println(st == st2);
	}

}
