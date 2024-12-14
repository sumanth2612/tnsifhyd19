package com.exceptionhandling;

//For age greater than 18 
public class ThrowKeyword2 {
	static void validate(int age){
		if(age<18)
		throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stud
		validate(19);
		 System.out.println("rest of the code...");
	}

}
