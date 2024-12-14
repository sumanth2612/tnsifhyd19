package com.interfaces;

class Implementation implements One,Two{

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Method of Interface Two");
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("Method of Interface One");
	}
	
}

public class MultipleInterfacesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation i=new Implementation();
		i.methodOne();
		i.methodTwo();
	}

}
