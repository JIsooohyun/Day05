package com.soohyun.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Teacher tc = new Teacher();

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
						//System.out.println(tc.name);
						//System.out.println(tc.subject);
						System.out.println("학생이름 : "+tc.students[i].name);
						System.out.println("학생번호 : "+tc.students[i].num);
						System.out.println("국어점수 : "+tc.students[i].kor);
						System.out.println("영어점수 : "+tc.students[i].eng);
						System.out.println("수학점수 : "+tc.students[i].math);
						System.out.println("총점 : "+tc.students[i].total);
						System.out.println("평균 : "+tc.students[i].avg);
						System.out.println("=================================");
					}
				}else {
					System.out.println("학생 정보가 없습니다");
				}
				break;
			case 3:
				if(tc.students != null) {
					System.out.println("학생의 번호를 입력하세요");
					select = sc.nextInt();
					for(int i=0; i<tc.students.length; i++) {
						if(select == tc.students[i].num) {
							System.out.println("학생이름 : "+tc.students[i].name);
							System.out.println("학생번호 : "+tc.students[i].num);
							System.out.println("국어점수 : "+tc.students[i].kor);
							System.out.println("영어점수 : "+tc.students[i].eng);
							System.out.println("수학점수 : "+tc.students[i].math);
							System.out.println("총점 : "+tc.students[i].total);
							System.out.println("평균 : "+tc.students[i].avg);
						}
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

//

