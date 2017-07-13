public class ArrayIntro {
	public static void main(String[] args) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars",
							 "Jupiter", "Saturn", "Uranus", "Neptune" };
		String[] countries = { "Ireland", "England", "France", "Germany", "Netherlands" };
		
		for (int i=0; i<planets.length; i++) {
			System.out.println("At index " + i + " we have " + planets[i]);
		}
		
		for (String c : countries ) {
			System.out.print(c + "\t");
		}
		
		System.out.println("");
	}
}