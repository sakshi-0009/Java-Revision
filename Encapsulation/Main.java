package Encapsulation;

public class Main {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(5000);
		
		acc.deposit(1000);
		acc.withdraw(3000);
		
		System.out.println("Balance: "+acc.getBalance());
	}
}
