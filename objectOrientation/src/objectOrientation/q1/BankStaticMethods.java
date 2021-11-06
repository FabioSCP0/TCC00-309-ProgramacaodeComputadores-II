package objectOrientation.q1;
import java.util.List;

public class BankStaticMethods {
	private BankStaticMethods() {};
	
	public static String delAccounts(String number, List<BankAccount> accounts) {
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
	
	private static void addTransaction(BankAccount account, Transaction transaction) {
		account.addTransaction(transaction);				
		if(transaction instanceof Credit) {
			transaction.addCredit();
		}else {
			transaction.addDebit();
		}
	}
	
	public static boolean addTransaction(String numberAccount, String operation, String description, double value, List<BankAccount> accounts) {
		if(!accounts.isEmpty()) {
			for(BankAccount search : accounts) {
				if(search.getNumber().equalsIgnoreCase(numberAccount)) {
					if(operation.equalsIgnoreCase("Debit")) {
						addTransaction(search, new Debit(description,value));
						return true;
					}else {
						addTransaction(search,new Credit(description, value));
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static String balance(String number, List<BankAccount> accounts) {
		double balance=Double.MAX_VALUE;
		if(!accounts.isEmpty()) {
			for(BankAccount search : accounts) {
				if(search.getNumber().equalsIgnoreCase(number)) {
					balance = search.getBalance();
				}
			}
		}
		if(balance!=Double.MAX_VALUE) {
			return "Your new balance is " + balance;
		}
		return "";
	}

	public static String limit(String number, List<BankAccount> accounts) {
		double limit = Double.MAX_VALUE;
		if(!accounts.isEmpty()) {
			for(BankAccount search : accounts) {
				if(search.getNumber().equalsIgnoreCase(number)) {
					limit = search.getLimit();
				};
			}
		}
		if(limit!=Double.MAX_VALUE) {
			return "Your new limit is " + limit;
		}
		return "";
	}

	public static boolean transfer(String accountOrigin, String accountDestiny, double value, List<BankAccount> accounts) {
		if(!accounts.isEmpty()) {
			for(BankAccount search : accounts) {
				if(search.getNumber().equalsIgnoreCase(accountOrigin)) {
					if((search.getBalance() + search.getLimit()) >= value) {
						addTransaction(search, new Debit("Bank Transfer",value));
						addTransaction(accountDestiny, "Credit", "Bank Transfer", value,accounts);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean withdraw(String number, double value, List<BankAccount> accounts) {
		for(BankAccount search : accounts) {
			if(search.getNumber().equalsIgnoreCase(number)) {
				if((search.getBalance() + search.getLimit()) >= value) {
					addTransaction(search, new Debit("Bank Withdraw",value));
					return true;
				}
			}
		}
		return false;
	}
	
	public static String statement(String number, List<BankAccount> accounts) {
		
		StringBuilder sb = new StringBuilder();
		if(!accounts.isEmpty()) {
			for(BankAccount search : accounts) {
				if(search.getNumber().equalsIgnoreCase(number)) {
					sb.append("Your balance is: ");
					sb.append(search.getBalance());
					sb.append("\n");
					sb.append("Your limit is: ");
					sb.append(search.getLimit());
					sb.append("\n");
					return statement(search.transactions,sb);
				}
			}
		}return "Account not found";
	}
	
	private static String statement(List<Transaction> transaction, StringBuilder sb) {
		
		if(!transaction.isEmpty()) {
			for (Transaction search : transaction) {
				sb.append("\n");
				sb.append(search.getDescription());
				sb.append(" - ");
				sb.append(search.getValue());
				return sb.toString();
			}
		} return "This account don't have transactions to show";
	}
}
