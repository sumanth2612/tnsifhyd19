package com.oop.polymorphism;
class Class1 {
	void method() {
		System.out.println("Class1 Method!!");
	}
}
class Class2 extends Class1{
	void method() {
		System.out.println("Class2 Method!!");
	}
}
public class OverRidingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 c1=new Class2();
		c1.method();
	}

}
