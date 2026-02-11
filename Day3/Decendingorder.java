package Java;

import java.util.Scanner;

public class Decendingorder {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		}
		
		scan.close();

	}

}
