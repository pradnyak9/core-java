package com.tutorial.domain;

public class Loan {
	int tenure;
	float interestRate;
	
	public Loan () {
		System.out.println("Calling Loan constructor");
		tenure = 5;
		interestRate = 8.5f;
	}
	
	public double calculateEMI (double principle) {
		double simpleInterest = (principle * interestRate * tenure) / 100;
		return ( simpleInterest + principle ) / tenure;
	}
}
