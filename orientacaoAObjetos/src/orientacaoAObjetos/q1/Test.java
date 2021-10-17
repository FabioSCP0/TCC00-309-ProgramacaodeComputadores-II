package orientacaoAObjetos.q1;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		
		String number;
		String numberTwo;
		String special;
		String description;
		int statusIn;
		double balance;
		double limit;
		boolean status = true;
		Scanner entrada = new Scanner(System.in);
		
		while(status) {
			System.out.println("Press \n 1 to open a bank account,\n"
					+ " 2 to close a bank account,\n"
					+ " 3 to make a bank withdraw,\n"
					+ " 4 to make a deposit,\n"
					+ " 5 to make a debit operation, \n"
					+ " 6 to Balance and statement issuance,\n"
					+ " 7 to make a Transfer between accounts,\n "
					+ "0 to leave");
			statusIn = entrada.nextInt();
			
			switch(statusIn) {
				case 0:
					status = false;
					break;
					
				case 1:
					//open a bank account
					System.out.println("Enter account number: ");
					number = entrada.next();
					System.out.println("Enter account balance: ");
					balance = entrada.nextDouble();
					System.out.println("Enter account limit: ");
					limit = entrada.nextDouble();
					System.out.println("Is this a special account ?: ");
					special = entrada.next();
					b1.addAccount(number, balance, limit, special);
					break;
					
				case 2:
					//close a bank account
					System.out.println("Enter account number: ");
					number = entrada.next();
					b1.delAccounts(number);
					break;
					
				case 3:
					//make a bank withdraw
					System.out.println("Enter account number: ");
					number = entrada.next();
					System.out.println("Inform the value: ");
					balance = entrada.nextDouble();
					b1.withdraw(number, balance);
					if(b1.balance(number)!=Double.MAX_VALUE) {
						System.out.println("Your balance is " + b1.balance(number));
						System.out.println("Your limit is " + b1.limit(number));
					}else System.out.println("Bank account not found");

					break;
					
				case 4:
					//make a deposit/credit
					System.out.println("Enter account number: ");
					number = entrada.next();
					System.out.println("Enter to description: ");
					description = entrada.next();
					System.out.println("Inform the value: ");
					balance = entrada.nextDouble();
					b1.addTransaction(number, "Credit", description, balance);
					break;
					
				case 5:
					//make a Debit operation
					System.out.println("Enter account number: ");
					number = entrada.next();
					System.out.println("Enter to description: ");
					description = entrada.next();
					System.out.println("Inform the value: ");
					balance = entrada.nextDouble();
					b1.addTransaction(number, "Debit", description, balance);
					break;
					
				case 6:
					//Balance and statement issuance
					System.out.println("Enter origin account number: ");
					number = entrada.next();
					System.out.println("Your balance is " + b1.balance(number));
					System.out.println("Your limit is " + b1.limit(number));
					b1.statement(number);
					break;
					
				case 7:
					//make a Transfer between accounts
					System.out.println("Enter origin account number: ");
					number = entrada.next();
					System.out.println("Enter destiny account number: ");
					numberTwo = entrada.next();
					System.out.println("Inform the value: ");
					balance = entrada.nextDouble();
					b1.transfer(number, numberTwo, balance);
					break;
			}
		}
		
	}
}
