package digital_wallet_system;

public abstract class WalletTransfer implements TransferService {
	public boolean transfer(Wallet fromWallet, Wallet toWallet, double amount) {
		if (fromWallet.getBalance() >= amount) {
			fromWallet.withdraw(amount);
			toWallet.deposit(amount);
			return true;
		}
		return false;
	}
}
