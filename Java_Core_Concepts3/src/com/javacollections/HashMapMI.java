package com.javacollections;

import java.util.*;
public class HashMapMI {
	 public static void main(String args[])
	 {
	 //CreatingHashMapand
	 //addingelements
	 HashMap<Integer,String> hm=new HashMap<Integer,String>();
	 hm.put(1,"Jana");
	 hm.put(2,"Gana");
	 hm.put(3,"Mana");
	 
	 //Finding the value for a key
	 System.out.println("Value for the key:1 is "+hm.get(1));
	 
	 //TraversingthroughtheHashMap
	 for(Map.Entry<Integer,String>e:hm.entrySet())
	 System.out.println(e.getKey()+" "+e.getValue());
	 }
}
