package com.tutorial.inheritance;

import com.tutorial.domain.HomeLoan;
import com.tutorial.domain.PlotLoan;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******* Single level interface *******");
		HomeLoan hLoan = new HomeLoan();
		System.out.println("Home loan EMI per year of principle 200000: "+hLoan.calculateEMI(200000));
		
		System.out.println();
		System.out.println();
		
		System.out.println("******* Multi level interface ********");
		PlotLoan pLoan = new PlotLoan();
		System.out.println("Plot loan EMI per year of principle 300000: "+pLoan.calculateEMI(300000));
	}

}
