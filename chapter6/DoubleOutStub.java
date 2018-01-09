package chapter6;

/*
	This is a stub class for DoubleOut.
	Author: Josias JJ Oberholster.
	Chapter 6 Programming Project 1.
	Last Changed: 1 August 2017.
*/

import java.util.Scanner;

public class DoubleOutStub {
	
	private static int scienceNotation;
	private double scienceValue;
	private static double eValue;
	
	
	public void scienceWrite(double e){
		scienceValue = e;
		eValue = e;
		
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

	
	public static void writeScienceln(double e){
		writePositiveScience(e);
		System.out.println();
	}
	
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
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DoubleOutStub d = new DoubleOutStub();
		
		System.out.println("Write any decimal amount and it will display in scientific notation.");
		double amount = sc.nextDouble();
		d.scienceWrite(amount);
	}
}




