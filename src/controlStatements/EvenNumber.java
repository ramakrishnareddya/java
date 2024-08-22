package controlStatements;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		
		int number;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Number: ");
			number = sc.nextInt();
		}
		
		if (number %2==0) {
			System.out.println(number  + " is an even number");
		} else {
			System.out.println(number  + " is not an even number");
		}
	}

}
