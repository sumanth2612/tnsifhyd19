package com.oop.inheritance;

class Parent{
	void method1() {
		System.out.println("Method of Parent class..");
	}
}

class Child extends Parent{
	void method2() {
		System.out.println("Method of Child class..");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.method1();
		c.method2();
	}
}
