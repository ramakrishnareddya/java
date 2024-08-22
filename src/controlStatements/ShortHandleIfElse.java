package controlStatements;

import java.util.Scanner;

public class ShortHandleIfElse {

	public static void main(String[] args) {
		int age , eligible ;
		String result;
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Person Age: ");
			age = sc.nextInt();
			eligible = 18;
		}
		result = (age >= eligible) ? "eligible for vote " : "not eligible for vote";
		System.out.println(result);
	}
}
