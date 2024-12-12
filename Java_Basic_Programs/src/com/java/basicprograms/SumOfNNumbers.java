package com.java.basicprograms;
import java.util.Scanner;
public class SumOfNNumbers { 

public static void main(String[] args) { 

Scanner scanner = new Scanner(System.in);

// Prompt the user to enter a number 
System.out.print("Enter a number: "); 
int n = scanner.nextInt(); 

//Calculate the sum of natural numbers up to n

int sum = 0; for (int i = 1; i <= n; i++)
{ 
sum += i;
} 

//Print the sum 
System.out.println("Sum of natural numbers up to " + n + " is: " + sum); 

//Close the scanner 
scanner.close();
  } 
}

