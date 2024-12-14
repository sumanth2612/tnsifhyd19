package com.java8features;

public class FunctionalInterfaceMain implements FunctionalInterface1{
	
	  public void say(String msg){  
	        System.out.println(msg);  
	    }  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceMain fie = new FunctionalInterfaceMain();  
        fie.say("Hello there"); 

	}

}
