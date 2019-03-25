package com.soohyun.cars;

public class CarMain {

	public static void main(String[] args) {
		
		Car c1= new Car();
		c1.wheel = 4;
		c1.color = "pink";
		c1.size = "대형";
		c1.company = "BMW";
		
		Car c2 = new Car();
		c2 = c1;
		c2.wheel = c1.wheel;
		c2.color = "red";
		c2.size = c1.size;
		c2.company = c1.company;
		System.out.println(c2.color);
		
		Bike b1 = new Bike();
		b1.wheel =2;
		b1.color="white";
		b1.company = "Honda";
		
		///engine
		System.out.println(c1);
		
		//Engine engine = new Engine();
		//c1.engine = engine;
		//위에 두줄을 한줄로 
		//engine.hp=100;
		//engine.fuel = "gas"
		//engine.cc=1000;
		
		c1.engine = new Engine();
		c1.engine.hp = 100;
		c1.engine.fuel="gas";
		c1.engine.cc = 1000;
		System.out.println(c1.engine.fuel);
		
		
		//---------------------------------------
		Airplane airplane = new Airplane();
	
		airplane.engine = new Engine[2];
		airplane.engine[0]=new Engine();
		airplane.engine[1]=new Engine();
		
		airplane.engine[0].hp = 1000;
		
		
		
		System.out.println(airplane.engine);
		
		
		
		Airplane airplane2 = new Airplane();
		airplane2.engine = new Engine[120];
		for(int i=0; i<airplane2.engine.length; i++) {
			airplane2.engine[i]=new Engine();
			airplane2.engine[i].hp = 1000;
			airplane2.engine[i].fuel = "항공유";
			airplane2.engine[i].cc = 30000;
			
			
			//Engine e = new Engine();
			//e.hp=1000;
			//e.fuel="항공유";
			//e.cc=30000;
			//airplane2.engine[i] = e;
			//두개로 나눈거에유
		}
		
		
		
		
		
		
		
		
		
		
	}

}
