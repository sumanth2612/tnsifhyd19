package com.scannerclass;

import java.util.Scanner;

public class ReadAFloat {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("Enter float value:");
		float f=read.nextFloat();
		System.out.println("Using nextFloat():"+f);
		read.close();
	
	}

}
