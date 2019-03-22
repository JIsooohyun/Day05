package com.soohyun.school;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SchoolMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//학생 수 입력 받아서
		//n명의 학생객체를 생성해서 이름과 번호를 입력하고 출력해봐
		System.out.println("몇 명 입력?");
		int count = sc.nextInt();
		//데이터타입 [] 변수명 = new 데이터타입 [갯수]
		Student st = null;
		Student [] students = new Student[count];
		for(int i=0; i<count; i++) {
			st= new Student();
			System.out.println("이름을 입력하세요");
			st.name = sc.next();
			
			System.out.println("번호를 입력하세요");
			st.num = sc.nextInt();
			students[i]=st;
		}
		/*
		for(int i=0; i<count; i++) {
			//st= new Student();
			System.out.println("이름을 입력하세요");
			students[i].name = sc.next();
			
			System.out.println("번호를 입력하세요");
			students[i].num = sc.nextInt();
			
		}
		///안됨 why?
		*/
		
		for(int i=0; i<count; i++) {
			System.out.println("이름 :"+students[i].name+",  번호: "+students[i].num);
		}
		
		
		
	}

}
