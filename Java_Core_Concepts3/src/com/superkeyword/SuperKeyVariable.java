package com.superkeyword;

class Mobile{
	String network="4G";
}

class OPPO extends Mobile{
	String network="5G";
	void display() {
		System.out.println("Mobile class network:"+super.network);
		System.out.println("OPPO class network:"+network);
	}
}

public class SuperKeyVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OPPO oppo=new OPPO();
		oppo.display();

	}

}
