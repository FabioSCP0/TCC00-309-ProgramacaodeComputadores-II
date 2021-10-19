package objectOrientation.q1;

public class Debit extends Transaction{
	
	public Debit(String description, double value) {
		setDescription(description);
		setValue(value);
	}
	
	@Override
	public void addDebit() {
		if(account.getBalance()>=value) {
			account.setBalance(account.getBalance() - value);
		}else if((account.getBalance() + account.getLimit())>=value){
			account.setLimit(account.getLimit() + (account.getBalance() - value));
			account.setBalance(account.getBalance() - value);
		}
	}
	
	@Override
	public void addCredit() {
		account.setBalance(account.getBalance());	
	}
}
