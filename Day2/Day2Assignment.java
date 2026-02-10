Day2/Day2Assignment.java

1. Get 3 floating numbers from user like for eg a,b,c. Multiply a & b and then divide it by c. Print the result.
package Java;

import java.util.Scanner;

public class Divisibleprogram {
	
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


Output : 

Enter the value of A
20
Enter the value of B
30
Enter the value of C
50
The result is  : 12.0


  2. Compare 2 numbers using >= and <= operators. Print the result.

  package Java;

import java.util.Scanner;

public class Comparenumbers {

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

Output : 
Enter the first number
20
Enter the second number
30
num1 >= num2 result: false
num1 <= num2 result: true

