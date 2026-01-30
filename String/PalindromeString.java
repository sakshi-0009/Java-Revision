package String;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = sc.next();
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println(rev+" is a palindrome string!");
		}else {
			System.out.println(rev+" is not a palindrome string!");
		}
		sc.close();
	}
}
