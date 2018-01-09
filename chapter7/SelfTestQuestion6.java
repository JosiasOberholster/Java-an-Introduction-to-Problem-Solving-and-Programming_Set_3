package chapter7;

/*
	This program will take the last double of a list of 20 
	double, supplied by the user, and display their difference.
	Author: Josias JJ Oberholster.
	Chapter 7 Self-Test Question 6.
	Last Changed: 26 September 2017.
*/

import java.util.Scanner;

public class SelfTestQuestion6 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double[] user = new double[20];
		
		System.out.println("Enter 20 different decimal numbers.");
		
		for(int index = 0; index < 20; index++){
			double userNumber = sc.nextDouble();
			user[index] = userNumber;
		}
		
		double lastIndex = user[19];
		
		System.out.println("\nNow the program will take the last index"
						 + "\nand displaye the difference in each entery");
		
		for(int i = 0; i < 20; i++){
			System.out.println("Index " + i + " : " + user[i] + " - " + lastIndex + " = " + (user[i] - lastIndex));
		}
	}
}
