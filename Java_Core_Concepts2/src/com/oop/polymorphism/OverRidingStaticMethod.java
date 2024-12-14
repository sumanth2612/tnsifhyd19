package com.oop.polymorphism;

class StaticMethod{
	static void method() {
		System.out.println("Static method!!");
	}
}
class InstanceMethod extends StaticMethod{
	static void method() {
		System.out.println("Instance method!!");
	}
}
public class OverRidingStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod i=new InstanceMethod();
		i.method(); // output will be Static method
		            // since the static methods cannot be overridden
		
	}
}
