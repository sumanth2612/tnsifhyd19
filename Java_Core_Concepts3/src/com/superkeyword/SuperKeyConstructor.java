package com.superkeyword;

class Mobiles{
	Mobiles(){
		System.out.println("Mobile Constructor invoked!!");;
	}
}

class OPPOReno extends Mobiles{
	OPPOReno(){
		super();
		System.out.println("OPPO Constructor is invoked!!");
	}
}
public class SuperKeyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OPPOReno oppo=new OPPOReno();
	}

}
