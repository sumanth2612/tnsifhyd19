package com.java8features;

public class Lambda2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda2Interface l2 = (name)->{
			return "Hello" + name;
		};
		
        System.out.println(l2.say("Sonoo"));    


	}

}
