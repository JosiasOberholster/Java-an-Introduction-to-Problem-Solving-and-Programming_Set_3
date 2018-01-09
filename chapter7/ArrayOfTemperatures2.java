package chapter7;

/*
Reads 7 temperatures from the user and shows which are above
and which are below the average of the 7 temperatures.
Author: Josias JJ Oberholster.
Chapter 7 Listing 7.1
Last Changed: 26 September 2017.
*/

import java.util.Scanner;

public class ArrayOfTemperatures2 {

	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many temperatures do you have?");
		int size = keyboard.nextInt();
		double[] temperature = new double[size];
		
		//Reads temperatures and compute their average.
		System.out.println("Enter " + temperature.length + " temperature");
		double sum = 0;
		
		for(int index = 0; index < temperature.length; index++){
			temperature[index] = keyboard.nextDouble();
			sum = sum + temperature[index];
		}
		
		double average = sum / temperature.length;
		System.out.println("The average temperature is: " + average);
		
		//Display each temperature and its relation to the average.
		System.out.println("The temperatures are");
		for(int index = 0; index < temperature.length; index++){
			if(temperature[index] < average){
				System.out.println(temperature[index] + " below average");
			}else if(temperature[index] > average){
				System.out.println(temperature[index] + " above average");
			}else{
				System.out.println(temperature[index] + "the average");
			}
		}
		
		System.out.println("Have a nice day.");
	}
}
