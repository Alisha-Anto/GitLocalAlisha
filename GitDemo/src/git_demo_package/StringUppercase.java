package git_demo_package;

import java.util.Scanner;

public class StringUppercase {

	public static void main(String[] args) {
		System.out.println("This is a program to convert string to UPPERCASE ");
		System.out.println("Enter the  string: ");
		
		Scanner scan = new Scanner(System.in);
		String input  = scan.next();
		System.out.println("To uppercase : "+toUppercase(input));

	}

	private static String toUppercase(String input) {
		return input.toUpperCase();
		
		
	}
	
	private static String toLowercase(String input) {
		return input.toUpperCase();
		
		
	}

}
