package com.javacollections;

import java.util.HashMap;

public class HMap {
	  public static void main(String[] args) {
	    // Create a HashMap object called cmap
	    HashMap<String, String> cmap = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    cmap.put("England", "London");
	    cmap.put("Germany", "Berlin");
	    cmap.put("Norway", "Oslo");
	    cmap.put("USA", "Washington DC");
	    System.out.println(cmap);
	    
	    //getting values using get()
	    System.out.println(cmap.get("Germany"));
	    //removing an element
	    cmap.remove("England");
	    System.out.println(cmap);
	    System.out.println("size of hashmap "+cmap.size());
	  }
	}

