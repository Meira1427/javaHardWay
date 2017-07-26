import java.util.Scanner;
import java.io.File;

class TemperatureSample {
	int month, day, year;
	double temperature;
}

public class TemperaturesByDate2 {
	public static void main(String[] args) throws Exception {
		Scanner fileIn = new Scanner(new File("DenverTempsAll.txt"));
		
		TemperatureSample[] tempDB = new TemperatureSample[10000];
		
		int numRecords, i = 0;
		
		while (fileIn.hasNextInt() && i < tempDB.length) {
			TemperatureSample e = new TemperatureSample();
			e.month = fileIn.nextInt();
			e.day	= fileIn.nextInt();
			e.year	= fileIn.nextInt();
			e.temperature = fileIn.nextDouble();
			if (e.temperature != -99) {
				tempDB[i] = e;
				i++;
			}
		}
		fileIn.close();
		numRecords = i;
		
		System.out.println(numRecords + " daily temperatures loaded.");
		
		double total = 0, avg;
		int count = 0;
		for (i=0; i<numRecords; i++) {
			if (tempDB[i].month == 11) {
				total += tempDB[i].temperature;
				count++;
			}
		}
		
		avg = total/count;
		avg = roundToOneDecimal(avg);
		System.out.print("Average daily temperature over " + count);
		System.out.println(" days in November: " + avg);

	}
	
	public static double roundToOneDecimal(double d) {
		return Math.round(d*10)/10.0;
	}
}