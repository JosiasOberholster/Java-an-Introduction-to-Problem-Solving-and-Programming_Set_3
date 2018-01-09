package chapter6;

/*
	This class will test the OutputFormat Class.
	Author: Josias JJ Oberholster.
	Chapter 6 Self-Test Question 30.
	Last Changed: 18 July 2017.
*/

import java.util.Scanner;

public class OutputFormatTest {

	public static void main(String[] args){
		
		double amount;
		int decimal;
		String response;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Start of test");
		
		do{
			System.out.println("Enter a value of type double [Total value with decimal]");
			amount = sc.nextDouble();
			System.out.println("Enter a value of type int [For decimal points]");
			decimal = sc.nextInt();
			
			OutputFormat.write(amount, decimal);
			System.out.println();
			System.out.println("Test again? [yes / no]");
			response = sc.next();
			
		}while(response.equalsIgnoreCase("yes"));
		
		System.out.println("End of test");
	}
}
