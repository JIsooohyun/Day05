package com.soohyun.methods;

public class MethodTest2 {
	//메서드명 : m1
	//급여를  매개변수로 받아서 고용보험료를 출력 0.2%
	public void m1(int val) {
		System.out.println(val*0.002);
	}
	
	//메서드명 : m2
	//급여를 받아서 의료보험료를 1.3% 출력
	public void m2(int val) {
		System.out.println(val*0.013);
	}
	
	//메서드명 : m3
	//국민연금 1.0%계산
	public void m3(int val) {
		System.out.println(val*0.01);
	}
	
	//메서드명 : m4
	//산재보험료 0.4%
	public void m4(int val) {
		System.out.println(val*0.004);
	}
	
}
