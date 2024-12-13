package com.java.operators;
import java.io.*;

public class BitwiseOperators {
	
	public static void main(String[] args)
	{
		int d = 10;
	    int e = 20;
	      
	     System.out.println("d & e : " + (d & e));
	     System.out.println("d | e : " + (d | e));
	     System.out.println("d ^ e : " + (d ^ e));
	     System.out.println("~d : " + (~d));
	     System.out.println("d << 2 : " + (d << 2));
	     System.out.println("e >> 1 : " + (e >> 1));
	     System.out.println("e >>> 1 : " + (e >>> 1));
	    
	}
}
