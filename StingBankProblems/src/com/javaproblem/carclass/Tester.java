package com.javaproblem.carclass;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(1965,"Bat Mobile");
		
		car1.checkSpeed();
		
		//--------- accelerate ----------------------------------------------------------------
		
		car1.accelerate();
		System.out.println("Accelerating 1st time : ");
		car1.checkSpeed();
		
		car1.accelerate();
		System.out.println("Accelerating 2nd time : ");
		car1.checkSpeed();
		
		car1.accelerate();
		System.out.println("Accelerating 3rd time : ");
		car1.checkSpeed();
		
		car1.accelerate();
		System.out.println("Accelerating 4th time : ");
		car1.checkSpeed();
		
		car1.accelerate();
		System.out.println("Accelerating 5th time : ");
		car1.checkSpeed();
		
		//--------- Brake ----------------------------------------------------------------
		
		car1.brake();
		System.out.println("Brake 1st time : ");
		car1.checkSpeed();
		
		car1.brake();
		System.out.println("Brake 2nd time : ");
		car1.checkSpeed();
		
		car1.brake();
		System.out.println("Brake 3rd time : ");
		car1.checkSpeed();
		
		car1.brake();
		System.out.println("Brake 4th time : ");
		car1.checkSpeed();
		
		car1.brake();
		System.out.println("Brake 5th time : ");
		car1.checkSpeed();
		
	}

}
