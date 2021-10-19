package objectOrientation.q1;

public abstract class Transaction {
	
	protected String description;
	protected double value;
	protected BankAccount account;
	
	public double getValue() {
		return value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public abstract void addCredit();
	public abstract void addDebit();
	
}
