package Java;

import java.util.Scanner;

public class Mathematicalprogram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Calc (add,sub,div) ");
		String input = scan.next().toLowerCase();
		
		System.out.println("Enter the first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = scan.nextInt();
		
		switch(input) {
		case "add":
			int add = num1 + num2;
			System.out.println("Addition of given number is  :" + add);
			break;
		case "sub":
			int sub = num1 - num2;
			System.out.println("Subtraction of given number is :" + sub);
			break;
		case "div":
			if(num2 !=0) {
				int div = num1 /  num2;
				System.out.println("Division of given number is :" + div);
			}
			else {
				System.out.println("Given number is cannot divisible by zero");
			}
			break;
			
			default:
				System.out.println("Invalid Calc Operation");
				
		}
		
		scan.close();
	}

}
