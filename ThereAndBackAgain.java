public class ThereAndBackAgain {
	public static void main(String[] args) {
		System.out.println("Here.");
		// #1. Removing parenthesis give this error "not a statement"
		erebor;
		System.out.println("Back first time.");
		erebor();
		System.out.println("Back second time.");
	}
	
	public static void erebor() {
		System.out.println("There.");
	}
}