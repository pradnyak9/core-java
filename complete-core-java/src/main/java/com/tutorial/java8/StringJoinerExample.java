package com.tutorial.java8;

import java.util.StringJoiner;

public class StringJoinerExample {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joinNames = new StringJoiner(",", "<", ">");
		
		joinNames.add("Pradnya");
		joinNames.add("Vivek");
		
		System.out.println(joinNames);
		
		StringJoiner joinNames1 = new StringJoiner(": ", "{ ", " }");
		joinNames1.setEmptyValue("Empty value");
		System.out.println("joinNames1 after setting empty value: "+joinNames1);
		
		joinNames1.add("Bhushan");
		joinNames1.add("Bhavana");
		
		joinNames1.merge(joinNames);
		
		System.out.println(joinNames1);
		
		System.out.println("joinNames length: " + joinNames.length());
		System.out.println("joinNames1 length: " + joinNames1.length());
		
		System.out.println("joinNames1 toString: " + joinNames1.toString());
		
		
		
		
	}

}
