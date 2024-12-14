package com.javacollections;

import java.util.*;
public class PriorityQueueQ {
	public static void main(String args[])
	 {
	 //Creating empty priority queue
	 PriorityQueue<Integer>pQueue=new PriorityQueue<Integer>();
	 
	 //AddingitemstothepQueueusingadd()
	 pQueue.add(1);
	 pQueue.add(2);
	 pQueue.add(3);
	 
	//Printing the top element of PriorityQueue
	 System.out.println(pQueue.peek());
	 
	 //Printing the top element and removing it
	 //from the PriorityQueue container
	 System.out.println(pQueue.poll());
	 
	 //Printing the top element again
	 System.out.println(pQueue.peek());
	 }

}
