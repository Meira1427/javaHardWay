import java.util.Scanner;

public class ForgetfulMachine {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What city is the capital of France?");
		keyboard.next();
		
		System.out.println("What is 6 multiplied by 7?");
		keyboard.nextInt();
		
		System.out.println("Enter a number between 0.0 and 1.0");
		keyboard.nextDouble();
		
		System.out.println("Is there anything else you would like to say?");
		keyboard.next();
		
		//The second questions blows up when I type a double instead of an integer
		
		/*The third question does not blow up when I type an integer larger than 1.0
		because it just converts it to a double. It isn't checking whether I really entered
		a number between 0.0 and 1.0. However, it does blow up when I type "test"*/
		
	}
}