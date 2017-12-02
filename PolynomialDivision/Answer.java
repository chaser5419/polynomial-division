package PolynomialDivision;

import java.util.ArrayList;

public class Answer extends Polynomial {
	ArrayList<Integer> quotient = new ArrayList<>();
	ArrayList<Integer> remainder = new ArrayList<>();
	
	public void printAnswer() {
		System.out.println("The quotient is:");
		printPolynomial(quotient);
		System.out.println("The remainder is:");
		printPolynomial(remainder);
	}
}