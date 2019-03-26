package com.soohyun.seoul;

import java.util.Scanner;

public class StudnetSearch {


	public Student search(Student [] students) {
		//학생번호를 입력
		//배열에서 학생번호랑 일치하는 학생을 찾아서 리턴해준다.
		Scanner sc = new Scanner(System.in);
		System.out.println("학생번호를 입력해주세요");
		int select = sc.nextInt();
		Student student = null;
		for(int i=0; i<students.length; i++) {
			if(select == students[i].num) {
				student = students[i];
				break;
			}
		}

		return student; //학생한명을 return해준다.
	}

}
