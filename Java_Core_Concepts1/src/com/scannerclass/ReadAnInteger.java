package com.scannerclass;

import java.util.Scanner;

public class ReadAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read=new Scanner(System.in);
	    System.out.println("Enter a Byte Value:");
	    byte num2=read.nextByte();
		System.out.println("Using nextByte() method value of num is:"+num2);
		
		System.out.println("Enter a Short Value:");
	    short num3=read.nextShort();
		System.out.println("Using nextInt() method value of num is:"+num3);
		
		System.out.println("Enter an Integer:");
	    int num1=read.nextInt();
		System.out.println("Using nextInt() method value of num is:"+num1);

		System.out.println("Enter a Long value:");
	    long num4=read.nextLong();
		System.out.println("Using nextLong() method value of num is:"+num4);
		read.close();
	}

}
