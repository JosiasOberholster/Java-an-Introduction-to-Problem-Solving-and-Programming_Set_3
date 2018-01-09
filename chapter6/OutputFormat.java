package chapter6;

/*
	This class will display values of type double that are not necessarily
	for money amounts.
	Author: Josias JJ Oberholster.
	Chapter 6 Self-Test Question 30.
	Last Changed: 18 July 2017.
*/

public class OutputFormat {

	/*Rounds after two decimal places.
	 *Does not advance to the next line after output.*/
	public static void write(double amount, int decimal){
		if(amount >= 0){
			writePositive(amount, decimal);
		}else{
			amount = Math.abs(amount);
			double positiveAmount = amount;
			System.out.print('-');
			writePositive(positiveAmount, decimal);
		}
	}
	
	/*Precondition: amount >= 0;
	 *Rounds after user supplied decimal places.*/
	private static void writePositive(double amount, int decimal){
		int decimalPoint = (int) Math.pow(10, decimal);
		int total = (int)(Math.round(amount * decimalPoint));
		int beforeDeci = total / decimalPoint;
		int afterDeci = total % decimalPoint;
		
		System.out.print(beforeDeci);
		System.out.print('.');
		
		if(afterDeci < decimalPoint){
			System.out.print('0');
			System.out.print(afterDeci);
		}else{
			System.out.print(afterDeci);
		}
	}
	
	/*Rounds after two decimal places.
	 *Advances to the next line after output.*/
	public static void writeln(double amount,  int decimal){
		write(amount, decimal);
		System.out.println();
	}
}
