public class ArrayIntro {
	public static void main(String[] args) {
		String[] planets = { "Mercury", "Venus", "Earth", "Mars",
							 "Jupiter", "Saturn", "Uranus", "Neptune" };
		String[] countries = { "Ireland", "England", "France", "Germany", "Netherlands" };
		
		for (String p : planets ) {
			System.out.println(p + "\t" + p.toUpperCase());
		}
		
		for (String c : countries ) {
			System.out.print(c + "\t");
		}
		
		System.out.println("");
	}
}