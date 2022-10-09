package com.tutorial.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface Drawable {
	void draw();
}

@FunctionalInterface
interface Animal {
	void sound(String animalName, String animalSound);
}

class Product {
	Integer id;
	String productName;
	Integer price;
	
	Product(Integer id, String name, Integer price) {
		this.id = id;
		this.productName = name;
		this.price = price;
	}
}

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Without Lambda expression
		Drawable d1 = new Drawable() {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("\nInvoking draw method without using Lambda expressions");
			}
			
		};
		
		d1.draw();
		
		// With Lambda expression
		Drawable d2 = () -> {
			System.out.println("\nInvoking draw method through Lambda expressions");
		};
		
		d2.draw();
		
		// Lambda expression With parameters
		System.out.println("==================================");
		System.out.println("\n #2: Lambda expression With parameters");
		System.out.println("==================================");
		Animal animal = (animalName, animalSound) -> {
			System.out.println("\n"+animalName+" "+animalSound);
		};
		
		animal.sound("Dog", "barks");
		animal.sound("Cat", "meow");
		
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Mouse", 300));
		productList.add(new Product(2, "Laptop", 300000));
		productList.add(new Product(3, "Keyboard", 30000));
		productList.add(new Product(4, "CPU", 45700));
		productList.add(new Product(5, "Mouse pad", 100));
		
		// Sorting product list
		
		System.out.println("\n #3: Sorting on the basis of product name");
		System.out.println("===========================================");
		Collections.sort(productList, (p1, p2) -> {
			return p1.productName.compareTo(p2.productName);
		});
		
		productList.forEach(p -> System.out.println(p.id +" "+p.productName+" "+p.price));
		
		System.out.println("\n #4: Sorting on the basis of product price");
		System.out.println("============================================");
		Collections.sort(productList, (p1, p2) -> {
			return p1.price.compareTo(p2.price);
		});
		
		productList.forEach(p -> System.out.println(p.id +" "+p.productName+" "+p.price));
		
		System.out.println("\n #5: Filter products price > 30000");
		System.out.println("==================================");
		Stream<Product> filteredProduct = productList.stream().filter(p -> p.price >= 30000);
		filteredProduct.forEach(p -> System.out.println(p.id +" "+p.productName+" "+p.price));
	}

}
