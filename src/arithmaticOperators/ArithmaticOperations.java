package arithmaticOperators;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {

		int a, b, c;
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Enter a value: ");
			a = sc.nextInt();
			System.out.println("Enter b value: ");
			b = sc.nextInt();
		}
		c = a+b;
		System.out.println(c);
	}
}
