package com.oop.polymorphism;
//Example program for both Different Parameters and Different Return types

class Adding {
	 
    // Adding three integer values
    public int add(int a, int b, int c)
    {
         
        int sum = a + b + c;
        return sum;
    }
    // adding three double values.
    public double add(double a, double b, double c)
    {
 
        double sum = a + b + c;
        return sum;
    }
}
public class OverLoadingDiffReturnType1 {
	public static void main(String[] args) {
		Adding ob = new Adding();
		
		System.out.println("Sum of the three integer values :" + ob.add(1, 2, 3));
      
        System.out.println("Sum of the three double values :"+ ob.add(1.0, 2.0, 3.0));
	}
}
