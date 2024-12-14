package com.finalkeyword;

class Tejas{
	final String speed="1.8 Mach" ;
	void fly(){
		speed="1.9 Mach"; //Final Variable cannot be changed
		                  //Once declared Final, it becomes constant
	}
}
public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tejas t=new Tejas();
		t.fly();
	}

}
