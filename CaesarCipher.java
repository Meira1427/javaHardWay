import java.util.Scanner;

public class CaesarCipher {
	/**
	 * Returns the character shifted by the given number of letters.
	 */
	public static char shiftLetter(char c, int n) {
		int u = c;
		
		if (!Character.isLetter(c) )
			return c;
			
		u = u + n;
		if (Character.isUpperCase(c) && (u > 'Z')
		  || Character.isLowerCase(c) && (u > 'z') ) {
		  	u -=26;
		}
		if (Character.isUpperCase(c) && (u < 'A')
		  || Character.isLowerCase(c) && (u < 'a') ) {
		  	u += 26;
		}
		return (char)u;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String plaintext, cipher = "";
		int shift;
		
		System.out.print("Message: ");
		plaintext = keyboard.nextLine();
		
		shift = getProperShift(30);
		
		for (int i=0; i<plaintext.length(); i++) {
			cipher += shiftLetter(plaintext.charAt(i), shift);
		}
	
		System.out.println(cipher);
	
	}	
	
	public static int getProperShift(int num) {
		while ( (num < 0) || (num > 26) ) {
			num = getCleanInt();	
		}
	
		return num;
	}
	
	public static int getCleanInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Shift (0-26): ");
		while(!scanner.hasNextInt()){
			System.out.print("Enter a Number Please (0-26): ");
			scanner.next();
		}
		return scanner.nextInt();
	}
	
}