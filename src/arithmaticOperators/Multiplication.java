package arithmaticOperators;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		int firstvalue, secondvalue, mul;
		
		try(Scanner multiplication = new Scanner(System.in)) {
			
			System.out.println("Enter First Value: ");
			firstvalue = multiplication.nextInt();
			
			System.out.println("Enter Second Value: ");
			secondvalue = multiplication.nextInt();
		}
		mul = firstvalue * secondvalue;
		System.out.println("Multiplication of Two Numbers: " + mul);
	}
}
 