import java.util.Scanner;

public class RudeQuestions {
	public static void main (String[] args) {
		String name, answer;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello. What is your name?");
		name = keyboard.next();
		
		System.out.print("Hi, " + name + "! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("So you're " + age + ", eh? That's not very old?");
		System.out.print("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.println(weight + "! Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();
		
		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");
		
		System.out.println("What do you think of my manners?");
		answer = keyboard.next();
		System.out.println("I'm sorry to hear that. So you really think I'm " + answer + "?");
		System.out.println("Nice to meet you too!");
		
		/* #1. Program doesn't blow up when I enter an integer if it is expecting a 
		double. It just stores my integer as a double*/
		/* #2. Program does NOT blow up when I enter a number instead of a string.
		Just stores the number as a string */
		/* #3. When the program is expecting a string, I could get it to blow up by 
		entering a formula 47+67. Any number is easy to blow up by entering one letter
		or a string of letters. The age will fail if I enter a fraction.  The numbers 
		also appear to blow up if I enter a formula or just a mathematical symbol.*/
	}
}