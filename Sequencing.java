import java.util.Scanner;

public class Sequencing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		/* #3. not required to initialize to zero, since calculations happen after
		price is initialized with user input
		*/
		
		/* #1. when calculation is here, we get "variable price might not have been initialized"
		salesTax = price *0.0825;
		total = price + salesTax;
		*/

		System.out.print("How much is the purchase price? ");
		price = keyboard.nextDouble();
	
		// #2. move calculations to below place where price is initialized	
		salesTax = price *0.0825;
		total = price + salesTax;
		
		System.out.println("Item price:\t" + price);
		System.out.println("Sales tax:\t" + salesTax);
		System.out.println("Total cost:\t" + total);
		
	}
}