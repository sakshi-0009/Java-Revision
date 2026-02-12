package Encapsulation;

public class Main {

	public static void main(String[] args) {
		BankAccount ac = new BankAccount(5000);
		
		ac.deposit(1000);
		ac.withdraw(3000);
		
		System.out.println("Balance: "+ac.getBalance());
	}
}
