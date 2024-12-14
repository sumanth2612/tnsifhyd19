package com.javacollections;

import java.util.*;
public class LinkedHashSetSI {
	 public static void main(String args[])
	 {
	 //CreatingLinkedHashSetand
	 //addingelements
	 LinkedHashSet<String>lhs=new LinkedHashSet<String>();
	 lhs.add("Rajiv");
	 lhs.add("Gandhi");
	 lhs.add("International");
	 lhs.add("Air Port");
	 lhs.add("Hyderabad");
	 
	//Traversingelements
	 Iterator<String>itr=lhs.iterator();
	 while(itr.hasNext()){
	 System.out.println(itr.next());
	 }
	 }
}
