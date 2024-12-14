package com.interfaces;

interface First{
	public void show1();
}

interface Second{
	public void show2();
}

public class MultipleInheritance implements First,Second  {

	public void show1() {
		System.out.println("First interface method..");
	}
	
	public void show2() {
		System.out.println("Second interface method..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInheritance m=new MultipleInheritance();
		m.show1();
		m.show2();
	}

}
