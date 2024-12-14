package com.finalkeyword;

final class FighterPlanes{
	
}
class Rafale extends FighterPlanes //Final class cannot be Inherited
{
	void fly() {
		System.out.println("Rafale can fly at a speed of 1.8 Mach");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rafale rafale=new Rafale();
		rafale.fly();

	}

}
