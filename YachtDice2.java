/* 
Yacht Dice 2 prints the dice horizontally
*/

public class YachtDice2 {
	public static void main(String[] args) {
		int r1, r2, r3, r4, r5, r6;
		boolean allSame;
		
		do {
			r1 = 1 + (int)(Math.random()*6);
			r2 = 1 + (int)(Math.random()*6);
			r3 = 1 + (int)(Math.random()*6);
			r4 = 1 + (int)(Math.random()*6);
			r5 = 1 + (int)(Math.random()*6);
			System.out.print("\nYou rolled: " + r1 + " " + r2 + " ");
			System.out.println(r3 + " " + r4 + " " + r5);
			showDice(r1, r2, r3, r4, r5);
			allSame = ( (r1==r2) && (r2==r3) && (r3==r4) && (r4==r5) );
		
		
		} while (!allSame);
		System.out.println("The Yacht!!");
	}
	
	public static void showDice(int d1, int d2, int d3, int d4, int d5) {
		//use arrays instead of printing the dice one at a time
		String[]    DiceTop = {"|       |", "| o     |", "| o     |", "| o   o |", "| o   o |", "| o   o |"};
		String[] DiceMiddle = {"|   o   |", "|       |", "|   o   |", "|       |", "|   o   |", "| o   o |"};
		String[] DiceBottom = {"|       |", "|     o |", "|     o |", "| o   o |", "| o   o |", "| o   o |"};
		
		System.out.print("+-------+\t+-------+\t+-------+\t+-------+\t+-------+");
		System.out.print("\n" + DiceTop[d1-1] + "\t" + DiceTop[d2-1] + "\t");
		System.out.print(DiceTop[d3-1] + "\t" + DiceTop[d4-1] + "\t" + DiceTop[d5-1]);
		System.out.print("\n" + DiceMiddle[d1-1] + "\t" + DiceMiddle[d2-1] + "\t");
		System.out.print(DiceMiddle[d3-1] + "\t" + DiceMiddle[d4-1] + "\t" + DiceMiddle[d5-1]);
		System.out.print("\n" + DiceBottom[d1-1] + "\t" + DiceBottom[d2-1] + "\t");
		System.out.print(DiceBottom[d3-1] + "\t" + DiceBottom[d4-1] + "\t" + DiceBottom[d5-1]);
		System.out.println("\n+-------+\t+-------+\t+-------+\t+-------+\t+-------+\t");
	}
}