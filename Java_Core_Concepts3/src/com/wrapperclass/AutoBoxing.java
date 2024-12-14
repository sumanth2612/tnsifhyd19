package com.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		
		 // createprimitive types
	     byte n1=2;
	     short n2=250;
		 int n3=547875;
		 long n4=707552386;
		 
		 float f=(float) 5.2;
		 double d = 5.67685;
		 
		 char c='S';
		 boolean b=true;
		 
		 //converts into wrapper objects
		 Byte n1Obj=Byte.valueOf(n1);
		 Short n2Obj=Short.valueOf(n2);
		 Integer n3Obj= Integer.valueOf(n3);
		 Long n4Obj=Long.valueOf(n4);
		 
		 Float fObj=Float.valueOf(f);
		 Double dObj= Double.valueOf(d);
		 
		 Character cObj= Character.valueOf(c);
		 Boolean bObj=Boolean.valueOf(b);
		 
		 if(n1Obj instanceof Byte) {
			 System.out.println("An object of Byte is created.");
			 }
		 if(n2Obj instanceof Short) {
			 System.out.println("An object of Short is created.");
			 }
		 if(n3Obj instanceof Integer) {
		 System.out.println("An object of Integer is created.");
		 }
		 if(n4Obj instanceof Long) {
			 System.out.println("An object of Long is created.");
			 }
		 
		 if(fObj instanceof Float) {
			 System.out.println("An object of Float is created.");
			 }
		 if(dObj instanceof Double) {
		 System.out.println("An object of Double is created.");
		 }

		 if(cObj instanceof Character) {
			 System.out.println("An object of Character is created.");
			 }
		 if(bObj instanceof Boolean) {
			 System.out.println("An object of Boolean is created.");
			 }
	}

}
