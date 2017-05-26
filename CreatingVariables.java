public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age, year;
		double seconds, e, checking, savings;
		String firstName, lastName, title, street, city;
		
		x = 10;
		y = 400;
		age = 39;
		year = 2017;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 3981.11;
		
		firstName = "Meira";
		lastName = "Pentermann";
		title = "Mrs.";
		street = "Geddes Cir";
		city = "Centennial";
		
		System.out.println("The variable x contains " + x );
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favorite irrational # is Euler's number: " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("Sue has " + savings + " in her savings account.");
		System.out.println("My neighbor is " + age + " years old.");
		System.out.println("My name's " + title + " " + firstName + " " + lastName + " and I live on " + street + " in " + city + ".");
		System.out.println("I took coding classes in " + year);
	}
}