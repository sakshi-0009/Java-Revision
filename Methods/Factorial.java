package Methods;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int num) {
		int fact = 1;
		int i = 1;
		
		while(i<=num) {
			fact = fact*i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is "+factorial(num));
	}
}
