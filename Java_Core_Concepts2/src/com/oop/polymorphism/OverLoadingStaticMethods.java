package com.oop.polymorphism;

class StaticEx{
	static void show() {
		System.out.println("Static method...");
	}
	static void show(int i) {
		System.out.println("Value given:"+i);
	}
}
public class OverLoadingStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx s=new StaticEx();
		s.show(); // Static methods can be overloaded
		                 // Since Static Methods belong to Class,
		                 //they are accessed using class name
		s.show(10);
	}

}
