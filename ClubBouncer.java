public class ClubBouncer {
	public static void main(String[] args) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";
		
		// #1. Break up the if. . . else with a random print statement
		// this will not compile
		
		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ){
			System.out.println("You are allowed to enter the club.");
			}
		System.out.println("Study Drill #1 Testing if/else break");
		else {
			System.out.println("You are not allowed to enter the club.");
		}
		
		
	}
}