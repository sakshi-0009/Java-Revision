package WhileLoop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int a=0, b=1;
		int count = 0;
		while(count<n) {
			System.out.print(a+" ");
			int sum = a+b;
			a = b;
			b = sum;
			count++;
		}
	}
}
