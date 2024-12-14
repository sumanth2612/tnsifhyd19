package com.oop.polymorphism;

class DifferentOrder {
	 
    // Method 1
    public void differentOrder(String name, int id)
    {
 
        // Printing name and id of person
        System.out.println("Name:" + name + " "
                           + "Id:" + id);
    }
    // Method 2
    public void differentOrder(int id, String name)
    {
 
        // Again printing name and id of person
        System.out.println("Id:" + id + " "
                           + "Name:" + name);
    }
}
public class OverLoadingDiffOrderOfParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentOrder d = new DifferentOrder();
		d.differentOrder("Sumanth",50);
		d.differentOrder(50,"Sumanth");
	}

}
