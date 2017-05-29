import java.util.Scanner;

public class ComparingNumbers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;
		
		System.out.print("Give me two numbers. First: ");
		first = keyboard.nextDouble();
		System.out.print("Second: ");
		second = keyboard.nextDouble();
		
		if (first < second) {
			System.out.println(first + " is LESS THAN " + second);
		}
		if (first <= second) {
			System.out.println(first + " is LESS THAN/EQUAL TO " + second);
		}
		if (first == second) {
			System.out.println(first + " is EQUAL TO " + second);
		}
		if (first >= second) {
			System.out.println(first + "is GREATER THAN/EQUAL to " + second);
		}
		if (first > second) {
			System.out.println(first + " is GREATER THAN " + second);
		}
		//no curly braces on last line okay as long as only one line of code
		// #1. try adding a "Hey". It prints every time.
		if (first != second)
			System.out.println(first + " is NOT EQUAL TO " + second);
			System.out.println("Hey.");

	}
}