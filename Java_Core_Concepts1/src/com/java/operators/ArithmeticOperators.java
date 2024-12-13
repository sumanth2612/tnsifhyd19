package com.java.operators;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner read=new Scanner(System.in);
	System.out.println("Enter any two numbers:");
    int a=read.nextInt();
	int b=read.nextInt();
	
	//Addition(+) operator
	System.out.println("Addition of the given numbers is:"+(a+b));
	
	//Subtraction(-) operator
		System.out.println("Subtraction of the given numbers is:"+(a-b));
	
		//Multiplication(*) operator
		System.out.println("Multiplication of the given numbers is:"+(a*b));
		
		//Division(/) operator
		System.out.println("Division of the given numbers is:"+(a/b));
		
		//Modulus(+) operator
		System.out.println("Modulus of the given numbers is:"+(a%b));
		
		//Increment ++ operator
		System.out.println("Pre-Increment of a:"+(++a));
		System.out.println("Post-Increment of a:"+(a++));
		
		//Decrement -- operator
		System.out.println("Pre-Decrement of b:"+(--b));
		System.out.println("Post-Decrement of b:"+(b--));
	}

}
