package com.strings;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sumanth";  
		String s2="Sumanth";
		String s3="Bablu";
		String s4=new String("Sumanth");  
		  
		//By Using equals() Method
		System.out.println(s1.equals(s2));//true  
		System.out.println(s1.equals(s3));//true  
		System.out.println(s1.equals(s4));//false
		
		//By Using == operator
		System.out.println(s1==s2);//true (because both refer to same instance)  
		System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  

		//By Using compareTo() method
		System.out.println(s1.compareTo(s2));//0  
		System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  

	}

}
