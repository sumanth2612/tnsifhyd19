package com.oop.inheritance;

class Base{
	void display1() {
		System.out.println("Base class method..");
	}
}

class Child1 extends Base{
	void display2(){
		System.out.println("Child1 class method..");
	}
}

class Child2 extends Child1{
	void display3() {
		System.out.println("Child2 class method..");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child2 c=new Child2();
		c.display1();
		c.display2();
		c.display3();
	}

}
