package scenario_based;
import java.util.*;
public class SnakeLadder {
    static final int No_Play = 0;
    static final int Ladder  = 1;
    static final int Snake   = 2;

    // UseCase1
    static int startPlayer() {
        return 0;
    }

    // UseCase2
    static int diceRoll() {
        return (int)(Math.random() * 6) + 1;
    }

    // UseCase3
    static int checkOption() {
        return (int)(Math.random() * 3);
    }

    // UseCase4
    static int useCase4(int position) {
        if (position < 0)
            return 0;
        return position;
    }

    // Use Case5
    static int useCase5(int position, int previousPosition) {
        if (position > 100)
            return previousPosition;
        return position;
    }

    // Movement
    static int Moves(int position, int dice, int option) {
        int previousPosition = position;
        if (option == Ladder)
            position += dice;
        else if (option == Snake)
            position -= dice;
        position = useCase4(position);
        position = useCase5(position, previousPosition);
        return position;
    }

    // Use Case6
    static void report(int player, int dice, int position) {
        System.out.println(
            "Player " + player +
            " rolled " + dice +
            " → Position: " + position
        );
    }

    // for single player
    static void singlePlayerGame() {
        int player = startPlayer();
        int diceCount = 0;
        System.out.println("Single Player Game Started");
        while (player < 100) {
            int dice = diceRoll();
            int option = checkOption();
            diceCount++;

            player = Moves(player, dice, option);
            report(1, dice, player);
        }
        System.out.println("Player WON!");
        System.out.println("Total Dice Rolls: " + diceCount);
    }

    // Use Case7 (for two players)
    static void twoPlayerGame() {
        int player1 = startPlayer();
        int player2 = startPlayer();
        int diceCountP1 = 0;
        int diceCountP2 = 0;
        int turn = 1;
        System.out.println("\nTwo Player Game Started\n");
        while (player1 < 100 && player2 < 100) {
            int dice = diceRoll();
            int option = checkOption();
            if (turn == 1) {
                diceCountP1++;
                player1 = Moves(player1, dice, option);
                report(1, dice, player1);

                if (option != Ladder)
                    turn = 2;
            } 
            else {
                diceCountP2++;
                player2 = Moves(player2, dice, option);
                report(2, dice, player2);

                if (option != Ladder)
                    turn = 1;
            }
        }
        if (player1 == 100)
            System.out.println(" Player 1 WON the Match!");
        else
            System.out.println(" Player 2 WON the Match!");

        System.out.println("\nDice Roll Count:");
        System.out.println("Player 1 Dice Rolls: " + diceCountP1);
        System.out.println("Player 2 Dice Rolls: " + diceCountP2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Snake & Ladder Game!");
        System.out.println("1. Single Player");
        System.out.println("2. Two Player");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        if (choice == 1)
            singlePlayerGame();
        else if (choice == 2)
            twoPlayerGame();
        else
            System.out.println("Invalid choice!");
        sc.close();
    }
}

