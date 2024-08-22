package conditions;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		
		  int number;
		  
		  try(Scanner sc = new Scanner(System.in)){
			  System.out.println("Enter value: ");
			  number = sc.nextInt();
		  }

	        if (number % 2 != 0) {
	            System.out.println(number + " is an odd number.");
	        } else {
	            System.out.println(number + " is not an odd number.");
	        }
	}

}
