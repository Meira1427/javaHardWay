import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class CaesarCipherFromFile {
	/**
	 * Returns the character shifted by the given number of letters.
	 * Study Drill #1, Read info from file instead of asking user.
	 */
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		String plaintext = "";
		String cipher = "";
		String fname = "message-and-shift.txt";
		int shift = 0;
		
		Scanner readFile = new Scanner(new File(fname));
		plaintext = readFile.nextLine();
		shift = readFile.nextInt();
		readFile.close();
		
		for (int i=0; i<plaintext.length(); i++) {
			cipher += shiftLetter(plaintext.charAt(i), shift);
		}
		
		PrintWriter fileout = new PrintWriter("my-cypher.txt");
	
		fileout.println("The secret message is: " + cipher);
		fileout.close();
		
		System.out.println("Secret message printed to secret file!");
	
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
	
}