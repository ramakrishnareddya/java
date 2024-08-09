package arithmaticOperators;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		
		int firstvalue, secondvalue, thirdvalue, sub;
		
		try(Scanner subtraction = new Scanner(System.in)) {
			
			System.out.println("Enter First Value: ");
			firstvalue = subtraction.nextInt();
			
			System.out.println("Enter Second Value: ");
			secondvalue = subtraction.nextInt();
			
			System.out.println("Enter Third Value: ");
			thirdvalue = subtraction.nextInt();
		}
		sub = firstvalue - secondvalue - thirdvalue;
		System.out.println("Subtraction of Three Numbers: " + sub);
	}

}
