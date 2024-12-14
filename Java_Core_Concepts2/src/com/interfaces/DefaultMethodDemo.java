package com.interfaces;

interface DefaultMethod{
	public default void method() {
		System.out.println("Default method of an interface.");
	}
}

public class DefaultMethodDemo implements DefaultMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodDemo d=new DefaultMethodDemo();
		d.method();
	}

}
