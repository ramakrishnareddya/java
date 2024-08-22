package controlStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		String day;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Day");
			day = sc.nextLine();
		}
		switch (day) {
		case "Sunday":
			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thrusday":
			System.out.println("Thrusday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
