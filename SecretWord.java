import java.util.Scanner;

public class SecretWord {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String secret = "please";
		String guess;
		//prefer these on separate lines
		
		System.out.print("What's the secret word? ");
		guess = keyboard.next();
		
		//java is bonus secret word
		if (guess.equals(secret) || guess.equals("java")) {
			System.out.println("That's correct!");
		}
		else {
			System.out.println("No, the secret word isn't \"" + guess + "\".");
		}
		
		//cannot use == with strings
		if (guess == secret) {
			System.out.println("(This will never ever show, no matter what.)");
		}
	
	}
}