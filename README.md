# Day1-Java-Basics-Assignment

1. How Java is different from other programming languages?
Java is a high-level, object-oriented programming language developed by Sun Microsystems.
Key differences of Java:
Platform Independent: Java follows Write Once, Run Anywhere. Java programs run on any operating system that has a JVM.
Object-Oriented: Java supports OOP concepts such as encapsulation, inheritance, polymorphism, and abstraction, its helps to creating modular and reusable code.
Robust and Secure: Java provides strong memory management, exception handling, and security features.
Multithreading Support: Java allows execution of multiple tasks simultaneously, improving performance.

2. Explain about public static void main(String[] args) ?
The main() method is the starting point of a Java program. JVM begins execution from this method.
public: Access modifier, means it's accessible from anywhere.
static: Means the method can be called without creating an object.
void: Return type, indicating it does not return any value.
main: Method name, the JVM looks for this method to start execution.
String[] args: Command line arguments passed to the program.

3. Write a sample program to print following:
package Java;
public class Startprogram {
  public static void main(String[] args) {
		    System.out.println("    * * *");
        System.out.println("  * * * * *");
}
}
output : 
    * * *
  * * * * *
