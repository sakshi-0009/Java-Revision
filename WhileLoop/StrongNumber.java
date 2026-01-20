package WhileLoop;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int digit = num%10;
			int fact = 1;
			int i = 1;
			
			while(i<=digit) {
				fact = fact*i;
				i++;
			}
			sum = sum+fact;
			num = num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number");
		}else {
			System.out.println(temp+" is not a strong number");
		}
		sc.close();
	}
}
