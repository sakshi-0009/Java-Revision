package Methods;

import java.util.Scanner;

public class CountDigits {
	
	static int CountDigits(int num, int count) {
		
		while(num!=0) {
			count++;
			num = num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to count the digits: ");
		
		int num = sc.nextInt();		
		int count = 0;
		
		count = CountDigits(num,count);

		System.out.println("Total digits: "+count);
		
	}
}
