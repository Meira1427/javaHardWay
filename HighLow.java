import java.util.Scanner;

public class HighLow {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;
		
		secret = 1 + (int)(100*Math.random());
		
		System.out.println("I'm thinking of a number between 1-100.");
		System.out.println("Try to guess it!");
		System.out.print("> ");
		while(!keyboard.hasNextInt()){ //error-checking, so program won't crash
			System.out.print("Only a number between 1-100, please >");
			keyboard.next();
		}
		guess = keyboard.nextInt();
		
		while(secret != guess) {
			if (guess < secret) {
				System.out.print("Sorry, your guess is too low.");
			}
			if (guess > secret) {
				System.out.print("Sorry, your guess is too high.");
			}
			System.out.print(" Try again.\n>");
			while(!keyboard.hasNextInt()){
				System.out.print("Only a number between 1-100, please >");
				keyboard.next();
			}
			guess = keyboard.nextInt();
		}
		
		System.out.println("You guessed it! ** " + secret + " ** What are the odds?!?");
	
	}
}