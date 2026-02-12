package Java;

import java.util.Scanner;

public class Stringandnum {
	
	public static void joinMethod(String value, int number) {
		System.out.println(value + number);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		String value = scan.next();
		
		System.out.println("Enter the number");
		int number = scan.nextInt();
		
		joinMethod(value, number);


	}

}
