package com.tns.a2;

public class Approach1 {
	int a=10; // instance variable
	static int b=20; //static variable
    void display() { //instance method 
    	System.out.println(a);
    }
   static int display1() { //static method
        return b;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=30; //local variable
		System.out.println("c="+c);
		Approach1 a1=new Approach1();
		System.out.println("a="+a1.a);
		a1.display();
		System.out.println("b="+Approach1.b);
		System.out.println(Approach1.display1());
	}

}
