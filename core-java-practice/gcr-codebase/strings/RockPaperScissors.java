package level_2;
import java.util.*;
public class RockPaperScissors {
    static String getComputerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }
    static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper")))
            return "User";

        return "Computer";
    }
    static void displayStats(int userWin, int compWin, int draw, int games) {
        double userPercent = (userWin * 100.0) / games;
        double compPercent = (compWin * 100.0) / games;
        double drawPercent = (draw * 100.0) / games;

        System.out.println("\nPlayer\t\tWins\tPercentage");
        System.out.printf("User\t\t%d\t%.2f%%\n", userWin, userPercent);
        System.out.printf("Computer\t\t%d\t%.2f%%\n", compWin, compPercent);
        System.out.printf("Draw\t\t%d\t%.2f%%\n", draw, drawPercent);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWin = 0, compWin = 0, draw = 0;
        System.out.println("\nEnter choice: rock / paper / scissors\n");
        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + ": ");
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String result = findWinner(user, computer);
            if (result.equals("User")) userWin++;
            else if (result.equals("Computer")) compWin++;
            else draw++;
            System.out.println("User: " + user + 
                               " | Computer: " + computer + 
                               " | Result: " + result);
        }
        displayStats(userWin, compWin, draw, games);
    }
}

