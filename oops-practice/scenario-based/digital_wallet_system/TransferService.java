package digital_wallet_system;

interface TransferService {
	void transferFunds(String fromAccount, String toAccount, double amount) 
		throws InsufficientBalanceException;
}
