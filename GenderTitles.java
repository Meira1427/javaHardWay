import java.util.Scanner;

public class GenderTitles {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title = "title";
		
		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F): ");
		String gender = keyboard.next();
		System.out.print("Age: ");
		//add error checking for the nextInt
		while(!keyboard.hasNextInt()){
			System.out.print("Enter a number please. Your age: ");
			keyboard.next();
		}
		int age = keyboard.nextInt();
		
		if (age < 20) {
			title = first;
		}
		//add options for lower case responses
		else {
			if (gender.equals("F") || gender.equals("f")) {
				System.out.print("Are you married, " + first + "? (Y/N): ");
				String married = keyboard.next();
				if(married.equals("Y") || married.equals("y")) {
					title = "Mrs. ";
				}
				else{
					title = "Ms. ";
				}
			}
			
			if (gender.equals("M") || gender.equals("m")){
				title = "Mr. ";
			}
		}
	
		System.out.println("\n" + title + " " + last);
	}
}