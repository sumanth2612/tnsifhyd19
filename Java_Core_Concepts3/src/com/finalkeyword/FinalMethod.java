package com.finalkeyword;

class FighterPlane{
	final void fly() {
		System.out.println("Used for Defence purpose...");
	}
}

class MIG21 extends FighterPlane{
	 void fly() { //Final Method cannot be over-ridden
		System.out.println("It flies at a speed of 2.05 Mach.");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MIG21 mig=new MIG21();
		mig.fly();
	}

}
