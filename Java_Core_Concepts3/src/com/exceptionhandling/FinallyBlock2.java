package com.exceptionhandling;

public class FinallyBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case2:exception occurs and not handled.
		 try{
			 int data=25/0;
			 System.out.println(data);
			 }
			 catch(NullPointerException e){
				 System.out.println(e);
				 }
			 finally{
				 System.out.println("finally block is always executed");
				 }
			 System.out.println("rest of the code...");

	}

}
