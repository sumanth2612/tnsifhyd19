package com.java8features;
import java.util.*;
import java.util.stream.Stream;

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"HPlaptop",25000f))
		;
		pl.add(new Product(2,"DEll laptop",30000f));

		pl.add(new Product(1," LENOVA laptop",28000f));

		pl.add(new Product(1,"Sony laptop",28000f));

		pl.add(new Product(1,"Apple laptop",90000f));
		//finding the laptop with maximum cost
		
		Product p=pl.stream().max((product1, product2)->product1.price>product2.price?1:-1).get();
        System.out.println("maaximum"+p.price);
        
        //finding the laptop with minimum cost
        Product p1=pl.stream().min((product1, product2)->product1.price<product2.price?1:-1).get();
        System.out.println("minimum"+p1.price);
        
   
        //finding no. of product in stream price <900000
        long count = pl.stream()
        		.filter(product->product.price<90000)
        		.count();
        System.out.println(count);
        
        //filtering laptop with price 300000
        
		pl.stream()
		.filter(product->product.price == 30000)
		.forEach(product ->System.out.println(product.name));
		
		//iterating through stream for 5 multiple upto a limit 5
		Stream.iterate(1, element->element+1)
		.filter(element->element%5==0)
         .limit(5)
         .forEach(  System.out::println );
	
	}

}
