package Methods;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int i=2;
		while(i<=num/2) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		sc.close();
	}
}
