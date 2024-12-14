package com.oop.abstraction;

//abstract class  
abstract class Demo  
{  
	abstract void display1();  //abstract method 
	void display2() {
		System.out.println("display2 method is implemented in Demo class i.e.,Abstract class..");
	}
} 

//extends the abstract class  
public class AbstractEx extends Demo  
{  
	
	//defining the body of the method of the abstract class  
	void display1()  
	{  
		System.out.println("display1 method is implemented in AbstractEx class");
		System.out.println("Abstract method called.");  
	}  
	
	public static void main(String[] args)  
	{    
		AbstractEx a = new AbstractEx ();  
		//invoking abstract method  
		a.display1();  
		a.display2();  
	}  
}  
