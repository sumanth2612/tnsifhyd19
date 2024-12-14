package com.oop.abstraction;

interface SwitchOn  //interface 1
{    
	void on();    // abstract method
}  

interface SwitchOff  //interface 2
{    
	void off();    // abstract method
} 

// inheriting both the interfaces using the implements keyword
public class InterfaceEx implements SwitchOn, SwitchOff  
{    
	public void on()  //defining body for the on()method
	{  
		System.out.println("The switch is in on state.");  
	}    
	
	public void off()  //defining body for the off()method
	{  
		System.out.println("The switch is in off state.");  
	}    
	
	public static void main(String args[])  
	{    
		InterfaceEx i = new InterfaceEx();    
		i.on();    
		i.off();    
	}  
}  
