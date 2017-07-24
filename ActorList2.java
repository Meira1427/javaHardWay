import java.util.Scanner;

class Actor {
	String name;
	String role;
	String birthdate;
}

class ActorList2 {
	public static void main(String[] args) throws Exception {
		String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
		Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
		/*
		I'm going to try putting the actors in an array instead. I wouldn't know how
		many actors should be in the array until later, but since I know it is 4, I'm
		going to use this information, just to see if this works.
		*/
		Actor[] myActors = new Actor[4];
		
		for (int i = 0; i<myActors.length; i++) {
			myActors[i] = getActor(inFile);
		}
		inFile.close();
		
		for (int i = 0; i<myActors.length; i++) {
			System.out.println(myActors[i].name + ", " + myActors[i].role + ", " + myActors[i].birthdate);
		}
		
	}
	
	public static Actor getActor(Scanner input) {
		Actor a = new Actor();
		a.name = input.nextLine();
		a.role = input.nextLine();
		a.birthdate = input.nextLine();
		
		return a;
	}
}	