import java.util.Scanner;

public class ComparingNumbers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;
		
		System.out.print("Give me two numbers. First: ");
		first = keyboard.nextDouble();
		System.out.print("Second: ");
		second = keyboard.nextDouble();
		
		/*
		Returning this file to original formatting. I prefer to leave all the curly
		braces in.
		*/
		
		if (first < second){
			System.out.println(first + " is LESS THAN " + second);
			}
		if (first <= second){
			System.out.println(first + " is LESS THAN/EQUAL TO " + second);
			}
		if (first == second){
			System.out.println(first + " is EQUAL TO " + second);
			}
		if (first >= second){
			System.out.println(first + "is GREATER THAN/EQUAL to " + second);
			}
		if (first > second){
			System.out.println(first + " is GREATER THAN " + second);
			}
		if (first != second) {
			System.out.println(first + " is NOT EQUAL TO " + second);
			}

	}
}