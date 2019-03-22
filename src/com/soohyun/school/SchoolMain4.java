package com.soohyun.school;

import java.util.Scanner;

public class SchoolMain4 {

	public static void main(String[] args) {
		//1. 학생등록
		// 학생수를 입력
		// 학생 수만 큼
		// 학생번호입력
		// 학생이름입력
		// 학생국어점수입력
		// 학생수학점수입력
		// 학생영어점수입력

		//2. 전체정보 조회
		// 번호, 이름, 국어, 영어, 수학 
		//3. 학생정보 검색
		//검색할 학생의 번호를 입력
		//검색한 학생의 번호, 이름, 국어, 영어, 수학 
		//4. 프로그램종료

		Scanner sc = new Scanner(System.in);
		Student st = null;  //학생에 대해서 입력할 수 있는 클래스
		Student [] ss = null;
		while(true) {
			System.out.println("1. 학생등록");
			System.out.println("2. 전체정보");
			System.out.println("3. 학생검색");
			System.out.println("4. 종      료");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("학생 수를 입력하세요");
				select = sc.nextInt();
				ss = new Student[select]; //학생의 모든 정보를 넣을 수 있는 배열
				for(int i=0; i<select; i++) {
					st = new Student();
					System.out.println(i+1+"번째 이름 입력");
					st.name = sc.next();
					System.out.println("번호 입력");
					st.num = sc.nextInt();
					System.out.println("국어 입력");
					st.kor = sc.nextInt();
					System.out.println("영어 입력");
					st.eng = sc.nextInt();
					System.out.println("수학 입력");
					st.math = sc.nextInt();
					st.total = st.kor+st.eng+st.math;
					st.avg = st.total/select;
					ss[i]=st;
				}
			}else if(select == 2) {
				//전체정보 조회
				for(int i=0; i<ss.length; i++) {
					System.out.println("이름 : "+ ss[i].name + " , 번호 : "+ss[i].num);
					System.out.println("국어 : "+ss[i].kor+" , 영어 : "+ss[i].eng+" , 수학 : "+ss[i].math);
					System.out.println("총점 : "+ss[i].total+" , 평균 : "+ss[i].avg);
					System.out.println("---------------------------------------");
				}

			}else if(select == 3) {
				//학생정보 검색
				boolean check= false;
				System.out.println("검색할 학생의 번호 입력");
				select = sc.nextInt();
				int i=0;
				for(i=0; i<ss.length; i++) {
					if(select == ss[i].num) {
						check=!check;
						break;
					}
				}
				if(check) {
					System.out.println("이름 : "+ ss[i].name + " , 번호 : "+ss[i].num);
					System.out.println("국어 : "+ss[i].kor+" , 영어 : "+ss[i].eng+" , 수학 : "+ss[i].math);
					System.out.println("총점 : "+ss[i].total+" , 평균 : "+ss[i].avg);

				}
			}else if(select == 4) {
				//정렬해서 조회
			}else {
				//프로그램 종료
			}

		}
	}
}
