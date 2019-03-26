package com.soohyun.seoul;

import java.util.Scanner;

public class StudentInput {
	public Student [] makeStudent () {
			
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.println("학생수입력");
		select = sc.nextInt();
		Student [] students = new Student[select];
		
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student();  //한번 돌아갈떄마다 다시 새로운 객체를 만들어 줘야 하니까 for문 아래다가 선언
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			System.out.println("kor 입력");
			student.kor = sc.nextInt();
			System.out.println("eng 입력");
			student.eng = sc.nextInt();
			System.out.println("math 입력");
			student.math = sc.nextInt();
			student.total = student.kor+student.eng+student.math;
			student.avg = student.total/3.0;
			students[i] = student; // 여기부분 꼭 기억하기!!!!!!!!!!!!!!!!!!!!!!
		}
		return students;
	}
}
