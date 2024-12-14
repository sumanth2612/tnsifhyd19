package com.javacollections;

import java.util.*;
public class TreeSetSSI {
	 public static void main(String args[])
	 {
	 //CreatingTreeSetand
	 //addingelements
	 TreeSet<String> ts=new TreeSet<String>();
	 ts.add("Rajiv");
	 ts.add("Gandhi");
	 ts.add("International");
	 ts.add("Airport");
	 ts.add("Hyderabad");
	 //Traversingelements
	 Iterator<String>itr=ts.iterator();
	 while(itr.hasNext()){
	 System.out.println(itr.next());
	 }
	 }
}
