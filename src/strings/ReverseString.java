package strings;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String name;
		
		try (Scanner rev = new Scanner(System.in)){
			System.out.println("Enter String");
			name = rev.nextLine();
		}
	
		String reverse="";
		int length=name.length();
		
		for(int i=length-1; i>=0; i--) {
			reverse=reverse+name.charAt(i);
		}
		System.out.println(reverse);
	}
}