package Encapsulation;

public class Main {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(5000);
		
		acc.deposit(10000);
		acc.withdraw(7000);
		
		System.out.println("Balance: "+acc.getBalance());
	}
}
