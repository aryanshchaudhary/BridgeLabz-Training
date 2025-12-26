package level_3;
import java.util.*;
public class DeckofCards {
	static String[] initializeDeck(String[] suits, String[] ranks) {
		int n = suits.length * ranks.length;
		String[] deck = new String[n];
		int index = 0;
		for (String suit : suits) {
			for (String rank : ranks) {
				deck[index++] = rank + " of " + suit;
			}
		}
		return deck;
	}
	static void shuffleDeck(String[] deck) {
		int n = deck.length;
		for (int i = 0; i < n; i++) {
			int random = i + (int) (Math.random() * (n - i));
			String temp = deck[i];
			deck[i] = deck[random];
			deck[random] = temp;
		}
	}
	static String[][] distributeCards(String[] deck, int players, int cards) {
		if (players * cards > deck.length) {
			return null;
		}

		String[][] result = new String[players][cards];
		int index = 0;

		for (int i = 0; i < players; i++) {
			for (int j = 0; j < cards; j++) {
				result[i][j] = deck[index++];
			}
		}
		return result;
	}
	static void printPlayers(String[][] players) {
		for (int i = 0; i < players.length; i++) {
			System.out.println("\nPlayer " + (i + 1) + ":");
			for (int j = 0; j < players[i].length; j++) {
				System.out.println("  " + players[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] deck = initializeDeck(suits, ranks);
		shuffleDeck(deck);
		System.out.print("Enter number of players: ");
		int players = sc.nextInt();
		System.out.print("Enter number of cards per player: ");
		int cards = sc.nextInt();
		String[][] distributed = distributeCards(deck, players, cards);
		if (distributed == null) {
			System.out.println("Cannot distribute cards. Not enough cards.");
		} else {
			printPlayers(distributed);
		}
		sc.close();
	}
}
