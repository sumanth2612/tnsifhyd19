package com.scannerclass;

import java.util.Scanner;

public class ReadADouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read=new Scanner(System.in);
		System.out.println("Enter a double value:");
		double dvalue=read.nextDouble();
		System.out.println("Using nextDouble():"+dvalue);
		read.close();
	}

}
