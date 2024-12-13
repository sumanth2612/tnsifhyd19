package com.java.operators;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);

		//Example-1
		boolean x;
		x=(5<4)?true:false;
		System.out.println(x);
		
		//Example-2
		String a="You're eligible to Vote!!";
		String b="You're not eligible to Vote!!";
		System.out.println("Enter your Age:");
		int age=read.nextInt();
		String result=(age>18)?a:b;
		System.out.println(result);
		
	}

}

