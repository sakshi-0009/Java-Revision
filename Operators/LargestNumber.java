package Operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());
		
		if(num1>num2) {
			System.out.println(num1+" is the large number!");
		}else{
			System.out.println(num2+" is the large number!");
		}
	}
}
