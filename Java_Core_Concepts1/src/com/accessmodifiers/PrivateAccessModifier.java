package com.accessmodifiers;

class Example{
	 private void display(){
	 System.out.println("This method is Private to the class");
	 }
}

public class PrivateAccessModifier {
	public static void main(String[] args) {
		Example e=new Example();
		e.display();
	}
}

