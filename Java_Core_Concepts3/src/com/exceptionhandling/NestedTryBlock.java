package com.exceptionhandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			 try{
			 System.out.println("Division Operation");
			 int b =39/0;
			 }
			 catch(ArithmeticException e){
				 System.out.println(e);
				 }
			 
			 try{
			 int a[]=new int[5];
			 a[5]=4;
			 }
			 catch(ArrayIndexOutOfBoundsException e){
				 System.out.println(e);
				 }
			 System.out.println("other statement");
			 }
		catch(Exception e){
				 System.out.println("handeled");
				 }
			 System.out.println("normal flow..");
	}

}
