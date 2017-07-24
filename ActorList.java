import java.util.Scanner;

class Actor {
	String name;
	String role;
	String birthdate;
}

class ActorList {
	public static void main(String[] args) throws Exception {
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
		// If you'd rather have file on your computer, use this:
		// Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
		int count = 0;
		
		while (inFile.hasNext()) {
			Actor a = getActor(inFile);
			System.out.print(a.name + " was born on " + a.birthdate);
			System.out.println(" and play " + a.role);
			count++;
		}
		inFile.close();
		System.out.println("\nThere were " + count + " records in the file.");
	}
	
	public static Actor getActor(Scanner input) {
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();
		
		return a;
	}
}	