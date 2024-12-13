package com.decisionmakingstmts;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=15;
	    if(a>b) {
	    	if( a>c) {
	    	System.out.println("'a'is the greatest value");
	    	}
	    }
	    else if(b>a) {
	    	if(b>c) {
	    	System.out.println("'b' is the greatest value");
	    	}
	    }
	    else {
	    	System.out.println("'c' is the greatest value");
	    }

	}

}
