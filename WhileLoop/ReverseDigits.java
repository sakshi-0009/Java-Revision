package WhileLoop;

import java.util.Scanner;

public class ReverseDigits {

	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Digits: ");
		int n = sc.nextInt();
		
		while(n!=0) {
			System.out.print(n%10);
			n = n/10;
		}
	}
}
