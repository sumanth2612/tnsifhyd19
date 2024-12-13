package com.java.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		//Simple Assignment Operator "="
		int n=20;
		System.out.println("Value Assigned using '=' is:"+n);
		
		n=20;
		//Add AND Assignment Operator "+="
		System.out.println("Value Assigned using '+=' is:"+(n+=5));
			
		n=20;
		//Subtract AND Assignment Operator "-="
		System.out.println("Value Assigned using '-=' is:"+(n-=5));
		
		n=20;
		//Multiply AND Assignment Operator "*="
		System.out.println("Value Assigned using '*=' is:"+(n*=5));
			
		n=20;
		//Divide Assignment Operator "/="
        System.out.println("Value Assigned using '=' is:"+(n/=5));
			
        n=20;
        //Modulus AND Assignment Operator "%="
		System.out.println("Value Assigned using '=' is:"+(n%=5));
	}

}
