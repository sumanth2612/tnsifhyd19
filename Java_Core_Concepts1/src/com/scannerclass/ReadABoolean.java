package com.scannerclass;

import java.util.Scanner;

public class ReadABoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("Enter [true/false]:");
		boolean bool=read.nextBoolean();
		if(bool==true)
		System.out.println("What you said is "+bool+"!");
		else 
			System.out.println("What you said is "+bool+"!");
		read.close();
	}

}
