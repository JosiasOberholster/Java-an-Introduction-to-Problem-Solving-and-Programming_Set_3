package chapter6;

/*
	This class will test the DoubleOut class.
	Author: Josias JJ Oberholster.
	Chapter 6 Programming Project 1.
	Last Changed: 1 August 2017.
*/

import java.util.Scanner;

public class DoubleOutTest {

	public static void main(String[] args){
		DoubleOut d = new DoubleOut();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any decimal amount");
		double userValue = sc.nextDouble();
		
		System.out.println("\nIn Dollar Value");
		d.moneyWrite(userValue);
		
		System.out.println("\nIn number Value");
		d.valueWrite(userValue, 2);
		
		System.out.println("\nIn scientific value");
		d.scienceWrite(userValue);
	}
}
