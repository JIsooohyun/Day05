package com.soohyun.school;

public class StudentView {

	//메서드명 : listView
	//학생정보 전체를 출력
	public void listView(Student st) {
		System.out.println("학생이름 : "+st.name);
		System.out.println("학생번호 : "+st.num);
		System.out.println("국어점수 : "+st.kor);
		System.out.println("영어점수 : "+st.eng);
		System.out.println("수학점수 : "+st.math);
		System.out.println("총점 : "+st.total);
		System.out.println("평균 : "+st.avg);
		System.out.println("=================================");

	}

	// 메서드명 :view
	//한면의 학생정보를 출력
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
