import java.util.Scanner;

public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready = "NO";
		
		System.out.print("Give me a number, and I'll find it's square root. ");
		System.out.println("(No negatives, please.) ");
		
		while (!ready.equals("YES!")) {
			System.out.print("Are you ready? (YES! or NO) ");
			ready = keyboard.next();
			ready = ready.toUpperCase();
		}
		
		System.out.print("What is your positive number? ");
		while(!keyboard.hasNextDouble()){
			System.out.print("Enter a number please: ");
			keyboard.next();
		}
		x = keyboard.nextDouble();
		
		while (x < 0) {
			System.out.println("I won't take the square root of a negative.");
			System.out.print("New number: ");
			while(!keyboard.hasNextDouble()){
				System.out.print("Enter a number please: ");
				keyboard.next();
			}
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of " + x + " is " + y); 
	}
}