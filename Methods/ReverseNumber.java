package Methods;

import java.util.Scanner;

public class ReverseNumber {

	static int reverseNumber(int num) {
		
		int rev = 0;
		
		while(num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		return rev;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int num = sc.nextInt();
		int rev = reverseNumber(num);
				
		System.out.println("Reversed number is: "+rev);
		sc.
	}
}
