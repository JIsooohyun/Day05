package com.soohyun.seoul;

import java.util.Scanner;

public class SeoulMenu {

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentView studentview = new StudentView();
		StudentInput si = new StudentInput();
		StudnetSearch search = new StudnetSearch();
		Student [] students=null;
		int select=0 ;
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보입력");
			System.out.println("2.정보전체출력");
			System.out.println("3.학생검색출력");
			System.out.println("4.종료");
			select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("====학생정보입력=====");
				students=si.makeStudent();
				break;
			case 2:
				System.out.println("=====전체정보출력====");
				studentview.listView(students);
				break;
			case 3:
				System.out.println("====검색정보출력====");
				Student s=search.search(students);
				if(s != null) {
					studentview.view(s);
				}
				
				break;
			default:
				System.out.println("프로그램을 종료하겠습니다");
				check =! check;
				break;

			}//switch마지막





		}
	}

}
