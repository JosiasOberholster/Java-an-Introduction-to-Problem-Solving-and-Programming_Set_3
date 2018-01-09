package chapter7;

/*
	This class will compute the average temperature and 
	then count and display the number of days on which
	the temperature was above average.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 1.
	Last Changed: 30 October 2017.
*/

import java.util.Scanner;

public class NumberAboveAverage {

	private static int[] temp = new int[10];
	private static int tempAverage;
	private static int days;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println("This class will compute the average temperature and "
						+ "\nthen count and display the number of days on which "
						+ "\nthe temperature was above average.");
		System.out.println();
		
		setTemp();
		getAverage();
		System.out.println("The average is: " + tempAverage);
		System.out.println();
		
		isHigher();
	}
	
	/*
		Precondition: method will ask user to supply the 
		temperature for each day up to 10 days.
		Postcondition: all supplied temperatures will be
		added to a array and can be used later on.
	*/
	private static void setTemp(){
		for(int i = 0; i < temp.length; i++){
			days = i + 1;
			System.out.print("Enter the temperature for day " + days + ":");
			int supplyTemp = sc.nextInt();
			temp[i] = supplyTemp;
		}
	}
	
	/*
		Precondition: This method requires setTemp to collect
		the array data first.
		Postcondition: This method will count the array tempAverage and sum
		them to get the average.
	*/
	private static int getAverage(){
		int sum = 0;
		
		for(int i = 0; i < temp.length; i++){
			sum = sum + temp[i];
		}
		
		tempAverage = sum / 10;
		return tempAverage;
	}
	
	/*
		Precondition: THis method requires both setTemp and getAverage
		to have been used first.
		Postcondition: the method will display each day and specify
		if on that day the temperature was either higher or lower than
		the average temperature or if it was exactly the same. 
	*/
	
	private static void isHigher(){
		System.out.println("Now to see on what day the temperature was higher than the average");
		
		for(int i = 0; i < temp.length; i++){
			days = i + 1;
			System.out.print("On day " + days + ": ");
			if(temp[i] > tempAverage){
				System.out.print("The temperature was higher than the average");
			}else if(temp[i] < tempAverage){
				System.out.print("The temperature was lower than the average");
			}else{
				System.out.print("The temperature was on average");
			}
			System.out.println();
		}
	}
}