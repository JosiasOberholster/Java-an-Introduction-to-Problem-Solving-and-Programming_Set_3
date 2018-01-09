package chapter6;

/*
	This class will test the DollarFormatFirstTry class.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.13.
	Last Changed: 12 July 2017.
*/

import java.util.Scanner;

public class DollarFormatFirstTryDriver {

	public static void main(String[] args){
		
		double amount;
		String response;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Testing DollarFormatFirstTry.write");
		
		do{
			System.out.println("Enter a value of type double:");
			amount = keyboard.nextDouble();
			DollarFormatFirstTry.write(amount);
			System.out.println();
			System.out.println("Test again? [yes / no]");
			response = keyboard.next();
		}while(response.equalsIgnoreCase("yes"));
		
		System.out.println("End of test");
	}
}
