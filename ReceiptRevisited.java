import java.io.PrintWriter;
import java.util.Scanner;

/********************************************************************
Had fun revisiting the Receipt and troubleshooting rounding and gaps
*********************************************************************/

public class ReceiptRevisited {
	public static void main(String[] args) throws Exception {
		PrintWriter fileout = new PrintWriter("receipt.txt");
		double gallons, total;
		double price = 2.459;
		int lengthG, lengthT;
		String gapG, gapT;
		
		System.out.println("Welcome to the Corner Store. Our gas costs " + price + " per gallon.");
		System.out.print("How many gallons did you buy?");
		gallons = getCleanDouble();
		gallons = reasonableGallons(gallons);
		total = price*gallons;
		total = (Math.floor(total*100.0)/100.0);
		gallons = (Math.floor(gallons*100.0)/100.0);
		
		lengthG = String.valueOf(gallons).length();
		lengthT = String.valueOf(total).length();
		
		/*
		If the gallons number is less than 5 characters long, it needs spaces in gap
		If the total is less than 6 characters, it needs spaces in the gap
		*/
		gapG = mindTheGap(5, lengthG);
		gapT = mindTheGap(6, lengthT);
	
		fileout.println("+---------------------------+");
		fileout.println("|                           |");
		fileout.println("|       CORNER STORE        |");
		fileout.println("|                           |");
		fileout.println("|   2017-06-02   09:32PM    |");
		fileout.println("|                           |");
		fileout.println("|  Gallons:          " + gapG + gallons + "  |");
		fileout.println("|  Price/gallon:    $2.459  |");
		fileout.println("|                           |");
		fileout.println("|  Fuel total:      " + gapT + total + "  |");
		fileout.println("|                           |");
		fileout.println("+---------------------------+");
		fileout.close();

	}
	
	/**
	 * Returns a double, input from user
	 *
	 * @author 	Meira Pentermann
	 * @return	input from user, type double
	 *
	 */
	public static double getCleanDouble() {
		Scanner keyboard = new Scanner(System.in);
		while (!keyboard.hasNextDouble()) {
			System.out.print("Enter the number of gallons please: ");
			keyboard.next();
		}
		return keyboard.nextDouble();
	}
	
	/**
	 * Returns a double, number between 0 and 100
	 *
	 * @author 	Meira Pentermann
	 * @return	input from user, type double, a believable number of gallons
	 *
	 */
	public static double reasonableGallons(double num) {
		while ((num < 0) || (num > 100)) {
			System.out.print("Enter a number between 0 and 100: ");
			num = getCleanDouble();
			}
			return num;
	}
	
	/**
	 * Returns a string or empty string to manage gap in receipt
	 *
	 * @author	Meira Pentermann
	 * @return	a string of empty spaces in the quantity (numspaces minus length); may be empty string
	 */
	public static String mindTheGap(int numspaces, int length){
		String s = "";
		int count = numspaces-length;
		while (count > 0) {
			s += " ";
			count -= 1;
		}
		return s;
	}

}