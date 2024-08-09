package arithmaticOperators;

import java.util.Scanner;

public class Modulus {
	public static void main(String[] args) {
		
		int firstvalue, secondvalue, mod;
		
		try(Scanner modulus = new Scanner(System.in)) {
			
			System.out.println("Enter First value: ");
			firstvalue = modulus.nextInt();
			
			System.out.println("Enter Second value: ");
			secondvalue = modulus.nextInt();
		}
		mod = firstvalue % secondvalue;
		System.out.println("Modulus of Two Values: " + mod);
	}

}
