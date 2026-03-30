package banking_system;

public class BankingSystemMain {
	public static void main(String[] args) {
		BankingSystem bank = new BankingSystem();
		
		bank.addAccount(101, 5000);
        bank.addAccount(102, 8000);
        bank.addAccount(103, 3000);

        bank.displayAccounts();

        bank.requestWithdrawal(101, 2000);
        bank.requestWithdrawal(103, 4000);
        bank.requestWithdrawal(102, 1000);

        bank.processWithdrawals();

        bank.displayAccounts();
        bank.displaySortedByBalance();
	}
}
