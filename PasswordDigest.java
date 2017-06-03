import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String pw, hash;
		
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
		System.out.print("Password: ");
		pw = keyboard.nextLine();
		
		digest.update( pw.getBytes("UTF-8") );
		hash = DatatypeConverter.printHexBinary(digest.digest());
		
		System.out.println(hash);
	
	/**********************************************************
	Study Drill #2
	
	If I remove "throws Exception" from line 6
	
	PasswordDigest.java:10: error: unreported exception NoSuchAlgorithmException; must be 
	caught or declared to be thrown MessageDigest digest = MessageDigest.getInstance("SHA-256");
		                                                ^
	PasswordDigest.java:15: error: unreported exception UnsupportedEncodingException; 
	must be caught or declared to be thrown digest.update( pw.getBytes("UTF-8") );
		                          ^
	2 errors
	
	***********************************************************/
	}
}