package com.scannerclass;
import java.util.Scanner;

public class ReadALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		System.out.println("Enter your Full Name:");
		String name=read.nextLine();
		System.out.println("My name is "+name);
		read.close();
	}

}
