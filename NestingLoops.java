public class NestingLoops {
	public static void main(String[] args) {
		// this is #1 - I'll call it "CN"
		/* ********************************************************************
		  Study Drill 1 - The inner loop changes it's variable faster A1 A2 A3
		  Study Drill 2 - switching "c" and "n" loop - Call this "NC"
		                    inner loop faster, now A1 B1 C1 D1 E1 
		   ********************************************************************/
		                    
		for (int n=1; n <=3; n++) {
			for (char c='A'; c<= 'E'; c++) {
				System.out.println(c + " " + n);
			}
		}
		
		System.out.println("\n");
		
		// this is #2 - I'll call it "AB"
		/* **********************************************************************
		   Study Drill 3 - change to println and then back to plain print
		   **********************************************************************/
	
		for (int a=1; a <= 3; a++) {
			for (int b=1; b <=3; b++) {
				System.out.println("(" + a + "," + b + ") ");
			}
			//code to add
		}
		
		System.out.println("\n");
		
	}
	
}