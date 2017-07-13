import java.util.Scanner;

public class CaesarCipher {
	/**
	 * Coding or Translating a Caesar Cipher
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String newtext = "";
		String cipher = "";
		String toDecode = "";
		String decoded = "";
		String userOption = "";
		int shift;
		
		userOption = getUserOption();
		
		if (userOption.equals("E")) {
			System.out.print("Message to Encrypt: ");
			newtext = keyboard.nextLine();
		
			shift = getProperShift(30);
		
			for (int i=0; i<newtext.length(); i++) {
				cipher += shiftLetter(newtext.charAt(i), shift);
			}
	
			System.out.println(cipher);
			
		}
		/* getUserChoice will only return an "E" or a "D". Choice was
		   decrypt "D" if program reaches this else clause */
		else {
			System.out.print("Message to Decrypt: ");
			toDecode = keyboard.nextLine();
		
			shift = getProperShift(30);
			System.out.println(shift);
			shift = 26-shift;
			
			for (int i=0; i<toDecode.length(); i++) {
				decoded += shiftLetter(toDecode.charAt(i), shift);
			}
	
			System.out.println(decoded);
		}
	
	}	
	
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
	
	public static String getUserOption() {
		Scanner scanner = new Scanner(System.in);
		String temp = "x";
		while(!(temp.equals("E") || temp.equals("D"))) {
			System.out.print("Do you wish to encrypt or decrypt a message? (E or D) ");
			temp = scanner.next().toUpperCase();
		}
		return temp;
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