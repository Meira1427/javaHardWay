import java.util.Scanner;

class Card {
	int value;
	String suit;
	String name;
	
	public String toString() {
		return name + " of " + suit;
	}
}
/*
In this game, I have the dealer trying to beat user's hand unless it is a tie or user busted.
When you say "yes" to play again, the deck is shuffled with all 52 cards and the hands are reset to null
A flaw in this game is that the Ace is always 11. Will need to modify in future to make Ace an optional 1
*/

public class BlackJack {
	public static void main(String[] args) {
		String playing = "yes";
		Card[] deck = buildDeck();
		Card[] userHand = new Card[10];
		Card[] houseHand = new Card[10];
		
		while (playing.equals("yes")) {
			shuffleDeck(deck);
			
			//all ten cards are set to null
			initializeHand(userHand);
			initializeHand(houseHand);
			
			// initiazing within the loop
			int userHandCount = 0;
			int houseHandCount = 0;
			int cardsDrawn = 0;
			int userTotal = 0;
			int houseTotal = 0;
			String userChoice;
			boolean userBusted = false;
			boolean houseBusted = false;
			
			//deal to user first; then house; then user; then house
			userHand[userHandCount] = deck[cardsDrawn];
			cardsDrawn++;
			userHandCount++;
			
			houseHand[houseHandCount] = deck[cardsDrawn];
			cardsDrawn++;
			houseHandCount++;
			
			userHand[userHandCount] = deck[cardsDrawn];
			cardsDrawn++;
			userHandCount++;
			
			houseHand[houseHandCount] = deck[cardsDrawn];
			cardsDrawn++;
			houseHandCount++;
			
			//Display user hand, but not dealer before prompting for hit
			System.out.print("User drew a ");
			displayHand(userHand, userHandCount);
			System.out.println("\nWorth a total of " + getTotal(userHand, userHandCount) + " points");
			
			userChoice = getUserResponse("Would you like to hit or stay? (hit/stay): ");
			while (userChoice.equals("hit")) {
				userHand[userHandCount] = deck[cardsDrawn];
				System.out.print("\nUser drew a " );
				System.out.println(userHand[userHandCount].name + " of " + userHand[userHandCount].suit);
				cardsDrawn++;
				userHandCount++;
				System.out.println("New Total is " + getTotal(userHand, userHandCount) + " points");
				if (getTotal(userHand, userHandCount) > 21) {
					userBusted = true;
					break;
				}
				else {
					userChoice = getUserResponse("Would you like to hit or stay? (hit/stay): ");
				}
			}

			while (!userBusted && !houseBusted && getTotal(userHand, userHandCount)>getTotal(houseHand, houseHandCount)) {
				houseHand[houseHandCount] = deck[cardsDrawn];
				cardsDrawn++;
				houseHandCount++;
				if (getTotal(houseHand, houseHandCount) > 21) {
					houseBusted = true;
				}
			}
	
			System.out.print("\nHouse drew a ");
			displayHand(houseHand, houseHandCount);
			System.out.println("\nWorth a total of " + getTotal(houseHand, houseHandCount) + " points");
			
			if (userBusted) {
				System.out.println("\nUser Busted! Dealer Wins");
			}
			else if (houseBusted) {
				System.out.println("\nDealer Busted! User wins!");
			}
			else if (getTotal(userHand, userHandCount)>getTotal(houseHand, houseHandCount)) {
				System.out.println("\nUser wins!");
			}
			else if (getTotal(userHand, userHandCount)==getTotal(houseHand, houseHandCount)) {
				System.out.println("\nUser ties with dealer!");
			}
			else {
				System.out.println("\nDealer Wins");
			}
	
			playing = stillPlaying("\nWould you like to play again? (yes/no): ");
		}
	}
	
	public static Card[] buildDeck() {
		String[] suits = {"clubs", "diamonds", "hearts", "spades"};
		String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six",
			"seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};
			
		int i = 0;
		Card[] deck = new Card[52];
		
		for(String s: suits) {
			for (int v=2; v <=14; v++) {
				Card c = new Card();
				c.suit = s;
				c.name = names[v];
				if (v == 14)
					c.value = 11;
				else if (v > 10)
					c.value = 10;
				else
					c.value = v;
					
				deck[i] = c;
				i++;
			}
		}
		return deck;
	}
	
	public static void initializeHand (Card[] hand) {
		for(int i=0; i<10; i++) {
			hand[i] = null;
		}
	}
	
	public static void displayHand(Card[] hand, int size) {
		for(int i=0; i<size; i++) {
			System.out.print(hand[i] + ", ");
			if (i==(size-2)) {
				System.out.print("and a ");
			}
		}
	}
	
	public static int getTotal(Card[] hand, int size) {
		int total = 0;
		for(int i=0; i<size; i++) {
			total += hand[i].value;
		}
		return total;
	}
	
	public static void shuffleDeck(Card[] deck) {
		Card hold1, hold2;
		int slot1, slot2;
		for(int i=0; i<1000; i++) {
			slot1 = (int)(Math.random()*deck.length);
			slot2 = (int)(Math.random()*deck.length);
			hold1 = deck[slot1];
			hold2 = deck[slot2];
			deck[slot1] = hold2;
			deck[slot2] = hold1;
		}
	}
	
	public static String getUserResponse(String prompt) {
		Scanner keyboard = new Scanner(System.in);
		String answer = "error";
		while(!(answer.equals("hit") || answer.equals("stay")) ) {
			System.out.print(prompt);
			answer = keyboard.next().toLowerCase();
		}
		return answer;
	}
	
	public static String stillPlaying(String prompt) {
		Scanner keyboard = new Scanner(System.in);
		String answer = "error";
		while(!(answer.equals("yes") || answer.equals("no")) ) {
			System.out.print(prompt);
			answer = keyboard.next().toLowerCase();
		}
		return answer;
	}
}