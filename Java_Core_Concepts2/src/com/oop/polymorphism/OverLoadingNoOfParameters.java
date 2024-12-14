package com.oop.polymorphism;
class One{
	int method() {
		return 10;	
	}
	int method(int n) {
		return n;
	}
}

public class OverLoadingNoOfParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o=new One();
		System.out.println(o.method());
		System.out.println(o.method(20));
	}

}
