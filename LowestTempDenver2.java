import java.util.Scanner;
import java.io.File;

/* 
Exercise 52, Study Drill #2
Modifying to be more efficient. Bringing code back into main, so I only pass through the
file one time and fill four arrays during that pass.
Using a file where Jan and Feb 1995 numbers were corrupted, so starting with March of 1995
Also deleting all other instances of a temperature of -99. So a few dates are missing over time
Presume this data is some kind of daily average, since the highest never goes above 88, and
I've personally experienced 100-degree days in Denver
Has 8142 data entries in it, including Month Day and Year. Going to attempt to do something
useful with extra data, since I don't want to clean up a 8000+-line file.
*/

public class LowestTempDenver2 {
	public static void main(String[] args) throws Exception {
		Scanner fileIn = new Scanner(new File("DenverTemps.txt"));
		int count = fileIn.nextInt();
	
		int[] monthTemp = new int[count];
		int[] dayTemp = new int[count];
		int[] yearTemp = new int[count];
		double[] temps = new double[count];
		
		System.out.println("\n" + temps.length + " temperatures in database.");
		
		for (int i=0; i<temps.length; i++) {
			monthTemp[i] = fileIn.nextInt();
			dayTemp[i] = fileIn.nextInt();
			yearTemp[i] = fileIn.nextInt();
			temps[i] = fileIn.nextDouble();
		}
		fileIn.close();
		
		double lowest = 9999.99;
		double highest = 0;
		int lowMonth=0, lowDay=0, lowYear=0, highMonth=0, highDay=0, highYear=0;
		
		for (int i=0; i<temps.length; i++) {
			if (temps[i] < lowest) {
				lowest = temps[i];
				lowMonth = monthTemp[i];
				lowDay = dayTemp[i];
				lowYear = yearTemp[i];
			}
			if (temps[i] > highest) {
				highest = temps[i];
				highMonth = monthTemp[i];
				highDay = dayTemp[i];
				highYear = yearTemp[i];
			}
		}
		System.out.print("\nThe lowest average daily temperature was ");
		System.out.println(lowest + "F (" + fToC(lowest) + "C)");
		System.out.println("This happened on " + lowMonth + "-" + lowDay + "-" + lowYear);
		System.out.print("\nThe highest average daily temperature was ");
		System.out.println(highest + "F (" + fToC(highest) + "C)");
		System.out.println("This happened on " + highMonth + "-" + highDay + "-" + highYear);
		System.out.println();
	}
	
	public static double fToC(double f) {
		double temp = (f-32)*5/9;
		temp = Math.floor(temp*10)/10;
		return temp;
	}
}