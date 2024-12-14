package com.javacollections;

import java.io.*;
import java.util.*;

public class ArrayListInLI {
	
	 public static void main(String[]args)
	 {
	 //Declaring the ArrayList with
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 
	 //Appending new elements atthe end of the list
	 for(int i=1;i<=5;i++)
		 al.add(i);
	 
	 //Printing elements
	 System.out.println(al);
	 
	//Remove element at index3
	 al.remove(3);
	 
	 //Displaying the ArrayList
	 //after deletion
	 System.out.println(al);
	 
	 //Printing elements one by one
	 for(int i=0; i<al.size(); i++)
	 System.out.print(al.get(i)+" ");
	 }
}
