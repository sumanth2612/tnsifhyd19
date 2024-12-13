package com.scannerclass;

import java.util.Scanner;

public class ReadAnEntireWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=read.next();
		System.out.println("My name is "+name);
		read.close();
	}

}
