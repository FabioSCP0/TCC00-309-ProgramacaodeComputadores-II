package objectOrientation.q1;

import java.util.Scanner;

public class ConsoleBank {
	public ConsoleBank() {
		run();
	}

	private void run() {
		Bank b1 = new Bank();
		
		String number;
		String numberTwo;
		String special;
		String description;
		int statusIn;
		double balance;
		double limit;
		boolean status = true;
		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);
		
		while(status) {
			System.out.println("Press \n 1 to open a bank account,\n"
					+ " 2 to close a bank account,\n"
					+ " 3 to make a bank withdraw,\n"
					+ " 4 to make a deposit,\n"
					+ " 5 to make a debit operation, \n"
					+ " 6 to Balance and statement issuance,\n"
					+ " 7 to make a Transfer between accounts,\n "
					+ "0 to leave");
			statusIn = entry.nextInt();
			
			switch(statusIn) {
				case 0:
					status = false;
					break;
					
				case 1:
					//open a bank account
					System.out.println("Enter account number: ");
					number = entry.next();
					System.out.println("Enter account balance: ");
					balance = entry.nextDouble();
					System.out.println("Enter account limit: ");
					limit = entry.nextDouble();
					System.out.println("Is this a special account ?: ");
					special = entry.next();
					b1.addAccount(number, balance, limit, special);
					break;
					
				case 2:
					//close a bank account
					System.out.println("Enter account number: ");
					number = entry.next();
					System.out.println(b1.delAccounts(number));
					break;
					
				case 3:
					//make a bank withdraw
					System.out.println("Enter account number: ");
					number = entry.next();
					System.out.println("Inform the value: ");
					balance = entry.nextDouble();
					if(b1.withdraw(number, balance)) {
						System.out.println("Successful Withdrawal");
						System.out.println(b1.balance(number));
						System.out.println(b1.limit(number));
					}else {
						System.out.println("Withdrawal not performed");
					}

					
					break;
					
				case 4:
					//make a deposit/credit
					System.out.println("Enter account number: ");
					number = entry.next();
					System.out.println("Enter to description: ");
					description = entry.next();
					System.out.println("Inform the value: ");
					balance = entry.nextDouble();
					if(b1.addTransaction(number, "Credit", description, balance)) {
						System.out.println("Deposit made successfully");
					}else System.out.println("Bank account not found");
					break;
					
				case 5:
					//make a Debit operation
					System.out.println("Enter account number: ");
					number = entry.next();
					System.out.println("Enter to description: ");
					description = entry.next();
					System.out.println("Inform the value: ");
					balance = entry.nextDouble();
					if(b1.addTransaction(number, "Debit", description, balance)){
						System.out.println("Amount debited from the account successfully");
					}else System.out.println("Bank account not found");
					
					break;
					
				case 6:
					//Balance and statement issuance
					System.out.println("Enter origin account number: ");
					number = entry.next();
					System.out.println(b1.statement(number));
					break;
					
				case 7:
					//make a Transfer between accounts
					System.out.println("Enter origin account number: ");
					number = entry.next();
					System.out.println("Enter destiny account number: ");
					numberTwo = entry.next();
					System.out.println("Inform the value: ");
					balance = entry.nextDouble();
					if(b1.transfer(number, numberTwo, balance)) {
						System.out.println("Successful transfer");
					}else System.out.println("Bank account not found");
					break;
			}
		}
		
	}
}
