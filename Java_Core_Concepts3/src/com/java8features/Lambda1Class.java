package com.java8features;

public class Lambda1Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width =10;
		Lambda1Interface l1= ()->
		{
			
			System.out.println("Drawing "+ width);
		};
		
		l1.draw();
		

	}

}
