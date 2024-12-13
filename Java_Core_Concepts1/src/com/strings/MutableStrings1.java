 package com.strings;

public class MutableStrings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using append() Method in StringBuffer Class
		 StringBuffer sb1=new StringBuffer("Sri ");
		 sb1.append("Indu");//now original string is changed
		 System.out.println(sb1);//prints Sri Indu
		 
		 //Using  insert() Method in StringBuffer Class
		 StringBuffer sb2=new StringBuffer("Allu ");
		 sb2.insert(1,"Arjun");//now original string is changed
		 System.out.println(sb2);//prints AArjunllu
		 
		 //Using replace() Method in StringBuffer Class
		 StringBuffer sb3=new StringBuffer("Samsung ");
		 sb3.replace(1,3,"Galaxy");
		 System.out.println(sb3);//prints SGalaxysung
		 
		 //Using delete() Method in StringBuffer Class
		 StringBuffer sb4=new StringBuffer("Hello");
		 sb4.delete(1,3);
		 System.out.println(sb4);//prints Hlo
		 
		 //Using reverse() Method in StringBuffer Class
		 StringBuffer sb5=new StringBuffer("Sumanth");
		 sb5.reverse();
		 System.out.println(sb5);//prints htnamuS
	}

}
