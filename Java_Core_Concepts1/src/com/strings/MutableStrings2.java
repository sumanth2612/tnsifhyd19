package com.strings;

public class MutableStrings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s1=new StringBuilder("Sumanth ");
		 s1.append("Savanapelly");//now original string is changed
		 System.out.println(s1);//prints Sumanth Savanapelly
		 
		//Using  insert() Method in StringBuilder Class
		 StringBuilder s2=new StringBuilder("Allu ");
		 s2.insert(1,"Arjun");//now original string is changed
		 System.out.println(s2);//prints AArjunllu
		 
		 //Using replace() Method in StringBuilder Class
		 StringBuilder s3=new StringBuilder("Samsung ");
		 s3.replace(1,3,"Galaxy");
		 System.out.println(s3);//prints SGalaxysung
		 
		 //Using delete() Method in StringBuilder Class
		 StringBuilder s4=new StringBuilder("Hello");
		 s4.delete(1,3);
		 System.out.println(s4);//prints Hlo
	}

}
