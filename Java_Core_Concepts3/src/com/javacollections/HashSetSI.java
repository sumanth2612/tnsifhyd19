package com.javacollections;

import java.util.*;
public class HashSetSI {
	 public static void main(String args[])
	 {
	 //CreatingHashSetand
	 //addingelements
	 HashSet<String>hs=new HashSet<String>();
	 hs.add("Rajiv");
	 hs.add("Gandhi");
	 hs.add("International");
	 hs.add("Air Port");
	 hs.add("Hyderabad");
	 
	 //Traversingelements
	 Iterator<String>itr=hs.iterator();
	 while(itr.hasNext()){
	 System.out.println(itr.next());
	 }
	 }
}
