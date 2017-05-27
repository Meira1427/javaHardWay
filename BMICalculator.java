import java.util.Scanner;

// feet, inches, and pounds version

public class BMICalculator {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, feet, inch, lbs;
		
		System.out.print("Your height (feet only): ");
		feet = keyboard.nextDouble();
		
		System.out.print("Your height (inches): ");
		inch = keyboard.nextDouble();
		
		System.out.print("Your weight in pounds: ");
		lbs = keyboard.nextDouble();
		
		inch = inch + (12*feet);
		
		m = inch*.0254;
		kg = lbs*.453592;
		
		bmi = kg / (m*m);
		
		System.out.println("Your BMI is " + bmi);
		
	}
}