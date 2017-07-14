import java.util.Scanner;

public class ItemNotFound {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] heroes = {
			"Abderus", "Achilles",  "Hector", "Aeneas", "Ajax", "Amphitryon", "Bellerophon",
			"Castor", "Chrysippus", "Daedalus", "Diomedes", "Eleusis", "Eunostus",
			"Ganymede", "Hector", "Iolaus", "Jason", "Meleager", "Odysseus", 
			"Orpheus", "Perseus", "Theseus", "Hector" };
		String guess;
		// Study Drill # 1: Change it to a count instead of a boolean
		// Print number of matches outside of for loop
		int count = 0;
		
		System.out.println("Pop Quiz!");
		System.out.print("Name any *mortal* hero from Greek mythology: ");
		guess = keyboard.next();
		
		for (String hero : heroes) {
			if (guess.equals(hero)) {
				count++;
			}
		}
		
		if (count > 0) {
			System.out.println("Found " + count + " match(es)");
		}
		else {
			System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
		}
	}	
}