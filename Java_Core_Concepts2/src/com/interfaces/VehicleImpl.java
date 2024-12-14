package com.interfaces;

class Car{
	void parts() {
		System.out.println("Car has 4 wheels");
	}
}
class Bike{
	void parts() {
		System.out.println("Bike has 2 wheels");
	}
}
class Auto{
	void parts() {
		System.out.println("Auto has 3 wheels");
	}
}

public class VehicleImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.parts();
		Auto a=new Auto();
		a.parts();
		Car c=new Car();
		c.parts();
	}

}
