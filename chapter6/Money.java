package chapter6;

/*
	Class representing non-negative amounts of money,
	such as $100, $41.99, $0.05.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.16.
	Last Changed: 19 July 2017.
*/

import java.util.Scanner;

public class Money {

	private long dollars;
	private long cents;
	
	public void set(long newDollars){
		if(newDollars < 0){
			System.out.println("Error: Negative amounts of money are not allowed.");
			System.exit(0);
		}else{
			dollars = newDollars;
			cents = 0;
		}
	}
	
	public void set(double newAmount){
		if(newAmount < 0){
			System.out.println("Error: Negative amounts of money are not allowed.");
			System.exit(0);
		}else{
			long allCents = Math.round(newAmount * 100);
			dollars = allCents / 100;
			cents = allCents % 100;
		}
	}
	
	public void set(Money moneyObject){
		this.dollars = moneyObject.dollars;
		this.cents = moneyObject.cents;
	}
	
	/*Precondition: The argument is an ordinary representation
	 *of an amount of money, with or without a dollar sign.
	 *Fractions of a cent are not allowed.*/
	public void set(String amountString){
		String dollarString = null;
		String centsString = null;
		
		//Delete '$' if any:
		if(amountString.charAt(0) == '$'){
			amountString = amountString.substring(1);
			amountString = amountString.trim();
		}
		
		//Locate decimal point
		int pointLocation = amountString.indexOf(".");
		
		if(pointLocation < 0){ //If no decimal point
			cents = 0;
			dollars = Long.parseLong(amountString);
		}else{ //String has a decimal point
			dollarString = amountString.substring(0, pointLocation);
			centsString = amountString.substring(pointLocation + 1);
		}
		
		//One digit in cents means tenth of a dollar
		if(centsString.length() <= 1){
			centsString = centsString + "0";
		}
		
		//Convert to numeric
		dollars = Long.parseLong(dollarString);
		cents = Long.parseLong(centsString);
		
		if((dollars < 0) || (cents < 0) || (cents > 99)){
			System.out.println("ERROR: Illegal representation of money.");
			System.exit(0);
		}
	}
	
	public void readInput(){
		System.out.println("Enter amount on a line by itself:");
		Scanner keyboard = new Scanner(System.in);
		String amount = keyboard.nextLine();
		set(amount.trim());
	}
	
	/*Do not go to the next line after displaying money.*/
	public void writeOutput(){
		System.out.println("$" + dollars);
		
		if(cents < 10){
			System.out.println(".0" + cents);
		}else{
			System.out.println(".0 + cents");
		}
	}
	
	/*Returns n times the calling object.*/
	public Money times(int n){
		Money product = new Money();
		product.cents = n * cents;
		long carryDollars = product.cents / 100;
		product.cents = product.cents % 100;
		product.dollars = n * dollars + carryDollars;
		return product;
	}
	
	/*Returns the sum of the calling object and the argument*/
	public Money add(Money otherAmount){
		Money sum = new Money();
		sum.cents = this.cents + otherAmount.cents;
		long carryDollars = sum.cents % 100;
		sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
		return sum;
	}
}