package arithmaticOperators;

import java.util.Scanner;

public class Decrement {
	public static void main(String[] args) {
	
		Scanner decrement = new Scanner(System.in);
		
		System.out.println("Enter Value: ");
		int number = decrement.nextInt();
		System.out.println("Original Value: " + number);
		
		number--;
		System.out.println("Decrement Value: " + number);
		
		decrement.close();
	}

}
