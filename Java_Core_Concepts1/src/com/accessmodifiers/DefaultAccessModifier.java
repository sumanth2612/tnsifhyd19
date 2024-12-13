package com.accessmodifiers;

import com.classeswithoutmain.*;

public class DefaultAccessModifier {
	 public static void main(String args[])
	 {
	 //accessing class Methods from the above package
		 DefaultEx d= new DefaultEx();
		 d.display();
	 }
}

// OUTPUT:Compile Time Error