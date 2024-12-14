package com.finalkeyword;

class Bike{
	final void wheels() {
		System.out.println("Bike is a Two-Wheeler...");
		//Final method can be inherited but, cannot be over-ridden
	}
}
public class FinalMethodInheritance extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethodInheritance f=new FinalMethodInheritance();
		f.wheels();
	}

}
