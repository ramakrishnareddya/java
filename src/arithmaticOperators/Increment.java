package arithmaticOperators;

import java.util.Scanner;

public class Increment {
	public static void main(String[] args) {

		Scanner increment = new Scanner(System.in);
		
		System.out.println("Enter value:");
		int num =increment.nextInt();
		System.out.println("Original Value: " + num);
		
		num++;
		System.out.println("Increment Value: " + num);
		
		increment.close();
		
	}

}
