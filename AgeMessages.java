import java.util.Scanner;

public class AgeMessages {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;
		
		System.out.print( "How old are you?" ); 
		age = keyboard.nextInt();
		
		System.out.println("You are: ");
		if (age < 13) {
			System.out.println("\ttoo young to create Facebook account");
		}
		if (age < 16) {
			System.out.println("\ttoo young to get a driver's license");
		}
		if (age < 18) {
			System.out.println("\ttoo young to get a tattoo");
		}
		if (age < 21) {
			System.out.println("\ttoo young to drink alcohol");
		}
		if (age < 35) {
			System.out.println("\ttoo young to run for President of the U.S.");
			System.out.println("\t\t(How sad!)");
		}
		if (age >= 65) {
			System.out.println("\told enough to retire!");
		}
		/* #1. If I type an age greater than or equal to 35, the only thing that gets
		printed is "You are: " because all other conditions evaluate to false */
		/* #2. Adding check for greater than or equal to 65*/
	}
}