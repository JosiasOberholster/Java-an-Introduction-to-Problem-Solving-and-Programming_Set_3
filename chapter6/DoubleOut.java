package chapter6;

/*
	
	Author: Josias JJ Oberholster.
	Chapter 6 Programming Project 1.
	Last Changed: 1 August 2017.
*/

public class DoubleOut {

	/*****************************************************************/
	/*For money purposes.*/
	/*****************************************************************/

	/*Displays amount in dollars and cents notation.
	 *Rounds after two decimal places.
	 *Does not advance to the next line after output.*/
	public static void moneyWrite(double amount){
		if(amount >= 0){
			System.out.print('$');
			writePositiveMoney(amount);
		}else{
			amount = Math.abs(amount);
			double positiveAmount = amount;
			System.out.print('$');
			System.out.print('-');
			writePositiveMoney(positiveAmount);
		}
	}
	
	/*Display amount in dollars and cents notation.
	 *Rounds after two decimal places.
	 *Advances to the next line after output.*/
	public static void writeMoneyln(double amount){
		moneyWrite(amount);
		System.out.println();
	}
	
	/*Precondition: amount >= 0;
	 *Displays amount in dollars ad cents notation. Rounds
	 *after two decimal places. Omits the dollar sign.*/
	private static void writePositiveMoney(double amount){
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
	
	
	/*****************************************************************/
	/*For value purposes.*/
	/*****************************************************************/
	
	/*Rounds after two decimal places.
	 *Does not advance to the next line after output.*/
	public static void valueWrite(double amount, int decimal){
		if(amount >= 0){
			writePositiveValue(amount, decimal);
		}else{
			amount = Math.abs(amount);
			double positiveAmount = amount;
			System.out.print('-');
			writePositiveValue(positiveAmount, decimal);
		}
	}
	
	/*Rounds after two decimal places.
	 *Advances to the next line after output.*/
	public static void writeValueln(double amount,  int decimal){
		valueWrite(amount, decimal);
		System.out.println();
	}
	
	/*Precondition: amount >= 0;
	 *Rounds after user supplied decimal places.*/
	private static void writePositiveValue(double amount, int decimal){
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
	
	/*****************************************************************/
	/*For scientific notation purposes.*/
	/*****************************************************************/
	
	private static int scienceNotation;
	private static double scienceValue;
	private static double eValue;
	
	/*Rounds after two decimal places.
	 *Does not advance to the next line after output.*/
	public static void scienceWrite(double e){
		scienceValue = e;
		eValue = e;
		//System.out.println(scienceValue);  												<----- Come Back To This ------->
		if(scienceValue < 0){
			do{
				scienceValue *= 10;
				scienceNotation++;
			}while(scienceValue < 0);

			writePositiveScience(scienceValue);
		}else if(scienceValue > 10){
			do{
				scienceValue /= 10;
				scienceNotation++;
			}while(scienceValue > 10);
		
			writePositiveScience(scienceValue);
		}
	}

	/*Rounds after two decimal places.
	 *Advances to the next line after output.*/
	public static void writeScienceln(double e){
		scienceWrite(e);
		System.out.println();
	}
	
	/*Precondition: amount >= 0;
	 *Rounds after user supplied decimal places.*/
	private static void writePositiveScience(double e){
		double setE = eValue;
		int setValue = (int)Math.round(e * 100);
		int afterDecimal = setValue / 100;
		int beforeDecimal = setValue % 100;
		
		System.out.print(afterDecimal);
		System.out.print('.');
		System.out.print(beforeDecimal);
		
		if(setE > 1){
			System.out.println("e" + scienceNotation);
		}else{
			System.out.println("e-" + scienceNotation);
		}
		
	}
	
}

































