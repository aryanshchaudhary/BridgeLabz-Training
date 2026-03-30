package banking_system;
import java.util.*;
public class BankingSystem {
	private HashMap<Integer, Double> accounts;

    private Queue<WithdrawalRequest> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.get(accountNumber) + amount);
    }

    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {
        System.out.println("\nProcessing Withdrawal Requests:");

        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            double balance = accounts.get(req.accountNumber);

            if (balance >= req.amount) {
                accounts.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal successful: Account "
                        + req.accountNumber + " -> ₹" + req.amount);
            } else {
                System.out.println("Insufficient balance: Account "
                        + req.accountNumber);
            }
        }
    }

    public void displayAccounts() {
        System.out.println("\nAccounts (HashMap):");
        System.out.println(accounts);
    }

    public void displaySortedByBalance() {

        TreeMap<Double, List<Integer>> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance (TreeMap):");
        for (Map.Entry<Double, List<Integer>> entry : sortedMap.entrySet()) {
            for (int acc : entry.getValue()) {
                System.out.println("Account " + acc + " -> ₹" + entry.getKey());
            }
        }
    }
}