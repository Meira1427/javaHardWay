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
		
		double totalNov = 0;
		double totalFeb = 0;
		double avgNov = 0;
		double highFeb = 0;
		double highTemp = 0;
		int countNov = 0;
		int countFeb = 0;
		for (i=0; i<numRecords; i++) {
			if (tempDB[i].temperature > highTemp) {
				highTemp = tempDB[i].temperature;
			}
			if (tempDB[i].month == 11) {
				totalNov += tempDB[i].temperature;
				countNov++;
			}
			if (tempDB[i].month == 2) {
				if (tempDB[i].temperature > highFeb) {
					highFeb = tempDB[i].temperature;
				}
				countFeb++;
			}
		}
		/*
		Study Drill #3
		Attempt to print out a full record of TemperatureSample class
		Appears to just print out a pointer of where to find the data
		This is what gets printed for three below:
		TemperatureSample@2503dbd3
		TemperatureSample@4b67cf4d
		TemperatureSample@7ea987ac
		*/
		TemperatureSample ts0 = tempDB[0];
		TemperatureSample ts233 = tempDB[233];
		TemperatureSample ts6000 = tempDB[6000];
		
		avgNov = totalNov/countNov;
		avgNov = roundToOneDecimal(avgNov);
		System.out.print("\nAverage daily temperature over " + countNov);
		System.out.println(" days in November: " + avgNov);
		System.out.print("\nHighest daily average temperature over " + countFeb);
		System.out.println(" days in February: " + highFeb);
		System.out.print("\nHighest daily avg temp over period from ");
		System.out.print(tempDB[0].month + "-" + tempDB[0].day + "-" + tempDB[0].year + " to ");
		System.out.print(tempDB[numRecords-1].month + "-" + tempDB[numRecords-1].day + "-"); 
		System.out.println(tempDB[numRecords-1].year + " was " + highTemp);
		System.out.println("\n");
		System.out.println(ts0);
		System.out.println(ts233);
		System.out.println(ts6000);
	}
	
	public static double roundToOneDecimal(double d) {
		return Math.round(d*10)/10.0;
	}
}