package ForLoop;

import java.util.Scanner;

public class OddIntegers {

	public static void main(String[] args) {
		System.out.println("Enter number" );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i<=n; i++) {
			if(n%2 != 0) {
				System.out.println("Number is odd!!");
			}else {
				System.out.println("Number is even!!");
			}
		}
	}
}
