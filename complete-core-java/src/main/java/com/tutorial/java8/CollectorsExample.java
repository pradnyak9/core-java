package com.tutorial.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product1 {
	Integer id;
	String productName;
	Integer price;
	
	Product1(Integer id, String name, Integer price) {
		this.id = id;
		this.productName = name;
		this.price = price;
	}
}

public class CollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "mouse", 300));
		productList.add(new Product(2, "Laptop", 300000));
		productList.add(new Product(3, "Keyboard", 300));
		productList.add(new Product(4, "CPU", 45700));
		productList.add(new Product(5, "Mouse pad", 100));
		
		List<Integer> priceList = productList.stream().map(p -> p.price).collect(Collectors.toList());
		System.out.println("\nPrice list: "+priceList);
		
		Set<Integer> priceSet = productList.stream().map(p -> p.price).collect(Collectors.toSet());
		System.out.println("\nPrice set: "+priceSet);
		
		Double avgPrice = productList.stream().map(p -> p.price).collect(Collectors.averagingDouble(a -> a));
		System.out.println("\nAverage price of Products: "+avgPrice);

		Long filterCount = productList.stream()
				.filter(p -> p.productName.toLowerCase().startsWith("Mou".toLowerCase()))
				.collect(Collectors.counting());
		System.out.println("\nProducts start with 'Mou' count: "+filterCount);
		
	}

}
