package chapter7;

/*
	This class will convert any given decimal point to a given 
	amount.
	Author: Josias JJ Oberholster.
	Chapter 7.
	Author: Josias JJ Oberholster.
*/

public class DollarFormat {
	
	/*Displays amount in dollars and cents notation.
	 *Rounds after two decimal places.
	 *Does not advance to the next line after output.*/
	public static void write(double amount){
		if(amount >= 0){
			writePositive(amount);
		}else{
			amount = Math.abs(amount);
			double positiveAmount = amount;
			writePositive(positiveAmount);
		}
	}
	
	/*Precondition: amount >= 0;
	 *Displays amount in dollars ad cents notation. Rounds
	 *after two decimal places. Omits the dollar sign.*/
	private static void writePositive(double amount){
		int allCents = (int)(Math.round(amount * 100));
		int dollars = allCents / 100;
		int cents = allCents % 100;
		
		System.out.print(dollars);
		System.out.print('.');
		
		if(cents < 10){
			System.out.print('0');
			System.out.print(cents);
		}else{
			System.out.print(cents);
		}
	}
	
	/*Display amount in dollars and cents notation.
	 *Rounds after two decimal places.
	 *Advances to the next line after output.*/
	public static double writeln(double amount){
		write(amount);
		System.out.println();
		return amount;
	}
}
