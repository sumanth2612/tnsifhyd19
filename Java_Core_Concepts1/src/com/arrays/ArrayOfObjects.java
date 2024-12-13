package com.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[]=new Student[5];
		
		s[0]=new Student(1,"Sumanth");
		s[1]=new Student(2,"Bablu");
		s[2]=new Student(3,"Sukumar");
		s[3]=new Student(4,"Abhilash");
		s[4]=new Student(5,"Abhiram");
		
		for(int i=0;i<s.length;i++)
			System.out.println("Elements in the array at position "+i+" is:"+s[i].roll_no+"."+s[i].name);

	}

}
