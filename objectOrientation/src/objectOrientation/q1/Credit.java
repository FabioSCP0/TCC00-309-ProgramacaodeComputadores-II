package objectOrientation.q1;

public class Credit extends Transaction{
	
	public Credit(String description, double value) {
		setDescription(description);
		setValue(value);
	}
	
	@Override
	public void addCredit() {
		if(account.getBalance()>=0) {
			account.setBalance(account.getBalance() + getValue());
		}else {
			account.setLimit(account.getLimit() - account.getBalance());
			account.setBalance(account.getBalance() + getValue());
		}
	}
	
	@Override
	public void addDebit() {
		account.setBalance(account.getBalance());
	}
}
