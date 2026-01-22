package Methods;

import java.util.Scanner;

public class CountDigits {
	
	static int countDigits(int num) {
		
		if(num==0) {
			return 1;
		}
		
		int count = 0;
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
		
		int count = countDigits(num);

		System.out.println("Total digits: "+count);
		sc.close();
	}
}
