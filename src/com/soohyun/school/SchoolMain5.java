package com.soohyun.school;

import java.util.Scanner;

import javafx.scene.control.ListView;

public class SchoolMain5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Teacher tc = new Teacher();
		StudentView studentView = new StudentView();  //객체만든거임

		Student ss = null;
		System.out.println("선생님의 이름을 입력");
		tc.name = sc.next();
		System.out.println("선생님의 과목명을 입력하세요");
		tc.subject = sc.next();

		boolean check = true;
		int select;
		while(check) {
			System.out.println("1.학생정보입력");
			System.out.println("2.전체정보 출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.프로그램종료");
			select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("학생의 수를 입력하세요");
				select = sc.nextInt();
				tc.students = new Student[select];
				for(int i=0; i<tc.students.length; i++) {
					System.out.println("이름 입력");
					Student student = new Student();
					student.name = sc.next();
					System.out.println("번호를 입력하세요");
					student.num=sc.nextInt();
					System.out.println("국어점수를 입력하세요");
					student.kor = sc.nextInt();
					System.out.println("영어점수를 입력하세요");
					student.eng = sc.nextInt();
					System.out.println("수학점수를 입력하세요");
					student.math = sc.nextInt();
					student.total = student.kor+student.eng+student.math;
					student.avg = (double)student.total/3.0;
					tc.students[i]=student;
				}
				break;

			case 2:
				if(tc.students != null) {
					System.out.println("선생님이 가진 전체 정보를 출력");
					for(int i=0; i<tc.students.length; i++) {
						studentView.listView(tc.students[i]);
					}
				}else {
					System.out.println("학생 정보가 없습니다");
				}
				break;

			case 3:
				if(tc.students != null) {
					boolean find = true;
					System.out.println("학생의 번호를 입력하세요");
					select = sc.nextInt();
					for(int i=0; i<tc.students.length; i++) {
						if(select == tc.students[i].num) 
							studentView.view(tc.students[i]);
						find =!find;
						break;
					}
					if(find) {
						System.out.println("없는 번호입니다");
					}
				} else {
					System.out.println("학생 정보가 없습니다");
				}
				break;

			default:
				check=!check;
			}

		}//while문
		System.out.println("프로그램이 종료되었습니다. ");
	}

}

