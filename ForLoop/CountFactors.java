package ForLoop;

import java.util.Scanner;

public class CountFactors {
	
	public static void main(String[] args) {
	 
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("Count is: "+count);
	}
 
}
