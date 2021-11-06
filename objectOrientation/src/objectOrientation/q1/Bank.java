package objectOrientation.q1;

import java.util.*;

public class Bank {
	
	private final List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public void addAccount(BankAccount account) {
		this.accounts.add(account);
		account.bank = this;
	}
	
	public void addAccount(String number, double balance, double limit, String special) {
		addAccount(new BankAccount(number, balance, limit, special));
	}
	
	public String delAccounts(String number) {
		return BankStaticMethods.delAccounts(number, accounts);
	}
	
	public boolean addTransaction(String numberAccount, String operation, String description, double value) {
		return BankStaticMethods.addTransaction(numberAccount, operation, description, value, accounts);
	}
	
	public String balance(String number) {
		return BankStaticMethods.balance(number, accounts);
	}
	
	public String limit(String number) {
		return BankStaticMethods.limit(number, accounts);
	}
	
	public boolean transfer(String accountOrigin, String accountDestiny, double value) {
		return BankStaticMethods.transfer(accountOrigin, accountDestiny, value, accounts);
	}
	
	public boolean withdraw(String number, double value) {
		return BankStaticMethods.withdraw(number, value, accounts);
	}
	
	public String statement(String number) {
		return BankStaticMethods.statement(number, accounts);
	}

}
