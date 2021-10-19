package objectOrientation.q1;
import java.util.*;

public class BankAccount {
	
	protected Bank bank;
	
	private String number;
	private double balance;
	private double limit;
	@SuppressWarnings("unused")
	private String special;
	
	public BankAccount(String number, double balance, double limit, String special) {
		setNumber(number);
		setBalance(balance);
		setLimit(limit);
		setSpecial(special);
	}
	
	public String getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getLimit() {
		return limit;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public void setSpecial(String special) {
		this.special = special;
	}
	
	protected final List<Transaction> transactions = new ArrayList<Transaction>();
	
	void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
		transaction.account = this;
	}
}
