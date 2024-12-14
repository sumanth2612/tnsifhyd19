package com.javacollections;

import java.util.*;
public class StackLI {
	 public static void main(String args[])
	 {
	 Stack<String> stack = new Stack<String>();
	 stack.push("Jan");
	 stack.push("Feb");
	 stack.push("Apr");
	 stack.push("Jan");
	 
	 // Iterator for the stack
	 Iterator<String> itr= stack.iterator();
	 
	 // Printing the stack
	 while (itr.hasNext()) {
	 System.out.print(itr.next() + " ");
	 }
	 System.out.println();
	 stack.pop();
	 
	 // Iterator for the stack
	 itr= stack.iterator();
	 
	 // Printing the stack
	 while (itr.hasNext()) {
	 System.out.print(itr.next() + " ");
	 }
	 }
}
