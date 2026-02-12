package Encapsulation;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	// Public method to access data
	public double getBalance() {
		return balance;
	}
	
	//Public method to modify data
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance = balance - amount;
		}else {
			System.out.println("Insufficient amount!");
		}
	}
}


