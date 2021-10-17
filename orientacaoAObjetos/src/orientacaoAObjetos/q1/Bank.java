package orientacaoAObjetos.q1;

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
		if(!accounts.isEmpty()) {
			for(BankAccount search : accounts) {
				if(search.getNumber().equalsIgnoreCase(number)) {
					accounts.remove(search);
					return "sucess";
				}
			}
			return "account not found";
		}else {
			return "There is no accounts in bank";
		}
	}
	
	public void addTransaction(BankAccount account, Transaction transaction) {
		account.addTransaction(transaction);				
		if(transaction instanceof Credit) {
			transaction.addCredit();
		}else {
			transaction.addDebit();
		}
	}
	
	public void addTransaction(String numberAccount, String operation, String description, double value) {
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(numberAccount)) {
				if(operation.equalsIgnoreCase("Debit")) {
					this.addTransaction(search, new Debit(description,value));
				}else {
					this.addTransaction(search,new Credit(description, value));
				}
			}
		}
	}
	
	public double balance(String number) {
		double balance;
		
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(number)) {
				balance = search.getBalance();
				return balance;
			}
		}
		return balance=0;
	}
	
	public double limit(String number) {
		double limit = Double.MAX_VALUE;
		
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(number)) {
				limit = search.getLimit();
				return limit;
			};
		}
		return limit;
	}
	
	public void transfer(String accountOrigin, String accountDestiny, double value) {
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(accountOrigin)) {
				if((search.getBalance() + search.getLimit()) >= value) {
					this.addTransaction(accountOrigin, "Debit", "Bank Transfer", value);
					this.addTransaction(accountDestiny, "Credit", "Bank Transfer", value);
				}
			}
		}
	}
	
	public void withdraw(String number, double value) {
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(number)) {
				if((search.getBalance() + search.getLimit()) >= value) {
					this.addTransaction(number, "Debit", "Bank Withdraw", value);
				
				}
			}
		}
	}
	
	public void statement(String number) {
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(number)) {
				statement(search.transactions);
			}
		}
	}
	public void statement(List<Transaction> transaction) {
			System.out.println("Transactions that are on this account is: ");
		for (Transaction search : transaction) {
			System.out.println(search.getDescription() +" - " + search.getValue());
		}
	}
}
