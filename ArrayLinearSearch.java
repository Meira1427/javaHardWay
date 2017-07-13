import java.util.Scanner;

public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] orderNumbers = { 12345, 54321, 101010, 8675309, 31415, 271828 };
		int toFind;
		boolean found = false;
		
		/* Study Drill #1: try declaring int num up here instead of in the for each loops
		ArrayLinearSearch.java:15: error: bad initializer for for-loop
		for (num : orderNumbers) {
		     ^
		ArrayLinearSearch.java:23: error: bad initializer for for-loop
		for (num : orderNumbers) {
		     ^
		2 errors
		Note: changed it back
		*/
		
		System.out.println("There are " + orderNumbers.length + "in the database.");
		
		System.out.print("Orders: ");
		for (int num : orderNumbers) {
			System.out.print(num + "   ");
		}
		System.out.println();
		
		System.out.print("Which order to find? ");
		toFind = keyboard.nextInt();
		
		for (int num : orderNumbers) {
			if ( num == toFind ) {
				System.out.println(num + " found.");
				found = true;
			}
		}
		if(!found) {
			System.out.println("Please check your number and try again.");
		}
	}
}