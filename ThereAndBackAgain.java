public class ThereAndBackAgain {
	public static void main(String[] args) {
		System.out.println("Here.");
		erebor();
		System.out.println("Back first time.");
		/* #2. code will skip the next "There", so Back first time and Back second time will be 
		printed one right after the other.
		*/
		//erebor();
		System.out.println("Back second time.");
	}
	
	public static void erebor() {
		System.out.println("There.");
	}
}