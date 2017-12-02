package PolynomialDivision;
import java.util.ArrayList;
import java.util.Scanner;

public class Polynomial {
	
	private static Scanner in;

	public static ArrayList<Integer> getPolynomial() {
		
		ArrayList<Integer> coefficients = new ArrayList<>();
		int degree;
		in = new Scanner(System.in);
		System.out.print("Enter the degree of the polynomial: ");
		degree = in.nextInt();
		
		for (int i=0; i <= degree; i++) {
			System.out.print("Enter the coefficient for degree " + (degree-i) + ": ");
			coefficients.add(in.nextInt());
		}
		
		return coefficients;
	}
	
	public static void printPolynomial(ArrayList<Integer> polynomial) {
		int i = 0;
		System.out.print("< ");
		while (i < polynomial.size()) {
			if (i == (polynomial.size() - 1)) {
				System.out.println(polynomial.get(i) + " >");
			}
			else {
				System.out.print(polynomial.get(i) + ", ");
			}
			i++;
		}
	}
	
	public static ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> polynomial){
			
		if (polynomial.get(0) == 0 && (polynomial.size() > 1)) {
			polynomial.remove(0);
			polynomial = removeLeadingZeros(polynomial);
		}
		return polynomial;
	}

}