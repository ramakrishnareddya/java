package controlStatements;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		int day; 
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Value");
			day = sc.nextInt();
		}
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
		System.out.println("monday");
		break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6: 
			System.out.println("friday");
			break;
		case 7: 
			System.out.println("saturday");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

}
