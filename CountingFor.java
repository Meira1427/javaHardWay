import java.util.Scanner;

public class CountingFor {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n;
		String message;
		
		System.out.println("Enter a message and I'll display it five times.");
		System.out.print("Message: ");
		message = keyboard.nextLine();
		
		for (n = 1; n <= 5; n++) {
			System.out.println(n + ". " + message);
		}
		
		System.out.println("\nNow I'll show it ten times and cound by 5s.");
		for (n = 5; n <= 50; n += 5) {
			System.out.println(n + ". " + message);
		}
		
		/*
		When you remove the init statement from the below loop, it uses the "n" from the
		previous for loop. That n is now 55 from right before the last loop ended. So instead
		of counting 3. . . 2. . . 1. . . it counts down from 55
		*/
		System.out.println("\nFinally, three times counting backward.");
		for (; n > 0; n -= 1) {
			System.out.println(n + ". " + message);
		}
	}
}