package com.tutorial.domain;

public class HomeLoan extends Loan {
	
	public HomeLoan () {
		System.out.println("Calling HomeLoan constructor");
		tenure = 5;
		interestRate = 8.5f;
	}
	
	@Override
	public double calculateEMI( double principle) {
		double emi = super.calculateEMI(principle);
		int additionalTax = 300;		
		return emi + additionalTax;
		
	}
}