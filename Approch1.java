package com.tns.a2;

public class Approch1 {
	int a=10;
	static int b=20;
    void display() {
    	System.out.println(a);
    }
   static int display1() {
      //  System.out.println("b="+b);
        return b;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=30;
		System.out.println("c="+c);
		Approch1 a1=new Approch1();
		System.out.println("a="+a1.a);
		a1.display();
		System.out.println("b="+Approch1.b);
		System.out.println(Approch1.display1());
	}

}
