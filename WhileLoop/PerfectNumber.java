package WhileLoop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i<=num/2) {
			if(num%i==0) {
				sum = sum+i;
			}
			i++;
		}
		if(sum==num && sum!=0) {
			System.out.println(num+" is a perfect number");
		}else {
			System.out.println(num+" is not a perfect number");
		}
		sc.close();
	}
}
