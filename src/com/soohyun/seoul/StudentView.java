package com.soohyun.seoul;

public class StudentView {

	//메서드명 : listView
	//학생정보 전체를 출력
	public void listView(Student [] students) {
		for(int i=0; i<students.length; i++) {
			System.out.println("학생이름 : "+students[i].name);
			System.out.println("학생번호 : "+students[i].num);
			System.out.println("국어점수 : "+students[i].kor);
			System.out.println("영어점수 : "+students[i].eng);
			System.out.println("수학점수 : "+students[i].math);
			System.out.println("총점 : "+students[i].total);
			System.out.println("평균 : "+students[i].avg);
			System.out.println("=================");

		}

	}

	// 메서드명 :view
	//한면의 학생정보를 출력  -> StudentSearch로 넘겨줌
	public void view(Student student) {
		System.out.println("학생이름 : "+student.name);
		System.out.println("학생번호 : "+student.num);
		System.out.println("국어점수 : "+student.kor);
		System.out.println("영어점수 : "+student.eng);
		System.out.println("수학점수 : "+student.math);
		System.out.println("총점 : "+student.total);
		System.out.println("평균 : "+student.avg);

	}




}
