package com.oop.inheritance;

class Animal{
	void hunt() {
		System.out.println("Animal hunts..");
	}
}

class Lion extends Animal {
	void roar() {
		System.out.println("Lion roars..");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("Deer eats grass..");
	}
}

class Cheetah extends Lion{
	void run() {
		System.out.println("Cheetah runs faster..");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cheetah c=new Cheetah();
		c.hunt();
		c.roar();
		c.run();
		/*c.eat(); this method cannot be accessed 
		using Cheetah class object*/
		
		Deer d=new Deer();
		d.hunt();
		d.eat();
		
	}

}
