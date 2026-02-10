package Java;

import java.util.Scanner;

public class Divisibleprogram {
	
//	Get 3 floating numbers from user like for eg a,b,c. Multiply a & b and then divide it by c. Print the result.

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of A");
		float a = scan.nextFloat();
		
		System.out.println("Enter the value of B");
		float b = scan.nextFloat();
		
		System.out.println("Enter the value of C");
		float c = scan.nextFloat();
		
		float result = (a * b) / c;
		
		System.out.println("The result is  : " + result);
		
		scan.close();

	}

}
