package Java;

import java.util.Scanner;

public class Stringandnum {
	
	public static String joinMethod(String name, int num) {
		return name + num; 
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		String name = scan.next();
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		System.out.println(joinMethod(name, num));


		scan.close();
	}

}
