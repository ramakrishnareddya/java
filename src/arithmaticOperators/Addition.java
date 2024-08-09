package arithmaticOperators;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int firstvalue, secondvalue, thirdvalue, sum;
		
		try (Scanner addition = new Scanner(System.in)) {
			System.out.println("Enter First Value: ");
			firstvalue = addition.nextInt();
			
			System.out.println("Enter Second Value: ");
			secondvalue = addition.nextInt();
			
			System.out.println("Enter Third Value; ");
			thirdvalue = addition.nextInt();
		}
		
		sum = firstvalue + secondvalue + thirdvalue; 
		
		System.out.println("Addition Of Three Values: " + sum);
	}
}
