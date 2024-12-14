package com.exceptionhandling;

public class FinallyBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Case1:Exception doesn't occur.
		 try{
			 int data=25/5;
			 System.out.println(data);
			 }
			 catch(NullPointerException e){
				 System.out.println(e);
				 }
			 finally{
				 System.out.println("finally block is always executed");
				 }
			 System.out.println("Rest of the code...");

	}

}
