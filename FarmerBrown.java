public class FarmerBrown {
	public static void main(String[] args) {
		/*
		Sheep are $10 each, so we don't have to go any further than 9 attempts,
		since we need one each of the other animals.
		We have to have at least one sheep and one chicken, so we can have a maximum of 25 goats
		This is 100-10.00-0.50 = 89.50 divided by 3.50.
		We can have a maximum of 98 chickens because we need at least one of each other
		type of animals and our total number of animals cannot exceed 100.
		Adding print statement to see all the work the computer is doing
		*/
		for ( int s=1; s<=9; s++) {
			for ( int g=1; g<=25; g++) {
				for ( int c=1; c<=98; c++) {
					//System.out.println("Testing for sheep = " + s + " goats = " + g + " and chickens = " + c);
					if( (s+g+c==100) && ((10.00*s)+(3.5*g)+(0.50*c)==100) ) {
						System.out.print(s + " sheep, ");
						System.out.print(g + " goats, and ");
						System.out.println(c + " chickens.");
					}
				}
			}
		}
	}
}