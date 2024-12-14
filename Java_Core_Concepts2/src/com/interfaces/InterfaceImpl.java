package com.interfaces;

public class InterfaceImpl implements InterfaceEx{
	
	@Override
	public void sum() {
		int c=a+b;
		System.out.printf("Sum of %d,%d is %d",a,b,c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl i=new InterfaceImpl();
		i.sum();
		
	}

}
