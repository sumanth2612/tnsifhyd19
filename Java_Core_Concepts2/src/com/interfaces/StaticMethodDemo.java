package com.interfaces;

interface StaticMethod{
	public static void method() {
		System.out.println("Static method of an interface..");
	}
}

public class StaticMethodDemo implements StaticMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.method();
	}

}
