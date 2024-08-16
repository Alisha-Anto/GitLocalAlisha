package git_demo_package;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("This is a program to check number is PALINDROME ");
		System.out.println("Enter the  number");
		
		Scanner scan = new Scanner(System.in);
		int  number = scan.nextInt();

		System.out.println("The number is: " + palindromeCheck(number) + " example of Palindrome");

	}

	private static boolean palindromeCheck(int number) {

		String string = new String();
		string = String.valueOf(number);

		StringBuffer strBuff = new StringBuffer(string);
		strBuff.reverse();

		System.out.println("The reversed string is:  " + strBuff);
		if (string.contentEquals(strBuff)) {
			return true;
		}

		return false;

	}
}
