import java.util.Scanner;

public class ItemNotFound {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] heroes = {
			"Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon", "Bellerophon",
			"Castor", "Chrysippus", "Daedalus", "Diomedes", "Eleusis", "Eunostus",
			"Ganymede", "Hector", "Iolaus", "Jason", "Meleager", "Odysseus", 
			"Orpheus", "Perseus", "Theseus" };
		String guess;
		// Study Drill # 1: Change it to a count instead of a boolean
		int count = 0;
		
		System.out.println("Pop Quiz!");
		System.out.print("Name any *mortal* hero from Greek mythology: ");
		guess = keyboard.next();
		
		for (String hero : heroes) {
			if (guess.equals(hero)) {
				System.out.println("That's one of them!");
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}	
}