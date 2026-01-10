package ControlStatements;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total units consumed: ");
		int units = sc.nextInt();
		 double bill = 0;
		 
		 if(units<=100) {
			 bill = units*2;
		 }else if(units<=200) {
			 bill = (100*2)+(units-100)*5;
		 }else if(units<=300) {
			 bill = (100*2)+(100*5)+(units-200)*7;
		 }else {
			 bill = (100*2)+(100*5)+(100*7)+(units-300)*10;
		 }
		 System.out.println("Electricity bill is "+bill+" Rs");
	}
}
