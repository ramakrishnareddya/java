package arithmaticOperators;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		
		int firstvalue, secondvalue, div;
		
		try(Scanner division = new Scanner(System.in)){
			
			System.out.println("Enter First Value:");
			firstvalue = division.nextInt();
			
			System.out.println("Enter Second Value:");
			secondvalue = division.nextInt();
		}
		
		div = firstvalue / secondvalue;
		System.out.println("Division of two values: " + div);
	}

}
