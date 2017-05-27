import java.util.Scanner;

// inches and pounds version

public class BMICalculator {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inch, lbs;
		
		System.out.print("Your height in inches: ");
		inch = keyboard.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		
		m = inch*.0254;
		kg = lbs*.453592;
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi);
		
	}
}