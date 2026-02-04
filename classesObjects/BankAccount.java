package classesObjects;

public class BankAccount {

	int accountNo;
	String name;
	double balance;
	
	BankAccount(){
		System.out.println("Account details: ");
	}
	void display() {
		System.out.println("Account number: "+accountNo);
		System.out.println("Account holder name: "+name);
		System.out.println("Balance: "+balance);
	}
	
	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		acc.accountNo = 101;
		acc.name = "Sakshi";
		acc.balance = 101000;
		
		acc.display();	
	}
}
