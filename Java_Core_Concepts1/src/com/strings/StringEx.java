package com.strings;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="String1"; //Created using java string literal
		char ch[]= {'S','t','r','i','n','g','2'};
		String s2=new String(ch); //converting char array to string    
		String s3=new String("String3"); //created Java String using new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
	}

}
