import java.util.Scanner;
import java.io.File;

/* 
Exercise 52, Study Drill #2
Using a file where Jan and Feb 1995 numbers were corrupted, so starting with March of 1995
Also deleting all other instances of a temperature of -99. So a few dates are missing over time
Presume this data is some kind of daily average, since the highest never goes above 88, and
I've personally experienced 100-degree days in Denver
Has 8142 data entries in it, including Month Day and Year. Going to attempt to do something
useful with extra data, since I don't want to clean up a 8000+-line file.
*/

public class LowestTempDenver {
	public static void main(String[] args) throws Exception {
		int[] monthTemp = IntArrayFromFile("DenverTemps.txt", 1);
		int[] dayTemp = IntArrayFromFile("DenverTemps.txt", 2);
		int[] yearTemp = IntArrayFromFile("DenverTemps.txt", 3);
		double[] temps = arrayFromFile("DenverTemps.txt");
		
		System.out.println(temps.length + " temperatures in database.");
		
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
		
		System.out.print("The lowest average daily temperature was ");
		System.out.println(lowest + "F (" + fToC(lowest) + "C)");
		System.out.println("This happened on " + lowMonth + "-" + lowDay + "-" + lowYear);
		System.out.print("The highest average daily temperature was ");
		System.out.println(highest + "F (" + fToC(highest) + "C)");
		System.out.println("This happened on " + highMonth + "-" + highDay + "-" + highYear);
	}
	
	public static double[] arrayFromFile(String fileName) throws Exception {
		Scanner fileIn = new Scanner(new File(fileName));
		int count = fileIn.nextInt();
		int temp = 0;
		
		double[] dubs = new double[count];
		
		for (int i=0; i<dubs.length; i++) {
			temp = fileIn.nextInt();
			temp = fileIn.nextInt();
			temp = fileIn.nextInt();
			dubs[i] = fileIn.nextDouble();
		}
		fileIn.close();
		return dubs;
	}
	
	/*
	This is not a very efficient way to do this. I should modify so that the program walks
	through the file once and creates all four arrays, but this is my first attempt to 
	use the file to pull all the data
	*/
	
	public static int[] IntArrayFromFile(String fileName, int num) throws Exception {
		Scanner fileIn = new Scanner(new File(fileName));
		int count = fileIn.nextInt();
		double toss;
		
		int[] myInts = new int[count];
		
		for (int i=0; i<myInts.length; i++) {
			if (num == 1) {
				myInts[i] = fileIn.nextInt();
				toss = fileIn.nextDouble();
				toss = fileIn.nextDouble();
				toss = fileIn.nextDouble();
			}
			else if (num == 2) {
				toss = fileIn.nextDouble();
				myInts[i] = fileIn.nextInt();
				toss = fileIn.nextDouble();
				toss = fileIn.nextDouble();
			}
			else if (num == 3) {
				toss = fileIn.nextDouble();
				toss = fileIn.nextDouble();
				myInts[i] = fileIn.nextInt();
				toss = fileIn.nextDouble();
			}
		}
		fileIn.close();
		return myInts;
	}
	
	public static double fToC(double f) {
		double temp = (f-32)*5/9;
		temp = Math.floor(temp*10)/10;
		return temp;
	}
}