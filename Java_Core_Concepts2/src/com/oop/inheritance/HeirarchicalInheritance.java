package com.oop.inheritance;

class Vehicle{
	void method() {
		System.out.println("Vehicle class method..");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Driving..");
	}
}

class Bike extends Vehicle{
	void ride() {
		System.out.println("Riding..");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b=new Bike();
		b.method();
		b.ride();
		//b.drive(); drive method cannot be accessed using Bike object
		
		Car c=new Car();
		c.method();
		c.drive();
		//c.ride(); ride method cannot be accessed using Car object
	}

}
