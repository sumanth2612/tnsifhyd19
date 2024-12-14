package com.exceptionhandling;

//For age less than 18
public class ThrowKeyword1 {
	static void validate(int age){
		 if(age<18)
		 throw new ArithmeticException("not valid");
		 else
		 System.out.println("welcome to vote");
	}
	public static void main(String args[]){
		validate(13);
		System.out.println("rest of the code...");
		 }
}
