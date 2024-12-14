package com.oop.encapsulation;

//Java encapsulation

class Encapsulate {
 // private variables declared
 // these can only be accessed by
 // public methods of class
	private String studentName;
	private int studentRollno;
	private int studentAge;

 // get method for age to access
 // private variable geekAge
	public int getAge() { 
		return studentAge; 
	}

 // get method for name to access
 // private variable geekName
	public String getName() { 
		return studentName; 
	}

 // get method for roll to access
 // private variable geekRoll
	public int getRoll() { 
		return studentRollno; 
	}

 // set method for age to access
 // private variable geekage
	public void setAge(int newAge) { 
		studentAge = newAge; 
	}

 // set method for name to access
 // private variable geekName
	public void setName(String newName){
		studentName = newName;
	 }

 // set method for roll to access
 // private variable geekRoll
	public void setRoll(int newRoll) { 
		studentRollno = newRoll; 
	}
}

public class EncapsulationDemo {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

     // setting values of the variables
		obj.setName("Sumanth");
		obj.setAge(20);
     	obj.setRoll(50);

     // Displaying values of the variables
     	System.out.println("Student's name: " + obj.getName());
     	System.out.println("Student's age: " + obj.getAge());
     	System.out.println("Student's roll: " + obj.getRoll());

     // Direct access of studentRollno is not possible
     // due to encapsulation
     // System.out.println("Student's roll: " +
     // obj.studentRollno);
     }
}
