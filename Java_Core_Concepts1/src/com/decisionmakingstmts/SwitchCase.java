package com.decisionmakingstmts;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("1.Name \n2.Branch \n3.RollNo");
		System.out.println("Choose your option:");
		int n=read.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("My name is Sumanth Savanapelly");
			break;
		
		case 2:
			System.out.println("Computer Science and Information Technology");
			break;
			
		case 3:
			System.out.println("21D41A3350");
			break;
			
		default:System.out.println("Not Available");;
		}
	}
}
