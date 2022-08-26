package com.javaproblem.carclass;

public class Car {
	
	int yearModel;
	String make;
	int speed;
	public Car(int yearModelInput, String makeInput) {
		this.yearModel = yearModelInput;
		this.make = makeInput;
		this.speed = 0;
	}
	
	public void setYearModel(int yearModelInput) {
		this.yearModel = yearModelInput;
	}
	
	public void setMake(String makeInput) {
		this.make = makeInput;
	}
	
	public void setSpeed(int speedInput) {
		this.speed = speedInput;
	}

	public int getYearModel() {
		return yearModel;
	}
	
	public String getMake() {
		return make;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void accelerate() {
		this.speed += 5;
	}
	
	public void brake() {
		this.speed -= 5;
	}
	
	public void checkSpeed() {
		System.out.println("=====================");
		System.out.println("Speed of car : " + this.speed);
		System.out.println("=====================\n");
	}
	
}
