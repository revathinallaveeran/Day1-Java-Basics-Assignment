package Java;

import java.util.Scanner;

public class Comparenumbers {
	
//	Compare 2 numbers using >= and <= operators. Print the result.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		System.out.println("num1 >= num2 result: " + (num1 >= num2));
		System.out.println("num1 <= num2 result: " + (num1 <= num2));
		
		scan.close();

	}

}
